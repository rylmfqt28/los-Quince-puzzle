package unit_test;

import clases.Fichas;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class fichasAleatoriasTest extends preCondicion{
    
    @Test
    public void fichasDesordenadas(){
        ArrayList<Integer> generado = Fichas.generarFichas();
        Assert.assertFalse("Las fichas no tomaron un orden aleatorio", generado.equals(fichasCompletas));
    }
    
}
