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
import entidades.Pedido;
import hibernate.HibernateUtil;
import javax.swing.table.TableColumn;
import org.hibernate.HibernateException;

public class PedidoDAO {

    public List<Object> consultarTodos() {
        List resultado = null;
        Pedido pes = new Pedido();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Pedido");
            resultado = q.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;

    }

    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Id";
        cabecalho[1] = "Usuário ID";
        cabecalho[2] = "Pessoa ID";
        cabecalho[3] = "Data";
        cabecalho[4] = "Hora";
        cabecalho[5] = "Situação";
   

        // cria matriz de acordo com nº de registros da tabela
        List resultado = null;
        int lin = 0;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Pedido");
            resultado = q.list();
            System.out.println("tamanho:" + resultado.size());

            dadosTabela = new Object[resultado.size()][6];

            for (Object o : resultado) {
                Pedido pes = (Pedido) o;
                PedidoDAO pd = new PedidoDAO();
                dadosTabela[lin][0] = pes.getId();
                dadosTabela[lin][1] = pes.getUsuariosId();
                dadosTabela[lin][2] = pes.getPessoasId().getNome();
                dadosTabela[lin][3] = pes.getData();
                dadosTabela[lin][4] = pes.getHora();
                dadosTabela[lin][5] = pes.getSituacao();
              
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

    public Pedido consultarID(int id) {
        List resultado = null;
        Pedido s = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        try {

            org.hibernate.Query q = sessao.createQuery("from Pedido where id = " + id);
            resultado = q.list();

            for (Object o : resultado) {
                s = (Pedido) o;
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return s;
    }

}
