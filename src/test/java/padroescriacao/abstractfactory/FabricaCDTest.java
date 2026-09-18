package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FabricaCDTest {

    private final FabricaAbstrata fabrica = new FabricaCD();

    @Test
    void deveCriarArtistaEmCD() {
        assertInstanceOf(ArtistaCD.class, fabrica.createArtista());
    }

    @Test
    void deveCriarBandaEmCD() {
        assertInstanceOf(BandaCD.class, fabrica.createBanda());
    }
}
