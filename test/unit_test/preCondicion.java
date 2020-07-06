
package unit_test;

import java.util.ArrayList;
import org.junit.Before;

public class preCondicion {
    
    protected ArrayList<Integer> fichasCompletas;
    
    @Before
    public void llenarArreglo() {
        fichasCompletas = new ArrayList<>();
        for(int i=0; i<16; i++){
            fichasCompletas.add(i);
        }
    }
    
}
