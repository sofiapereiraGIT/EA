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

public class UtilizadorComumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression e_mail;
	public final StringExpression password;
	public final StringExpression nome;
	public final StringExpression fotografia;
	public final StringExpression concelho;
	public final StringExpression telemovel;
	public final StringExpression descricao;
	public final CollectionExpression animaisAdotar;
	public final CollectionExpression listaPedidosAd;
	public final CollectionExpression animalPerdidos;
	
	public UtilizadorComumDetachedCriteria() {
		super(procura4patas.UtilizadorComum.class, procura4patas.UtilizadorComumCriteria.class);
		e_mail = new StringExpression("e_mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		animaisAdotar = new CollectionExpression("ORM_AnimaisAdotar", this.getDetachedCriteria());
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this.getDetachedCriteria());
		animalPerdidos = new CollectionExpression("ORM_AnimalPerdidos", this.getDetachedCriteria());
	}
	
	public UtilizadorComumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.UtilizadorComumCriteria.class);
		e_mail = new StringExpression("e_mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		animaisAdotar = new CollectionExpression("ORM_AnimaisAdotar", this.getDetachedCriteria());
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this.getDetachedCriteria());
		animalPerdidos = new CollectionExpression("ORM_AnimalPerdidos", this.getDetachedCriteria());
	}
	
	public AnimalPerdidoDetachedCriteria createAnimalPerdidosCriteria() {
		return new AnimalPerdidoDetachedCriteria(createCriteria("ORM_AnimalPerdidos"));
	}
	
	public AnimalDetachedCriteria createAnimaisAdotarCriteria() {
		return new AnimalDetachedCriteria(createCriteria("ORM_AnimaisAdotar"));
	}
	
	public AdocaoDetachedCriteria createListaPedidosAdCriteria() {
		return new AdocaoDetachedCriteria(createCriteria("ORM_ListaPedidosAd"));
	}
	
	public UtilizadorComum uniqueUtilizadorComum(PersistentSession session) {
		return (UtilizadorComum) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UtilizadorComum[] listUtilizadorComum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UtilizadorComum[]) list.toArray(new UtilizadorComum[list.size()]);
	}
}

