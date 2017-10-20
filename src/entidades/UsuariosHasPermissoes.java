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
 * @author gtren_000
 */
@Entity
@Table(name = "usuarios_has_permissoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosHasPermissoes.findAll", query = "SELECT u FROM UsuariosHasPermissoes u"),
    @NamedQuery(name = "UsuariosHasPermissoes.findById", query = "SELECT u FROM UsuariosHasPermissoes u WHERE u.id = :id"),
    @NamedQuery(name = "UsuariosHasPermissoes.findBySituacao", query = "SELECT u FROM UsuariosHasPermissoes u WHERE u.situacao = :situacao")})
public class UsuariosHasPermissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "situacao")
    private boolean situacao;
    @JoinColumn(name = "permissoes_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Permissoes permissoesId;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;

    public UsuariosHasPermissoes() {
    }

    public UsuariosHasPermissoes(Integer id) {
        this.id = id;
    }

    public UsuariosHasPermissoes(Integer id, boolean situacao) {
        this.id = id;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Permissoes getPermissoesId() {
        return permissoesId;
    }

    public void setPermissoesId(Permissoes permissoesId) {
        this.permissoesId = permissoesId;
    }

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
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
        if (!(object instanceof UsuariosHasPermissoes)) {
            return false;
        }
        UsuariosHasPermissoes other = (UsuariosHasPermissoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.UsuariosHasPermissoes[ id=" + id + " ]";
    }
    
}
