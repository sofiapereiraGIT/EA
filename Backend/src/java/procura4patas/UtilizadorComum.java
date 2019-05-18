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

public class UtilizadorComum extends procura4patas.Utilizador {
	public UtilizadorComum() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UTILIZADORCOMUM_ANIMALPERDIDOS) {
			return ORM_animalPerdidos;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_animalPerdidos = new java.util.HashSet();
	
	private void setORM_AnimalPerdidos(java.util.Set value) {
		this.ORM_animalPerdidos = value;
	}
	
	private java.util.Set getORM_AnimalPerdidos() {
		return ORM_animalPerdidos;
	}
	
	public final procura4patas.AnimalPerdidoSetCollection animalPerdidos = new procura4patas.AnimalPerdidoSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADORCOMUM_ANIMALPERDIDOS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
