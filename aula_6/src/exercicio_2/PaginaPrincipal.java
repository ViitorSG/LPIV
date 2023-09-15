package exercicio_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaPrincipal extends JFrame implements ActionListener {

    private final JDesktopPane desktopPane;

    public PaginaPrincipal() {
        // Configurar a janela principal
        setTitle("Sistema MDI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar um JDesktopPane para a interface MDI
        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        // Criar a barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menu "Cadastros"
        JMenu cadastrosMenu = new JMenu("Cadastros");
        menuBar.add(cadastrosMenu);

        // Submenu "Cliente"
        JMenuItem clienteMenuItem = new JMenuItem("Cliente");
        cadastrosMenu.add(clienteMenuItem);
        clienteMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cliente")) {
            // Ação para abrir uma janela de cadastro de clientes
            JInternalFrame clienteFrame = new JInternalFrame("Cadastro de Clientes", true, true, true, true);
            clienteFrame.setSize(400, 300);
            desktopPane.add(clienteFrame);
            clienteFrame.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PaginaPrincipal principal = new PaginaPrincipal();
            principal.setVisible(true);
        });
    }
}