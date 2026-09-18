package padroescriacao.abstractfactory;

public class FabricaVinil implements FabricaAbstrata {

    @Override
    public Artista createArtista() {
        return new ArtistaVinil();
    }

    @Override
    public Banda createBanda() {
        return new BandaVinil();
    }
}
