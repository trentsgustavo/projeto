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
@Table(name = "logerros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logerros.findAll", query = "SELECT l FROM Logerros l"),
    @NamedQuery(name = "Logerros.findById", query = "SELECT l FROM Logerros l WHERE l.id = :id"),
    @NamedQuery(name = "Logerros.findByDescricao", query = "SELECT l FROM Logerros l WHERE l.descricao = :descricao"),
    @NamedQuery(name = "Logerros.findByData", query = "SELECT l FROM Logerros l WHERE l.data = :data"),
    @NamedQuery(name = "Logerros.findByHora", query = "SELECT l FROM Logerros l WHERE l.hora = :hora")})
public class Logerros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "pessoas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pessoas pessoasId;

    public Logerros() {
    }

    public Logerros(Integer id) {
        this.id = id;
    }

    public Logerros(Integer id, String descricao, Date data, Date hora) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Pessoas getPessoasId() {
        return pessoasId;
    }

    public void setPessoasId(Pessoas pessoasId) {
        this.pessoasId = pessoasId;
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
        if (!(object instanceof Logerros)) {
            return false;
        }
        Logerros other = (Logerros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Logerros[ id=" + id + " ]";
    }
    
}
