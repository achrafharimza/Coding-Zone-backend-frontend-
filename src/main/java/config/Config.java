package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {


//    private static String url = "jdbc:postgresql://localhost:5432/dbCODING";
//    private static String user = "postgres" ;
//    private static String passwd = "admin";
//    private static Connection connect;
    private static String url = "jdbc:postgresql://ec2-34-193-2-172.compute-1.amazonaws.com:5432/d6kpt4vb2fn7mc";
    private static String user = "xlfrqfxgnlrtgg" ;
    private static String passwd = "68a45959d529237cb0b64a1ae905d23d051471c7479a8d9d319c4a0b61a79fd0";
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