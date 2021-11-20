package product;
/**
 * 
 * @author Felipe Augusto
 *@see Configuracao
 */
public class Configuracao {
	
	private String url;
	private String usuario;
	private String senha;
	private String driver;
	
	/**
	 * @return
	 * @see Configuracao
	 * @exception Configuracao
	 * @throws Configuracao
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @see Configuracao
	 * @return
	 * @param url
	 * @throws Configuracao
	 * @exception Configuracao
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 
	 * @return
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * 
	 * @return
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * 
	 * @return
	 */
	public String getDriver() {
		return driver;
	}
	/**
	 * 
	 * @param driver
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
}
