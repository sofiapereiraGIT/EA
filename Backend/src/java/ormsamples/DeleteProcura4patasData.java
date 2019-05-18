/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProcura4patasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = procura4patas.Procura4patasPersistentManager.instance().getSession().beginTransaction();
		try {
			procura4patas.Utilizador lprocura4patasUtilizador = procura4patas.UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Delete the persistent object
			procura4patas.UtilizadorDAO.delete(lprocura4patasUtilizador);
			procura4patas.Canil lprocura4patasCanil = procura4patas.CanilDAO.loadCanilByQuery(null, null);
			// Delete the persistent object
			procura4patas.CanilDAO.delete(lprocura4patasCanil);
			procura4patas.UtilizadorComum lprocura4patasUtilizadorComum = procura4patas.UtilizadorComumDAO.loadUtilizadorComumByQuery(null, null);
			// Delete the persistent object
			procura4patas.UtilizadorComumDAO.delete(lprocura4patasUtilizadorComum);
			procura4patas.Animal lprocura4patasAnimal = procura4patas.AnimalDAO.loadAnimalByQuery(null, null);
			// Delete the persistent object
			procura4patas.AnimalDAO.delete(lprocura4patasAnimal);
			procura4patas.Cao lprocura4patasCao = procura4patas.CaoDAO.loadCaoByQuery(null, null);
			// Delete the persistent object
			procura4patas.CaoDAO.delete(lprocura4patasCao);
			procura4patas.Gato lprocura4patasGato = procura4patas.GatoDAO.loadGatoByQuery(null, null);
			// Delete the persistent object
			procura4patas.GatoDAO.delete(lprocura4patasGato);
			procura4patas.AnimalPerdido lprocura4patasAnimalPerdido = procura4patas.AnimalPerdidoDAO.loadAnimalPerdidoByQuery(null, null);
			// Delete the persistent object
			procura4patas.AnimalPerdidoDAO.delete(lprocura4patasAnimalPerdido);
			procura4patas.Pedido lprocura4patasPedido = procura4patas.PedidoDAO.loadPedidoByQuery(null, null);
			// Delete the persistent object
			procura4patas.PedidoDAO.delete(lprocura4patasPedido);
			procura4patas.Adocao lprocura4patasAdocao = procura4patas.AdocaoDAO.loadAdocaoByQuery(null, null);
			// Delete the persistent object
			procura4patas.AdocaoDAO.delete(lprocura4patasAdocao);
			procura4patas.FAT lprocura4patasFAT = procura4patas.FATDAO.loadFATByQuery(null, null);
			// Delete the persistent object
			procura4patas.FATDAO.delete(lprocura4patasFAT);
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
				procura4patas.Procura4patasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
