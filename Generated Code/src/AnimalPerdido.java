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
public class AnimalPerdido {
	public AnimalPerdido() {
	}
	
	private int ID;
	
	private Animal animalPerdido;
	
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
	
	public void setAnimalPerdido(Animal value) {
		this.animalPerdido = value;
	}
	
	public Animal getAnimalPerdido() {
		return animalPerdido;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
