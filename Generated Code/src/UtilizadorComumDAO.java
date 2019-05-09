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

public class UtilizadorComumDAO {
	public static UtilizadorComum loadUtilizadorComumByORMID(String e_mail) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadUtilizadorComumByORMID(session, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum getUtilizadorComumByORMID(String e_mail) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getUtilizadorComumByORMID(session, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByORMID(String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadUtilizadorComumByORMID(session, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum getUtilizadorComumByORMID(String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getUtilizadorComumByORMID(session, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByORMID(PersistentSession session, String e_mail) throws PersistentException {
		try {
			return (UtilizadorComum) session.load(UtilizadorComum.class, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum getUtilizadorComumByORMID(PersistentSession session, String e_mail) throws PersistentException {
		try {
			return (UtilizadorComum) session.get(UtilizadorComum.class, e_mail);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByORMID(PersistentSession session, String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UtilizadorComum) session.load(UtilizadorComum.class, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum getUtilizadorComumByORMID(PersistentSession session, String e_mail, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UtilizadorComum) session.get(UtilizadorComum.class, e_mail, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizadorComum(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryUtilizadorComum(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizadorComum(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryUtilizadorComum(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum[] listUtilizadorComumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listUtilizadorComumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum[] listUtilizadorComumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listUtilizadorComumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizadorComum(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From UtilizadorComum as UtilizadorComum");
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
	
	public static List queryUtilizadorComum(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From UtilizadorComum as UtilizadorComum");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UtilizadorComum", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum[] listUtilizadorComumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUtilizadorComum(session, condition, orderBy);
			return (UtilizadorComum[]) list.toArray(new UtilizadorComum[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum[] listUtilizadorComumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUtilizadorComum(session, condition, orderBy, lockMode);
			return (UtilizadorComum[]) list.toArray(new UtilizadorComum[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadUtilizadorComumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadUtilizadorComumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UtilizadorComum[] utilizadorComums = listUtilizadorComumByQuery(session, condition, orderBy);
		if (utilizadorComums != null && utilizadorComums.length > 0)
			return utilizadorComums[0];
		else
			return null;
	}
	
	public static UtilizadorComum loadUtilizadorComumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UtilizadorComum[] utilizadorComums = listUtilizadorComumByQuery(session, condition, orderBy, lockMode);
		if (utilizadorComums != null && utilizadorComums.length > 0)
			return utilizadorComums[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUtilizadorComumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateUtilizadorComumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilizadorComumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateUtilizadorComumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilizadorComumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From UtilizadorComum as UtilizadorComum");
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
	
	public static java.util.Iterator iterateUtilizadorComumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From UtilizadorComum as UtilizadorComum");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UtilizadorComum", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum createUtilizadorComum() {
		return new UtilizadorComum();
	}
	
	public static boolean save(UtilizadorComum utilizadorComum) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().saveObject(utilizadorComum);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(UtilizadorComum utilizadorComum) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().deleteObject(utilizadorComum);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(UtilizadorComum utilizadorComum) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().refresh(utilizadorComum);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(UtilizadorComum utilizadorComum) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().evict(utilizadorComum);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UtilizadorComum loadUtilizadorComumByCriteria(UtilizadorComumCriteria utilizadorComumCriteria) {
		UtilizadorComum[] utilizadorComums = listUtilizadorComumByCriteria(utilizadorComumCriteria);
		if(utilizadorComums == null || utilizadorComums.length == 0) {
			return null;
		}
		return utilizadorComums[0];
	}
	
	public static UtilizadorComum[] listUtilizadorComumByCriteria(UtilizadorComumCriteria utilizadorComumCriteria) {
		return utilizadorComumCriteria.listUtilizadorComum();
	}
}
