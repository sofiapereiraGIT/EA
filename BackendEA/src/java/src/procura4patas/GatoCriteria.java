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

public class GatoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression emailUti;
	public final StringExpression nome;
	public final StringExpression fotografia;
	public final CharacterExpression sexo;
	public final CharacterExpression idade;
	public final StringExpression raça;
	public final CharacterExpression porte;
	public final StringExpression corPelo;
	public final CharacterExpression compPelo;
	public final CharacterExpression estado;
	public final StringExpression descricao;
	
	public GatoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		emailUti = new StringExpression("emailUti", this);
		nome = new StringExpression("nome", this);
		fotografia = new StringExpression("fotografia", this);
		sexo = new CharacterExpression("sexo", this);
		idade = new CharacterExpression("idade", this);
		raça = new StringExpression("raça", this);
		porte = new CharacterExpression("porte", this);
		corPelo = new StringExpression("corPelo", this);
		compPelo = new CharacterExpression("compPelo", this);
		estado = new CharacterExpression("estado", this);
		descricao = new StringExpression("descricao", this);
	}
	
	public GatoCriteria(PersistentSession session) {
		this(session.createCriteria(Gato.class));
	}
	
	public GatoCriteria() throws PersistentException {
		this(Procura4patasPersistentManager.instance().getSession());
	}
	
	public Gato uniqueGato() {
		return (Gato) super.uniqueResult();
	}
	
	public Gato[] listGato() {
		java.util.List list = super.list();
		return (Gato[]) list.toArray(new Gato[list.size()]);
	}
}
