/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.*;

/**
 *
 * @author davidsousa
 */
@Stateless
public class CanilBean implements CanilBeanLocal {

    @Override
    public List<Canil> getCanis(PersistentSession sessao) {
        List<Canil> lista = new ArrayList<>();
        
        try {
            lista = CanilDAO.queryCanil(sessao, null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(CanilBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    @Override
    public Canil getCanil(PersistentSession sessao, String email) {
        Canil canil = null;
        
        try {
            canil = CanilDAO.getCanilByORMID(sessao, email);
        } catch (PersistentException ex) {
            Logger.getLogger(CanilBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return canil;
    }

    @Override
    public boolean addCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta) {
        
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
        
        Canil c = new Canil();
        c.setMorada(morada);
        
        if(!horario.equals("")) c.setHorario(horario);
        else c.setHorario(null);
            
        if(!site.equals("")) c.setSiteOficial(site);
        else c.setSiteOficial(null);
        
        if(!face.equals("")) c.setFacebook(face);
        else c.setFacebook(null);
        
        if(!insta.equals("")) c.setInstagram(insta);
        else c.setInstagram(null);
        
        try {
            sessao.beginTransaction();
            
            criado = UtilizadorDAO.save(ut);
            
            if(criado){
                Query query = sessao.createSQLQuery("INSERT INTO Canil (UtilizadorEmail, Morada, Horario, SiteOficial, Facebook, Instagram) VALUES(" 
                        + email + ", " + c.getMorada() + ", " + c.getHorario() + ", " + c.getSiteOficial() + ", " + c.getFacebook() + ", " + c.getInstagram() + ")");
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
    public void updateCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta) {
    }
}
