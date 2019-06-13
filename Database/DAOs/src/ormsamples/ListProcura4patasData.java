/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProcura4patasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utilizador...");
		procura4patas.Utilizador[] procura4patasUtilizadors = procura4patas.UtilizadorDAO.listUtilizadorByQuery(null, null);
		int length = Math.min(procura4patasUtilizadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasUtilizadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canil...");
		procura4patas.Canil[] procura4patasCanils = procura4patas.CanilDAO.listCanilByQuery(null, null);
		length = Math.min(procura4patasCanils.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasCanils[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UtilizadorComum...");
		procura4patas.UtilizadorComum[] procura4patasUtilizadorComums = procura4patas.UtilizadorComumDAO.listUtilizadorComumByQuery(null, null);
		length = Math.min(procura4patasUtilizadorComums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasUtilizadorComums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Animal...");
		procura4patas.Animal[] procura4patasAnimals = procura4patas.AnimalDAO.listAnimalByQuery(null, null);
		length = Math.min(procura4patasAnimals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasAnimals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		procura4patas.Pedido[] procura4patasPedidos = procura4patas.PedidoDAO.listPedidoByQuery(null, null);
		length = Math.min(procura4patasPedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasPedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilizador by Criteria...");
		procura4patas.UtilizadorCriteria lprocura4patasUtilizadorCriteria = new procura4patas.UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasUtilizadorCriteria.email.eq();
		lprocura4patasUtilizadorCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Utilizador[] procura4patasUtilizadors = lprocura4patasUtilizadorCriteria.listUtilizador();
		int length =procura4patasUtilizadors== null ? 0 : Math.min(procura4patasUtilizadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasUtilizadors[i]);
		}
		System.out.println(length + " Utilizador record(s) retrieved."); 
		
		System.out.println("Listing Canil by Criteria...");
		procura4patas.CanilCriteria lprocura4patasCanilCriteria = new procura4patas.CanilCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasCanilCriteria.email.eq();
		lprocura4patasCanilCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Canil[] procura4patasCanils = lprocura4patasCanilCriteria.listCanil();
		length =procura4patasCanils== null ? 0 : Math.min(procura4patasCanils.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasCanils[i]);
		}
		System.out.println(length + " Canil record(s) retrieved."); 
		
		System.out.println("Listing UtilizadorComum by Criteria...");
		procura4patas.UtilizadorComumCriteria lprocura4patasUtilizadorComumCriteria = new procura4patas.UtilizadorComumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasUtilizadorComumCriteria.email.eq();
		lprocura4patasUtilizadorComumCriteria.setMaxResults(ROW_COUNT);
		procura4patas.UtilizadorComum[] procura4patasUtilizadorComums = lprocura4patasUtilizadorComumCriteria.listUtilizadorComum();
		length =procura4patasUtilizadorComums== null ? 0 : Math.min(procura4patasUtilizadorComums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasUtilizadorComums[i]);
		}
		System.out.println(length + " UtilizadorComum record(s) retrieved."); 
		
		System.out.println("Listing Animal by Criteria...");
		procura4patas.AnimalCriteria lprocura4patasAnimalCriteria = new procura4patas.AnimalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasAnimalCriteria.ID.eq();
		lprocura4patasAnimalCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Animal[] procura4patasAnimals = lprocura4patasAnimalCriteria.listAnimal();
		length =procura4patasAnimals== null ? 0 : Math.min(procura4patasAnimals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasAnimals[i]);
		}
		System.out.println(length + " Animal record(s) retrieved."); 
		
		System.out.println("Listing Pedido by Criteria...");
		procura4patas.PedidoCriteria lprocura4patasPedidoCriteria = new procura4patas.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasPedidoCriteria.ID.eq();
		lprocura4patasPedidoCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Pedido[] procura4patasPedidos = lprocura4patasPedidoCriteria.listPedido();
		length =procura4patasPedidos== null ? 0 : Math.min(procura4patasPedidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasPedidos[i]);
		}
		System.out.println(length + " Pedido record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProcura4patasData listProcura4patasData = new ListProcura4patasData();
			try {
				listProcura4patasData.listTestData();
				//listProcura4patasData.listByCriteria();
			}
			finally {
				procura4patas.Procura4patasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
