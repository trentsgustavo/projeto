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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
    @NamedQuery(name = "Permissoes.findBySituacao", query = "SELECT p FROM Permissoes p WHERE p.situacao = :situacao")})
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
    private Boolean permissaovisibilidadetela;
    @Column(name = "permissaoedicaotela")
    private Boolean permissaoedicaotela;
    @Column(name = "permissaobtninclusao")
    private Boolean permissaobtninclusao;
    @Column(name = "permissaobtnedicao")
    private Boolean permissaobtnedicao;
    @Column(name = "permissaobtnexclusao")
    private Boolean permissaobtnexclusao;
    @Column(name = "permissaoconsulta")
    private Boolean permissaoconsulta;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;

    public Permissoes() {
    }

    public Permissoes(Integer id) {
        this.id = id;
    }

    public Permissoes(Integer id, String situacao) {
        this.id = id;
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

    public Boolean getPermissaovisibilidadetela() {
        return permissaovisibilidadetela;
    }

    public void setPermissaovisibilidadetela(Boolean permissaovisibilidadetela) {
        this.permissaovisibilidadetela = permissaovisibilidadetela;
    }

    public Boolean getPermissaoedicaotela() {
        return permissaoedicaotela;
    }

    public void setPermissaoedicaotela(Boolean permissaoedicaotela) {
        this.permissaoedicaotela = permissaoedicaotela;
    }

    public Boolean getPermissaobtninclusao() {
        return permissaobtninclusao;
    }

    public void setPermissaobtninclusao(Boolean permissaobtninclusao) {
        this.permissaobtninclusao = permissaobtninclusao;
    }

    public Boolean getPermissaobtnedicao() {
        return permissaobtnedicao;
    }

    public void setPermissaobtnedicao(Boolean permissaobtnedicao) {
        this.permissaobtnedicao = permissaobtnedicao;
    }

    public Boolean getPermissaobtnexclusao() {
        return permissaobtnexclusao;
    }

    public void setPermissaobtnexclusao(Boolean permissaobtnexclusao) {
        this.permissaobtnexclusao = permissaobtnexclusao;
    }

    public Boolean getPermissaoconsulta() {
        return permissaoconsulta;
    }

    public void setPermissaoconsulta(Boolean permissaoconsulta) {
        this.permissaoconsulta = permissaoconsulta;
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
