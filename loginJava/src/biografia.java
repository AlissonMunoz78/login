import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biografia {
    private JPanel bioPanel;
    private JTextArea bioTextArea;
    private JButton hobbyButton;
    private JButton logoutButton;
    private JLabel userLabel;
    private JPanel biografia;
    private JTextArea llenaTuBiografiaTextArea;
    private JLabel user2;
    private JButton cerrarSesiónButton;
    private JButton hobbiesButton;

    public biografia() {
        initializeComponents();
        userLabel.setText("Ali");
        bioTextArea.setText("Tu biografía aquí...");

        hobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame hobbyFrame = new JFrame("Hobbies");
                hobbyFrame.setContentPane(new hobbies().getHobbyPanel());
                hobbyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                hobbyFrame.pack();
                hobbyFrame.setSize(600, 400);
                hobbyFrame.setLocationRelativeTo(null);
                hobbyFrame.setVisible(true);
                SwingUtilities.getWindowAncestor(bioPanel).dispose();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame loginFrame = new JFrame("Login");
                loginFrame.setContentPane(new login().getLoginPanel());
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loginFrame.pack();
                loginFrame.setSize(400, 300);
                loginFrame.setLocationRelativeTo(null);
                loginFrame.setVisible(true);
                SwingUtilities.getWindowAncestor(bioPanel).dispose();
            }
        });
    }

    private void initializeComponents() {
        bioPanel = new JPanel();
        bioTextArea = new JTextArea();
        hobbyButton = new JButton("Hobbies");
        logoutButton = new JButton("Logout");
        userLabel = new JLabel("User");

        // Layout setup
        bioPanel.setLayout(new BoxLayout(bioPanel, BoxLayout.Y_AXIS));
        bioPanel.add(userLabel);
        bioPanel.add(new JScrollPane(bioTextArea));
        bioPanel.add(hobbyButton);
        bioPanel.add(logoutButton);
    }

    public JPanel getBioPanel() {
        return bioPanel;
    }
}
