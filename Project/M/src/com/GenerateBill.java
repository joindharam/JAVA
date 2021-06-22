package com;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;


public class GenerateBill extends JFrame {
    JLabel l1;
    Choice c1,c2;
    JButton b1;
    JTextArea t1;
    JPanel p1;
    int order_id;
    
    public GenerateBill(int order_id) {
        super("Generate Your Bill");
        this.order_id = order_id;

        setSize(500,900);
        setLayout(new BorderLayout());
        
        p1 = new JPanel();
        
        l1 = new JLabel("Medical Store Billing System");

        t1 = new JTextArea(60,15);
        t1.setEditable(false);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("senserif", Font.ITALIC, 18));


        p1.add(l1);
        add(p1, "North");
        add(jsp, "Center");
        double total = 0;

        try {
            dbcon con = new dbcon();
            ResultSet resultSet = con.s.executeQuery("select * from orders where o_id='"+order_id+"'");
            while (resultSet.next()){
                t1.append("\nBill Number            : "+'\t'+resultSet.getString("o_id"));
                t1.append("\nPatient Name           : "+'\t'+resultSet.getString("o_name"));
                t1.append("\nPrescribed Doctor Name : "+'\t'+resultSet.getString("O_DOC_PREC"));
                t1.append("\nPatient Address        : "+'\t'+resultSet.getString("O_address"));
                t1.append("\nPatient Age            : "+'\t'+resultSet.getString("O_age"));
                t1.append("\n Medicines Purchased at Bill            : ");
                t1.append("\n-------------------------------------------------------------------------------------------------------");
                t1.append("\nMedicine Id\tMedicine Name\tQuantity\tPrice\n");
                t1.append("\n-------------------------------------------------------------------------------------------------------");
                t1.append("\n"+resultSet.getString("O_ITEMS"));
                total = Double.parseDouble(resultSet.getString("grand_total"));
            }
                t1.append("\n-------------------------------------------------------------------------------------------------------");
                t1.append('\n'+"Payable Amount : "+'\t'+'\t'+'\t'+String.valueOf(total));
        }catch (Exception ex){
            ex.printStackTrace();
        }

        setSize(900,800);
        setLocation(350,40);
        
    }

    public static void main(String[] args) {
        new GenerateBill(0).setVisible(true);
    }

}
