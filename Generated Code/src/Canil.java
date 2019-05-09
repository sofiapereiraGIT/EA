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
public class Canil extends Utilizador {
	public Canil() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANIL_LISTAPEDIDOSFAT) {
			return ORM_listaPedidosFAT;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String morada;
	
	private String horario;
	
	private String siteOficial;
	
	private String facebook;
	
	private String instagram;
	
	private java.util.Set ORM_listaPedidosFAT = new java.util.HashSet();
	
	public void setMorada(String value) {
		this.morada = value;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public void setHorario(String value) {
		this.horario = value;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setSiteOficial(String value) {
		this.siteOficial = value;
	}
	
	public String getSiteOficial() {
		return siteOficial;
	}
	
	public void setFacebook(String value) {
		this.facebook = value;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public void setInstagram(String value) {
		this.instagram = value;
	}
	
	public String getInstagram() {
		return instagram;
	}
	
	private void setORM_ListaPedidosFAT(java.util.Set value) {
		this.ORM_listaPedidosFAT = value;
	}
	
	private java.util.Set getORM_ListaPedidosFAT() {
		return ORM_listaPedidosFAT;
	}
	
	public final FATSetCollection listaPedidosFAT = new FATSetCollection(this, _ormAdapter, ORMConstants.KEY_CANIL_LISTAPEDIDOSFAT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
