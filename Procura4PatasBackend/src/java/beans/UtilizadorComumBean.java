/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Utilizador;
import procura4patas.UtilizadorComum;
import procura4patas.UtilizadorComumDAO;
import procura4patas.UtilizadorDAO;

/**
 *
 * @author davidsousa
 */
@Stateless
public class UtilizadorComumBean implements UtilizadorComumBeanLocal {

    @Override
    public UtilizadorComum getUtilizadorComun(PersistentSession sessao, String email) {
        UtilizadorComum uc = null;
        
        try {
            uc = UtilizadorComumDAO.getUtilizadorComumByORMID(sessao, email);
        } catch (PersistentException ex) {
            Logger.getLogger(UtilizadorComumBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uc;
    }

    @Override
    public boolean addUtilizadorComun(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao) {
        boolean criado = false;
        
        Utilizador ut = new Utilizador();
        ut.setEmail(email);
        ut.setPassword(pass);
        ut.setNome(nome);
        ut.setConcelho(concelho);
        
        if(!foto.equals("")) ut.setFotografia(foto);
        else ut.setFotografia(null);
        
        if(!tlm.equals("")) ut.setTelemovel(tlm);
        else ut.setTelemovel(null);
        
        if(!descricao.equals("")) ut.setDescricao(descricao);
        else ut.setDescricao(null);
        
        try {
            sessao.beginTransaction();
            
            criado = UtilizadorDAO.save(ut);
            
            if(criado){
                Query query = sessao.createSQLQuery("INSERT INTO UtilizadorComum VALUES(" + email + ")");
                query.executeUpdate();
                
                try{
                sessao.getTransaction().commit();
                criado = true;
                } catch (Exception e){
                    sessao.getTransaction().rollback();
                    criado = false;
                }
            }
            else sessao.getTransaction().rollback();
            
        } catch (PersistentException ex) {
            sessao.getTransaction().rollback();
            criado = false;
        }
        
        return criado;
    }

    @Override
    public boolean updateUtilizadorComun(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao) {
        return false;
    }
}
