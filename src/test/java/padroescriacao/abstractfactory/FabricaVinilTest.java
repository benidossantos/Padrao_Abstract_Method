package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FabricaVinilTest {

    private final FabricaAbstrata fabrica = new FabricaVinil();

    @Test
    void deveCriarArtistaEmVinil() {
        assertInstanceOf(ArtistaVinil.class, fabrica.createArtista());
    }

    @Test
    void deveCriarBandaEmVinil() {
        assertInstanceOf(BandaVinil.class, fabrica.createBanda());
    }
}
