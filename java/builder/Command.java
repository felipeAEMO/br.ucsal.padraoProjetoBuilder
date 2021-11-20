package builder;

/**
 * 
 * @author Felipe Augusto
 * Classe abstrata que vai servir como herança em alguns casos da aplicacao
 * 
 */

import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author Felipe Augusto
 *
 */
public abstract class Command {
	
	/**
	 * 
	 * @param statement
	 * @param sql
	 * @see SQLException
	 * @return
	 * @exception Command
	 * @throws SQLException
	 * 
	 */
	public abstract String executar(Statement statement, String sql) throws SQLException;
}
