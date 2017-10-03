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
@Table(name = "permissoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissoes.findAll", query = "SELECT p FROM Permissoes p"),
    @NamedQuery(name = "Permissoes.findById", query = "SELECT p FROM Permissoes p WHERE p.id = :id"),
    @NamedQuery(name = "Permissoes.findByDescricao", query = "SELECT p FROM Permissoes p WHERE p.descricao = :descricao")
    })
public class Permissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @JoinColumn(name = "telas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Telas telasId;

    public Permissoes() {
    }

    public Permissoes(Integer id) {
        this.id = id;
    }

    public Permissoes(Integer id, boolean situacao) {
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

    public Telas getTelasId() {
        return telasId;
    }

    public void setTelasId(Telas telasId) {
        this.telasId = telasId;
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
