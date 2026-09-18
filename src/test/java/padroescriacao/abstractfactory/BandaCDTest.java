package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BandaCDTest {

    @Test
    void deveEmitirDescricaoDaBandaEmCD() {
        Banda banda = new BandaCD();

        assertEquals("Banda lançada em CD", banda.emitir());
    }
}
