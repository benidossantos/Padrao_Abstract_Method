package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapaCDTest {

    @Test
    void deveEmitirDescricaoDaCapaDeCD() {
        Capa capa = new CapaCD();

        assertEquals("Capa de CD", capa.emitir());
    }
}
