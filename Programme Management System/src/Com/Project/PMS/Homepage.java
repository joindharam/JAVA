package Com.Project.PMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame implements ActionListener {
    Homepage(){
        setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0,1200,30);

        JMenu main = new JMenu("Student-Corner");
        main.setFont(new Font("Sanserif",Font.BOLD,18));
        main.setBackground(Color.WHITE);
        main.setForeground(Color.blue);

        JMenuItem m1 = new JMenuItem("New Addmision");
        m1.setFont(new Font("Arial",Font.BOLD,16));
        m1.setBackground(Color.CYAN);
        m1.setForeground(Color.orange);
        JMenuItem m2 = new JMenuItem("Post Graduate Courses");
        m2.setFont(new Font("Arial",Font.BOLD,16));
        m2.setBackground(Color.CYAN);
        m2.setForeground(Color.orange);

        JMenuItem m3 = new JMenuItem("Graduate Courses");
        m3.setFont(new Font("Arial",Font.BOLD,16));
        m3.setBackground(Color.CYAN);
        m3.setForeground(Color.orange);
        JMenuItem m4 = new JMenuItem("Diploma/Certificate Courses");
        m4.setFont(new Font("Arial",Font.BOLD,16));
        m4.setBackground(Color.CYAN);
        m4.setForeground(Color.orange);


        main.add(m1);
        main.add(m2);
        main.add(m3);
        main.add(m4);

        menuBar.add(main);
        add(menuBar);

        setSize(1200,700);
        setLocation(100,0);
    }

    public static void main(String[] args) {
        new Homepage().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
