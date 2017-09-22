/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.swing.JTable;
import org.hibernate.Session;
import entidades.Permissoes;
import entidades.Usuarios;
import hibernate.HibernateUtil;

/**
 *
 * @author ederson
 */
public class TelasPermissoesDAO {


    public List<Object> consultar(String criterio) {
        List resultado = null;
        Usuarios us = new Usuarios();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            //executa a consulta
            org.hibernate.Query q = sessao.createQuery("from TelasPermissoes where telasPermissoesAtiva = true and fkIdUsuarios = " + criterio);
            resultado = q.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro: " + he);
            //he.printStackTrace();
        }
        
        return null;
        
    }

  
}
