package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtistaCDTest {

    @Test
    void deveEmitirDescricaoDoArtistaEmCD() {
        Artista artista = new ArtistaCD();

        assertEquals("Artista Solo lançado em CD", artista.emitir());
    }
}
