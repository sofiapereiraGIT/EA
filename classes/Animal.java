public class Animal {
	private int id;
	private String emailUti;
	private String nome;
	private String fotografia;
	private char sexo;
	private char idade;
	private String raça;
	private char porte;
	private String corPelo;
	private char compPelo;
	private char estado;
	private String descricao;

	public void setId(int aId) {
		this.id = aId;
	}

	public int getId() {
		return this.id;
	}

	public void setEmailUti(String aEmailUti) {
		this.emailUti = aEmailUti;
	}

	public String getEmailUti() {
		return this.emailUti;
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

	public void setSexo(char aSexo) {
		this.sexo = aSexo;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setIdade(char aIdade) {
		this.idade = aIdade;
	}

	public char getIdade() {
		return this.idade;
	}

	public void setRaça(String aRaça) {
		this.raça = aRaça;
	}

	public String getRaça() {
		return this.raça;
	}

	public void setPorte(char aPorte) {
		this.porte = aPorte;
	}

	public char getPorte() {
		return this.porte;
	}

	public void setCorPelo(String aCorPelo) {
		this.corPelo = aCorPelo;
	}

	public String getCorPelo() {
		return this.corPelo;
	}

	public void setCompPelo(char aCompPelo) {
		this.compPelo = aCompPelo;
	}

	public char getCompPelo() {
		return this.compPelo;
	}

	public void setEstado(char aEstado) {
		this.estado = aEstado;
	}

	public char getEstado() {
		return this.estado;
	}

	public void setDescricao(String aDescricao) {
		this.descricao = aDescricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}