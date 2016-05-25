
package buisnessLogic;
import database.Kontakti;
import java.util.List;

public interface KontaktiInterface {
    void create(Kontakti k);
    void edit(Kontakti k);
    void delete(Kontakti k);
    List<Kontakti> findAll();
    
       
    
}

