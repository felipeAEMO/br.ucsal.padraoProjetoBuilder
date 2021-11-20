package concreteBuilder;

import java.sql.SQLException;
import java.sql.Statement;

import builder.Command;
/**
 * 
 * @author Felipe Augusto
 *@see CriarTabela
 *
 */
public class CriarTabela extends Command {

	/**
	 *@author Felipe Augusto
	 *@param statement
	 *@param sql
	 *@see SQLException
	 *@see CriarTabela
	 *@return  !boleano+""
	 *@throws CriarTabela
	 *@throws SQLException
	 *@exception CriarTabela
	 *@exception SQLException
	 * 
	 */
	public String executar(Statement statement, String sql) throws SQLException {
		Boolean boleano = statement.execute(sql);
		statement.closeOnCompletion();
		return !boleano+"";
	}

}
