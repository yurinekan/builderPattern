package br.unifor.restaurante;

public class CreateOrder {
    private BuilderOrder builderOrder;

    public CreateOrder(BuilderOrder builderOrder) {
        this.builderOrder = builderOrder;
    }
    public Order criarPedido() {
        this.builderOrder.buildItemPrincipal("BigMc");
        this.builderOrder.buildItemSecundario("Batata");
        this.builderOrder.buildBebida("Coca-cola");
        this.builderOrder.buildBrinquedo("Máscara");

        Order order = builderOrder.getPedido();
        return order;
    }
}
