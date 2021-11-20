package product;

import builder.Command;
import concreteBuilder.Consulta;
import concreteBuilder.CriaTesteCommand;
import concreteBuilder.CriarTabela;
import concreteBuilder.Update;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Felipe Augusto
 *@see Involker
 */
public class Involker {
	/**
	 * @author Felipe Augusto
	 * @see Involker
	 */
	private Map<String,Command> storeComandos;
	
	private Banco banco;
	
	
	
	public Involker(Banco banco) {
		
		this.banco = banco;
		
		storeComandos= new HashMap<String, Command>();
		
		storeComandos.put("SELECT", new Consulta());
		
		storeComandos.put("CREATE", new CriarTabela());
		
		storeComandos.put("UPDATE", new Update());
		
		storeComandos.put("TESTE", new CriaTesteCommand());
	}



	/**
	 * @author Felipe Augusto
	 * @return
	 * @see Involker
	 * @throws Involker
	 * @param sql
	 * @return
	 */
	public String executar(String sql) {

		String[] commados = sql.toUpperCase().split(" ");
		
		Command comando = this.storeComandos.getOrDefault(
				commados[0], 
				this.storeComandos.get("CREATE"));

		
		String retorno = "";
		try {
			retorno = comando.executar(banco.getConnection().createStatement(), sql);	
		} catch (Exception sqlErro) {
			sqlErro.printStackTrace();
			retorno = sqlErro.getMessage();
		}
		
		return retorno;

	}
}
