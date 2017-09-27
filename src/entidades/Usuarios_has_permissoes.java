/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Usuarios_has_permissoes {
 
    private int idUsuario;
    private int idPermissoes;
    private boolean situacao;
    

    public Usuarios_has_permissoes(int idUsuario, int idCaminhao) {
        this.idUsuario = idUsuario;
        this.idPermissoes = idPermissoes;
        this.situacao=situacao;
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

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

}
