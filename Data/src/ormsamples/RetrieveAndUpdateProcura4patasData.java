/**
 * Licensee: salete(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProcura4patasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = procura4patas.Procura4patasPersistentManager.instance().getSession().beginTransaction();
		try {
			procura4patas.Utilizador lprocura4patasUtilizador = procura4patas.UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.UtilizadorDAO.save(lprocura4patasUtilizador);
			procura4patas.Canil lprocura4patasCanil = procura4patas.CanilDAO.loadCanilByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.CanilDAO.save(lprocura4patasCanil);
			procura4patas.UtilizadorComum lprocura4patasUtilizadorComum = procura4patas.UtilizadorComumDAO.loadUtilizadorComumByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.UtilizadorComumDAO.save(lprocura4patasUtilizadorComum);
			procura4patas.Animal lprocura4patasAnimal = procura4patas.AnimalDAO.loadAnimalByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.AnimalDAO.save(lprocura4patasAnimal);
			procura4patas.Cao lprocura4patasCao = procura4patas.CaoDAO.loadCaoByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.CaoDAO.save(lprocura4patasCao);
			procura4patas.Gato lprocura4patasGato = procura4patas.GatoDAO.loadGatoByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.GatoDAO.save(lprocura4patasGato);
			procura4patas.AnimalPerdido lprocura4patasAnimalPerdido = procura4patas.AnimalPerdidoDAO.loadAnimalPerdidoByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.AnimalPerdidoDAO.save(lprocura4patasAnimalPerdido);
			procura4patas.Pedido lprocura4patasPedido = procura4patas.PedidoDAO.loadPedidoByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.PedidoDAO.save(lprocura4patasPedido);
			procura4patas.Adocao lprocura4patasAdocao = procura4patas.AdocaoDAO.loadAdocaoByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.AdocaoDAO.save(lprocura4patasAdocao);
			procura4patas.FAT lprocura4patasFAT = procura4patas.FATDAO.loadFATByQuery(null, null);
			// Update the properties of the persistent object
			procura4patas.FATDAO.save(lprocura4patasFAT);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilizador by UtilizadorCriteria");
		procura4patas.UtilizadorCriteria lprocura4patasUtilizadorCriteria = new procura4patas.UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasUtilizadorCriteria.e_mail.eq();
		System.out.println(lprocura4patasUtilizadorCriteria.uniqueUtilizador());
		
		System.out.println("Retrieving Canil by CanilCriteria");
		procura4patas.CanilCriteria lprocura4patasCanilCriteria = new procura4patas.CanilCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasCanilCriteria.e_mail.eq();
		System.out.println(lprocura4patasCanilCriteria.uniqueCanil());
		
		System.out.println("Retrieving UtilizadorComum by UtilizadorComumCriteria");
		procura4patas.UtilizadorComumCriteria lprocura4patasUtilizadorComumCriteria = new procura4patas.UtilizadorComumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasUtilizadorComumCriteria.e_mail.eq();
		System.out.println(lprocura4patasUtilizadorComumCriteria.uniqueUtilizadorComum());
		
		System.out.println("Retrieving Animal by AnimalCriteria");
		procura4patas.AnimalCriteria lprocura4patasAnimalCriteria = new procura4patas.AnimalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasAnimalCriteria.ID.eq();
		System.out.println(lprocura4patasAnimalCriteria.uniqueAnimal());
		
		System.out.println("Retrieving Cao by CaoCriteria");
		procura4patas.CaoCriteria lprocura4patasCaoCriteria = new procura4patas.CaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasCaoCriteria.ID.eq();
		System.out.println(lprocura4patasCaoCriteria.uniqueCao());
		
		System.out.println("Retrieving Gato by GatoCriteria");
		procura4patas.GatoCriteria lprocura4patasGatoCriteria = new procura4patas.GatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasGatoCriteria.ID.eq();
		System.out.println(lprocura4patasGatoCriteria.uniqueGato());
		
		System.out.println("Retrieving AnimalPerdido by AnimalPerdidoCriteria");
		procura4patas.AnimalPerdidoCriteria lprocura4patasAnimalPerdidoCriteria = new procura4patas.AnimalPerdidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasAnimalPerdidoCriteria.ID.eq();
		System.out.println(lprocura4patasAnimalPerdidoCriteria.uniqueAnimalPerdido());
		
		System.out.println("Retrieving Pedido by PedidoCriteria");
		procura4patas.PedidoCriteria lprocura4patasPedidoCriteria = new procura4patas.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasPedidoCriteria.ID.eq();
		System.out.println(lprocura4patasPedidoCriteria.uniquePedido());
		
		System.out.println("Retrieving Adocao by AdocaoCriteria");
		procura4patas.AdocaoCriteria lprocura4patasAdocaoCriteria = new procura4patas.AdocaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasAdocaoCriteria.ID.eq();
		System.out.println(lprocura4patasAdocaoCriteria.uniqueAdocao());
		
		System.out.println("Retrieving FAT by FATCriteria");
		procura4patas.FATCriteria lprocura4patasFATCriteria = new procura4patas.FATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lprocura4patasFATCriteria.ID.eq();
		System.out.println(lprocura4patasFATCriteria.uniqueFAT());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProcura4patasData retrieveAndUpdateProcura4patasData = new RetrieveAndUpdateProcura4patasData();
			try {
				retrieveAndUpdateProcura4patasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProcura4patasData.retrieveByCriteria();
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
