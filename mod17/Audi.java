package br.com.danilobetelli;

public class Audi extends Carro{

    public Audi() {
        super("Audi");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando Audi.");
    }
}
