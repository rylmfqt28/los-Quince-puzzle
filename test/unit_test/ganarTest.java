package unit_test;

import clases.Tablero;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ganarTest {
    
    private ArrayList<Integer> tableroActual;
    private Tablero tablero;
     
    @Test
    public void ganar(){
        tablero = new Tablero(tableroActual);
        tablero.setTablero(15, 14, 15);
        Assert.assertTrue("No reconoce que las fichas en el tablero estan ordenadas", tablero.ganador());
    }
    
    @Before
    public void condicion(){
        tableroActual = new ArrayList<>();
        tableroActual.add(1);
        tableroActual.add(2);
        tableroActual.add(3);
        tableroActual.add(4);
        tableroActual.add(5);
        tableroActual.add(6);
        tableroActual.add(7);
        tableroActual.add(8);
        tableroActual.add(9);
        tableroActual.add(10);
        tableroActual.add(11);
        tableroActual.add(12);
        tableroActual.add(13);
        tableroActual.add(14);
        tableroActual.add(0);
        tableroActual.add(15);
    }
    
}
