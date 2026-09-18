package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapaVinilTest {

    @Test
    void deveEmitirDescricaoDaCapaDeVinil() {
        Capa capa = new CapaVinil();

        assertEquals("Capa de Disco de Vinil", capa.emitir());
    }
}
