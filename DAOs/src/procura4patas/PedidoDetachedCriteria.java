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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PedidoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression utilizadorComumId;
	public final AssociationExpression utilizadorComum;
	public final IntegerExpression animalId;
	public final AssociationExpression animal;
	public final DateExpression data;
	public final CharacterExpression estado;
	public final DateExpression dataUltimoContacto;
	public final CharacterExpression discriminator;
	
	public PedidoDetachedCriteria() {
		super(procura4patas.Pedido.class, procura4patas.PedidoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		utilizadorComumId = new StringExpression("utilizadorComum.", this.getDetachedCriteria());
		utilizadorComum = new AssociationExpression("utilizadorComum", this.getDetachedCriteria());
		animalId = new IntegerExpression("animal.ID", this.getDetachedCriteria());
		animal = new AssociationExpression("animal", this.getDetachedCriteria());
		data = new DateExpression("data", this.getDetachedCriteria());
		estado = new CharacterExpression("estado", this.getDetachedCriteria());
		dataUltimoContacto = new DateExpression("dataUltimoContacto", this.getDetachedCriteria());
		discriminator = new CharacterExpression("discriminator", this.getDetachedCriteria());
	}
	
	public PedidoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.PedidoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		utilizadorComumId = new StringExpression("utilizadorComum.", this.getDetachedCriteria());
		utilizadorComum = new AssociationExpression("utilizadorComum", this.getDetachedCriteria());
		animalId = new IntegerExpression("animal.ID", this.getDetachedCriteria());
		animal = new AssociationExpression("animal", this.getDetachedCriteria());
		data = new DateExpression("data", this.getDetachedCriteria());
		estado = new CharacterExpression("estado", this.getDetachedCriteria());
		dataUltimoContacto = new DateExpression("dataUltimoContacto", this.getDetachedCriteria());
		discriminator = new CharacterExpression("discriminator", this.getDetachedCriteria());
	}
	
	public UtilizadorComumDetachedCriteria createUtilizadorComumCriteria() {
		return new UtilizadorComumDetachedCriteria(createCriteria("utilizadorComum"));
	}
	
	public AnimalDetachedCriteria createAnimalCriteria() {
		return new AnimalDetachedCriteria(createCriteria("animal"));
	}
	
	public Pedido uniquePedido(PersistentSession session) {
		return (Pedido) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pedido[] listPedido(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pedido[]) list.toArray(new Pedido[list.size()]);
	}
}

