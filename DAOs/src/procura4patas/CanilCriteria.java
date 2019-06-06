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
	public final StringExpression e_mail;
	public final StringExpression password;
	public final StringExpression nome;
	public final StringExpression fotografia;
	public final StringExpression concelho;
	public final StringExpression telemovel;
	public final StringExpression descricao;
	public final CollectionExpression animaisAdotar;
	public final CollectionExpression listaPedidosAd;
	public final StringExpression morada;
	public final StringExpression horario;
	public final StringExpression siteOficial;
	public final StringExpression facebook;
	public final StringExpression instagram;
	public final CollectionExpression listaPedidosFAT;
	
	public CanilCriteria(Criteria criteria) {
		super(criteria);
		e_mail = new StringExpression("e_mail", this);
		password = new StringExpression("password", this);
		nome = new StringExpression("nome", this);
		fotografia = new StringExpression("fotografia", this);
		concelho = new StringExpression("concelho", this);
		telemovel = new StringExpression("telemovel", this);
		descricao = new StringExpression("descricao", this);
		animaisAdotar = new CollectionExpression("ORM_AnimaisAdotar", this);
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this);
		morada = new StringExpression("morada", this);
		horario = new StringExpression("horario", this);
		siteOficial = new StringExpression("siteOficial", this);
		facebook = new StringExpression("facebook", this);
		instagram = new StringExpression("instagram", this);
		listaPedidosFAT = new CollectionExpression("ORM_ListaPedidosFAT", this);
	}
	
	public CanilCriteria(PersistentSession session) {
		this(session.createCriteria(Canil.class));
	}
	
	public CanilCriteria() throws PersistentException {
		this(Procura4patasPersistentManager.instance().getSession());
	}
	
	public FATCriteria createListaPedidosFATCriteria() {
		return new FATCriteria(createCriteria("ORM_ListaPedidosFAT"));
	}
	
	public AnimalCriteria createAnimaisAdotarCriteria() {
		return new AnimalCriteria(createCriteria("ORM_AnimaisAdotar"));
	}
	
	public AdocaoCriteria createListaPedidosAdCriteria() {
		return new AdocaoCriteria(createCriteria("ORM_ListaPedidosAd"));
	}
	
	public Canil uniqueCanil() {
		return (Canil) super.uniqueResult();
	}
	
	public Canil[] listCanil() {
		java.util.List list = super.list();
		return (Canil[]) list.toArray(new Canil[list.size()]);
	}
}

