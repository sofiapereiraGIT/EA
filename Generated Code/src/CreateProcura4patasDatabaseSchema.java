/**
 * Licensee: Carlos Pedrosa(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class CreateProcura4patasDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(Procura4patasPersistentManager.instance());
			Procura4patasPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
