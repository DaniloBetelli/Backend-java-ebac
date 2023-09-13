package br.com.danilobetelli;

public class FabricaFerrari implements FabricaCarro {

    @Override
    public Carro criarCarro() {
        return new Ferrari();
    }
}
