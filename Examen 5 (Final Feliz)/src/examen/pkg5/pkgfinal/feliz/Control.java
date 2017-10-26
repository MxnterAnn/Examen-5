package examen.pkg5.pkgfinal.feliz;

import java.awt.event.*;
import javax.swing.*;

public class Control implements ActionListener {

    Vista ab;
    double z, v, c, b, e, f, h, TP, ISR, SAL, SIN, AFO, TD, SANT;

    public Control() {
        ab = new Vista();
        ab.setVisible(true);
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(50);
        nm.setMinimum(0);
        nm.setStepSize(1);
        ab.jh.setModel(nm);
        SpinnerNumberModel mn = new SpinnerNumberModel();
        nm.setMaximum(50);
        nm.setMinimum(0);
        nm.setStepSize(1);
        ab.ja.setModel(mn);
        ab.calcular.addActionListener(this);
        ab.borrar.addActionListener(this);

    }

    public static void main(String[] args) {
        Control c = new Control();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        z = Double.parseDouble(ab.jh.getValue().toString());
        v = Double.parseDouble(ab.ja.getValue().toString());
        if (ab.cbopuestos.getSelectedIndex() == 0) {
            c = z * 200;
            b = c * 0.015;
            e = c * 0.025;
            f = c * 0.03;
            h = v * 150;
            TP = c + b + e + f + h;
            ISR = c * 0.16;
            SAL = c * 0.035;
            SIN = c * 0.01;
            AFO = c * 0.02;
            TD = ISR + SAL + SIN + AFO;
            SANT = TP - TD;
            if (ab.calcular == ae.getSource()) {
                ab.area.setText("PERCEPCIONES\tDEDUCCIONES\n"
                        + "SUELDO BASE\t$" + c + "\tISR\t$" + ISR + "\n"
                        + "CANA_BÁSICA\t$" + b + "\tSALUD\t$" + SAL + "\n"
                        + "CAPACITACIÓN\t$" + e + "\tSINDICATO\t$" + SIN + "\n"
                        + "APOYO\t$" + f + "\tAFORE\t$" + AFO + "\n"
                        + "ANTIGUADAD\t$" + h + "\tTD: \t$" + TD + "\n"
                        + "TP: \t$" + TP + "\tSALA_NETO:\t$" + SANT + "\n");
            }
            if (ab.borrar == ae.getSource()) {
                ab.area.setText("");
            }

        }
        if (ab.cbopuestos.getSelectedIndex() == 1) {
            c = z * 100;
            b = c * 0.015;
            e = c * 0.025;
            f = c * 0.03;
            h = v * 150;
            TP = c + b + e + f + h;
            ISR = c * 0.16;
            SAL = c * 0.035;
            SIN = c * 0.01;
            AFO = c * 0.02;
            TD = ISR + SAL + SIN + AFO;
            SANT = TP - TD;
            if (ab.calcular == ae.getSource()) {
                ab.area.setText("PERCEPCIONES\tDEDUCCIONES\n"
                        + "SUELDO BASE\t$" + c + "\tISR\t$" + ISR + "\n"
                        + "CANA_BÁSICA\t$" + b + "\tSALUD\t$" + SAL + "\n"
                        + "CAPACITACIÓN\t$" + e + "\tSINDICATO\t$" + SIN + "\n"
                        + "APOYO\t$" + f + "\tAFORE\t$" + AFO + "\n"
                        + "ANTIGUADAD\t$" + h + "\tTD: \t$" + TD + "\n"
                        + "TP: \t$" + TP + "\tSALA_NETO:\t$" + SANT + "\n");
            }
            if (ab.borrar == ae.getSource()) {
                ab.area.setText("");
            }

        }
        if (ab.cbopuestos.getSelectedIndex() == 2) {
            c = z * 70;
            b = c * 0.015;
            e = c * 0.025;
            f = c * 0.03;
            h = v * 150;
            TP = c + b + e + f + h;
            ISR = c * 0.16;
            SAL = c * 0.035;
            SIN = c * 0.01;
            AFO = c * 0.02;
            TD = ISR + SAL + SIN + AFO;
            SANT = TP - TD;
            if (ab.calcular == ae.getSource()) {
                ab.area.setText("PERCEPCIONES\tDEDUCCIONES\n"
                        + "SUELDO BASE\t$" + c + "\tISR\t$" + ISR + "\n"
                        + "CANA_BÁSICA\t$" + b + "\tSALUD\t$" + SAL + "\n"
                        + "CAPACITACIÓN\t$" + e + "\tSINDICATO\t$" + SIN + "\n"
                        + "APOYO\t$" + f + "\tAFORE\t$" + AFO + "\n"
                        + "ANTIGUADAD\t$" + h + "\tTD: \t$" + TD + "\n"
                        + "TP: \t$" + TP + "\tSALA_NETO:\t$" + SANT + "\n");
            }
            if (ab.borrar == ae.getSource()) {
                ab.area.setText("");
            }
        }
    }

}
