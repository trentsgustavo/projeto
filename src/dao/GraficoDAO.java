/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import entidades.Grafico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class GraficoDAO {
    public ArrayList<Object> consultarPedidoProdutos() {
        ArrayList<Object> Grafico = new ArrayList<>();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select p.descricao as produtos, count(p.id) as pedidos from produtos p, pedido pe, pedido_produtos pp"
                    + "where pp.pedido_id = pe.id and pp.produtos_id= p.id"
                    + "group by p.descricao";
            
             System.out.println(sql.toString());

            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                Grafico g = new Grafico();
                g.setProdutos(resultado.getString("produtos"));
                g.setQuantPedidos(resultado.getInt("pedidos"));

                Grafico.add(g);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar pedidos por produtos: " + e);
        }

        return consultarPedidoProdutos();
                
    }

}
