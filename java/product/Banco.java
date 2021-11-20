package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Felipe Augusto
 *@see Banco
 */

public class Banco {
	/**
	 * @see Banco
	 */
	private static  Connection connection;

	public Banco(Configuracao configuracao) {
		try {
			Class.forName(configuracao.getDriver());
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(configuracao.getUrl(),configuracao.getUsuario(),
					configuracao.getSenha());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		return connection;
	}
	
}
