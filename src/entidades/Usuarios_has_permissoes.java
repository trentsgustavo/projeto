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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios_has_permissoes.findAll", query = "SELECT u FROM Usuarios_has_permissoes u"),
    @NamedQuery(name = "Usuarios_has_permissoes.findByUsuariosId", query = "SELECT u FROM Usuarios_has_permissoes u WHERE u.usuariosId = :usuariosId"),
    @NamedQuery(name = "Usuarios_has_permissoes.findByPermissoesId", query = "SELECT u FROM Usuarios_has_permissoes u WHERE u.permissoesId = :permissoesId")
})
/**
 *
 * @author gtren_000
 */
public class Usuarios_has_permissoes implements Serializable {
    @Basic(optional = false)
    @Column(name = "usuarios_id")
    private int usuariosId;
    
    @Basic(optional = false)
    @Column(name = "permissoes_id")
    private int permissoesId;
    @Id
    private Integer Id;

    public Usuarios_has_permissoes(int usuariosId, int permissoesId) {
        this.usuariosId = usuariosId;
        this.permissoesId = permissoesId;
    }

    public Usuarios_has_permissoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(int usuariosId) {
        this.usuariosId = usuariosId;
    }

    public int getPermissoesId() {
        return permissoesId;
    }

    public void setPermissoesId(int permissoesId) {
        this.permissoesId = permissoesId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    
}
