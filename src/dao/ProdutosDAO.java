/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entidades.Produtos;
import hibernate.HibernateUtil;
import javax.swing.table.TableColumn;
import org.hibernate.Query;
import dao.DAO;
import entidades.Usuarios;
import org.hibernate.HibernateException;

public class ProdutosDAO {

    public List<Object> consultarTodos() {
        List resultado = null;
        Produtos prod = new Produtos();
        Usuarios us = new Usuarios();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Produtos");
            resultado = q.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
             LogErroDAO.salvarLog(he, us);
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;

    }
     public int contarTodos() {
        int resultado = 0;
        Produtos prod = new Produtos();
        try {
           Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            System.out.println("aqui");
            org.hibernate.Query q = sessao.createQuery("select max(produtos.id) from produtos");
            System.out.println("aqui2");

            resultado = q.getMaxResults()+1;
            System.out.println(resultado);
            sessao.close(); 
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            System.out.println(resultado);
             return resultado;
        }
        return resultado +1;
    }


    public String salvarReturnID(Object o) {
        //inicializa variaveis necessarias
        String retorno = null;
        Session sessao = null;
        Produtos produtos = (Produtos) o;
        //Executa a inserção

        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        try {
            //retorno = String.valueOf(produtos.getIdProduto());
            return retorno;
            //deu erro retorna false
        } catch (Exception he) {
            //LogErroDAO.salvarLog(he, us);
            he.printStackTrace();
            return retorno;
        } finally {
            sessao.close();
        }

    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Id";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Peso";
        cabecalho[3] = "Situação";

        // cria matriz de acordo com nº de registros da tabela
        List resultado = null;
        int lin = 0;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Produtos");
            resultado = q.list();
            System.out.println("tamanho:" + resultado.size());

            dadosTabela = new Object[resultado.size()][4];

            for (Object o : resultado) {
                Produtos p = (Produtos) o;
                dadosTabela[lin][0] = p.getId();
                dadosTabela[lin][1] = p.getDescricao();
                dadosTabela[lin][2] = p.getPeso();
                dadosTabela[lin][3] = p.getSituacao();
                lin++;
            }

        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }
        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;

            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
                }
        }
    }
    
    public Produtos consultarID(int id) {
        List resultado = null;
        Produtos s = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        try {

            org.hibernate.Query q = sessao.createQuery("from Produtos where id = " + id);
            resultado = q.list();

            for (Object o : resultado) {
                s = (Produtos) o;
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return s;
    }

}
