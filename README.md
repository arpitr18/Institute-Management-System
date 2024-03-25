![image](https://github.com/arpitr18/Institute-Management-System/assets/114918704/495b672b-045b-41f8-9231-7b1226284c84)# Institute-Management-System
The Institute Management System can be used to store student information like attendance, fees, and student  result. Using this system, we can register new student and their course details. We can submit student’s fees and can check fees details anytime. We can create exam result and submit in this system.
We can also add new  employee in the system and can check details of the employee easily.

============================================================================================================================================================================================================================================================================================================================

SQL CODES FOR DATABSE INTEGRATION

CREATE DATABASE InstituteManagement;
USE InstituteManagement;

CREATE TABLE login(username varchar(50), password varchar(50));
SELECT * FROM login;
INSERT INTO login VALUES('atharva','123456');
DROP TABLE login;
DROP TABLE student;


CREATE TABLE student(name TEXT, CHECK (name regexp '^[A-Za-z]*$'), fname TEXT,rollno varchar(20),dob varchar(40),
address varchar(100),phone varchar(10), CHECK(phone REGEXP '^[0-9]*$'),email varchar(40),class_x varchar(2),CHECK(class_x REGEXP '^[0-9]*$'),
class_xii varchar(2),CHECK(class_xii REGEXP '^[0-9]*$'),aadhar varchar(12),course varchar(40),branch varchar(40));
SELECT * FROM student;
DELETE  FROM student;

desc student;
DROP TABLE student;

CREATE TABLE teacher(name TEXT, CHECK (name regexp '^[A-Za-z]*$'),fname TEXT(50),empId varchar(50),dob varchar(50),address varchar(50),phone varchar(10),CHECK(phone REGEXP '^[0-9]*$'),
email varchar(50), x varchar(2),CHECK(x REGEXP '^[0-9]*$'),
xii varchar(2),CHECK(xii REGEXP '^[0-9]*$'),aadhar varchar(12),qualification varchar(50),department varchar(50));
SELECT * FROM teacher;
DROP TABLE teacher;
TRUNCATE teacher;

CREATE TABLE studentleave(rollno varchar(20),date varchar(20),duration varchar(20));
DROP TABLE studentleave;
SELECT * FROM studentleave;

CREATE TABLE teacherleave(rollno varchar(20),date varchar(20),duration varchar(20));
DROP TABLE teacherleave;
SELECT * FROM teacherleave;

CREATE TABLE subject(rollno varchar(20), semester varchar(20), tfsub1 varchar(50), tfsub2 varchar(50), tfsub3 varchar(50), tfsub4 varchar(50), tfsub5 varchar(50));
SELECT * FROM subject;
DROP TABLE subject;

CREATE TABLE marks(rollno varchar(20), semester varchar(20), tfmarks1 varchar(50), tfmarks2 varchar(50), tfmarks3 varchar(50), tfmarks4 varchar(50),tfmarks5 varchar(50));
SELECT * FROM marks;
DROP TABLE marks;

CREATE TABLE fee(course varchar(20),semester1 varchar(20),semester2 varchar(20),semester3 varchar(20),semester4 varchar(20),semester5 varchar(20),semester6 varchar(20),semester7 varchar(20),semester8 varchar(20));
SELECT * FROM FEE;

INSERT INTO FEE VALUES("BTECH",'48000','43000','43000','43000','43000','43000','43000','43000');
INSERT INTO FEE VALUES("BSC",'40000','35000','35000','35000','35000','35000','0','0');
INSERT INTO FEE VALUES("BCA",'35000','30000','30000','30000','30000','30000','0','0');


CREATE TABLE collegefee(rollno varchar(20),course varchar(20),branch varchar(20),semester varchar(20),total varchar(20));

============================================================================================================================================================================================================================================================================================================================

CONNECTION CODES FOR JDBC CONNECTIVITY 

package pattern.CollegeERP;
import java.sql.*;
public class Conn {
    public PreparedStatement s;
    public PreparedStatement Statement;
    Connection connection;
    Statement statement;

    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///collegeERP","root","Arpit1809");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public PreparedStatement prepareStatement(String query) {
        return null;
    }
}

============================================================================================================================================================================================================================================================================================================================


