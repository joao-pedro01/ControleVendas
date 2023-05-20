package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Vendedor extends Pessoa{
    private double salarioBase, taxaComissao;
    private ArrayList<Pedido> pedidos;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        this.pedidos = new ArrayList<Pedido>();
    }
    
    public void setSalarioBase (double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public void setTaxaComissao (double taxaComissao){
        this.taxaComissao = taxaComissao / 100;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.adicionarVendedor(this); // associação bidirecional
    }    
}
