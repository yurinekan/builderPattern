package br.unifor.restaurante;

public class Main {
    public static void main(String[] args) {

        BuilderOrder pedidoBuilder = new BuilderOrder1();
        CreateOrder criarPedido = new CreateOrder(pedidoBuilder);
        Order pedido = criarPedido.criarPedido();
    }
}
