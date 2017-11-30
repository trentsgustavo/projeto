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

import dao.FuncoesDAO;
import dao.PessoaDAO;
import entidades.Funcoes;
import entidades.Pessoas;
import entidades.Usuarios;
import hibernate.HibernateUtil;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JFrame;
import org.hibernate.Session;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
 
public class Grafico2 extends JFrame {
 
	
 
	 public static void main( String[ ] args )throws Exception
   {
     
      String produtos[] = {
      "Meia",   
      "Mouse"
      };
        /* Create MySQL Database Connection */
      Class.forName( "com.mysql.jdbc.Driver" );
      Connection connect = DriverManager.getConnection( 
         "jdbc:postgresql://localhost:5432/Transports" ,     
         "postgres",     
         "postgres");
      
        
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("select p.descricao as produtos, count(p.id) as pedidos from produtos p, pedido pe, pedido_produtos pp \n" +
"where pp.pedido_id = pe.id and pp.produtos_id= p.id\n" +
"group by p.descricao" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
      while( resultSet.next( ) ) {
         dataset.setValue( 
         resultSet.getString("produtos" ) ,
         Double.parseDouble( resultSet.getString( "pedidos" )));
         
             JFreeChart chart = ChartFactory.createPieChart3D( 
         "Mobile Sales" ,  // chart title                   
         dataset ,         // data 
         true ,            // include legend                   
         true, 
         false);
             
    
     final PiePlot3D plot = ( PiePlot3D ) chart.getPlot( );             
      plot.setStartAngle( 270 );             
      plot.setForegroundAlpha( 0.60f );             
      plot.setInteriorGap( 0.02 );             
      int width = 640; /* Width of the image */             
      int height = 480; /* Height of the image */                             
      File pieChart3D = new File( "pie_Chart3D.jpeg" );                           
      ChartUtilities.saveChartAsJPEG( pieChart3D , chart , width , height );   
   }
   }
   

}