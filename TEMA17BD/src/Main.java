import java.sql.*;
import java.util.Calendar;
import java.util.TimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] Args){
        String url = "jdbc:mysql://localhost:3306/bdempresa";
        String user = "root";
        String passwd = "root";

        Calendar now = Calendar.getInstance();
        TimeZone zanahoria = now.getTimeZone();
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(url, user, passwd);
                System.out.println("Conexión Realizada, mostrando datos");
                System.out.println("");
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery("SELECT * FROM clientes");
                while (result.next()) {
                    System.out.println(
                            result.getString("codigoCliente") + " - " +
                            result.getString("nomCli"));
                }
                result.close();
                statement.close();
                connection.close();
                System.out.println("Desconectando de la base de datos...");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}