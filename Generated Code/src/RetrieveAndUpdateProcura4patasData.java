/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateProcura4patasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = Procura4patasPersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Update the properties of the persistent object
			UtilizadorDAO.save(utilizador);
			Canil canil = CanilDAO.loadCanilByQuery(null, null);
			// Update the properties of the persistent object
			CanilDAO.save(canil);
			UtilizadorComum utilizadorComum = UtilizadorComumDAO.loadUtilizadorComumByQuery(null, null);
			// Update the properties of the persistent object
			UtilizadorComumDAO.save(utilizadorComum);
			Animal animal = AnimalDAO.loadAnimalByQuery(null, null);
			// Update the properties of the persistent object
			AnimalDAO.save(animal);
			Cao cao = CaoDAO.loadCaoByQuery(null, null);
			// Update the properties of the persistent object
			CaoDAO.save(cao);
			Gato gato = GatoDAO.loadGatoByQuery(null, null);
			// Update the properties of the persistent object
			GatoDAO.save(gato);
			AnimalPerdido animalPerdido = AnimalPerdidoDAO.loadAnimalPerdidoByQuery(null, null);
			// Update the properties of the persistent object
			AnimalPerdidoDAO.save(animalPerdido);
			Pedido pedido = PedidoDAO.loadPedidoByQuery(null, null);
			// Update the properties of the persistent object
			PedidoDAO.save(pedido);
			Adocao adocao = AdocaoDAO.loadAdocaoByQuery(null, null);
			// Update the properties of the persistent object
			AdocaoDAO.save(adocao);
			FAT fAT = FATDAO.loadFATByQuery(null, null);
			// Update the properties of the persistent object
			FATDAO.save(fAT);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilizador by UtilizadorCriteria");
		UtilizadorCriteria utilizadorCriteria = new UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//utilizadorCriteria.e_mail.eq();
		System.out.println(utilizadorCriteria.uniqueUtilizador());
		
		System.out.println("Retrieving Canil by CanilCriteria");
		CanilCriteria canilCriteria = new CanilCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//canilCriteria.e_mail.eq();
		System.out.println(canilCriteria.uniqueCanil());
		
		System.out.println("Retrieving UtilizadorComum by UtilizadorComumCriteria");
		UtilizadorComumCriteria utilizadorComumCriteria = new UtilizadorComumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//utilizadorComumCriteria.e_mail.eq();
		System.out.println(utilizadorComumCriteria.uniqueUtilizadorComum());
		
		System.out.println("Retrieving Animal by AnimalCriteria");
		AnimalCriteria animalCriteria = new AnimalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//animalCriteria.ID.eq();
		System.out.println(animalCriteria.uniqueAnimal());
		
		System.out.println("Retrieving Cao by CaoCriteria");
		CaoCriteria caoCriteria = new CaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//caoCriteria.ID.eq();
		System.out.println(caoCriteria.uniqueCao());
		
		System.out.println("Retrieving Gato by GatoCriteria");
		GatoCriteria gatoCriteria = new GatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//gatoCriteria.ID.eq();
		System.out.println(gatoCriteria.uniqueGato());
		
		System.out.println("Retrieving AnimalPerdido by AnimalPerdidoCriteria");
		AnimalPerdidoCriteria animalPerdidoCriteria = new AnimalPerdidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//animalPerdidoCriteria.ID.eq();
		System.out.println(animalPerdidoCriteria.uniqueAnimalPerdido());
		
		System.out.println("Retrieving Pedido by PedidoCriteria");
		PedidoCriteria pedidoCriteria = new PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//pedidoCriteria.ID.eq();
		System.out.println(pedidoCriteria.uniquePedido());
		
		System.out.println("Retrieving Adocao by AdocaoCriteria");
		AdocaoCriteria adocaoCriteria = new AdocaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//adocaoCriteria.ID.eq();
		System.out.println(adocaoCriteria.uniqueAdocao());
		
		System.out.println("Retrieving FAT by FATCriteria");
		FATCriteria fATCriteria = new FATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fATCriteria.ID.eq();
		System.out.println(fATCriteria.uniqueFAT());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProcura4patasData retrieveAndUpdateProcura4patasData = new RetrieveAndUpdateProcura4patasData();
			try {
				retrieveAndUpdateProcura4patasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProcura4patasData.retrieveByCriteria();
			}
			finally {
				Procura4patasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
