package buisnessLogic;

import database.Pacienti;
import java.util.List;


public interface PacientiInterface {
    void create(Pacienti p);
    void edit(Pacienti p);
    void delete(Pacienti p);
    //List<Shteti> selectAll();
    List<Pacienti> findAll();
    //Pacienti findByID(int id);
}