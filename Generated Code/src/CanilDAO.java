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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CanilDAO {
	public static Canil loadCanilByORMID(String e_mail) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCanilByORMID(session, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil getCanilByORMID(String e_mail) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getCanilByORMID(session, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByORMID(String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCanilByORMID(session, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil getCanilByORMID(String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getCanilByORMID(session, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByORMID(PersistentSession session, String e_mail) throws PersistentException {
		try {
			return (Canil) session.load(Canil.class, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil getCanilByORMID(PersistentSession session, String e_mail) throws PersistentException {
		try {
			return (Canil) session.get(Canil.class, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByORMID(PersistentSession session, String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Canil) session.load(Canil.class, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil getCanilByORMID(PersistentSession session, String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Canil) session.get(Canil.class, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanil(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryCanil(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanil(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryCanil(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil[] listCanilByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listCanilByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil[] listCanilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listCanilByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanil(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Canil as Canil");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanil(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Canil as Canil");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Canil", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil[] listCanilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCanil(session, condition, orderBy);
			return (Canil[]) list.toArray(new Canil[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil[] listCanilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCanil(session, condition, orderBy, lockMode);
			return (Canil[]) list.toArray(new Canil[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCanilByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCanilByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Canil[] canils = listCanilByQuery(session, condition, orderBy);
		if (canils != null && canils.length > 0)
			return canils[0];
		else
			return null;
	}
	
	public static Canil loadCanilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Canil[] canils = listCanilByQuery(session, condition, orderBy, lockMode);
		if (canils != null && canils.length > 0)
			return canils[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCanilByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateCanilByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateCanilByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Canil as Canil");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Canil as Canil");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Canil", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil createCanil() {
		return new Canil();
	}
	
	public static boolean save(Canil canil) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().saveObject(canil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Canil canil) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().deleteObject(canil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Canil canil) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().refresh(canil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Canil canil) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().evict(canil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canil loadCanilByCriteria(CanilCriteria canilCriteria) {
		Canil[] canils = listCanilByCriteria(canilCriteria);
		if(canils == null || canils.length == 0) {
			return null;
		}
		return canils[0];
	}
	
	public static Canil[] listCanilByCriteria(CanilCriteria canilCriteria) {
		return canilCriteria.listCanil();
	}
}
