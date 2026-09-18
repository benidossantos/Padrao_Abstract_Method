package org.example.model;

public abstract class FormaGeometrica {

    private final String nome;

    protected FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void exibirDados() {
        IO.println(String.format(
                "%s -> área: %.2f | perímetro: %.2f",
                nome, calcularArea(), calcularPerimetro()));
    }
}
