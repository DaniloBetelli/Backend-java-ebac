package br.com.danilobetelli;

public class Ferrari extends Carro {

    public Ferrari() {
        super("Ferrari");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando Ferrari.");
    }
}
