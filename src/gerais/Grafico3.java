/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerais;

/**
 *
 * @author Tainá Fiegenbaum
 */
import entidades.Produtos;
import hibernate.HibernateUtil;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;
import org.hibernate.Session;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class Grafico3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private PieDataset dataset;
    private JFreeChart grafico;

    public Grafico3(String tituloAplicacao, String tituloGrafico) {
        super(tituloAplicacao);
        //cria o dataset
        this.dataset = criaDataset();
        //baseando no dataset criamos o gráfico
        this.grafico = criaGrafico(dataset, tituloGrafico);
        //insere o painel no gráfico
        ChartPanel painelGrafico = new ChartPanel(grafico);
        //tamanho padrão
        painelGrafico.setPreferredSize(new Dimension(500, 270));
        //adiciona o painel à aplicação
        setContentPane(painelGrafico);
    }

    //cria um simples dataset
    public DefaultPieDataset criaDataset() {
        DefaultPieDataset resultado = new DefaultPieDataset();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        org.hibernate.Query q = sessao.createQuery("select p.descricao as Produtos, count(p.id) as Pedido from Produtos p, Pedido pe, PedidoProdutos pp \n"
                + "where pp.pedidoId = pe.id and pp.produtosId= p.id\n"
                + "group by p.descricao");

        //for (int i = 0; i < q.list().size(); i++) {
        System.out.println(q.list().toString());
        Object o[] = q.list().toArray();
        System.out.println("xx: " + o);
        //}

//        
//        while (q.list().size() > 0) {
//            resultado.setValue("produtos", q.list().size());
//        }
        return resultado;
    }

    //cria o gráfico
    private JFreeChart criaGrafico(PieDataset dataset, String titulo) {
        JFreeChart graf = ChartFactory.createPieChart3D(
                titulo, dataset, true, true, false);
        PiePlot3D enredo = (PiePlot3D) graf.getPlot();
        enredo.setStartAngle(290);
        enredo.setDirection(Rotation.CLOCKWISE);
        enredo.setForegroundAlpha(0.5f);
        return graf;
    }
}
