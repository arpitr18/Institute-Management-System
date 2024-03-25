package pattern.CollegeERP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EnterMarks extends JFrame implements ActionListener{

    Choice crollno;
    JComboBox cbsemester;
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub5,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5;
    JButton cancel,submit;

    EnterMarks(){

        setSize(1000,500);
        setLocation(350,150);
        setLayout(null);

        getContentPane().setBackground(new Color(224, 195, 220));

//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/exam.png"));
//        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
//        ImageIcon i3= new ImageIcon(i2);
//        JLabel image= new JLabel(i3);
//        image.setBounds(500,40,400,300);
//        add(image);

        JLabel heading= new JLabel ("Enter Marks of Student");
        heading.setBounds(50,0,500,50);
        heading.setFont(new Font("Tahoma", Font.BOLD,20));
        heading.setForeground(new Color(74, 25, 67));
        add(heading);

        JLabel lblrollnumber= new JLabel ("Select Roll Number");
        lblrollnumber.setForeground(new Color(74, 25, 67));
        lblrollnumber.setBounds(50,70,150,20);
        add(lblrollnumber);

        crollno=new Choice();
        crollno.setBounds(200,70,150,20);
        add(crollno);

        try{
            Conn c= new Conn();
            ResultSet rs= c.statement.executeQuery("select * from student");
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel lblsemester= new JLabel ("Select Semester");
        lblsemester.setForeground(new Color(74, 25, 67));
        lblsemester.setBounds(50,110,150,20);
        //  lblsemester.setForeground(new Color(224, 195, 220));
        add(lblsemester);

        String semester[]={"1st Semester", "2nd Semester", "3rd Semester","4th Semester","5th Semester","6th Semester","7th Semester","8th Semester"};
        cbsemester=new JComboBox(semester);
        cbsemester.setBounds(200,110,150,20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);

        JLabel lblentersubject= new JLabel ("Enter Subject");
        lblentersubject.setForeground(new Color(74, 25, 67));
        lblentersubject.setBounds(100,150,200,40);
        //lblentersubject.setForeground(new Color(224, 195, 220));
        add(lblentersubject);

        JLabel lblentermarks= new JLabel ("Enter Marks");
        lblentermarks.setBounds(320,150,200,40);
        lblentermarks.setForeground(new Color(74, 25, 67));
        //lblentermarks.setForeground(new Color(224, 195, 220));
        add(lblentermarks);

        tfsub1= new JTextField();
        tfsub1.setBounds(50,200,200,20);
        tfsub1.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfsub1);

        tfsub2= new JTextField();
        tfsub2.setBounds(50,230,200,20);
        tfsub2.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfsub2);

        tfsub3= new JTextField();
        tfsub3.setBounds(50,260,200,20);
        tfsub3.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfsub3);

        tfsub4= new JTextField();
        tfsub4.setBounds(50,290,200,20);
        tfsub4.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfsub4);

        tfsub5= new JTextField();
        tfsub5.setBounds(50,320,200,20);
        tfsub5.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfsub5);

        tfmarks1= new JTextField();
        tfmarks1.setBounds(250,200,200,20);
        tfmarks1.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfmarks1);

        tfmarks2= new JTextField();
        tfmarks2.setBounds(250,230,200,20);
        tfmarks2.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfmarks2);

        tfmarks3= new JTextField();
        tfmarks3.setBounds(250,260,200,20);
        tfmarks3.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfmarks3);

        tfmarks4= new JTextField();
        tfmarks4.setBounds(250,290,200,20);
        tfmarks4.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfmarks4);

        tfmarks5= new JTextField();
        tfmarks5.setBounds(250,320,200,20);
        tfmarks5.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
        add(tfmarks5);

        submit=new JButton("Submit");
        submit.setBounds(70,360,150,25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(280,360,150,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        //  setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){
            try{
                Conn c= new Conn();

                String query1="insert into subject values('"+crollno.getSelectedItem()+"','"+cbsemester.getSelectedItem()+"',  '"+tfsub1.getText()+"','"+tfsub2.getText()+"','"+tfsub3.getText()+"','"+tfsub4.getText()+"','"+tfsub5.getText()+"',)";
                String query2="insert into marks values('"+crollno.getSelectedItem()+"','"+cbsemester.getSelectedItem()+"','"+tfmarks1.getText()+"','"+tfmarks2.getText()+"','"+tfmarks3.getText()+"','"+tfmarks4.getText()+"','"+tfmarks5.getText()+"',)";

                c.statement.executeUpdate(query1);
                c.statement.executeUpdate(query2);

                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                setVisible(false);

            } catch(Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new EnterMarks();
    }
}
