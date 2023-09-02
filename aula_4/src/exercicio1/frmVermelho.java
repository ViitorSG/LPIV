package exercicio1;

import javax.swing.*;

public class frmVermelho {
    private JPanel jPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frmVermelho frmVermelho = new frmVermelho();

        frame.add(frmVermelho.jPanel);

        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setTitle("Formulário vermelho");

        frame.setVisible(true);
    }
}

