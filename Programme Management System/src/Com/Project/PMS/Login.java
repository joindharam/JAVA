package Com.Project.PMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    public Login(){
        setLayout(null);

         l1 = new JLabel("Username");
        l1.setFont(new Font("Monospaced",Font.BOLD,20));
        l1.setForeground(Color.BLACK);
        l1.setBounds(60,20,100,30);
        add(l1);

         t1 = new JTextField();
        t1.setFont(new Font("Arial",Font.ITALIC,19));
        t1.setForeground(Color.green);
        t1.setBounds(200,20,180,30);
        add(t1);

         l2 = new JLabel("Password");
        l2.setFont(new Font("Monospaced",Font.BOLD,20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(60,70,100,30);
        add(l2);

         t2 = new JPasswordField();
        t2.setFont(new Font("Arial",Font.ITALIC,19));
        t2.setForeground(Color.green);
        t2.setBounds(200,70,180,30);
        add(t2);

         b1 = new JButton("Login");
        b1.setFont(new Font("Monospaced",Font.BOLD,19));
        b1.setBackground(Color.MAGENTA);
        b1.setForeground(Color.green);
        b1.setBounds(100,120,100,30);
        add(b1);

         b2 = new JButton("SignUp");
        b2.setFont(new Font("Monospaced",Font.BOLD,19));
        b2.setBackground(Color.MAGENTA);
        b2.setForeground(Color.green);
        b2.setBounds(250,120,100,30);
        add(b2);

         b3 = new JButton("Exit");
        b3.setFont(new Font("Monospaced",Font.BOLD,19));
        b3.setBackground(Color.MAGENTA);
        b3.setForeground(Color.green);
        b3.setBounds(170,170,100,30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(500,300);
        setLocation(400,100);
    }

    public void actionPerformed(ActionEvent ae){
        String uname,pass;
        if(ae.getSource() == b1){
                uname =t1.getText();
                pass = t2.getText();
                conn c1 = new conn();
                try{
                    ResultSet rs = c1.s.executeQuery("select * from login where uname = '"+uname+"' and password = '"+pass+"'");
                    if (rs.next()){
                        this.setVisible(false);
                        new Homepage().setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null,"Username and Password Dosen't Match ");
                        this.setVisible(false);
                    }
                }catch (Exception e){}
            }
        if (ae.getSource() == b2){
                setVisible(false);
                new SignUp().setVisible(true);
            }
        if (ae.getSource() == b3){
            System.exit(0);
        }
        }


    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
