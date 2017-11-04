/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class Calendario {

    SimpleDateFormat sdData = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdHora = new SimpleDateFormat("HH:mm");
    Calendar cal = new GregorianCalendar();

    public String obterDataAtualDMA() {
        return String.valueOf(sdData.format(cal.getTime()));
    }

    public String obterDataAtualMais(int dias) {
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return (sdData.format(cal.getTime()));
    }

    public String obterDataAtualMenos(int dias) {
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return (sdData.format(cal.getTime()));
    }

    public String obterHoraAtual() {
        Date data = new Date();
        return (String.valueOf(sdHora.format(data)));
    }
}
