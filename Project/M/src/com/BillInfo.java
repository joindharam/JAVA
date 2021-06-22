package com;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class BillInfo extends JFrame implements ActionListener{
    JPanel p;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5;
    int order_id;
    public BillInfo(int order_id){
        this.order_id = order_id;
        setLayout(null);

        p = new JPanel();
        p.setLayout(null);
        p.setBounds(20, 20, 550, 400);
        p.setBackground(Color.cyan);
        p.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "Order Generate", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));


        add(p);
        l1 = new JLabel("Order ID :");
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.WHITE);
        l1.setBounds(10, 50, 150, 20);
        p.add(l1);
        t1 = new JTextField();
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        t1.setBounds(200, 50, 150, 20);
        t1.setEditable(false);
        p.add(t1);
        t1.setText(String.valueOf(order_id));


        l2 = new JLabel("Name of Patient:");
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.WHITE);
        l2.setBounds(10, 90, 150, 20);
        p.add(l2);

        t2 = new JTextField();
        t2.setBackground(Color.BLACK);
        t2.setForeground(Color.WHITE);
        t2.setBounds(200, 90, 150, 20);
        p.add(t2);


        l3 = new JLabel("Prescribed Doctor Name:");
        l3.setBackground(Color.BLACK);
        l3.setForeground(Color.WHITE);
        l3.setBounds(10, 130, 150, 20);
        p.add(l3);

        t3 = new JTextField();
        t3.setBackground(Color.BLACK);
        t3.setForeground(Color.WHITE);
        t3.setBounds(200, 130, 150, 20);
        p.add(t3);

        l4 = new JLabel("Patient Address:");
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.WHITE);
        l4.setBounds(10, 170, 150, 20);
        p.add(l4);

        t4 = new JTextField();
        t4.setBackground(Color.BLACK);
        t4.setForeground(Color.WHITE);
        t4.setBounds(200, 170, 150, 20);
        p.add(t4);

        l5= new JLabel("Patient AGE");
        l5.setBackground(Color.BLACK);
        l5.setForeground(Color.WHITE);
        l5.setBounds(10, 210, 150, 20);
        p.add(l5);

        t5 = new JTextField();
        t5.setBackground(Color.BLACK);
        t5.setForeground(Color.WHITE);
        t5.setBounds(200, 210, 150, 20);
        p.add(t5);

        b1 = new JButton("Generate Bills");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10, 240, 150, 20);
        b1.addActionListener(this);
        p.add(b1);

         setSize(600,800);
         setLocation(300,100);

    }

    public static void main(String[] args) {
        new BillInfo(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            dbcon c = new dbcon();
            try {
                System.out.println(order_id);
                c.s.executeUpdate("update orders set o_name='"+t2.getText()+"' , O_DOC_PREC='"+t3.getText()+"',O_ADDRESS='"+t4.getText()+"',O_AGE='"+Integer.parseInt(t5.getText())+"' where o_id='"+order_id+"'");

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Order Is Saved.");
            setVisible(false);
            GenerateBill bill = new GenerateBill(order_id);
            bill.setVisible(true);
        }

    }
}
