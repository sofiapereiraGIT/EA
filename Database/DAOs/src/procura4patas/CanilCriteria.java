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

public class CanilCriteria extends AbstractORMCriteria {
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression nome;
	public final StringExpression fotografia;
	public final StringExpression concelho;
	public final StringExpression telemovel;
	public final StringExpression descricao;
	public final CollectionExpression animais;
	public final CollectionExpression listaPedidos;
	public final StringExpression morada;
	public final StringExpression horario;
	public final StringExpression siteOficial;
	public final StringExpression facebook;
	public final StringExpression instagram;
	
	public CanilCriteria(Criteria criteria) {
		super(criteria);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		nome = new StringExpression("nome", this);
		fotografia = new StringExpression("fotografia", this);
		concelho = new StringExpression("concelho", this);
		telemovel = new StringExpression("telemovel", this);
		descricao = new StringExpression("descricao", this);
		animais = new CollectionExpression("ORM_Animais", this);
		listaPedidos = new CollectionExpression("ORM_ListaPedidos", this);
		morada = new StringExpression("morada", this);
		horario = new StringExpression("horario", this);
		siteOficial = new StringExpression("siteOficial", this);
		facebook = new StringExpression("facebook", this);
		instagram = new StringExpression("instagram", this);
	}
	
	public CanilCriteria(PersistentSession session) {
		this(session.createCriteria(Canil.class));
	}
	
	public CanilCriteria() throws PersistentException {
		this(Procura4patasPersistentManager.instance().getSession());
	}
	
	public AnimalCriteria createAnimaisCriteria() {
		return new AnimalCriteria(createCriteria("ORM_Animais"));
	}
	
	public PedidoCriteria createListaPedidosCriteria() {
		return new PedidoCriteria(createCriteria("ORM_ListaPedidos"));
	}
	
	public Canil uniqueCanil() {
		return (Canil) super.uniqueResult();
	}
	
	public Canil[] listCanil() {
		java.util.List list = super.list();
		return (Canil[]) list.toArray(new Canil[list.size()]);
	}
}

