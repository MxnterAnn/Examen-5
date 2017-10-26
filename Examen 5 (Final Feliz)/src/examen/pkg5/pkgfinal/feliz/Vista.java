package examen.pkg5.pkgfinal.feliz;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JSpinner jh, ja;
    JComboBox cbopuestos;
    JLabel lpu, lhr, lan;
    JButton calcular, borrar;
    JTextArea area;

    public Vista() {
        this.setTitle("Un Final Feliz");
        this.setSize(500, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        lpu = new JLabel("Puesto: ");
        this.getContentPane().add(lpu, new AbsoluteConstraints                  (20, 20, 100, 25));
        lhr = new JLabel("Horas: ");
        this.getContentPane().add(lhr, new AbsoluteConstraints                  (20, 60, 100, 25));
        lan = new JLabel("Antiguedad: ");
        this.getContentPane().add(lan, new AbsoluteConstraints                  (20, 90, 100, 25));
        cbopuestos = new JComboBox();
        this.getContentPane().add(cbopuestos, new AbsoluteConstraints           (130, 20, 130, 30));
        jh = new JSpinner();
        this.getContentPane().add(jh, new AbsoluteConstraints                   (130, 60, 100, 25));
        ja = new JSpinner();
        this.getContentPane().add(ja, new AbsoluteConstraints                   (130, 90, 100, 25));
        calcular = new JButton("Calcular");
        this.getContentPane().add(calcular, new AbsoluteConstraints             (280, 20, 100, 40));
        borrar = new JButton("Borrar");
        this.getContentPane().add(borrar, new AbsoluteConstraints               (280, 70, 100, 40));

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Gerente El Chido");
        modelo.addElement("Cajero El Crack");
        modelo.addElement("Intendente :v");
        cbopuestos.setModel(modelo);
        area = new JTextArea();
        area.setBorder(new LineBorder(Color.LIGHT_GRAY, 6, true));
        this.getContentPane().add(area, new AbsoluteConstraints(20, 150, 400, 150));

    }

    public static void main(String[] args) {
        Vista ab = new Vista();
        ab.setVisible(true);
    }

}
