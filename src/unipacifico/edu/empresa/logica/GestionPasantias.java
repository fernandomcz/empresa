
package unipacifico.edu.empresa.logica;

import java.util.ArrayList;
import java.util.List;




public class GestionPasantias {
    private List<Pasantia> pasantias;
    
    public GestionPasantias(){
        pasantias = new ArrayList<>();
    }
        
         public void publicarPasantia(Pasantia pasantia) {
        pasantias.add(pasantia);
    }

    public void modificarPasantia(int codigo) {
        
        
    }

    public void inactivarPasantia(int codigo) {
        
    }
}
        
    
    

