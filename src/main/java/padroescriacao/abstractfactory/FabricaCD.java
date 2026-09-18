package padroescriacao.abstractfactory;

public class FabricaCD implements FabricaAbstrata {

    @Override
    public Artista createArtista() {
        return new ArtistaCD();
    }

    @Override
    public Banda createBanda() {
        return new BandaCD();
    }
}
