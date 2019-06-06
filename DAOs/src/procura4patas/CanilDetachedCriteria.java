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

public class CanilDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public CanilDetachedCriteria() {
		super(procura4patas.Canil.class, procura4patas.CanilCriteria.class);
		e_mail = new StringExpression("e_mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		animaisAdotar = new CollectionExpression("ORM_AnimaisAdotar", this.getDetachedCriteria());
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this.getDetachedCriteria());
		morada = new StringExpression("morada", this.getDetachedCriteria());
		horario = new StringExpression("horario", this.getDetachedCriteria());
		siteOficial = new StringExpression("siteOficial", this.getDetachedCriteria());
		facebook = new StringExpression("facebook", this.getDetachedCriteria());
		instagram = new StringExpression("instagram", this.getDetachedCriteria());
		listaPedidosFAT = new CollectionExpression("ORM_ListaPedidosFAT", this.getDetachedCriteria());
	}
	
	public CanilDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, procura4patas.CanilCriteria.class);
		e_mail = new StringExpression("e_mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		fotografia = new StringExpression("fotografia", this.getDetachedCriteria());
		concelho = new StringExpression("concelho", this.getDetachedCriteria());
		telemovel = new StringExpression("telemovel", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		animaisAdotar = new CollectionExpression("ORM_AnimaisAdotar", this.getDetachedCriteria());
		listaPedidosAd = new CollectionExpression("ORM_ListaPedidosAd", this.getDetachedCriteria());
		morada = new StringExpression("morada", this.getDetachedCriteria());
		horario = new StringExpression("horario", this.getDetachedCriteria());
		siteOficial = new StringExpression("siteOficial", this.getDetachedCriteria());
		facebook = new StringExpression("facebook", this.getDetachedCriteria());
		instagram = new StringExpression("instagram", this.getDetachedCriteria());
		listaPedidosFAT = new CollectionExpression("ORM_ListaPedidosFAT", this.getDetachedCriteria());
	}
	
	public FATDetachedCriteria createListaPedidosFATCriteria() {
		return new FATDetachedCriteria(createCriteria("ORM_ListaPedidosFAT"));
	}
	
	public AnimalDetachedCriteria createAnimaisAdotarCriteria() {
		return new AnimalDetachedCriteria(createCriteria("ORM_AnimaisAdotar"));
	}
	
	public AdocaoDetachedCriteria createListaPedidosAdCriteria() {
		return new AdocaoDetachedCriteria(createCriteria("ORM_ListaPedidosAd"));
	}
	
	public Canil uniqueCanil(PersistentSession session) {
		return (Canil) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Canil[] listCanil(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Canil[]) list.toArray(new Canil[list.size()]);
	}
}

