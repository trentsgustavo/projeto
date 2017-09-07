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
@Table(name = "auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.id = :id"),
    @NamedQuery(name = "Auditoria.findByDescricao", query = "SELECT a FROM Auditoria a WHERE a.descricao = :descricao"),
    @NamedQuery(name = "Auditoria.findByData", query = "SELECT a FROM Auditoria a WHERE a.data = :data"),
    @NamedQuery(name = "Auditoria.findByHora", query = "SELECT a FROM Auditoria a WHERE a.hora = :hora"),
    @NamedQuery(name = "Auditoria.findByAtivaauditoria", query = "SELECT a FROM Auditoria a WHERE a.ativaauditoria = :ativaauditoria")})
public class Auditoria implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "ativaauditoria")
    private String ativaauditoria;
    @JoinColumn(name = "pessoas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pessoas pessoasId;

    public Auditoria() {
    }

    public Auditoria(Integer id) {
        this.id = id;
    }

    public Auditoria(Integer id, String descricao, Date data, Date hora, String ativaauditoria) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.ativaauditoria = ativaauditoria;
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

    public String getAtivaauditoria() {
        return ativaauditoria;
    }

    public void setAtivaauditoria(String ativaauditoria) {
        this.ativaauditoria = ativaauditoria;
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
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Auditoria[ id=" + id + " ]";
    }
    
}
