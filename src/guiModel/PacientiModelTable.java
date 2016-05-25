
package guiModel;

import database.Pacienti;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class PacientiModelTable extends AbstractTableModel{
    List<Pacienti>list;
    
    String [] columns ={"Nr_personal","Emri","Emri i prinderit", "Mbiemri", "Gjinia","Data e lindjes", "Vendlindja","Vendbanimi", "Komuna", "Adresa"};
    public PacientiModelTable(){}
    
    @Override
    public String getColumnName(int col){
        return columns[col];
    }
    public Pacienti getPacienti(int row){
        return list.get(row);
    }
    
    public int getRowCount() {
      return list.size();
    }

    public int getColumnCount() {
       return columns.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Pacienti p=getPacienti(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getNrpersonal();
            case 1:
                return p.getEmri();
            case 2:
                return p.getEmriprindit();
            case 3:
                return p.getMbiemri();
            case 4:
               return p.getGjinia();
            case 5:
               return p.getDatalindjes();
            case 6:
                return p.getVendlindja();
            case 7:
                return p.getVendbanimi();
            case 8:
                return p.getAdresa();
            case 9:
                return p.getKomuna();
            default:
                return null;
        } 
    }
    
    public void add(List<Pacienti> data){
        this.list=data;
    }
    
}
