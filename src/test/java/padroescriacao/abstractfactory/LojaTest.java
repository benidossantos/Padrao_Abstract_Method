package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LojaTest {

    @Test
    void deveEmitirMidiaECapaDeVinilQuandoUsarFabricaVinil() {
        Loja loja = new Loja(new FabricaVinil());

        assertEquals("Mídia em Disco de Vinil", loja.emitirMidia());
        assertEquals("Capa de Disco de Vinil", loja.emitirCapa());
    }

    @Test
    void deveEmitirMidiaECapaDeCDQuandoUsarFabricaCD() {
        Loja loja = new Loja(new FabricaCD());

        assertEquals("Mídia em CD", loja.emitirMidia());
        assertEquals("Capa de CD", loja.emitirCapa());
    }
}
