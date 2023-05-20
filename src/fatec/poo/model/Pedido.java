package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ATHUR GAIA
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private ArrayList<ItemPedido> itensPedidos;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.itensPedidos = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }
    
    // Adicionar Item Pedido
    
    public void adicionarItemPedido(ItemPedido itemPedido) {
        itensPedidos.add(itemPedido);
        itemPedido.getProduto().setQtdeEstoque(itemPedido.getProduto().getQtdeEstoque() - itemPedido.getQtdeVendida());
        
        this.cliente.subtrairLimiteDisponivel(itemPedido.getProduto().getPreco());
    }
    
    // Métodos para garantir a bidirecionalidade
    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
        this.cliente.adicionarPedido(this);
    }

    public void adicionarVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        this.vendedor.adicionarPedido(this);
    }


    
}
