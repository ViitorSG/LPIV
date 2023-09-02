package exercicio1;

import javax.swing.*;

public class frmAzul {
    private JPanel jPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frmAzul frmAzul = new frmAzul();

        frame.add(frmAzul.jPanel);

        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setTitle("Formulário Azul");

        frame.setVisible(true);
    }
}