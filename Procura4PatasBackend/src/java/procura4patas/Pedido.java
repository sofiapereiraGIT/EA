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

public class Pedido {
	public Pedido() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PEDIDO_ANIMAL) {
			this.animal = (procura4patas.Animal) owner;
		}
		
		else if (key == ORMConstants.KEY_PEDIDO_UTILIZADORCOMUM) {
			this.utilizadorComum = (procura4patas.UtilizadorComum) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private procura4patas.UtilizadorComum utilizadorComum;
	
	private procura4patas.Animal animal;
	
	private java.util.Date data;
	
	private char estado;
	
	private java.util.Date dataUltimoContacto;
	
	private char discriminator;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData(java.util.Date value) {
		this.data = value;
	}
	
	public java.util.Date getData() {
		return data;
	}
	
	public void setEstado(char value) {
		this.estado = value;
	}
	
	public char getEstado() {
		return estado;
	}
	
	public void setDataUltimoContacto(java.util.Date value) {
		this.dataUltimoContacto = value;
	}
	
	public java.util.Date getDataUltimoContacto() {
		return dataUltimoContacto;
	}
	
	public void setDiscriminator(char value) {
		this.discriminator = value;
	}
	
	public char getDiscriminator() {
		return discriminator;
	}
	
	public void setAnimal(procura4patas.Animal value) {
		this.animal = value;
	}
	
	public procura4patas.Animal getAnimal() {
		return animal;
	}
	
	public void setUtilizadorComum(procura4patas.UtilizadorComum value) {
		this.utilizadorComum = value;
	}
	
	public procura4patas.UtilizadorComum getUtilizadorComum() {
		return utilizadorComum;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
