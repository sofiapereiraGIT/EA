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

public class UtilizadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression nome;
	public final StringExpression fotografia;
	public final StringExpression concelho;
	public final StringExpression telemovel;
	public final StringExpression descricao;
	public final CollectionExpression animais;
	public final CollectionExpression listaPedidos;
	
	public UtilizadorDetachedCriteria() {
		super(procura4patas.Utilizador.class, procura4patas.UtilizadorCriteria.class);
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		animais = new CollectionExpression("ORM_Animais", this.getDetachedCriteria());
		listaPedidos = new CollectionExpression("ORM_ListaPedidos", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.UtilizadorCriteria.class);
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		animais = new CollectionExpression("ORM_Animais", this.getDetachedCriteria());
		listaPedidos = new CollectionExpression("ORM_ListaPedidos", this.getDetachedCriteria());
	}
	
	public AnimalDetachedCriteria createAnimaisCriteria() {
		return new AnimalDetachedCriteria(createCriteria("ORM_Animais"));
	}
	
	public PedidoDetachedCriteria createListaPedidosCriteria() {
		return new PedidoDetachedCriteria(createCriteria("ORM_ListaPedidos"));
	}
	
	public Utilizador uniqueUtilizador(PersistentSession session) {
		return (Utilizador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilizador[] listUtilizador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
	}
}

