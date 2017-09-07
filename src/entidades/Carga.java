/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tainá Fiegenbaum
 */
@Entity
@Table(name = "carga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carga.findAll", query = "SELECT c FROM Carga c"),
    @NamedQuery(name = "Carga.findById", query = "SELECT c FROM Carga c WHERE c.id = :id"),
    @NamedQuery(name = "Carga.findByCaminhaoId", query = "SELECT c FROM Carga c WHERE c.caminhaoId = :caminhaoId"),
    @NamedQuery(name = "Carga.findByData", query = "SELECT c FROM Carga c WHERE c.data = :data"),
    @NamedQuery(name = "Carga.findByNfe", query = "SELECT c FROM Carga c WHERE c.nfe = :nfe")})
public class Carga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "caminhao_id")
    private int caminhaoId;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "nfe")
    private String nfe;
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Endereco enderecoId;
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedido pedidoId;

    public Carga() {
    }

    public Carga(Integer id) {
        this.id = id;
    }

    public Carga(Integer id, int caminhaoId, Date data, String nfe) {
        this.id = id;
        this.caminhaoId = caminhaoId;
        this.data = data;
        this.nfe = nfe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCaminhaoId() {
        return caminhaoId;
    }

    public void setCaminhaoId(int caminhaoId) {
        this.caminhaoId = caminhaoId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNfe() {
        return nfe;
    }

    public void setNfe(String nfe) {
        this.nfe = nfe;
    }

    public Endereco getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Endereco enderecoId) {
        this.enderecoId = enderecoId;
    }

    public Pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedidoId = pedidoId;
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
        if (!(object instanceof Carga)) {
            return false;
        }
        Carga other = (Carga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Carga[ id=" + id + " ]";
    }
    
}
