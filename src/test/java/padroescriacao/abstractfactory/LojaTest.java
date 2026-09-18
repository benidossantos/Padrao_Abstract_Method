package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveEmitirArtistaVinil() {
        FabricaAbstrata fabrica = new FabricaVinil();
        Loja loja = new Loja(fabrica);
        assertEquals("Artista Solo lançado em Disco de Vinil", loja.emitirArtista());
    }

    @Test
    void deveEmitirArtistaCD() {
        FabricaAbstrata fabrica = new FabricaCD();
        Loja loja = new Loja(fabrica);
        assertEquals("Artista Solo lançado em CD", loja.emitirArtista());
    }

    @Test
    void deveEmitirBandaVinil() {
        FabricaAbstrata fabrica = new FabricaVinil();
        Loja loja = new Loja(fabrica);
        assertEquals("Banda lançada em Disco de Vinil", loja.emitirBanda());
    }

    @Test
    void deveEmitirBandaCD() {
        FabricaAbstrata fabrica = new FabricaCD();
        Loja loja = new Loja(fabrica);
        assertEquals("Banda lançada em CD", loja.emitirBanda());
    }
}
