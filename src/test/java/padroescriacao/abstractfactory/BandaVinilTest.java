package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BandaVinilTest {

    @Test
    void deveEmitirDescricaoDaBandaEmVinil() {
        Banda banda = new BandaVinil();

        assertEquals("Banda lançada em Disco de Vinil", banda.emitir());
    }
}
