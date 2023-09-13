package br.com.danilobetelli;

public class Honda extends Carro {

    public Honda() {
        super("Honda");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando Honda.");
    }
}
