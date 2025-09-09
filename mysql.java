import java.sql.*;

public class mysql {
    public Connection con;
    public Statement statement;

    public mysql(){
        try{
            con = DriverManager.getConnection("jdbc:mysql:///atm", "root", "");
            statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
