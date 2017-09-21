/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tainá Fiegenbaum
 */
@Entity
@Table(name = "funcoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcoes.findAll", query = "SELECT f FROM Funcoes f"),
    @NamedQuery(name = "Funcoes.findById", query = "SELECT f FROM Funcoes f WHERE f.id = :id"),
    @NamedQuery(name = "Funcoes.findByDescricao", query = "SELECT f FROM Funcoes f WHERE f.descricao = :descricao"),
    @NamedQuery(name = "Funcoes.findBySituacao", query = "SELECT f FROM Funcoes f WHERE f.situacao = :situacao")})
public class Funcoes implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcoesId")
    private Collection<Usuarios> usuariosCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;

    public Funcoes() {
    }

    public Funcoes(Integer id) {
        this.id = id;
    }

    public Funcoes(Integer id, String descricao, String situacao) {
        this.id = id;
        this.descricao = descricao;
        this.situacao = situacao;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
        if (!(object instanceof Funcoes)) {
            return false;
        }
        Funcoes other = (Funcoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Funcoes[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }
    
}
