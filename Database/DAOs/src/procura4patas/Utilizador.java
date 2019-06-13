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

public class Utilizador {
	public Utilizador() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Utilizador))
			return false;
		Utilizador utilizador = (Utilizador)aObj;
		if ((getEmail() != null && !getEmail().equals(utilizador.getEmail())) || (getEmail() == null && utilizador.getEmail() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getEmail() == null ? 0 : getEmail().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UTILIZADOR_ANIMAIS) {
			return ORM_animais;
		}
		else if (key == ORMConstants.KEY_UTILIZADOR_LISTAPEDIDOS) {
			return ORM_listaPedidos;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String email;
	
	private String password;
	
	private String nome;
	
	private String fotografia;
	
	private String concelho;
	
	private String telemovel;
	
	private String descricao;
	
	private java.util.Set ORM_animais = new java.util.HashSet();
	
	private java.util.Set ORM_listaPedidos = new java.util.HashSet();
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getORMID() {
		return getEmail();
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
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
	
	public void setConcelho(String value) {
		this.concelho = value;
	}
	
	public String getConcelho() {
		return concelho;
	}
	
	public void setTelemovel(String value) {
		this.telemovel = value;
	}
	
	public String getTelemovel() {
		return telemovel;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	private void setORM_Animais(java.util.Set value) {
		this.ORM_animais = value;
	}
	
	private java.util.Set getORM_Animais() {
		return ORM_animais;
	}
	
	public final procura4patas.AnimalSetCollection animais = new procura4patas.AnimalSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADOR_ANIMAIS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ListaPedidos(java.util.Set value) {
		this.ORM_listaPedidos = value;
	}
	
	private java.util.Set getORM_ListaPedidos() {
		return ORM_listaPedidos;
	}
	
	public final procura4patas.PedidoSetCollection listaPedidos = new procura4patas.PedidoSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADOR_LISTAPEDIDOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getEmail());
	}
	
}
