package exercicio2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class register {

    static void setDocumentLabel(String selectedItem, JLabel DocumentLabel) {
        if ("Física".equals(selectedItem)) {
            DocumentLabel.setText("CPF:");
        } else {
            DocumentLabel.setText("CNPJ:");
        }
    }

    static void getSuccessMessage(String name, String employerNumber, String personDocument, String personType) {
        String successMessage = "Nome: " + name + "\nRazão Social: " + employerNumber + "\nDocumento: " + personDocument + "\nTipo de Pessoa: " + personType;
        JOptionPane.showMessageDialog(null, successMessage);
    }

    static void getErrorMessage() {
        JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
    }

    static void showMessageBox(String name, String employerNumber, String personDocument, String personType) {
        if (name.isEmpty() || employerNumber.isEmpty() || personDocument.isEmpty()) {
            getErrorMessage();
            return;
        } else {
            getSuccessMessage(name, employerNumber, personDocument, personType);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);
        frame.setLayout(new GridLayout(6, 4));

        JLabel nameLabel = new JLabel("Nome:");
        JLabel EmployerNumberLabel = new JLabel("Razão Social:");
        JLabel DocumentLabel = new JLabel("Documento:");

        JTextField fieldTextName = new JTextField();
        JTextField fieldTextEmployerNumber = new JTextField();
        JTextField fielTextDocument = new JTextField();

        JComboBox<String> comboBoxPersonType = new JComboBox<>(new String[]{"Física", "Jurídica"});

        JButton saveButton = new JButton("Salvar");

        frame.add(nameLabel);
        frame.add(fieldTextName);
        frame.add(EmployerNumberLabel);
        frame.add(fieldTextEmployerNumber);
        frame.add(DocumentLabel);
        frame.add(fielTextDocument);
        frame.add(new JLabel("Tipo de Pessoa:"));
        frame.add(comboBoxPersonType);

        comboBoxPersonType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBoxPersonType.getSelectedItem();
                setDocumentLabel(selectedItem, DocumentLabel);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fieldTextName.getText();
                String employerNumber = fieldTextEmployerNumber.getText();
                String personDocument = fielTextDocument.getText();
                String personType = (String) comboBoxPersonType.getSelectedItem();

                showMessageBox(name, employerNumber, personDocument, personType);
            }
        });

        frame.add(saveButton);
        frame.setVisible(true);
    }
}