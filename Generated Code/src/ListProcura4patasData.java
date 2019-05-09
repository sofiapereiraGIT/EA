/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class ListProcura4patasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utilizador...");
		Utilizador[] utilizadors = UtilizadorDAO.listUtilizadorByQuery(null, null);
		int length = Math.min(utilizadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(utilizadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canil...");
		Canil[] canils = CanilDAO.listCanilByQuery(null, null);
		length = Math.min(canils.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(canils[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UtilizadorComum...");
		UtilizadorComum[] utilizadorComums = UtilizadorComumDAO.listUtilizadorComumByQuery(null, null);
		length = Math.min(utilizadorComums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(utilizadorComums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Animal...");
		Animal[] animals = AnimalDAO.listAnimalByQuery(null, null);
		length = Math.min(animals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cao...");
		Cao[] caos = CaoDAO.listCaoByQuery(null, null);
		length = Math.min(caos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(caos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Gato...");
		Gato[] gatos = GatoDAO.listGatoByQuery(null, null);
		length = Math.min(gatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(gatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AnimalPerdido...");
		AnimalPerdido[] animalPerdidos = AnimalPerdidoDAO.listAnimalPerdidoByQuery(null, null);
		length = Math.min(animalPerdidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(animalPerdidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		Pedido[] pedidos = PedidoDAO.listPedidoByQuery(null, null);
		length = Math.min(pedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(pedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Adocao...");
		Adocao[] adocaos = AdocaoDAO.listAdocaoByQuery(null, null);
		length = Math.min(adocaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(adocaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FAT...");
		FAT[] fATs = FATDAO.listFATByQuery(null, null);
		length = Math.min(fATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilizador by Criteria...");
		UtilizadorCriteria utilizadorCriteria = new UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//utilizadorCriteria.e_mail.eq();
		utilizadorCriteria.setMaxResults(ROW_COUNT);
		Utilizador[] utilizadors = utilizadorCriteria.listUtilizador();
		int length =utilizadors== null ? 0 : Math.min(utilizadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(utilizadors[i]);
		}
		System.out.println(length + " Utilizador record(s) retrieved."); 
		
		System.out.println("Listing Canil by Criteria...");
		CanilCriteria canilCriteria = new CanilCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//canilCriteria.e_mail.eq();
		canilCriteria.setMaxResults(ROW_COUNT);
		Canil[] canils = canilCriteria.listCanil();
		length =canils== null ? 0 : Math.min(canils.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(canils[i]);
		}
		System.out.println(length + " Canil record(s) retrieved."); 
		
		System.out.println("Listing UtilizadorComum by Criteria...");
		UtilizadorComumCriteria utilizadorComumCriteria = new UtilizadorComumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//utilizadorComumCriteria.e_mail.eq();
		utilizadorComumCriteria.setMaxResults(ROW_COUNT);
		UtilizadorComum[] utilizadorComums = utilizadorComumCriteria.listUtilizadorComum();
		length =utilizadorComums== null ? 0 : Math.min(utilizadorComums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(utilizadorComums[i]);
		}
		System.out.println(length + " UtilizadorComum record(s) retrieved."); 
		
		System.out.println("Listing Animal by Criteria...");
		AnimalCriteria animalCriteria = new AnimalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//animalCriteria.ID.eq();
		animalCriteria.setMaxResults(ROW_COUNT);
		Animal[] animals = animalCriteria.listAnimal();
		length =animals== null ? 0 : Math.min(animals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(animals[i]);
		}
		System.out.println(length + " Animal record(s) retrieved."); 
		
		System.out.println("Listing Cao by Criteria...");
		CaoCriteria caoCriteria = new CaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//caoCriteria.ID.eq();
		caoCriteria.setMaxResults(ROW_COUNT);
		Cao[] caos = caoCriteria.listCao();
		length =caos== null ? 0 : Math.min(caos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(caos[i]);
		}
		System.out.println(length + " Cao record(s) retrieved."); 
		
		System.out.println("Listing Gato by Criteria...");
		GatoCriteria gatoCriteria = new GatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//gatoCriteria.ID.eq();
		gatoCriteria.setMaxResults(ROW_COUNT);
		Gato[] gatos = gatoCriteria.listGato();
		length =gatos== null ? 0 : Math.min(gatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(gatos[i]);
		}
		System.out.println(length + " Gato record(s) retrieved."); 
		
		System.out.println("Listing AnimalPerdido by Criteria...");
		AnimalPerdidoCriteria animalPerdidoCriteria = new AnimalPerdidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//animalPerdidoCriteria.ID.eq();
		animalPerdidoCriteria.setMaxResults(ROW_COUNT);
		AnimalPerdido[] animalPerdidos = animalPerdidoCriteria.listAnimalPerdido();
		length =animalPerdidos== null ? 0 : Math.min(animalPerdidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(animalPerdidos[i]);
		}
		System.out.println(length + " AnimalPerdido record(s) retrieved."); 
		
		System.out.println("Listing Pedido by Criteria...");
		PedidoCriteria pedidoCriteria = new PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//pedidoCriteria.ID.eq();
		pedidoCriteria.setMaxResults(ROW_COUNT);
		Pedido[] pedidos = pedidoCriteria.listPedido();
		length =pedidos== null ? 0 : Math.min(pedidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(pedidos[i]);
		}
		System.out.println(length + " Pedido record(s) retrieved."); 
		
		System.out.println("Listing Adocao by Criteria...");
		AdocaoCriteria adocaoCriteria = new AdocaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//adocaoCriteria.ID.eq();
		adocaoCriteria.setMaxResults(ROW_COUNT);
		Adocao[] adocaos = adocaoCriteria.listAdocao();
		length =adocaos== null ? 0 : Math.min(adocaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(adocaos[i]);
		}
		System.out.println(length + " Adocao record(s) retrieved."); 
		
		System.out.println("Listing FAT by Criteria...");
		FATCriteria fATCriteria = new FATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fATCriteria.ID.eq();
		fATCriteria.setMaxResults(ROW_COUNT);
		FAT[] fATs = fATCriteria.listFAT();
		length =fATs== null ? 0 : Math.min(fATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fATs[i]);
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
				Procura4patasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
