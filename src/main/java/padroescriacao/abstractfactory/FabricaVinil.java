package padroescriacao.abstractfactory;

public class FabricaVinil implements FabricaAbstrata {

    @Override
    public Midia createMidia() {
        return new MidiaVinil();
    }

    @Override
    public Capa createCapa() {
        return new CapaVinil();
    }
}
