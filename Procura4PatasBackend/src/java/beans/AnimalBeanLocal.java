/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.ejb.Local;
import org.orm.PersistentSession;
import procura4patas.Animal;

/**
 *
 * @author davidsousa
 */
@Local
public interface AnimalBeanLocal {

    public List getCaesAdotar(PersistentSession session);

    public List getGatosAdotar(PersistentSession session);

    public List getCaesPerdidos(PersistentSession session);

    public List getGatosPerdidos(PersistentSession session);

    public boolean addAnimal(PersistentSession session, String UtilizadorEmail, String nome, String fotografia, char sexo, char idade, String raca, char porte, String corPelo, char compPelo, char estado, String descricao, String concelho, char discriminator);

    public boolean updateAnimal(PersistentSession session, int ID, String nome, String fotografia, char sexo, char idade, String raca, char porte, String corPelo, char compPelo, char estado, String descricao, String concelho, char discriminator);

    public boolean deleteAnimalPerdido(PersistentSession session, int ID);

    public Animal getAnimal(PersistentSession session, int id);

    public String getUtilizadorEmail(PersistentSession session, int id);
    
}
