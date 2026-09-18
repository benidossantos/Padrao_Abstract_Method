package padroescriacao.abstractfactory;

public class Loja {

    private Artista artista;
    private Banda banda;

    public Loja (FabricaAbstrata fabrica) {
        this.artista = fabrica.createArtista();
        this.banda = fabrica.createBanda();
    }

    public String emitirArtista() {
        return this.artista.emitir();
    }

    public String emitirBanda() {
        return this.banda.emitir();
    }
}
