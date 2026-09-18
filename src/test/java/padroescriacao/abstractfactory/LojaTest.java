package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LojaTest {

    @Test
    void deveEmitirArtistaEBandaDeVinilQuandoUsarFabricaVinil() {
        Loja loja = new Loja(new FabricaVinil());

        assertEquals("Artista Solo lançado em Disco de Vinil", loja.emitirArtista());
        assertEquals("Banda lançada em Disco de Vinil", loja.emitirBanda());
    }

    @Test
    void deveEmitirArtistaEBandaDeCDQuandoUsarFabricaCD() {
        Loja loja = new Loja(new FabricaCD());

        assertEquals("Artista Solo lançado em CD", loja.emitirArtista());
        assertEquals("Banda lançada em CD", loja.emitirBanda());
    }
}
