package exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario extends Component {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton blueButton = new JButton("Azul");
        JButton yellowButton = new JButton("Amarelo");
        JButton redButton = new JButton("Vermelho");
        JButton closeButton = new JButton("Fechar");

        frmAmarelo frmAmarelo = new frmAmarelo();

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmAmarelo frmAmarelo = new frmAmarelo();
                frmAmarelo.main(args);
            }
        });

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVermelho frmVermelho = new frmVermelho();
                frmVermelho.main(args);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmAzul frmAzul = new frmAzul();
                frmAzul.main(args);
            }
        });

        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setTitle("Formulário");

        panel.add(blueButton);
        panel.add(yellowButton);
        panel.add(redButton);
        panel.add(closeButton);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
