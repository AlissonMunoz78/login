import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class hobbies {
    private JButton biografiaButton;
    private JPanel hobbies;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;

    public hobbies() {
        JFrame hobbiesFrame = new JFrame("Hobbies");
        hobbiesFrame.setContentPane(hobbies);
        hobbiesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hobbiesFrame.pack();
        hobbiesFrame.setSize(1000, 1000);
        hobbiesFrame.setLocationRelativeTo(null);
        hobbiesFrame.setVisible(true);

        try{
            URL urlimg1 = new URL("https://www.movilzona.es/app/uploads-movilzona.es/2023/09/mejores-apps-para-escuchar-musica-en-el-movil.jpg?x=480&y=375&quality=40");
            ImageIcon icon1 = new ImageIcon(urlimg1);
            img1.setIcon(icon1);

            URL urlimg2 = new URL("https://i.blogs.es/c66e83/python3/450_1000.jpeg");
            ImageIcon icon2 = new ImageIcon(urlimg2);
            img2.setIcon(icon2);

            URL urlimg3 = new URL("https://www.webconsultas.com/sites/default/files/styles/wc_adaptive_noticia__small/public/media/2022/07/14/videojuegos_decisiones.jpg");
            ImageIcon icon3 = new ImageIcon(urlimg3);
            img3.setIcon(icon3);

            URL urlimg4 = new URL("https://img.freepik.com/fotos-premium/hombre-descansa-gimnasio-despues-hacer-ejercicio_600776-30728.jpg");
            ImageIcon icon4 = new ImageIcon(urlimg4);
            img4.setIcon(icon4);

        } catch (Exception e){
            e.printStackTrace();
        }

        biografiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hobbiesFrame.setVisible(false);
                new biografia();
            }
        });
    }

    public JPanel getHobbiesPanel() {
        return hobbies;
    }
}