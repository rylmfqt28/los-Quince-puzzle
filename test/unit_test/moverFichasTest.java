package unit_test;

import clases.Tablero;
import org.junit.Assert;
import org.junit.Test;

public class moverFichasTest extends preCondicion{
    
    @Test
    public void moverFicha(){
        Tablero tablero = new Tablero(fichasCompletas);
        tablero.setTablero(15, 0, 15);
        Assert.assertTrue(tablero.getFicha(0) == 15);
    }
    
}
