package fatec.poo.model;

/**
 *
 * @author ATHUR GAIA
 */
public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
        
        // controla estoque
        double estoqueAtualizado = produto.getQtdeEstoque() - qtdeVendida;
        produto.setQtdeEstoque(estoqueAtualizado);
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
}
