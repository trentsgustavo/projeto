/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tainá Fiegenbaum
 */
@Entity
@Table(name = "pedido_produtos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoProdutos.findAll", query = "SELECT p FROM PedidoProdutos p"),
    @NamedQuery(name = "PedidoProdutos.findById", query = "SELECT p FROM PedidoProdutos p WHERE p.id = :id")})
public class PedidoProdutos implements Serializable {

    @Basic(optional = false)
    @Column(name = "peso")
    private double peso;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedido pedidoId;
    @JoinColumn(name = "produtos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Produtos produtosId;

    public PedidoProdutos() {
    }

    public PedidoProdutos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Produtos getProdutosId() {
        return produtosId;
    }

    public void setProdutosId(Produtos produtosId) {
        this.produtosId = produtosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoProdutos)) {
            return false;
        }
        PedidoProdutos other = (PedidoProdutos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PedidoProdutos[ id=" + id + " ]";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
