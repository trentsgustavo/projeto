/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class Grafico {
    int quantPedidos;
    String produtos;

    public int getQuantPedidos() {
        return quantPedidos;
    }

    public void setQuantPedidos(int quantPedidos) {
        this.quantPedidos = quantPedidos;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
    public String getQuantPedidos(int id_pedido) {
        Produtos p = new Produtos ();
        return p.getDescricao();
    }
    
    
}
