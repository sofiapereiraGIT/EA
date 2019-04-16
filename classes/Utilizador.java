import java.util.Vector;

public class Utilizador {
	private String e_mail;
	private String password;
	private String nome;
	private String fotografia;
	private String concelho;
	private String telemovel;
	private String descricao;
	private Animal animaisAdotar;
	private AnimalPerdido animaisPerdidos;
	private Vector<Adocao> listaPedidosAd = new Vector<Adocao>();

	public void setE_mail(String aE_mail) {
		this.e_mail = aE_mail;
	}

	public String getE_mail() {
		return this.e_mail;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

	public String getPassword() {
		return this.password;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setFotografia(String aFotografia) {
		this.fotografia = aFotografia;
	}

	public String getFotografia() {
		return this.fotografia;
	}

	public void setConcelho(String aConcelho) {
		this.concelho = aConcelho;
	}

	public String getConcelho() {
		return this.concelho;
	}

	public void setTelemovel(String aTelemovel) {
		this.telemovel = aTelemovel;
	}

	public String getTelemovel() {
		return this.telemovel;
	}

	public void setDescricao(String aDescricao) {
		this.descricao = aDescricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}