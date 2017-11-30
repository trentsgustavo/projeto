/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerais;

import javafx.scene.chart.PieChart;

/**
 *
 * @author Tainá Fiegenbaum
 */


public class Main {

	   public static void main(String[] args) {
	          GraficoCerto demo = new GraficoCerto("Comparação", "Qual sistema operacional você está usando?");
	          demo.pack();
	          demo.setVisible(true);
	      }
	}
