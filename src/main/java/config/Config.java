package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {


//    private static String url = "jdbc:postgresql://localhost:5432/dbCODING";
//    private static String user = "postgres" ;
//    private static String passwd = "admin";
//    private static Connection connect;
    private static String url = "jdbc:postgresql://ec2-54-220-243-77.eu-west-1.compute.amazonaws.com:5432/ddbv1ojm3qt9br";
    private static String user = "wcirbhlncfduts" ;
    private static String passwd = "6bd3ce641b95c015b2fcd6ad6e0860abb78f0f16ba9a52d82365dfc3702b05ec";
    private static Connection connect;

    public static Connection getInstance(){
        if(connect == null){
            try   {

                Class.forName("org.postgresql.Driver");

            }
            catch(ClassNotFoundException e) {
                System.out.println("Class not found "+ e);
            }

            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}