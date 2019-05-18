/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
package procura4patas;

public class Animal {
	public Animal() {
	}
	
	private int ID;
	
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
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setFotografia(String value) {
		this.fotografia = value;
	}
	
	public String getFotografia() {
		return fotografia;
	}
	
	public void setSexo(char value) {
		this.sexo = value;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setIdade(char value) {
		this.idade = value;
	}
	
	public char getIdade() {
		return idade;
	}
	
	public void setRaça(String value) {
		this.raça = value;
	}
	
	public String getRaça() {
		return raça;
	}
	
	public void setPorte(char value) {
		this.porte = value;
	}
	
	public char getPorte() {
		return porte;
	}
	
	public void setCorPelo(String value) {
		this.corPelo = value;
	}
	
	public String getCorPelo() {
		return corPelo;
	}
	
	public void setCompPelo(char value) {
		this.compPelo = value;
	}
	
	public char getCompPelo() {
		return compPelo;
	}
	
	public void setEstado(char value) {
		this.estado = value;
	}
	
	public char getEstado() {
		return estado;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
