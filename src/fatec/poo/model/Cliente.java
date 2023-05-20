package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        this.pedidos = new ArrayList<Pedido>();
    }
    
    public void setLimiteCred(double limiteCred){
        this.limiteCred = limiteCred;
    }    
    
    public double getLimiteCred(){
        return limiteCred;
    }
    
    public double getLimiteDisp(){
        return limiteDisp;
    }
         
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.adicionarCliente(this); // associação bidirecional
       
    }
    
    public void subtrairLimiteDisponivel(double valor) {
        this.limiteDisp -= valor;
    }
}
