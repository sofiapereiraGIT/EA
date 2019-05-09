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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CaoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public CaoDetachedCriteria() {
		super(procura4patas.Cao.class, procura4patas.CaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		emailUti = new StringExpression("emailUti", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		sexo = new CharacterExpression("sexo", this.getDetachedCriteria());
		idade = new CharacterExpression("idade", this.getDetachedCriteria());
		raça = new StringExpression("raça", this.getDetachedCriteria());
		porte = new CharacterExpression("porte", this.getDetachedCriteria());
		corPelo = new StringExpression("corPelo", this.getDetachedCriteria());
		compPelo = new CharacterExpression("compPelo", this.getDetachedCriteria());
		estado = new CharacterExpression("estado", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
	}
	
	public CaoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.CaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		emailUti = new StringExpression("emailUti", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		sexo = new CharacterExpression("sexo", this.getDetachedCriteria());
		idade = new CharacterExpression("idade", this.getDetachedCriteria());
		raça = new StringExpression("raça", this.getDetachedCriteria());
		porte = new CharacterExpression("porte", this.getDetachedCriteria());
		corPelo = new StringExpression("corPelo", this.getDetachedCriteria());
		compPelo = new CharacterExpression("compPelo", this.getDetachedCriteria());
		estado = new CharacterExpression("estado", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
	}
	
	public Cao uniqueCao(PersistentSession session) {
		return (Cao) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cao[] listCao(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cao[]) list.toArray(new Cao[list.size()]);
	}
}

