package com;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ManageUser extends JFrame implements ActionListener {

    JPanel p;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JTextArea a1;
    JPasswordField p1;
    JRadioButton rb1, rb2, rb3;
    JButton b1, b2, b3;


    ManageUser() {
        super("USER_MANAGEMENT AT Medicine Store System");

        setLayout(null);

        p = new JPanel();
        p.setLayout(null);
        p.setBounds(10, 10, 550, 400);
        p.setBackground(Color.ORANGE);
        p.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "Create User", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        p.setBackground(Color.ORANGE);

        add(p);

        l1 = new JLabel("Username :");
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.WHITE);
        l1.setBounds(10, 50, 150, 20);
        p.add(l1);
        t1 = new JTextField();
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        t1.setBounds(200, 50, 150, 20);
        p.add(t1);


        l2 = new JLabel("Password :");
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.WHITE);
        l2.setBounds(10, 90, 150, 20);
        p.add(l2);

        p1 = new JPasswordField();
        p1.setBackground(Color.BLACK);
        p1.setForeground(Color.WHITE);
        p1.setBounds(200, 90, 150, 20);
        p.add(p1);
        l3 = new JLabel("Select your Gender ?");
        l3.setBackground(Color.BLACK);
        l3.setForeground(Color.WHITE);
        l3.setBounds(10, 130, 250, 20);
        p.add(l3);


        rb1 = new JRadioButton("Male");
        rb1.setBounds(200, 130, 100, 20);
        p.add(rb1);

        rb2 = new JRadioButton("female");
        rb2.setBounds(300, 130, 100, 20);
        p.add(rb2);

        rb3 = new JRadioButton("Transgender");
        rb3.setBounds(400, 130, 100, 20);
        p.add(rb3);

         ButtonGroup bg = new ButtonGroup();
         bg.add(rb1);
         bg.add(rb2);
         bg.add(rb3);

        l4 = new JLabel("Your FULL Address :");
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.WHITE);
        l4.setBounds(10, 170, 150, 20);
        p.add(l4);
        a1 = new JTextArea();
        a1.setBackground(Color.BLACK);
        a1.setForeground(Color.WHITE);
        a1.setBounds(200, 170, 150, 20);
        p.add(a1);


        b1 = new JButton("Create User");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10, 200, 150, 20);
        b1.addActionListener(this);
        p.add(b1);


      b2 = new JButton("Back to Main Screen");
      b2.setBackground(Color.BLUE);
      b2.setForeground(Color.WHITE);
      b2.setBounds(200, 200, 250, 20);
      b2.addActionListener(this);
        p.add(b2);

        setVisible(true);
        setSize(800, 800);
        setLocation(200, 200);


    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            Connection c = null;
            String gender = null;
            try {
                if (rb1.isSelected()){
                    gender = "Male";
                }else if(rb2.isSelected()){
                    gender = "Female";
                }else if (rb3.isSelected()){
                    gender = "Transgender";
                }

                c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jadmin", "India123");
                String sql = "insert into emp values(?,?,?,?)";
                PreparedStatement pst = c.prepareStatement(sql);
                pst.setString(1, t1.getText());
                pst.setString(2, p1.getText());
                pst.setString(3, gender);
                pst.setString(4, a1.getText());
                int i = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Congratulation! User Successfully Created.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            }
        if (ae.getSource() == b2) {
            try{
                setVisible(false);
            new Project("demode").setVisible(true);

        }catch(Exception e){
                System.out.println("invalid input");
            }


        }
    }


    public static void main(String args[]) {

        new ManageUser();

    }

}
