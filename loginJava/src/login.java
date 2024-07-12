import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class login {
    private JPanel loginPanel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;
    private JLabel imageLabel;
    private JLabel coment;
    private JPasswordField password;
    private JPanel LOGIN;
    private JTextField user;

    public login() {
        initializeComponents();

        try {
            URL url = new URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.es%2Fpin%2F680958406152526092%2F&psig=AOvVaw0ZAZf6idjk_8tQH-7VEBlT&ust=1720846177537000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKjdstvZoIcDFQAAAAAdAAAAABAR");
            ImageIcon icon = new ImageIcon(url);
            imageLabel.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userTextField.getText();
                String password = new String(passwordField.getPassword());

                if ("Ali".equals(user) && "1234".equals(password)) {
                    messageLabel.setText("Login successful!");
                    JFrame bioFrame = new JFrame("Biografía");
                    bioFrame.setContentPane(new biografia().getBioPanel());
                    bioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    bioFrame.pack();
                    bioFrame.setSize(600, 400);
                    bioFrame.setLocationRelativeTo(null);
                    bioFrame.setVisible(true);
                    SwingUtilities.getWindowAncestor(loginPanel).dispose();
                } else {
                    messageLabel.setText("Invalid credentials.");
                }
            }
        });
    }

    private void initializeComponents() {
        loginPanel = new JPanel();
        userTextField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        messageLabel = new JLabel();
        imageLabel = new JLabel();

        // Layout setup
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(userTextField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(messageLabel);
        loginPanel.add(imageLabel);
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }
}
