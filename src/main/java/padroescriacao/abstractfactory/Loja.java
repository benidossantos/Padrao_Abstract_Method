package padroescriacao.abstractfactory;

public class Loja {

    private Midia midia;
    private Capa capa;

    public Loja (FabricaAbstrata fabrica) {
        this.midia = fabrica.createMidia();
        this.capa = fabrica.createCapa();
    }

    public String emitirMidia() {
        return this.midia.emitir();
    }

    public String emitirCapa() {
        return this.capa.emitir();
    }
}
