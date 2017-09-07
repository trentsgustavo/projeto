/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tainá Fiegenbaum
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id"),
    @NamedQuery(name = "Pedido.findByData", query = "SELECT p FROM Pedido p WHERE p.data = :data"),
    @NamedQuery(name = "Pedido.findByHora", query = "SELECT p FROM Pedido p WHERE p.hora = :hora"),
    @NamedQuery(name = "Pedido.findBySituacao", query = "SELECT p FROM Pedido p WHERE p.situacao = :situacao")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;
    @JoinTable(name = "pedido_produtos", joinColumns = {
        @JoinColumn(name = "pedido_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "produtos_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Produtos> produtosCollection;
    @JoinColumn(name = "pessoas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pessoas pessoasId;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoId")
    private Collection<Carga> cargaCollection;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Pedido(Integer id, Date data, Date hora, String situacao) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public Collection<Produtos> getProdutosCollection() {
        return produtosCollection;
    }

    public void setProdutosCollection(Collection<Produtos> produtosCollection) {
        this.produtosCollection = produtosCollection;
    }

    public Pessoas getPessoasId() {
        return pessoasId;
    }

    public void setPessoasId(Pessoas pessoasId) {
        this.pessoasId = pessoasId;
    }

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
    }

    @XmlTransient
    public Collection<Carga> getCargaCollection() {
        return cargaCollection;
    }

    public void setCargaCollection(Collection<Carga> cargaCollection) {
        this.cargaCollection = cargaCollection;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pedido[ id=" + id + " ]";
    }
    
}
