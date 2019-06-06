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

public class UtilizadorComumCriteria extends AbstractORMCriteria {
	public final StringExpression e_mail;
	public final IntegerExpression animaisPerdidosId;
	public final AssociationExpression animaisPerdidos;
	public final IntegerExpression animaisAdotarId;
	public final AssociationExpression animaisAdotar;
	public final StringExpression password;
	public final StringExpression nome;
	public final StringExpression fotografia;
	public final StringExpression concelho;
	public final StringExpression telemovel;
	public final StringExpression descricao;
	public final CollectionExpression listaPedidosAd;
	
	public UtilizadorComumCriteria(Criteria criteria) {
		super(criteria);
		e_mail = new StringExpression("e_mail", this);
		animaisPerdidosId = new IntegerExpression("animaisPerdidos.ID", this);
		animaisPerdidos = new AssociationExpression("animaisPerdidos", this);
		animaisAdotarId = new IntegerExpression("animaisAdotar.ID", this);
		animaisAdotar = new AssociationExpression("animaisAdotar", this);
		password = new StringExpression("password", this);
		nome = new StringExpression("nome", this);
		fotografia = new StringExpression("fotografia", this);
		concelho = new StringExpression("concelho", this);
		telemovel = new StringExpression("telemovel", this);
		descricao = new StringExpression("descricao", this);
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this);
	}
	
	public UtilizadorComumCriteria(PersistentSession session) {
		this(session.createCriteria(UtilizadorComum.class));
	}
	
	public UtilizadorComumCriteria() throws PersistentException {
		this(Procura4patasPersistentManager.instance().getSession());
	}
	
	public AnimalPerdidoCriteria createAnimaisPerdidosCriteria() {
		return new AnimalPerdidoCriteria(createCriteria("animaisPerdidos"));
	}
	
	public AnimalCriteria createAnimaisAdotarCriteria() {
		return new AnimalCriteria(createCriteria("animaisAdotar"));
	}
	
	public AdocaoCriteria createListaPedidosAdCriteria() {
		return new AdocaoCriteria(createCriteria("ORM_ListaPedidosAd"));
	}
	
	public UtilizadorComum uniqueUtilizadorComum() {
		return (UtilizadorComum) super.uniqueResult();
	}
	
	public UtilizadorComum[] listUtilizadorComum() {
		java.util.List list = super.list();
		return (UtilizadorComum[]) list.toArray(new UtilizadorComum[list.size()]);
	}
}
