package padroescriacao.abstractfactory;

public class FabricaCD implements FabricaAbstrata {

    @Override
    public Midia createMidia() {
        return new MidiaCD();
    }

    @Override
    public Capa createCapa() {
        return new CapaCD();
    }
}
