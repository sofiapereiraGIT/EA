/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProcura4patasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = procura4patas.Procura4patasPersistentManager.instance().getSession().beginTransaction();
		try {
			procura4patas.Utilizador lprocura4patasUtilizador = procura4patas.UtilizadorDAO.createUtilizador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : listaPedidos, animais, email
			procura4patas.UtilizadorDAO.save(lprocura4patasUtilizador);
			procura4patas.Canil lprocura4patasCanil = procura4patas.CanilDAO.createCanil();
			// Initialize the properties of the persistent object here
			procura4patas.CanilDAO.save(lprocura4patasCanil);
			procura4patas.UtilizadorComum lprocura4patasUtilizadorComum = procura4patas.UtilizadorComumDAO.createUtilizadorComum();
			// Initialize the properties of the persistent object here
			procura4patas.UtilizadorComumDAO.save(lprocura4patasUtilizadorComum);
			procura4patas.Animal lprocura4patasAnimal = procura4patas.AnimalDAO.createAnimal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : discriminator, estado, compPelo, porte, idade, sexo
			procura4patas.AnimalDAO.save(lprocura4patasAnimal);
			procura4patas.Pedido lprocura4patasPedido = procura4patas.PedidoDAO.createPedido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : discriminator, estado, animal, utilizadorComum
			procura4patas.PedidoDAO.save(lprocura4patasPedido);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProcura4patasData createProcura4patasData = new CreateProcura4patasData();
			try {
				createProcura4patasData.createTestData();
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
