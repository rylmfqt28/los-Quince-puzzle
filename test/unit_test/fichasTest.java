
package unit_test;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import clases.Fichas;

public class fichasTest extends preCondicion{
    
    @Test
    public void fichasCompletas() {
        ArrayList<Integer> generado = Fichas.generarFichas();
        Assert.assertTrue("Las fichas no son correctas", generado.equals(fichasCompletas));
    }
    
}
