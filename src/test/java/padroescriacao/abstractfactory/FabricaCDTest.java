package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FabricaCDTest {

    private final FabricaAbstrata fabrica = new FabricaCD();

    @Test
    void deveCriarMidiaEmCD() {
        assertInstanceOf(MidiaCD.class, fabrica.createMidia());
    }

    @Test
    void deveCriarCapaDeCD() {
        assertInstanceOf(CapaCD.class, fabrica.createCapa());
    }
}
