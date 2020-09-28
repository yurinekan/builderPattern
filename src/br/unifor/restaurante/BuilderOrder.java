package br.unifor.restaurante;

public interface BuilderOrder {

    void buildItemPrincipal(String item_principal);
    void buildItemSecundario(String item_secundario);
    void buildBebida(String bebida);
    void buildBrinquedo(String brinquedo);

    Order getPedido();
}
