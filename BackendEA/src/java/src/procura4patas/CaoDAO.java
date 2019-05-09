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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CaoDAO {
	public static Cao loadCaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCaoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao getCaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getCaoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao getCaoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getCaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cao) session.load(procura4patas.Cao.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao getCaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cao) session.get(procura4patas.Cao.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cao) session.load(procura4patas.Cao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao getCaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cao) session.get(procura4patas.Cao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCao(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryCao(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCao(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryCao(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao[] listCaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listCaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao[] listCaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listCaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCao(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Cao as Cao");
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
	
	public static List queryCao(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Cao as Cao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cao", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao[] listCaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCao(session, condition, orderBy);
			return (Cao[]) list.toArray(new Cao[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao[] listCaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCao(session, condition, orderBy, lockMode);
			return (Cao[]) list.toArray(new Cao[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadCaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cao[] caos = listCaoByQuery(session, condition, orderBy);
		if (caos != null && caos.length > 0)
			return caos[0];
		else
			return null;
	}
	
	public static Cao loadCaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cao[] caos = listCaoByQuery(session, condition, orderBy, lockMode);
		if (caos != null && caos.length > 0)
			return caos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateCaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateCaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Cao as Cao");
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
	
	public static java.util.Iterator iterateCaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Cao as Cao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cao", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao createCao() {
		return new procura4patas.Cao();
	}
	
	public static boolean save(procura4patas.Cao cao) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().saveObject(cao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(procura4patas.Cao cao) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().deleteObject(cao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(procura4patas.Cao cao) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().refresh(cao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(procura4patas.Cao cao) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().evict(cao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cao loadCaoByCriteria(CaoCriteria caoCriteria) {
		Cao[] caos = listCaoByCriteria(caoCriteria);
		if(caos == null || caos.length == 0) {
			return null;
		}
		return caos[0];
	}
	
	public static Cao[] listCaoByCriteria(CaoCriteria caoCriteria) {
		return caoCriteria.listCao();
	}
}
