package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MidiaCDTest {

    @Test
    void deveEmitirDescricaoDaMidiaEmCD() {
        Midia midia = new MidiaCD();

        assertEquals("Mídia em CD", midia.emitir());
    }
}
