package exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(formulario::Formulario);
    }

    private static void Formulario() {

        JFrame formulario = new JFrame("Cores");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setSize(500, 500);
        formulario.setLayout(new FlowLayout());

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btnAmarelo = new JButton("Amarelo");
        btnAmarelo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAmarelo();
            }
        });

        JButton btnAzul = new JButton("Azul");
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAzul();
            }
        });

        JButton btnVermelho = new JButton("Vermelho");
        btnVermelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmVermelho();
            }
        });

        formulario.add(btnFechar);
        formulario.add(btnAmarelo);
        formulario.add(btnAzul);
        formulario.add(btnVermelho);
        formulario.setVisible(true);
    }

    protected static void FrmVermelho() {
        JFrame frmVermelho = new JFrame("FrmVermelho");
        frmVermelho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmVermelho.setSize(300, 200);

        JPanel panelVermelho = new JPanel();
        panelVermelho.setBackground(Color.red);
        frmVermelho.add(panelVermelho);
        frmVermelho.setVisible(true);
    }

    protected static void FrmAzul() {
        JFrame frmAzul = new JFrame("FrmAzul");
        frmAzul.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmAzul.setSize(300, 200);

        JPanel panelAzul = new JPanel();
        panelAzul.setBackground(Color.blue);
        frmAzul.add(panelAzul);
        frmAzul.setVisible(true);

    }

    private static void FrmAmarelo() {
        JFrame frmAmarelo = new JFrame("FrmAmarelo");
        frmAmarelo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmAmarelo.setSize(300, 200);

        JPanel panelAmarelo = new JPanel();
        panelAmarelo.setBackground(Color.YELLOW);
        frmAmarelo.add(panelAmarelo);
        frmAmarelo.setVisible(true);
    }
}

