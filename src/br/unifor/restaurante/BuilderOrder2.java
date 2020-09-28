package br.unifor.restaurante;

public class BuilderOrder2 implements BuilderOrder {
    private String item_principal;
    private String item_secundario;
    private String bebida;
    private String brinquedo;

    @Override
    public void buildItemPrincipal(String item_principal) {
        this.item_principal = item_principal;
    }

    @Override
    public void buildItemSecundario(String item_secundario) {
        this.item_secundario = item_secundario;
    }

    @Override
    public void buildBebida(String bebida) {
        this.bebida = bebida;
    }

    @Override
    public void buildBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    @Override
    public Order getPedido() {
        return new Order1(item_principal,item_secundario,bebida,brinquedo);
    }
}
