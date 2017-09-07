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
@Table(name = "telas_permissoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelasPermissoes.findAll", query = "SELECT t FROM TelasPermissoes t"),
    @NamedQuery(name = "TelasPermissoes.findById", query = "SELECT t FROM TelasPermissoes t WHERE t.id = :id"),
    @NamedQuery(name = "TelasPermissoes.findBySituacao", query = "SELECT t FROM TelasPermissoes t WHERE t.situacao = :situacao")})
public class TelasPermissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;
    @JoinColumn(name = "permissoes_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Permissoes permissoesId;
    @JoinColumn(name = "telas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Telas telasId;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;

    public TelasPermissoes() {
    }

    public TelasPermissoes(Integer id) {
        this.id = id;
    }

    public TelasPermissoes(Integer id, String situacao) {
        this.id = id;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Permissoes getPermissoesId() {
        return permissoesId;
    }

    public void setPermissoesId(Permissoes permissoesId) {
        this.permissoesId = permissoesId;
    }

    public Telas getTelasId() {
        return telasId;
    }

    public void setTelasId(Telas telasId) {
        this.telasId = telasId;
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
        if (!(object instanceof TelasPermissoes)) {
            return false;
        }
        TelasPermissoes other = (TelasPermissoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TelasPermissoes[ id=" + id + " ]";
    }
    
}
