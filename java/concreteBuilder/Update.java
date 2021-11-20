package concreteBuilder;

import java.sql.SQLException;
import java.sql.Statement;

import builder.Command;

public class Update extends Command {

	/**
	 * @author Felipe Augusto
	 * @param statement
	 * @param sql
	 * @see Update
	 * @throws Update
	 * @exception SQLException
	 * 
	 */
	public String executar(Statement statement, String sql) throws SQLException {
		int numero = statement.executeUpdate(sql);
		statement.closeOnCompletion();
		return numero+"";
	}


}
