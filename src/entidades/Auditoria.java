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
@Table(name = "auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.id = :id"),
    @NamedQuery(name = "Auditoria.findByDescricao", query = "SELECT a FROM Auditoria a WHERE a.descricao = :descricao"),
    @NamedQuery(name = "Auditoria.findByDatatime", query = "SELECT a FROM Auditoria a WHERE a.datatime = :datatime"),
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
    @Column(name = "datatime")
    private String datatime;
    @Basic(optional = false)
    @Column(name = "ativaauditoria")
    private boolean ativaauditoria;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;

    public Auditoria() {
    }

    public Auditoria(Integer id) {
        this.id = id;
    }

    public Auditoria(Integer id, String descricao, String datatime, boolean ativaauditoria) {
        this.id = id;
        this.descricao = descricao;
        this.datatime = datatime;
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

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public boolean getAtivaauditoria() {
        return ativaauditoria;
    }

    public void setAtivaauditoria(boolean ativaauditoria) {
        this.ativaauditoria = ativaauditoria;
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
