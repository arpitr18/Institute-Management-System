package pattern.CollegeERP;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddTeacher extends JFrame implements ActionListener {

    JTextField tfname, tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfaadhar;
    JLabel labelempId;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
    JButton submit, cancel;

    Random ran= new Random();
    long first4= Math.abs((ran.nextLong() % 9000L)+ 1000L);

    AddTeacher(){
        setSize(900,700);
        setLocation (350, 50);
        getContentPane().setBackground(new Color(224, 195, 220));
        setLayout(null);

        JLabel heading = new JLabel("New Teacher Details");
        heading.setForeground(new Color(74,25,67));
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("Arial Black", Font.BOLD, 20));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setForeground(new Color(74,25,67));
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname= new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        tfname.setForeground(new Color(74,25,67));
        tfname.setFont(new Font("Times New Roman",Font.PLAIN,16));
        tfname.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("^[A-Za-z]+$"); // Allows only alphabetic characters
            }
        });

        add(tfname);

        JLabel lblfname = new JLabel("Surname");
        heading.setForeground(new Color(74,25,67));
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        tffname= new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        tffname.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("^[A-Za-z]+$"); // Allows only alphabetic characters
            }
        });
        add(tffname);

        JLabel lblempid = new JLabel("Employee ID");
        lblempid.setBounds(50, 200, 200, 30);
        lblempid.setFont(new Font("serif", Font.BOLD, 20));
        add(lblempid);

        labelempId = new JLabel("101"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("serif", Font.BOLD, 20));
        add(labelempId);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);

        dcdob= new JDateChooser();
        dcdob.setBounds (600,200,150,30);
        add(dcdob);

        JLabel lblfaddress = new JLabel("Address");
        lblfaddress.setBounds(50, 250, 200, 30);
        lblfaddress.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfaddress);

        tfaddress= new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone= new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        tfphone.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("\\d{10}");
            }
        });
        add(tfphone);

        JLabel lblfemail = new JLabel("Email ID");
        lblfemail.setBounds(50, 300, 200, 30);
        lblfemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfemail);

        tfemail= new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel lblx = new JLabel("Class X (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 20));
        add(lblx);

        tfx= new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);

        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif", Font.BOLD, 20));
        add(lblxii);

        tfxii= new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);

        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("serif", Font.BOLD, 20));
        add(lblaadhar);

        tfaadhar= new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        tfaadhar.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("\\d{12}");
            }
        });
        add(tfaadhar);

        JLabel lblcourse = new JLabel("Qualification");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcourse);

        String course[]= {"BTech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "Mcom", "MA", "BA"};
        cbcourse= new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);

        JLabel lblbranch = new JLabel("Department");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(lblbranch);

        String branch[]= {"COMP", "IT", "EXTC", "ECS", "AIDS" , "AIML", "IOT", "CIVIL" ,"MECHANICAL"};
        cbbranch= new JComboBox(branch);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);

        submit=new JButton("Submit");
        submit.setBounds(250,550,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(450,550,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);



        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if (tfname.getInputVerifier().shouldYieldFocus(tfname)) {
            JOptionPane.showMessageDialog(null, "Valid name and Surname");

        } else {
            JOptionPane.showMessageDialog(null, "Invalid name. Please enter only alphabetic characters.");
        }if (tffname.getInputVerifier().shouldYieldFocus(tffname)){

        }else{
            JOptionPane.showMessageDialog(null, "Invalid name. Please enter only alphabetic characters.");
        }if (tfphone.getInputVerifier().shouldYieldFocus(tfphone)) {
            // JOptionPane.showMessageDialog(null, "Valid phone number: " + tfphone.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter exactly 10 digits.");
        }if (tfaadhar.getInputVerifier().shouldYieldFocus(tfaadhar)) {
            // JOptionPane.showMessageDialog(null, "Valid phone number: " + tfphone.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Invalid aadhar number. Please enter exactly 12 digits.");
        }

        if (ae.getSource()==submit){
            String name=tfname.getText();
            String fname=tffname.getText();
            String empid=labelempId.getText();
            String dob=((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String x=tfx.getText();
            String xii=tfxii.getText();
            String aadhar=tfaadhar.getText();
            String course=(String)cbcourse.getSelectedItem();
            String branch=(String)cbbranch.getSelectedItem();
            try{
                String empId = null;
                String qualification = null;
                String department;
                department = null;
                String query= "insert into teacher values('"+name+"','"+fname+"','"+empid+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+qualification+"','"+department+"')";
                Conn con=new Conn();
                con.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully!");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String [] args) {
        new AddTeacher();
    }
}

