package pattern.CollegeERP;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class StudentDetails extends JFrame implements ActionListener {
    Choice choice;
    JTable tabel;

    JButton search, print, update, add, cancel;

    StudentDetails() {
        getContentPane().setBackground(new Color(224, 195, 220));

        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(20, 20, 150, 20);
        heading.setForeground(new Color(74, 25, 67));
        add(heading);

        choice = new Choice();
        choice.setBounds(180, 20, 150, 20);
        add(choice);

        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from student");

            while (resultSet.next()) {
                choice.add(resultSet.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        tabel = new JTable();
        tabel.setEnabled(false);
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery(" select * from student");
            tabel.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }


        JScrollPane js = new JScrollPane(tabel);
        js.setBounds(0, 100, 900, 600);
        add(js);


        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        add = new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add.addActionListener(this);
        add(add);

        update = new JButton("Update");
        update.setBounds(320, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);


        setLayout(null);
        setSize(900, 700);
        setLocation(350, 50);
        setVisible(true);
        setResizable(false);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String q = " select * from student where rollno = '" + choice.getSelectedItem() + "'";

            try {
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery(q);
                tabel.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception E) {
                E.printStackTrace();
            }

        } else if (e.getSource()==print){    //PRINT
            try{
                tabel.print();

            }catch(Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource()== add) {
            setVisible(false);
            new AddStudent();

        } else if (e.getSource()== update) {
            new UpdateStudent();

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new StudentDetails();

    }
}