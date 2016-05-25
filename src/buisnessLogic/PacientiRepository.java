
package buisnessLogic;

import database.Pacienti;
import java.util.List;
import java.util.List;
import javax.persistence.Query;

public class PacientiRepository extends EntMngClass implements PacientiInterface{ 
    
    public void create(Pacienti p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();   
    }

    @Override
    public void edit(Pacienti p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Pacienti p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    @Override
    @SuppressWarnings("empty-statement")
    public List<Pacienti> findAll() {
        return em.createNamedQuery("Pacienti.findAll").getResultList();
    } 
    
}
