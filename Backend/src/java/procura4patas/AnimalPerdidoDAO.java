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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AnimalPerdidoDAO {
	public static AnimalPerdido loadAnimalPerdidoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalPerdidoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido getAnimalPerdidoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getAnimalPerdidoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalPerdidoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido getAnimalPerdidoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getAnimalPerdidoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AnimalPerdido) session.load(procura4patas.AnimalPerdido.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido getAnimalPerdidoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AnimalPerdido) session.get(procura4patas.AnimalPerdido.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AnimalPerdido) session.load(procura4patas.AnimalPerdido.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido getAnimalPerdidoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AnimalPerdido) session.get(procura4patas.AnimalPerdido.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimalPerdido(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryAnimalPerdido(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimalPerdido(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryAnimalPerdido(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido[] listAnimalPerdidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listAnimalPerdidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido[] listAnimalPerdidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listAnimalPerdidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimalPerdido(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.AnimalPerdido as AnimalPerdido");
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
	
	public static List queryAnimalPerdido(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.AnimalPerdido as AnimalPerdido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AnimalPerdido", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido[] listAnimalPerdidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnimalPerdido(session, condition, orderBy);
			return (AnimalPerdido[]) list.toArray(new AnimalPerdido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido[] listAnimalPerdidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnimalPerdido(session, condition, orderBy, lockMode);
			return (AnimalPerdido[]) list.toArray(new AnimalPerdido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalPerdidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalPerdidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AnimalPerdido[] animalPerdidos = listAnimalPerdidoByQuery(session, condition, orderBy);
		if (animalPerdidos != null && animalPerdidos.length > 0)
			return animalPerdidos[0];
		else
			return null;
	}
	
	public static AnimalPerdido loadAnimalPerdidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AnimalPerdido[] animalPerdidos = listAnimalPerdidoByQuery(session, condition, orderBy, lockMode);
		if (animalPerdidos != null && animalPerdidos.length > 0)
			return animalPerdidos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnimalPerdidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateAnimalPerdidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnimalPerdidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateAnimalPerdidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnimalPerdidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.AnimalPerdido as AnimalPerdido");
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
	
	public static java.util.Iterator iterateAnimalPerdidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.AnimalPerdido as AnimalPerdido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AnimalPerdido", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido createAnimalPerdido() {
		return new procura4patas.AnimalPerdido();
	}
	
	public static boolean save(procura4patas.AnimalPerdido animalPerdido) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().saveObject(animalPerdido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(procura4patas.AnimalPerdido animalPerdido) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().deleteObject(animalPerdido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(procura4patas.AnimalPerdido animalPerdido) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().refresh(animalPerdido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(procura4patas.AnimalPerdido animalPerdido) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().evict(animalPerdido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AnimalPerdido loadAnimalPerdidoByCriteria(AnimalPerdidoCriteria animalPerdidoCriteria) {
		AnimalPerdido[] animalPerdidos = listAnimalPerdidoByCriteria(animalPerdidoCriteria);
		if(animalPerdidos == null || animalPerdidos.length == 0) {
			return null;
		}
		return animalPerdidos[0];
	}
	
	public static AnimalPerdido[] listAnimalPerdidoByCriteria(AnimalPerdidoCriteria animalPerdidoCriteria) {
		return animalPerdidoCriteria.listAnimalPerdido();
	}
}
