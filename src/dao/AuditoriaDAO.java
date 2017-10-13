/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entidades.Auditoria;
import entidades.Usuarios;
import apoio.FormatarCampos;
import hibernate.HibernateUtil;
import java.util.List;
import telas.IfrConfiguracoes;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class AuditoriaDAO {

    public boolean salvar(Object o) {
        //inicializa variaveis necessarias
        //Object aud = <property name="show_sql">true</property>;
        Session sessao = null;

        Usuarios us = new Usuarios();
        IfrConfiguracoes ifrConfig = new IfrConfiguracoes();
        Auditoria aud = (Auditoria) o;
        //Executa a inserção
        //deu certo retorna true
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        try {
            aud.setUsuariosId(us);
            us.setId(1);
            System.out.println("Usuário: " + us);
            aud.setDatatime(FormatarCampos.getDataHoraAtual());
            System.out.println("hora");
            aud.setDescricao("Salvou!");

            aud.setAtivaauditoria(ifrConfig.verificaEstado());
            //ifrConfig.setChkAtivaAuditoria(aud);
            System.out.println("auditoria");
            sessao.save(aud);
            sessao.save(o);
            t.commit();
            return true;
            //deu erro retorna false
        } catch (Exception he) {
            LogErroDAO.salvarLog(he, us);
            //he.printStackTrace();
            return false;
        } finally {
            sessao.close();
        }
    }

    public static void salvarSalvou(Object o, Usuarios us) {
        Session sessao = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        Auditoria aud = new Auditoria();
        IfrConfiguracoes ifrConfig = new IfrConfiguracoes();
        if (ifrConfig.chamaChkAtivaAuditoria()) {
            System.out.println("VAI SALVAR");
            aud.setDescricao("Salvou!");
            aud.setDatatime(FormatarCampos.getDataHoraAtual());
            aud.setUsuariosId(us);
            System.out.println(us);
            us.setId(1);
            sessao.save(aud);
            sessao.save(o);
            t.commit();
        } else {
            System.out.println("entrou no else");
            sessao.save(o);
            t.commit();
        }
    }

    public static void Atualizou(Object o, Usuarios us) {
        Session sessao = null;
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        Auditoria aud = new Auditoria();
        IfrConfiguracoes ifrConfig = new IfrConfiguracoes();

        if (ifrConfig.chamaChkAtivaAuditoria()) {
            System.out.println("VAI SALVAR");
            aud.setDescricao("Atualizou!");
            aud.setDatatime(FormatarCampos.getDataHoraAtual());
            aud.setUsuariosId(us);
            System.out.println(us);
            us.setId(1);
            sessao.save(aud);
            sessao.update(o);
            t.commit();
        } else {
            System.out.println("entrou no else");
            sessao.update(o);
            t.commit();
        }
    }
public Object consultaEstado(boolean estado) {
    List resultado = null;
        Auditoria a = new Auditoria();
        Usuarios us = new Usuarios();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            //executa a consulta
            org.hibernate.Query q = sessao.createQuery("select ativaAuditoria from Auditoria" + estado);
            resultado = q.list();
            sessao.close();
            for (Object o : resultado) {
                System.out.println("Resultado:::: ");
                a = (Auditoria) o;
                return a;
            }
        } catch (Exception he) {
            LogErroDAO.salvarLog(he, us);
            //he.printStackTrace();
        }
        return null;    
    }
}
