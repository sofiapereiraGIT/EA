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
			procura4patas.Pedido lprocura4patasPedido = procura4patas.PedidoDAO.loadPedidoByQuery(null, null);
			// Delete the persistent object
			procura4patas.PedidoDAO.delete(lprocura4patasPedido);
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
