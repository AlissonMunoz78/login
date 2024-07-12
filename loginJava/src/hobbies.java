import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class hobbies {
    private JPanel hobbyPanel;
    private JButton backButton;
    private JLabel hobbyImageLabel;
    private JPanel hobbies;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;
    private JButton biografiaButton;

    public hobbies() {
        initializeComponents();

        try {
            URL url = new URL("https://i.pinimg.com/564x/2c/08/24/2c0824495213775ca5fb69b21d7bcaa9.jpg");
            ImageIcon originalIcon = new ImageIcon(url);
            ImageIcon scaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT)); // Adjust size here
            hobbyImageLabel.setIcon(scaledIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame bioFrame = new JFrame("Biografía");
                bioFrame.setContentPane(new biografia().getBioPanel());
                bioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                bioFrame.pack();
                bioFrame.setSize(600, 400);
                bioFrame.setLocationRelativeTo(null);
                bioFrame.setVisible(true);
                SwingUtilities.getWindowAncestor(hobbyPanel).dispose();
            }
        });
    }

    private void initializeComponents() {
        hobbyPanel = new JPanel();
        backButton = new JButton("Back to Biografía");
        hobbyImageLabel = new JLabel();

        // Layout setup
        hobbyPanel.setLayout(new BoxLayout(hobbyPanel, BoxLayout.Y_AXIS));
        hobbyPanel.add(hobbyImageLabel);
        hobbyPanel.add(backButton);
    }

    public JPanel getHobbyPanel() {
        return hobbyPanel;
    }
}
