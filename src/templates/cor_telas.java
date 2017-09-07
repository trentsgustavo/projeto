/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author ederson
 */
public class cor_telas {

    public static LineBorder bordaObrigatorio = new LineBorder(Color.RED, 2, true);
    public static LineBorder bordaPadrao = new LineBorder(Color.WHITE, 1, true);

    /**
     * @return the bordaObrigatorio
     */
    public LineBorder getBordaObrigatorio() {
        return bordaObrigatorio;
    }

    /**
     * @return the bordaPadrao
     */
    public LineBorder getBordaPadrao() {
        return bordaPadrao;
    }
    
    

}
