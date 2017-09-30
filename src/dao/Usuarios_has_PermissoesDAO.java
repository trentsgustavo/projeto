/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.HibernateUtil;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entidades.Usuarios_has_permissoes;

/**
 *
 * @author gtren_000
 */
public class Usuarios_has_PermissoesDAO {
    
    public List<Object> consultarTodos() {
        List resultado = null;
        Usuarios_has_permissoes up = new Usuarios_has_permissoes();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Usuarios_has_permissoes");
            resultado = q.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar Usuarios_has_permissoes");
            //he.printStackTrace();
        }
        return resultado;

    }

    public int contarTodos() {
        int resultado = 0;
        Usuarios_has_permissoes prod = new Usuarios_has_permissoes();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Usuarios_has_permissoes");
            resultado = q.list().size();
            System.out.println(resultado);
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;

    }

    public String salvarReturnID(Object o) {
        //inicializa variaveis necessarias
        String retorno = null;
        Session sessao = null;
        Usuarios_has_permissoes up = (Usuarios_has_permissoes) o;
        //Executa a inserção

        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        try {
            //retorno = String.valueOf(endereco.getIdProduto());
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
        Object[] cabecalho = new Object[2];
        cabecalho[0] = "Id Usuário";
        cabecalho[1] = "Id Permissoes";

        // cria matriz de acordo com nº de registros da tabela
        List resultado = null;
        int lin = 0;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Endereco");
            resultado = q.list();
            System.out.println("tamanho:" + resultado.size());

            dadosTabela = new Object[resultado.size()][2];

            for (Object o : resultado) {
                Usuarios_has_permissoes up = (Usuarios_has_permissoes) o;
                dadosTabela[lin][0] = up.getIdUsuario();
                dadosTabela[lin][1] = up.getIdPermissoes();
                lin++;
            }

        } catch (Exception e) {
            System.out.println("problemas para popular tabela Usuarios_has_permissoes");
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

    public Usuarios_has_permissoes consultarID(int id) {
        List resultado = null;
        Usuarios_has_permissoes s = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        try {

            org.hibernate.Query q = sessao.createQuery("from Usuarios_has_permissoes where id = " + id);
            resultado = q.list();

            for (Object o : resultado) {
                s = (Usuarios_has_permissoes) o;
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return s;
    }
    
}
