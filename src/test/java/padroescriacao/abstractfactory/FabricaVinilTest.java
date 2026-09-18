package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FabricaVinilTest {

    private final FabricaAbstrata fabrica = new FabricaVinil();

    @Test
    void deveCriarMidiaEmVinil() {
        assertInstanceOf(MidiaVinil.class, fabrica.createMidia());
    }

    @Test
    void deveCriarCapaDeVinil() {
        assertInstanceOf(CapaVinil.class, fabrica.createCapa());
    }
}
