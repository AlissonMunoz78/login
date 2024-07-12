import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class biografia {
    private JPanel biografia;
    private JTextArea textArea1;
    private JButton hobbiesButton;
    private JButton cerrarSesiónButton;
    private JLabel user2;

    public biografia() {

        JFrame frame = new JFrame("Biografia");
        frame.setContentPane(biografia);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        user2.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                user2.setText("Adrian");
            }
        });
        textArea1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new login();
            }
        });
        hobbiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new hobbies();
            }
        });
    }

    public JPanel BIOGRAFIA() {
        return biografia;
    }
}
