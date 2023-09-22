import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Desconectar {
    public void desconectar(Connection conn) { //void nao retorna nada
        try {
            if(conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Desconectou do banco de dados.");
            }
        } catch (SQLException ex) {
            System.out.println("Não conseguiu desconectar do BD.");
        }
    }
}
