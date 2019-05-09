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
public class Utilizador {
	public Utilizador() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Utilizador))
			return false;
		Utilizador utilizador = (Utilizador)aObj;
		if ((getE_mail() != null && !getE_mail().equals(utilizador.getE_mail())) || (getE_mail() == null && utilizador.getE_mail() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getE_mail() == null ? 0 : getE_mail().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UTILIZADOR_LISTAPEDIDOSAD) {
			return ORM_listaPedidosAd;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String e_mail;
	
	private AnimalPerdido animaisPerdidos;
	
	private Animal animaisAdotar;
	
	private String password;
	
	private String nome;
	
	private String fotografia;
	
	private String concelho;
	
	private String telemovel;
	
	private String descricao;
	
	private java.util.Set ORM_listaPedidosAd = new java.util.HashSet();
	
	public void setE_mail(String value) {
		this.e_mail = value;
	}
	
	public String getE_mail() {
		return e_mail;
	}
	
	public String getORMID() {
		return getE_mail();
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
	
	public void setAnimaisAdotar(Animal value) {
		this.animaisAdotar = value;
	}
	
	public Animal getAnimaisAdotar() {
		return animaisAdotar;
	}
	
	public void setAnimaisPerdidos(AnimalPerdido value) {
		this.animaisPerdidos = value;
	}
	
	public AnimalPerdido getAnimaisPerdidos() {
		return animaisPerdidos;
	}
	
	private void setORM_ListaPedidosAd(java.util.Set value) {
		this.ORM_listaPedidosAd = value;
	}
	
	private java.util.Set getORM_ListaPedidosAd() {
		return ORM_listaPedidosAd;
	}
	
	public final AdocaoSetCollection listaPedidosAd = new AdocaoSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADOR_LISTAPEDIDOSAD, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getE_mail());
	}
	
}
