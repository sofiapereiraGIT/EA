/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: salete(Universidade do Minho)
 * License Type: Academic
 */
package procura4patas;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdocaoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression utilizadorComumId;
	public final AssociationExpression utilizadorComum;
	public final IntegerExpression animalId;
	public final AssociationExpression animal;
	public final DateExpression data;
	public final CharacterExpression estado;
	public final DateExpression dataUltimoContacto;
	
	public AdocaoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		utilizadorComumId = new StringExpression("utilizadorComum.", this);
		utilizadorComum = new AssociationExpression("utilizadorComum", this);
		animalId = new IntegerExpression("animal.ID", this);
		animal = new AssociationExpression("animal", this);
		data = new DateExpression("data", this);
		estado = new CharacterExpression("estado", this);
		dataUltimoContacto = new DateExpression("dataUltimoContacto", this);
	}
	
	public AdocaoCriteria(PersistentSession session) {
		this(session.createCriteria(Adocao.class));
	}
	
	public AdocaoCriteria() throws PersistentException {
		this(Procura4patasPersistentManager.instance().getSession());
	}
	
	public UtilizadorComumCriteria createUtilizadorComumCriteria() {
		return new UtilizadorComumCriteria(createCriteria("utilizadorComum"));
	}
	
	public AnimalCriteria createAnimalCriteria() {
		return new AnimalCriteria(createCriteria("animal"));
	}
	
	public Adocao uniqueAdocao() {
		return (Adocao) super.uniqueResult();
	}
	
	public Adocao[] listAdocao() {
		java.util.List list = super.list();
		return (Adocao[]) list.toArray(new Adocao[list.size()]);
	}
}

