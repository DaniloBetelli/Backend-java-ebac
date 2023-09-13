package br.com.danilobetelli;

public class FabricaFiatUno implements FabricaCarro {

    @Override
    public Carro criarCarro() {
        return new FiatUno();
    }
}
