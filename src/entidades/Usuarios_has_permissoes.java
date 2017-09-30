/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Usuarios_has_permissoes {
 
    private int idUsuario;
    private int idPermissoes;
    

    public Usuarios_has_permissoes(int idUsuario, int idCaminhao) {
        this.idUsuario = idUsuario;
        this.idPermissoes = idPermissoes;
    }

    public Usuarios_has_permissoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPermissoes() {
        return idPermissoes;
    }

    public void setIdPermissoes(int idPermissoes) {
        this.idPermissoes = idPermissoes;
    }

}
