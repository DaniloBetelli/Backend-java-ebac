package br.com.danilobetelli;

public class Fiat extends Carro {

    public Fiat() {
        super("Fiat");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o Fiat.");
    }
}
