package Frames;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kevin
 */
public class ConexionSQL {

    protected final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    protected final String db = "databaseName=zermat;";
    protected final String user = "user=sa;";
    protected final String password = "password=Kevin.jair19;";
    Connection cx;

    public ConexionSQL() {

    }

    public Connection Conectar() {

        try {
            Class.forName(driver);
            cx = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-M29H6EG\\SQLEXPRESS:1433;" + db + user + password);
            if (cx != null) {
                System.out.println("Se realizó la conexión");
            }
        } catch (Exception e) {
            System.err.println("No conectado error fue " + e);
        }
        return cx;

    }

}
