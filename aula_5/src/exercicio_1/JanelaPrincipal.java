package exercicio_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal {
    private JDesktopPane desktopPane;

    public JanelaPrincipal() {
        JFrame frame = new JFrame("Aplicação MDI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        desktopPane = new JDesktopPane();
        frame.add(desktopPane);
        createMenuBar(frame);
        frame.setVisible(true);

    }

    private void createMenuBar(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();

        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenu editMenu = new JMenu("Edit");
        JMenu help = new JMenu("Ajuda");

        JMenuItem clienteMenuItem = new JMenuItem("Cliente");
        clienteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openClienteForm();
            }
        });
        cadastroMenu.add(clienteMenuItem);

        JMenuItem produtoMenuItem = new JMenuItem("produto");
        produtoMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProdutoForm();
            }
        });
        cadastroMenu.add(produtoMenuItem);

        JMenuItem fornecedorMenuItem = new JMenuItem("Fornecedor");
        fornecedorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFornecedorForm();
            }
        });
        cadastroMenu.add(fornecedorMenuItem);

        JMenuItem exitOption = new JMenuItem("Exit");
        exitOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cadastroMenu.add(exitOption);

        menuBar.add(cadastroMenu);
        menuBar.add(editMenu);
        menuBar.add(help);

        frame.setJMenuBar(menuBar);
    }

    private void openProdutoForm() {
        JInternalFrame produtoFrame = new JInternalFrame("Cadastro de Produto", true, true, true, true);
        JPanel panel = new JPanel();
        JButton button = new JButton("Salvar Produto");
        panel.add(button);
        produtoFrame.add(panel);
        produtoFrame.setSize(500, 500);
        desktopPane.add(produtoFrame);
        produtoFrame.setVisible(true);
    }

    private void openClienteForm() {
        JInternalFrame clienteFrame = new JInternalFrame("Cadastro de Cliente", true, true, true, true);
        JPanel panel = new JPanel();
        JButton button = new JButton("Salvar Cliente");
        panel.add(button);
        clienteFrame.add(panel);
        clienteFrame.setSize(500, 500);
        desktopPane.add(clienteFrame);
        clienteFrame.setVisible(true);
    }

    private void openFornecedorForm() {
        JInternalFrame fornecedorFrame = new JInternalFrame("Cadastro de Fornecedor", true, true, true, true);
        JPanel panel = new JPanel();
        JButton button = new JButton("Salvar Fornecedor");
        panel.add(button);
        fornecedorFrame.add(panel);
        fornecedorFrame.setSize(500, 500);
        desktopPane.add(fornecedorFrame);
        fornecedorFrame.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}
