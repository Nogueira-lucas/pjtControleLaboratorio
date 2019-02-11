/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.dominio.PC;
import br.com.modelos.IDAO;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lucas
 */
public class PCDAO implements IDAO{
    public static EntityManagerFactory emf;
    public static EntityManager em;
    
    public PCDAO() {
        emf = Persistence.createEntityManagerFactory("srcContabLabPU");
        em = emf.createEntityManager();
    }

    @Override
    public boolean salvar(PC o) {
        try{
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            em.getTransaction().rollback();
            return false;
        }finally{
            em.close();
        }
        
    }

    @Override
    public void alterar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
