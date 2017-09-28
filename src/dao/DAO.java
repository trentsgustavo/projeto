/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.HibernateUtil;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAO<T> {

    public DAO() {
    }

    public void salvar(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacion = null;
        try {
            transacion = session.beginTransaction();
            session.save(object);
            transacion.commit();
            System.out.println("Deu certo");
        } catch (HibernateException e) {
            transacion.rollback();
            e.printStackTrace();
            System.out.println("Deu erro");
        } finally {
            session.close();
        }
    }

    public void atualizar(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacion = null;
        try {
            transacion = session.beginTransaction();
            session.update(object);
            transacion.commit();
            System.out.println("Deu certo");
        } catch (HibernateException e) {
            transacion.rollback();
            e.printStackTrace();
            System.out.println("Deu erro");
        } finally {
            session.close();
        }
    }

    public void excluir(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacion = null;
        try {
            transacion = session.beginTransaction();
            session.delete(object);
            transacion.commit();
            System.out.println("Deu certo");
        } catch (HibernateException e) {
            transacion.rollback();
            e.printStackTrace();
            System.out.println("Deu certo");
        } finally {
            session.close();
        }
    }

    public void definirPermissoes(Container tela, int id) {
        List<Component> componentList = new ArrayList<Component>();
        componentList = getAllComponents(tela);
        System.out.println(componentList = getAllComponents(tela));
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        List<Object[]> resultado = sessao.createSQLQuery("select pe.descricao, pe.id from usuarios_has_permissoes up"
                + " left join permissoes pe on (up.permissoes_id = pe.id)"
                + " left join telas tl on (pe.telas_id = tl.id)"
                + " where tl.descricao = '" + tela.getName() + "'"
                + " and up.usuarios_id = " + id).list();

        for (int j = 0; j < componentList.size(); j++) {
            System.out.println(tela.getName());
            //System.out.println("primeiro for");
            for (Object[] o : resultado) {
                //  System.out.println("segundo for");
                if (componentList.get(j).getName().equals(o[0].toString())) {
                    //System.out.println(componentList.get(j));
                    //System.out.println("aquiiiiiiiiiii");

                    componentList.get(j).setEnabled(false);
                    System.out.println("sads");
                }

            }
        }
        tela.setVisible(false);
        //JOptionPane.showMessageDialog(tela, "Você não tem permissão para esta tela!");

    }
    
    public static List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<Component>();
        for (Component comp : comps) {
            if (comp instanceof JButton && comp.getName() != null) {
                compList.add(comp);
                System.out.println(compList);
            } else if (comp instanceof JTextField && comp.getName() != null) {
                compList.add(comp);
                //System.out.println(compList);
            } else if (comp instanceof JCheckBox && comp.getName() != null) {
                compList.add(comp);
                //System.out.println(compList);
            } else if (comp instanceof Container) {
                compList.addAll(getAllComponents((Container) comp));
                //System.out.println(compList);
            }
        }
        return compList;
    }

    public List<T> query(String sql) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(sql);
        return (List<T>) query.list();
    }
}
