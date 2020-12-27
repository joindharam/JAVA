package Com.Project.PMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewAdmission extends JFrame implements ActionListener{



        JLabel l1,l2,l3,l4,l5,l6;
        JPasswordField p1;
        JTextField t1,t2,t3,t4,t5;
        JRadioButton r1,r2,r3;
        JButton b1,b2,b3;

        NewAdmission() {
            setLayout(null);
            l1 = new JLabel("Email as Username");

            l1.setFont(new Font("Monospaced", Font.BOLD, 20));
            l1.setForeground(Color.black);
            l1.setBounds(60, 40, 150, 30);
            add(l1);

            t1 = new JTextField();
            t1.setFont(new Font("Arial", Font.ITALIC, 20));
            t1.setForeground(Color.BLACK);
            t1.setBounds(270, 40, 200, 30);
            add(t1);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            String Name = "";
            String pass = "";
            String email = "";
            String gender = "";
            String Hp = "";
            StringBuilder statusNull = new StringBuilder("");
            StringBuilder validationErrors = new StringBuilder("");
            statusNull.length();

            if (e.getSource() == b1) {

            }
        }
        public static void main(String[] args) {

            new NewAdmission().setVisible(true);
        }


    }






