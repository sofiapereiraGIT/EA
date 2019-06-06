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

public class AnimalPerdido {
	public AnimalPerdido() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ANIMALPERDIDO_ANIMALPERDIDO) {
			this.animalPerdido = (procura4patas.Animal) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private procura4patas.Animal animalPerdido;
	
	private String concelho;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setConcelho(String value) {
		this.concelho = value;
	}
	
	public String getConcelho() {
		return concelho;
	}
	
	public void setAnimalPerdido(procura4patas.Animal value) {
		this.animalPerdido = value;
	}
	
	public procura4patas.Animal getAnimalPerdido() {
		return animalPerdido;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
