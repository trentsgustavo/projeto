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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "permissoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissoes.findAll", query = "SELECT p FROM Permissoes p"),
    @NamedQuery(name = "Permissoes.findById", query = "SELECT p FROM Permissoes p WHERE p.id = :id"),
    @NamedQuery(name = "Permissoes.findByDescricao", query = "SELECT p FROM Permissoes p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Permissoes.findByPermissaovisibilidadetela", query = "SELECT p FROM Permissoes p WHERE p.permissaovisibilidadetela = :permissaovisibilidadetela"),
    @NamedQuery(name = "Permissoes.findByPermissaoedicaotela", query = "SELECT p FROM Permissoes p WHERE p.permissaoedicaotela = :permissaoedicaotela"),
    @NamedQuery(name = "Permissoes.findByPermissaobtninclusao", query = "SELECT p FROM Permissoes p WHERE p.permissaobtninclusao = :permissaobtninclusao"),
    @NamedQuery(name = "Permissoes.findByPermissaobtnedicao", query = "SELECT p FROM Permissoes p WHERE p.permissaobtnedicao = :permissaobtnedicao"),
    @NamedQuery(name = "Permissoes.findByPermissaobtnexclusao", query = "SELECT p FROM Permissoes p WHERE p.permissaobtnexclusao = :permissaobtnexclusao"),
    @NamedQuery(name = "Permissoes.findByPermissaoconsulta", query = "SELECT p FROM Permissoes p WHERE p.permissaoconsulta = :permissaoconsulta"),
    @NamedQuery(name = "Permissoes.findByPermissoesativas", query = "SELECT p FROM Permissoes p WHERE p.permissoesativas = :permissoesativas")})
public class Permissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "permissaovisibilidadetela")
    private String permissaovisibilidadetela;
    @Column(name = "permissaoedicaotela")
    private String permissaoedicaotela;
    @Column(name = "permissaobtninclusao")
    private String permissaobtninclusao;
    @Column(name = "permissaobtnedicao")
    private String permissaobtnedicao;
    @Column(name = "permissaobtnexclusao")
    private String permissaobtnexclusao;
    @Column(name = "permissaoconsulta")
    private String permissaoconsulta;
    @Column(name = "permissoesativas")
    private String permissoesativas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissoesId")
    private Collection<TelasPermissoes> telasPermissoesCollection;

    public Permissoes() {
    }

    public Permissoes(Integer id) {
        this.id = id;
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

    public String getPermissaovisibilidadetela() {
        return permissaovisibilidadetela;
    }

    public void setPermissaovisibilidadetela(String permissaovisibilidadetela) {
        this.permissaovisibilidadetela = permissaovisibilidadetela;
    }

    public String getPermissaoedicaotela() {
        return permissaoedicaotela;
    }

    public void setPermissaoedicaotela(String permissaoedicaotela) {
        this.permissaoedicaotela = permissaoedicaotela;
    }

    public String getPermissaobtninclusao() {
        return permissaobtninclusao;
    }

    public void setPermissaobtninclusao(String permissaobtninclusao) {
        this.permissaobtninclusao = permissaobtninclusao;
    }

    public String getPermissaobtnedicao() {
        return permissaobtnedicao;
    }

    public void setPermissaobtnedicao(String permissaobtnedicao) {
        this.permissaobtnedicao = permissaobtnedicao;
    }

    public String getPermissaobtnexclusao() {
        return permissaobtnexclusao;
    }

    public void setPermissaobtnexclusao(String permissaobtnexclusao) {
        this.permissaobtnexclusao = permissaobtnexclusao;
    }

    public String getPermissaoconsulta() {
        return permissaoconsulta;
    }

    public void setPermissaoconsulta(String permissaoconsulta) {
        this.permissaoconsulta = permissaoconsulta;
    }

    public String getPermissoesativas() {
        return permissoesativas;
    }

    public void setPermissoesativas(String permissoesativas) {
        this.permissoesativas = permissoesativas;
    }

    @XmlTransient
    public Collection<TelasPermissoes> getTelasPermissoesCollection() {
        return telasPermissoesCollection;
    }

    public void setTelasPermissoesCollection(Collection<TelasPermissoes> telasPermissoesCollection) {
        this.telasPermissoesCollection = telasPermissoesCollection;
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
        if (!(object instanceof Permissoes)) {
            return false;
        }
        Permissoes other = (Permissoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Permissoes[ id=" + id + " ]";
    }
    
}
