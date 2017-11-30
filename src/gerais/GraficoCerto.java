/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerais;
import dao.GraficoDAO;
import dao.PedidoProdutoDAO;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Tainá Fiegenbaum
 */


public class GraficoCerto extends JFrame {
 
	private static final long serialVersionUID = 1L;
 
	public GraficoCerto(String applicationTitle, String chartTitle) {
		super(applicationTitle);
		// Isso irá criar o conjunto de dados
		PieDataset dataset = createDataset();
 
		// com base no conjunto de dados que criamos o gráfico
		JFreeChart chart = createChart(dataset, chartTitle);
 
		// vamos colocar o gráfico em um painel
		ChartPanel chartPanel = new ChartPanel(chart);
 
		// default tamanho
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
 
		// adiciona a nossa aplicação
		setContentPane(chartPanel);
 
	}
 
	/**
	 * Cria um conjunto de dados de amostra 
	 */
 
	private PieDataset createDataset() {
            GraficoDAO pp= new GraficoDAO();
            entidades.Grafico g = new entidades.Grafico();
       //     for (int i = 0; i < pp.consultarPedidoProdutos().size(); i++) {
                
        //    }
		DefaultPieDataset result = new DefaultPieDataset();
                ArrayList<Object> pontos = pp.consultarPedidoProdutos();
                System.out.println(g.getQuantPedidos());

	    for (int i = 0; i < pontos.size(); i++) 	
	    {
                //result.setValue(pontos.get(i).getProdutos(),pontos.get(i).getQuantPedidos());
            }
                
		//result.setValue(g.getProdutos(),g.getQuantPedidos());
                System.out.println(pp.consultarPedidoProdutos());
                //System.out.println(g.getQuantPedidos());
		result.setValue("Mac", 20);
		result.setValue("Windows", 51);
		return result;
 
	}
 
	/**
	 * Cria um gráfico 
	 */
 
	private JFreeChart createChart(PieDataset dataset, String title) {
 
		JFreeChart chart = ChartFactory.createPieChart3D(title, // título / gráfico 
				dataset, // dados 
				true, // include lenda
				true, false);
 
		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(290);
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.5f);
		return chart;
 
	}
 
}
