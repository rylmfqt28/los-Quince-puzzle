package clases;

import java.util.ArrayList;
import java.util.Collections;

public class Fichas {
    private static ArrayList<Integer> fichas;

    public static ArrayList<Integer> generarFichas() {
        fichas = new ArrayList<>();
        asignarNumeros();
        desordenarFichas();
        return fichas;
    }

    private static void asignarNumeros() {
        for (int i = 0; i < 16; i++) {
            fichas.add(i);
        }
    }
    
    private static void desordenarFichas(){
        Collections.shuffle(fichas);
    }
    
}
