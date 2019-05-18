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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AnimalPerdidoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression animalPerdidoId;
	public final AssociationExpression animalPerdido;
	public final StringExpression concelho;
	
	public AnimalPerdidoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		animalPerdidoId = new IntegerExpression("animalPerdido.ID", this);
		animalPerdido = new AssociationExpression("animalPerdido", this);
		concelho = new StringExpression("concelho", this);
	}
	
	public AnimalPerdidoCriteria(PersistentSession session) {
		this(session.createCriteria(AnimalPerdido.class));
	}
	
	public AnimalPerdidoCriteria() throws PersistentException {
		this(Procura4patasPersistentManager.instance().getSession());
	}
	
	public AnimalCriteria createAnimalPerdidoCriteria() {
		return new AnimalCriteria(createCriteria("animalPerdido"));
	}
	
	public AnimalPerdido uniqueAnimalPerdido() {
		return (AnimalPerdido) super.uniqueResult();
	}
	
	public AnimalPerdido[] listAnimalPerdido() {
		java.util.List list = super.list();
		return (AnimalPerdido[]) list.toArray(new AnimalPerdido[list.size()]);
	}
}

