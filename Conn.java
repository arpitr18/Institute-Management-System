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

