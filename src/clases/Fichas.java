package clases;

import java.util.ArrayList;

public class Fichas {
    private static ArrayList<Integer> fichas;

    public static ArrayList<Integer> generarFichas() {
        fichas = new ArrayList<>();
        asignarNumeros();
        return fichas;
    }

    private static void asignarNumeros() {
        for (int i = 0; i < 16; i++) {
            fichas.add(i);
        }
    }
}
