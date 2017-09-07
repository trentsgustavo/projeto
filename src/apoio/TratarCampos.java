package apoio;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import templates.cor_telas;

public class TratarCampos {

    public static void limparCampos(Container container) {
        Component c[] = container.getComponents();
        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) c[i];
                field.setValue(null);
            } else if (c[i] instanceof JTextField) {
                JTextField field = (JTextField) c[i];
                field.setText("");
            } else if (c[i] instanceof JScrollPane) {
                ((JTextArea) ((JScrollPane) c[i]).getViewport().getComponent(0)).setText("");
            } else if (c[i] instanceof JComboBox) {
                JComboBox cb = (JComboBox) c[i];
                cb.setSelectedIndex(-1);
            } else if (c[i] instanceof JCheckBox) {
                JCheckBox ckb = (JCheckBox) c[i];
                ckb.setSelected(false);
            }
        }
    }

    public static boolean verificaVazios(Container container) {
        Component c[] = container.getComponents();
        System.out.println("aqui");
        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof JTextField) {
                JTextField field = (JTextField) c[i];
                System.out.println("aqui2");
                if (field.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(container, "Existem campos obrigatórios em branco");
                    field.requestFocus();
                    field.setBorder(cor_telas.bordaObrigatorio);
                    return false;
                    //break;
                }
            }
            if (c[i] instanceof JFormattedTextField) {
                JFormattedTextField jfield = (JFormattedTextField) c[i];;
                if (FormatarCampos.removerFormatacao(jfield.getText()).trim().length() == 0) {
                    JOptionPane.showMessageDialog(container, "Existem campos obrigatórios em branco \n"
                            + "Comece pelo campo " + jfield.getName());
                    jfield.requestFocus();
                    return false;
                    //break;
                }
            }
            if (c[i] instanceof JComboBox) {
                JComboBox cb = (JComboBox) c[i];
                if (cb.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(container, "Existem informações que devem ser selecionadas \n"
                            + "Verifique o campo " + cb.getName());
                    return false;
                }
            }
        }
        return true;
    }

    public static void trataObrigatorios(JTextField campo) {
        if (campo.getText().trim().length() > 0) {
            campo.setBorder(cor_telas.bordaPadrao);
        } else {
            campo.setBorder(cor_telas.bordaObrigatorio);
        }
    }

    public static void trataObrigatoriosFormatados(JFormattedTextField campo) {
        if (FormatarCampos.removerFormatacao(campo.getText()).trim().length() > 0) {
            campo.setBorder(cor_telas.bordaPadrao);
        } else {
            campo.setBorder(cor_telas.bordaObrigatorio);
        }
    }

    public static void setaBorda(Container container, boolean status) {
        Component c[] = container.getComponents();
        if (status) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] instanceof JTextField) {
                    JTextField field = (JTextField) c[i];
                    field.setBorder(cor_telas.bordaObrigatorio);
                }
            }
        } else {
            for (int i = 0; i < c.length; i++) {
                if (c[i] instanceof JTextField) {
                    JTextField field = (JTextField) c[i];
                    field.setBorder(cor_telas.bordaPadrao);
                }
            }
        }
    }
}
