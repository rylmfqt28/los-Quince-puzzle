
package unit_test;

import org.junit.Assert;
import org.junit.Test;
import clases.Tablero;

public class tableroTest extends preCondicion{
    
    @Test
    public void tableroConFichas(){
        Tablero tablero = new Tablero(fichasCompletas);
        Assert.assertTrue("Las fichas no estan ubicadas de la misma forma", fichasCompletas.equals(tablero.getTablero()));
    }
    
}
