package br.unifor.restaurante;

public class Order2 implements Order {

    private String item_principal;
    private String item_secundario;
    private String bebida;
    private String brinquedo;

    public Order2(String item_principal, String item_secundario, String bebida, String brinquedo) {
        this.item_principal = item_principal;
        this.item_secundario = item_secundario;
        this.bebida = bebida;
        this.brinquedo = brinquedo;
    }

    @Override
    public String getItemPrincipal() {
        return "item principal";
    }

    @Override
    public String getItemSecundario() {
        return "item secundario";
    }

    @Override
    public String getBebida() {
        return "bebida";
    }

    @Override
    public String getBrinquedo() {
        return "brinquedo";
    }
}