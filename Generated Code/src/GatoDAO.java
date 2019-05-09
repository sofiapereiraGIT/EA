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

public class GatoDAO {
	public static Gato loadGatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadGatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato getGatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getGatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadGatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato getGatoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getGatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Gato) session.load(Gato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato getGatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Gato) session.get(Gato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gato) session.load(Gato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato getGatoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gato) session.get(Gato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryGato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGato(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryGato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato[] listGatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listGatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato[] listGatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listGatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Gato as Gato");
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
	
	public static List queryGato(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Gato as Gato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Gato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato[] listGatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGato(session, condition, orderBy);
			return (Gato[]) list.toArray(new Gato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato[] listGatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGato(session, condition, orderBy, lockMode);
			return (Gato[]) list.toArray(new Gato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadGatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadGatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Gato[] gatos = listGatoByQuery(session, condition, orderBy);
		if (gatos != null && gatos.length > 0)
			return gatos[0];
		else
			return null;
	}
	
	public static Gato loadGatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Gato[] gatos = listGatoByQuery(session, condition, orderBy, lockMode);
		if (gatos != null && gatos.length > 0)
			return gatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateGatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateGatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Gato as Gato");
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
	
	public static java.util.Iterator iterateGatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Gato as Gato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Gato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato createGato() {
		return new Gato();
	}
	
	public static boolean save(Gato gato) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().saveObject(gato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Gato gato) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().deleteObject(gato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Gato gato) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().refresh(gato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Gato gato) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().evict(gato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gato loadGatoByCriteria(GatoCriteria gatoCriteria) {
		Gato[] gatos = listGatoByCriteria(gatoCriteria);
		if(gatos == null || gatos.length == 0) {
			return null;
		}
		return gatos[0];
	}
	
	public static Gato[] listGatoByCriteria(GatoCriteria gatoCriteria) {
		return gatoCriteria.listGato();
	}
}
