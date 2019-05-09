/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class CreateProcura4patasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = Procura4patasPersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = UtilizadorDAO.createUtilizador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animaisAdotar, animaisPerdidos, e_mail
			UtilizadorDAO.save(utilizador);
			Canil canil = CanilDAO.createCanil();
			// Initialize the properties of the persistent object here
			CanilDAO.save(canil);
			UtilizadorComum utilizadorComum = UtilizadorComumDAO.createUtilizadorComum();
			// Initialize the properties of the persistent object here
			UtilizadorComumDAO.save(utilizadorComum);
			Animal animal = AnimalDAO.createAnimal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado, compPelo, porte, idade, sexo
			AnimalDAO.save(animal);
			Cao cao = CaoDAO.createCao();
			// Initialize the properties of the persistent object here
			CaoDAO.save(cao);
			Gato gato = GatoDAO.createGato();
			// Initialize the properties of the persistent object here
			GatoDAO.save(gato);
			AnimalPerdido animalPerdido = AnimalPerdidoDAO.createAnimalPerdido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animalPerdido
			AnimalPerdidoDAO.save(animalPerdido);
			Pedido pedido = PedidoDAO.createPedido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado, animal, utilizadorComum
			PedidoDAO.save(pedido);
			Adocao adocao = AdocaoDAO.createAdocao();
			// Initialize the properties of the persistent object here
			AdocaoDAO.save(adocao);
			FAT fAT = FATDAO.createFAT();
			// Initialize the properties of the persistent object here
			FATDAO.save(fAT);
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
				Procura4patasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
