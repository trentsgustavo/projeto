/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Endereco;
import entidades.Funcoes;
import entidades.Pessoas;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import entidades.Usuarios;
import hibernate.HibernateUtil;
import javax.swing.table.TableColumn;
import org.hibernate.HibernateException;

public class UsuarioDAO {

    public List<Object> consultarTodos() {
        List resultado = null;
        Usuarios u = new Usuarios();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Usuarios");
            resultado = q.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;

    }
public Object validaUser(Object o) {
        Usuarios resultado = null;
        Usuarios us = new Usuarios();
        us = (Usuarios) o;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try {
            //executa a consulta
            org.hibernate.Query q = sessao.createQuery(
                    "from Usuarios where situacao = 'a' and usuario = "+us.getUsuario()+" and u.senha = "+us.getSenha());
            System.out.println(us.getUsuario());
            resultado =  (Usuarios) q.list().iterator().next();
            System.out.println(resultado.getUsuario());
            sessao.close();
            if (resultado != null) {
                return resultado;
            }
        } catch (Exception he) {
            System.out.println("deu erro");
            //he.printStackTrace();
            return null;
        }
        return null;
    }
    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Id";
        cabecalho[1] = "Id Pessoa";
        cabecalho[2] = "Id Funcao";
        cabecalho[3] = "Usuario";
        cabecalho[4] = "Senha";
        cabecalho[5] = "Situação";
        
        

        // cria matriz de acordo com nº de registros da tabela
        List resultado = null;
        int lin = 0;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Usuarios");
            resultado = q.list();
            System.out.println("tamanho:" + resultado.size());

            dadosTabela = new Object[resultado.size()][6];

            for (Object o : resultado) {
                Usuarios u = (Usuarios) o;
                Pessoas p = new PessoaDAO().consultarID(u.getPessoasId().getId());
                Funcoes f = new FuncoesDAO().consultarID(u.getFuncoesId().getId());
                
                dadosTabela[lin][0] = u.getId();
                dadosTabela[lin][1] = u.getPessoasId().getNome()+" "+u.getPessoasId().getSobrenome();
                dadosTabela[lin][2] = u.getFuncoesId().getDescricao();
                dadosTabela[lin][3] = u.getUsuario();
                dadosTabela[lin][4] = u.getSenha();
                dadosTabela[lin][5] = u.getSituacao();
                
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
    
    public Usuarios consultarID(int id) {
        List resultado = null;
        Usuarios s = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        try {

            org.hibernate.Query q = sessao.createQuery("from Usuarios where id = " + id);
            resultado = q.list();

            for (Object o : resultado) {
                s = (Usuarios) o;
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return s;
    }
    
    public Usuarios consultarLogin(String user) {
        List resultado = null;
        Usuarios s = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        try {

            org.hibernate.Query q = sessao.createQuery("from Usuarios where usuario = '" + user +"'");
            resultado = q.list();
            System.out.println(resultado);

            for (Object o : resultado) {
                s = (Usuarios) o;
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return s;
    }

}
