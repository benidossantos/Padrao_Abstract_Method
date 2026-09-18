package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MidiaVinilTest {

    @Test
    void deveEmitirDescricaoDaMidiaEmVinil() {
        Midia midia = new MidiaVinil();

        assertEquals("Mídia em Disco de Vinil", midia.emitir());
    }
}
