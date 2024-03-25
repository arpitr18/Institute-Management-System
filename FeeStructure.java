package pattern.CollegeERP;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class FeeStructure extends JFrame {

    FeeStructure(){
        setSize(1000,700);
        setLocation(350,50);
        setLayout(null);

        getContentPane().setBackground(new Color(224, 195, 220));

        JLabel heading = new JLabel("Fee Structure");
        heading.setBounds(50,10,400,30);
        heading.setForeground(new Color(74,25,67));
        heading.setFont(new Font("ARIAL BLACK", Font.BOLD,25));
        add(heading);



        JTable table = new JTable();
        table.setEnabled(false);

        try{
            Conn c = new Conn();
            ResultSet resultSet =c.statement.executeQuery("Select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,60,1000,700);
        add(jsp);

        setVisible(true);
    }

    public static void main(String [] args){
        new FeeStructure();
    }
}