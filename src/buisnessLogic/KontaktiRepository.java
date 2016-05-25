/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisnessLogic;

import database.Kontakti;
import java.util.List;

/**
 *
 * @author KP Team
 */
public class KontaktiRepository extends EntMngClass implements KontaktiInterface{

    @Override
    public void create(Kontakti k) {
        em.getTransaction().begin();
        em.persist(k);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Kontakti k) {
        em.getTransaction().begin();
        em.merge(k);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Kontakti k) {
        em.getTransaction().begin();
        em.remove(k);
        em.getTransaction().commit(); 
    }

    @Override
    public List<Kontakti> findAll() {
        return em.createNamedQuery("Kontakti.findAll").getResultList();
            
    }
    
}
