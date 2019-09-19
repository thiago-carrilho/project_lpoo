package obj;

public abstract class AbstractUsuarios {
	private String login;
	private String senha;
	
	
	
	public AbstractUsuarios(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public boolean compararSenha(String strSenha) {
		return this.senha.equals(strSenha);
	}
}
