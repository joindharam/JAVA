package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Project extends JFrame implements ActionListener {

    JLabel l2,l3;
    JButton b1;
    String username;
    Project(String username){
        super("Homepage - Programme Management System");

        this.username = username;
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("com/img/add.png"));
        Image img = icon.getImage();
        setIconImage(img);
//
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("com/img/P1.jpg"));
        Image img1 = icon1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon icc = new ImageIcon(img1) ;
        JLabel l1 = new JLabel(icc);
        add(l1);

        l3 = new JLabel();
        l3.setFont(new Font("Sanserif", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l3.setSize(500, 20);
        l3.setBounds(100,20,700,20);
        l1.add(l3);


        l2 = new JLabel();
        l2.setFont(new Font("Sanserif", Font.BOLD, 15));
        l2.setForeground(Color.BLACK);
        l2.setSize(500, 20);
        l2.setBounds(917,10,500,25);
        l1.add(l2);
        l2.setText(username);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Supplier");
        JMenuItem m1 = new JMenuItem("Manage Supplier");
        //JMenuItem m2 = new JMenuItem("Update Supplier");
        main.setFont(new Font("Monospaced",Font.BOLD,20));
        mb.setForeground(Color.white);
        main.setForeground(Color.BLUE);

        m1.setFont(new Font("Monospaced",Font.BOLD,16));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.white);
        m1.addActionListener(this);

        JMenu Stock = new JMenu("Stocks");
        JMenuItem u1 = new JMenuItem("Manage Stock");
        //JMenuItem u2 = new JMenuItem("View Stocks");
        Stock.setFont(new Font("Monospaced",Font.BOLD,20));
        Stock.setForeground(Color.GRAY);

        u1.setFont(new Font("Monospaced",Font.BOLD,16));
        u1.setMnemonic('D');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.white);
        u1.addActionListener(this);

        JMenu User = new JMenu("User");
        JMenuItem user1 = new JMenuItem("Manage User");
        User.setFont(new Font("Monospaced",Font.BOLD,20));
        User.setForeground(Color.green);

        user1.setFont(new Font("Monospaced",Font.BOLD,16));
        user1.setMnemonic('U');
        user1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
        user1.setBackground(Color.white);
        user1.addActionListener(this);

        JMenu sellmed = new JMenu("Sell Medicine");
        JMenuItem med = new JMenuItem("Manage Medicine");
        sellmed.setFont(new Font("Monospaced",Font.BOLD,20));
        sellmed.setForeground(Color.BLUE);

        med.setFont(new Font("Monospaced",Font.BOLD,16));
        med.setMnemonic('M');
        med.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        med.setBackground(Color.white);
        med.addActionListener(this);

        JMenu ex = new JMenu("Exit");
        JMenuItem ex1 = new JMenuItem("Exit");
        ex.setFont(new Font("Monospaced",Font.BOLD,20));
        ex1.setFont(new Font("Monospaced",Font.BOLD,16));
        ex1.setBackground(Color.WHITE);
        ex1.addActionListener(this);

        JMenu about = new JMenu("View Reports");
        JMenuItem about1 = new JMenuItem("About");
        about.setForeground(Color.GREEN);
        about.setFont(new Font("Monospaced",Font.BOLD,20));
        about1.setFont(new Font("Monospaced",Font.BOLD,16));
        about1.setBackground(Color.WHITE);
        about1.addActionListener(this);

        main.add(m1);
        //main.add(m2);

        Stock.add(u1);
        //Stock.add(u2);

        User.add(user1);
        ex.add(ex1);
        sellmed.add(med);
        about.add(about1);

        mb.add(main);
        mb.add(Stock);
        mb.add(User);
        mb.add(sellmed);
        mb.add(about);
        mb.add(ex);

        setJMenuBar(mb);
        setFont(new Font("sanserif",Font.BOLD,20));
        setLayout(new FlowLayout());
        setSize(1100,700);
        setLocation(150,0);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Project("demode").setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = l2.getText();
        String action = ae.getActionCommand();
        if (action.equals("Manage Supplier")) {
            setVisible(false);
           new AddSupplier().setVisible(true);
        } else if (action.equals("Manage Stock")) {
            setVisible(false);
            new AddStock().setVisible(true);
        } else if (action.equals("Manage User")) {
            setVisible(false);
            new ManageUser().setVisible(true);
        } else if (action.equals("Manage Medicine")) {
            setVisible(false);
            new ManageMedicine().setVisible(true);
        }else if (action.equals("Exit")) {
            System.exit(0);
        }

    }

}






