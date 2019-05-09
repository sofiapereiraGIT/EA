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

public class UtilizadorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public UtilizadorDetachedCriteria() {
		super(procura4patas.Utilizador.class, procura4patas.UtilizadorCriteria.class);
		e_mail = new StringExpression("e_mail", this.getDetachedCriteria());
		animaisPerdidosId = new IntegerExpression("animaisPerdidos.ID", this.getDetachedCriteria());
		animaisPerdidos = new AssociationExpression("animaisPerdidos", this.getDetachedCriteria());
		animaisAdotarId = new IntegerExpression("animaisAdotar.ID", this.getDetachedCriteria());
		animaisAdotar = new AssociationExpression("animaisAdotar", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.UtilizadorCriteria.class);
		e_mail = new StringExpression("e_mail", this.getDetachedCriteria());
		animaisPerdidosId = new IntegerExpression("animaisPerdidos.ID", this.getDetachedCriteria());
		animaisPerdidos = new AssociationExpression("animaisPerdidos", this.getDetachedCriteria());
		animaisAdotarId = new IntegerExpression("animaisAdotar.ID", this.getDetachedCriteria());
		animaisAdotar = new AssociationExpression("animaisAdotar", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this.getDetachedCriteria());
	}
	
	public AnimalPerdidoDetachedCriteria createAnimaisPerdidosCriteria() {
		return new AnimalPerdidoDetachedCriteria(createCriteria("animaisPerdidos"));
	}
	
	public AnimalDetachedCriteria createAnimaisAdotarCriteria() {
		return new AnimalDetachedCriteria(createCriteria("animaisAdotar"));
	}
	
	public AdocaoDetachedCriteria createListaPedidosAdCriteria() {
		return new AdocaoDetachedCriteria(createCriteria("ORM_ListaPedidosAd"));
	}
	
	public Utilizador uniqueUtilizador(PersistentSession session) {
		return (Utilizador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilizador[] listUtilizador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
	}
}

