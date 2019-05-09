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

public class AnimalDAO {
	public static Animal loadAnimalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal getAnimalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getAnimalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal getAnimalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return getAnimalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Animal) session.load(procura4patas.Animal.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal getAnimalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Animal) session.get(procura4patas.Animal.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Animal) session.load(procura4patas.Animal.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal getAnimalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Animal) session.get(procura4patas.Animal.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimal(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryAnimal(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimal(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return queryAnimal(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal[] listAnimalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listAnimalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal[] listAnimalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return listAnimalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimal(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Animal as Animal");
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
	
	public static List queryAnimal(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Animal as Animal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Animal", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal[] listAnimalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnimal(session, condition, orderBy);
			return (Animal[]) list.toArray(new Animal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal[] listAnimalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnimal(session, condition, orderBy, lockMode);
			return (Animal[]) list.toArray(new Animal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return loadAnimalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Animal[] animals = listAnimalByQuery(session, condition, orderBy);
		if (animals != null && animals.length > 0)
			return animals[0];
		else
			return null;
	}
	
	public static Animal loadAnimalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Animal[] animals = listAnimalByQuery(session, condition, orderBy, lockMode);
		if (animals != null && animals.length > 0)
			return animals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnimalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateAnimalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnimalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Procura4patasPersistentManager.instance().getSession();
			return iterateAnimalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnimalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Animal as Animal");
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
	
	public static java.util.Iterator iterateAnimalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From procura4patas.Animal as Animal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Animal", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal createAnimal() {
		return new procura4patas.Animal();
	}
	
	public static boolean save(procura4patas.Animal animal) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().saveObject(animal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(procura4patas.Animal animal) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().deleteObject(animal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(procura4patas.Animal animal) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().refresh(animal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(procura4patas.Animal animal) throws PersistentException {
		try {
			Procura4patasPersistentManager.instance().getSession().evict(animal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animal loadAnimalByCriteria(AnimalCriteria animalCriteria) {
		Animal[] animals = listAnimalByCriteria(animalCriteria);
		if(animals == null || animals.length == 0) {
			return null;
		}
		return animals[0];
	}
	
	public static Animal[] listAnimalByCriteria(AnimalCriteria animalCriteria) {
		return animalCriteria.listAnimal();
	}
}
