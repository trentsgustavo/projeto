/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.swing.JTable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entidades.Logerros;
import entidades.Usuarios;
import apoio.FormatarCampos;
import hibernate.HibernateUtil;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class LogErroDAO {

    public boolean salvar(Object o) {
        return true;
    }

    public static void salvarLog(Object erro, Usuarios us) {
        Exception he = (Exception) erro;
        Logerros le = new Logerros();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        try {
            System.out.println("Erro: " + he);
            le.setDescricao(he.toString());
            le.setDatatime(FormatarCampos.getDataHoraAtual());
            le.setUsuariosId(us);
            //us.getIdUsuarios();
            us.setId(1);

            System.out.println("Usuário: " + us);

            sessao.save(le);
            t.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

}
