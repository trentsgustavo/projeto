/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author gtren_000
 */
public class UsuarioCaminhao {
 
    private int idUsuario;
    private int idCaminhao;

    public UsuarioCaminhao(int idUsuario, int idCaminhao) {
        this.idUsuario = idUsuario;
        this.idCaminhao = idCaminhao;
    }

    public int getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(int idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
