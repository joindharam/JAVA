package Com.Project.PMS;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class splash extends JFrame {

    public static void main(String[] args) {
        Frame f = new Frame();

        f.setSize(800,600);
        f.setLocation(300,30);
        f.setVisible(true);

        Thread t = new Thread(
                ()->{
                    try {
                        Thread.sleep(5000);
                        f.setVisible(false);
                        new Login().setVisible(true);

                    }catch (Exception e){}

                }
        );
        t.start();
    }

}
class Frame extends JFrame{
    Frame(){
        super("University Management System");
        setLayout(new FlowLayout());

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("Com/Project/PMS/icon/priscilla-du-preez-XkKCui44iM0-unsplash.jpg"));
        Image img = ic1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon icc1 = new ImageIcon(img);

        JLabel l1 = new JLabel(icc1);
        add(l1);
    }
}
