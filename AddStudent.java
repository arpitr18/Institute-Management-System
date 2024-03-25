package pattern.CollegeERP;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class AddStudent extends JFrame implements ActionListener {

    JTextField tfname, tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfaadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
    JButton submit, cancel;
    Character character;


    Random ran= new Random();
    long first4= Math.abs((ran.nextLong() % 9000L)+ 1000L);

    AddStudent(){
        setSize(900,700);
        setLocation (350, 50);
        //setBackground(new Color(74, 25, 67));
        setLayout(null);
        getContentPane().setBackground(new Color(74,25,67));
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setBackground(new Color(74, 25, 67));
        //setIconImage();

        JLabel heading = new JLabel("New Student Details");
        heading.setForeground(new Color(224, 195, 220));
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("ARIAL BLACK", Font.BOLD, 20));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setForeground(new Color(224, 195, 220));
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname= new JTextField();
        tfname.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tfname.setBounds(200, 150, 150, 30);
        //VALIDATION
        tfname.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("^[A-Za-z]+$"); // Allows only alphabetic characters
            }
        });
        add(tfname);

        JLabel lblfname = new JLabel(" Surname");
        lblfname.setForeground(new Color(224, 195, 220));
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);

        tffname= new JTextField();
        tffname.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tffname.setBounds(600, 150, 150, 30);

        //VALIDATION
        tffname.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("^[A-Za-z]+$"); // Allows only alphabetic characters
            }
        });
        add(tffname);

        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setForeground(new Color(224, 195, 220));
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(lblrollno);

        labelrollno = new JLabel("1"+first4);
        labelrollno.setForeground(new Color(224, 195, 220));
        labelrollno.setBounds(200, 200, 200, 30);
        labelrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(labelrollno);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setForeground(new Color(224, 195, 220));
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);

        dcdob= new JDateChooser();
        dcdob.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        dcdob.setBounds(600,200,150,30);
        add(dcdob);

        JLabel lblfaddress = new JLabel("Address");
        lblfaddress.setForeground(new Color(224, 195, 220));
        lblfaddress.setBounds(50, 250, 200, 30);
        lblfaddress.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfaddress);

        tfaddress= new JTextField();
        tfaddress.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setForeground(new Color(224, 195, 220));
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone= new JTextField(10);
        tfphone.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tfphone.setBounds(600, 250, 150, 30);
        tfphone.setText("0");
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
        lblfemail.setForeground(new Color(224, 195, 220));
        lblfemail.setBounds(50, 300, 200, 30);
        lblfemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfemail);

        tfemail= new JTextField();
        tfemail.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel lblx = new JLabel("Class X (%)");
        lblx.setForeground(new Color(224, 195, 220));
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 20));
        add(lblx);

        tfx= new JTextField();
        tfx.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tfx.setBounds(600, 300, 150, 30);
        tfx.setFont(new Font("Sitka Subheading Semibold",Font.PLAIN,15));
        tfx.setText("0");
        tfx.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("\\d{2}");
            }
        });
        add(tfx);

        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setForeground(new Color(224, 195, 220));
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif", Font.BOLD, 20));
        add(lblxii);

        tfxii= new JTextField();
        tfxii.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
        tfxii.setBounds(200, 350, 150, 30);
        tfxii.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText().trim();
                return text.matches("\\d{2}");
            }
        });
        add(tfxii);

        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setForeground(new Color(224, 195, 220));
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("serif", Font.BOLD, 20));

        add(lblaadhar);

        tfaadhar= new JTextField(12);
        tfaadhar.setFont(new Font("ARIAL BLACK", Font.PLAIN,12));
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

        JLabel lblcourse = new JLabel("Course");
        lblcourse.setForeground(new Color(224, 195, 220));
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcourse);

        String course[]= {"BTech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "Mcom", "MA", "BA"};
        cbcourse= new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);

        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setForeground(new Color(224, 195, 220));
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(lblbranch);

        String branch[]= {"COMP", "IT", "EXTC", "ECS", "AIDS" , "AIML", "IOT", "CIVIL" ,"MECHANICAL"};
        //cbbranch.setForeground(new Color(224, 195, 220));
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


        /*ImageIcon i44 = new ImageIcon(ClassLoader.getSystemResource("icon/watermark.png"));
        Image i54 = i44.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i64 = new ImageIcon(i54);
        JLabel image = new JLabel(i64);
        image.setBounds(0,0,900,700);
        add(image);*/

        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setEnabled(true);
        setTitle("Add Student Details");
    }





    public void actionPerformed(ActionEvent ae){
        if (tfname.getInputVerifier().shouldYieldFocus(tfname)) {
            JOptionPane.showMessageDialog(null, "Valid name and Surname");

        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid name and Surname. Please enter only alphabetic characters.");

        }
        if (tffname.getInputVerifier().shouldYieldFocus(tffname)){
            //  JOptionPane.showMessageDialog(null, "Valid Surname: " + tffname.getText());
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Surname. Please enter only alphabetic characters.");
        }
        if (tfphone.getInputVerifier().shouldYieldFocus(tfphone)) {
            // JOptionPane.showMessageDialog(null, "Valid phone number: " + tfphone.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter exactly 10 digits.");
        }
        if (tfaadhar.getInputVerifier().shouldYieldFocus(tfaadhar)) {
            // JOptionPane.showMessageDialog(null, "Valid phone number: " + tfphone.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Invalid aadhar number. Please enter exactly 12 digits.");
        }
        if (tfx.getInputVerifier().shouldYieldFocus(tfx)){

        }else{
            JOptionPane.showMessageDialog(null,"Invalid X Marks,Only Number");
        }
        if(tfxii.getInputVerifier().shouldYieldFocus(tfxii)){

        }else{
            JOptionPane.showMessageDialog(null,"Invalid XII Marks,Only Number");
        }
        // CANCEL BUTTON WORKING
//          if (ae.getSource()==cancel){
//              System.exit(Integer.parseInt("0"));
//          }
        if (ae.getSource()==submit){

            String name=tfname.getText();
            String fname=tffname.getText();
            String rollno=labelrollno.getText();
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
                String query= "insert into student values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"')";
                Conn con =new Conn();
                con.statement.executeUpdate(query);
                //  PreparedStatement pstmt = con.prepareStatement(query);
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully!");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(e);
            }
        }
        else {setVisible(true);}
    }



    public static void main(String [] args)
    {
        new AddStudent();
    }
}

