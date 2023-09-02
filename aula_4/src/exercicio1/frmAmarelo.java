package exercicio1;

import javax.swing.*;

public class frmAmarelo {
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frmAmarelo frmAmarelo = new frmAmarelo();

        frame.add(frmAmarelo.panel1);

        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setTitle("Formulário amarelo");

        frame.setVisible(true);
    }
}
