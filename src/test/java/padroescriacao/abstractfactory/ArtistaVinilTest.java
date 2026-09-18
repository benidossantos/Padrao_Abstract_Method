package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtistaVinilTest {

    @Test
    void deveEmitirDescricaoDoArtistaEmVinil() {
        Artista artista = new ArtistaVinil();

        assertEquals("Artista Solo lançado em Disco de Vinil", artista.emitir());
    }
}
