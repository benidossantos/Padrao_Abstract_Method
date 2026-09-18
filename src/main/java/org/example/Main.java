package org.example;

import padroescriacao.abstractfactory.FabricaAbstrata;
import padroescriacao.abstractfactory.FabricaCD;
import padroescriacao.abstractfactory.FabricaVinil;
import padroescriacao.abstractfactory.Loja;

public class Main {
    public static void main(String[] args) {
        FabricaAbstrata fabricaVinil = new FabricaVinil();
        Loja lojaVinil = new Loja(fabricaVinil);
        IO.println(lojaVinil.emitirArtista());
        IO.println(lojaVinil.emitirBanda());

        FabricaAbstrata fabricaCD = new FabricaCD();
        Loja lojaCD = new Loja(fabricaCD);
        IO.println(lojaCD.emitirArtista());
        IO.println(lojaCD.emitirBanda());
    }
}
