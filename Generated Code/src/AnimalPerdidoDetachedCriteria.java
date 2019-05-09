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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AnimalPerdidoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression animalPerdidoId;
	public final AssociationExpression animalPerdido;
	public final StringExpression concelho;
	
	public AnimalPerdidoDetachedCriteria() {
		super(AnimalPerdido.class, AnimalPerdidoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		animalPerdidoId = new IntegerExpression("animalPerdido.ID", this.getDetachedCriteria());
		animalPerdido = new AssociationExpression("animalPerdido", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
	}
	
	public AnimalPerdidoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AnimalPerdidoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		animalPerdidoId = new IntegerExpression("animalPerdido.ID", this.getDetachedCriteria());
		animalPerdido = new AssociationExpression("animalPerdido", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
	}
	
	public AnimalDetachedCriteria createAnimalPerdidoCriteria() {
		return new AnimalDetachedCriteria(createCriteria("animalPerdido"));
	}
	
	public AnimalPerdido uniqueAnimalPerdido(PersistentSession session) {
		return (AnimalPerdido) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AnimalPerdido[] listAnimalPerdido(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AnimalPerdido[]) list.toArray(new AnimalPerdido[list.size()]);
	}
}

