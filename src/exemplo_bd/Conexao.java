package exemplo_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static final String url = "jdbc: mysql://localhost:3306/bd_turra";
	public static final String user = "root";
	public static final String password = "root";
	
	public static Connection conectar() throws SQLException{
		return DriverManager.getConnection(url, user, password);
		
	}
}
