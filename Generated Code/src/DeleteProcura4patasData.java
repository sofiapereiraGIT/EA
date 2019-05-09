/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class DeleteProcura4patasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = Procura4patasPersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Delete the persistent object
			UtilizadorDAO.delete(utilizador);
			Canil canil = CanilDAO.loadCanilByQuery(null, null);
			// Delete the persistent object
			CanilDAO.delete(canil);
			UtilizadorComum utilizadorComum = UtilizadorComumDAO.loadUtilizadorComumByQuery(null, null);
			// Delete the persistent object
			UtilizadorComumDAO.delete(utilizadorComum);
			Animal animal = AnimalDAO.loadAnimalByQuery(null, null);
			// Delete the persistent object
			AnimalDAO.delete(animal);
			Cao cao = CaoDAO.loadCaoByQuery(null, null);
			// Delete the persistent object
			CaoDAO.delete(cao);
			Gato gato = GatoDAO.loadGatoByQuery(null, null);
			// Delete the persistent object
			GatoDAO.delete(gato);
			AnimalPerdido animalPerdido = AnimalPerdidoDAO.loadAnimalPerdidoByQuery(null, null);
			// Delete the persistent object
			AnimalPerdidoDAO.delete(animalPerdido);
			Pedido pedido = PedidoDAO.loadPedidoByQuery(null, null);
			// Delete the persistent object
			PedidoDAO.delete(pedido);
			Adocao adocao = AdocaoDAO.loadAdocaoByQuery(null, null);
			// Delete the persistent object
			AdocaoDAO.delete(adocao);
			FAT fAT = FATDAO.loadFATByQuery(null, null);
			// Delete the persistent object
			FATDAO.delete(fAT);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProcura4patasData deleteProcura4patasData = new DeleteProcura4patasData();
			try {
				deleteProcura4patasData.deleteTestData();
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
