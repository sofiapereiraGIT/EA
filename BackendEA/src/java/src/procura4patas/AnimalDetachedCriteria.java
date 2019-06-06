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

public class AnimalDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public AnimalDetachedCriteria() {
		super(procura4patas.Animal.class, procura4patas.AnimalCriteria.class);
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
	
	public AnimalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.AnimalCriteria.class);
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
	
	public Animal uniqueAnimal(PersistentSession session) {
		return (Animal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Animal[] listAnimal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Animal[]) list.toArray(new Animal[list.size()]);
	}
}
