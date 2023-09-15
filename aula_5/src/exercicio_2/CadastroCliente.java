package exercicio_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class CadastroCliente extends JFrame {
    private JTextField nomeField, telefoneField, emailField, salarioField;

    public CadastroCliente() {
        setTitle("Cadastro de Cliente");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        JLabel telefoneLabel = new JLabel("Telefone:");
        JLabel emailLabel = new JLabel("E-mail:");
        JLabel salarioLabel = new JLabel("Salário:");

        nomeField = new JTextField();
        telefoneField = new JTextField();
        emailField = new JTextField();
        salarioField = new JTextField();

        JButton salvarButton = new JButton("Salvar");
        JButton lerButton = new JButton("Ler");

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDados();
            }
        });

        lerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lerDados();
            }
        });

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(telefoneLabel);
        panel.add(telefoneField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(salarioLabel);
        panel.add(salarioField);
        panel.add(salvarButton);
        panel.add(lerButton);

        add(panel);
    }

    private void salvarDados() {
        try {
            String nome = nomeField.getText();
            String telefone = telefoneField.getText();
            String email = emailField.getText();
            String salario = salarioField.getText();

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/develop/faculdade/LPIV/aula_5/src/exercicio_2/client.txt"));
            writer.write("Nome: " + nome + "\n");
            writer.write("Telefone: " + telefone + "\n");
            writer.write("E-mail: " + email + "\n");
            writer.write("Salário: " + salario + "\n");
            writer.close();

            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar os dados.");
        }
    }

    private void lerDados() {
        try {
            String clientTxt = "C:/develop/faculdade/LPIV/aula_5/src/exercicio_2/client.txt";

            Scanner scanner = new Scanner(new File(clientTxt));

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(":");
                if (partes.length == 2) {
                    String chave = partes[0].trim();
                    String valor = partes[1].trim();

                    if (chave.equals("Nome")) {
                        nomeField.setText(valor);
                    } else if (chave.equals("Telefone")) {
                        telefoneField.setText(valor);
                    } else if (chave.equals("E-mail")) {
                        emailField.setText(valor);
                    } else if (chave.equals("Salário")) {
                        salarioField.setText(valor);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Arquivo não encontrado.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }
}
