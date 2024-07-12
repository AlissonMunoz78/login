import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class login {
    private JPanel LOGIN;
    private JTextField user;
    private JTextField password;
    private JButton loginButton;
    private JLabel coment;
    private JLabel imageLabel;

    public Container LOGIN() {
        return LOGIN;
    }

    public login() {

        try{
            URL url = new URL("https://static.vecteezy.com/system/resources/thumbnails/019/879/186/small/user-icon-on-transparent-background-free-png.png");
            ImageIcon icon = new ImageIcon(url);
            imageLabel.setIcon(icon);
        } catch (Exception e){
            e.printStackTrace();
        }

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(user.getText());
            }
        });
        password.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText());
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getText().equals("admin") && password.getText().equals("admin")) {
                    coment.setText("Conectado");
                    JFrame login = new JFrame();
                    login.setVisible(false);
                    new biografia();
                } else {
                    coment.setText("Usuario o contraseña incorrecto");
                }
            }
        });
    }
}

