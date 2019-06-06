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
		
		System.out.println("Listing Cao...");
		procura4patas.Cao[] procura4patasCaos = procura4patas.CaoDAO.listCaoByQuery(null, null);
		length = Math.min(procura4patasCaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasCaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Gato...");
		procura4patas.Gato[] procura4patasGatos = procura4patas.GatoDAO.listGatoByQuery(null, null);
		length = Math.min(procura4patasGatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasGatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AnimalPerdido...");
		procura4patas.AnimalPerdido[] procura4patasAnimalPerdidos = procura4patas.AnimalPerdidoDAO.listAnimalPerdidoByQuery(null, null);
		length = Math.min(procura4patasAnimalPerdidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasAnimalPerdidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		procura4patas.Pedido[] procura4patasPedidos = procura4patas.PedidoDAO.listPedidoByQuery(null, null);
		length = Math.min(procura4patasPedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasPedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Adocao...");
		procura4patas.Adocao[] procura4patasAdocaos = procura4patas.AdocaoDAO.listAdocaoByQuery(null, null);
		length = Math.min(procura4patasAdocaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasAdocaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FAT...");
		procura4patas.FAT[] procura4patasFATs = procura4patas.FATDAO.listFATByQuery(null, null);
		length = Math.min(procura4patasFATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(procura4patasFATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilizador by Criteria...");
		procura4patas.UtilizadorCriteria lprocura4patasUtilizadorCriteria = new procura4patas.UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasUtilizadorCriteria.e_mail.eq();
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
		//lprocura4patasCanilCriteria.e_mail.eq();
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
		//lprocura4patasUtilizadorComumCriteria.e_mail.eq();
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
		
		System.out.println("Listing Cao by Criteria...");
		procura4patas.CaoCriteria lprocura4patasCaoCriteria = new procura4patas.CaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasCaoCriteria.ID.eq();
		lprocura4patasCaoCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Cao[] procura4patasCaos = lprocura4patasCaoCriteria.listCao();
		length =procura4patasCaos== null ? 0 : Math.min(procura4patasCaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasCaos[i]);
		}
		System.out.println(length + " Cao record(s) retrieved."); 
		
		System.out.println("Listing Gato by Criteria...");
		procura4patas.GatoCriteria lprocura4patasGatoCriteria = new procura4patas.GatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasGatoCriteria.ID.eq();
		lprocura4patasGatoCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Gato[] procura4patasGatos = lprocura4patasGatoCriteria.listGato();
		length =procura4patasGatos== null ? 0 : Math.min(procura4patasGatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasGatos[i]);
		}
		System.out.println(length + " Gato record(s) retrieved."); 
		
		System.out.println("Listing AnimalPerdido by Criteria...");
		procura4patas.AnimalPerdidoCriteria lprocura4patasAnimalPerdidoCriteria = new procura4patas.AnimalPerdidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasAnimalPerdidoCriteria.ID.eq();
		lprocura4patasAnimalPerdidoCriteria.setMaxResults(ROW_COUNT);
		procura4patas.AnimalPerdido[] procura4patasAnimalPerdidos = lprocura4patasAnimalPerdidoCriteria.listAnimalPerdido();
		length =procura4patasAnimalPerdidos== null ? 0 : Math.min(procura4patasAnimalPerdidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasAnimalPerdidos[i]);
		}
		System.out.println(length + " AnimalPerdido record(s) retrieved."); 
		
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
		
		System.out.println("Listing Adocao by Criteria...");
		procura4patas.AdocaoCriteria lprocura4patasAdocaoCriteria = new procura4patas.AdocaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasAdocaoCriteria.ID.eq();
		lprocura4patasAdocaoCriteria.setMaxResults(ROW_COUNT);
		procura4patas.Adocao[] procura4patasAdocaos = lprocura4patasAdocaoCriteria.listAdocao();
		length =procura4patasAdocaos== null ? 0 : Math.min(procura4patasAdocaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasAdocaos[i]);
		}
		System.out.println(length + " Adocao record(s) retrieved."); 
		
		System.out.println("Listing FAT by Criteria...");
		procura4patas.FATCriteria lprocura4patasFATCriteria = new procura4patas.FATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lprocura4patasFATCriteria.ID.eq();
		lprocura4patasFATCriteria.setMaxResults(ROW_COUNT);
		procura4patas.FAT[] procura4patasFATs = lprocura4patasFATCriteria.listFAT();
		length =procura4patasFATs== null ? 0 : Math.min(procura4patasFATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(procura4patasFATs[i]);
		}
		System.out.println(length + " FAT record(s) retrieved."); 
		
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
