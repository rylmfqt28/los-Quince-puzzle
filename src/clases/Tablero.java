package clases;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Integer> tableroActual;
    private final ArrayList<Integer> fichasOrdenadas;

    public Tablero(ArrayList<Integer> tableroActual) {
        this.tableroActual = tableroActual;
        fichasOrdenadas = new ArrayList<>();
        generarFichasOrdenadas();
    }

    //para test
    public ArrayList<Integer> getTablero() {
        return tableroActual;
    }

    public void setTablero(int posActual, int posNuevo, int valorFicha) {
        tableroActual.set(posNuevo, valorFicha);
        tableroActual.set(posActual, 0);
    }
    
    //para test
    public int getFicha(int index){
        return tableroActual.get(index);
    }
    
    public boolean ganador(){
        if(fichasOrdenadas.equals(tableroActual)){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Integer> iniciarJuego(){
        return Fichas.generarFichas();
    }
    
    public void setTableroActual(ArrayList<Integer> nuevoTableroActual){
        tableroActual = null;
        tableroActual = nuevoTableroActual; 
    }

    private void generarFichasOrdenadas() {
        fichasOrdenadas.add(1);
        fichasOrdenadas.add(2);
        fichasOrdenadas.add(3);
        fichasOrdenadas.add(4);
        fichasOrdenadas.add(5);
        fichasOrdenadas.add(6);
        fichasOrdenadas.add(7);
        fichasOrdenadas.add(8);
        fichasOrdenadas.add(9);
        fichasOrdenadas.add(10);
        fichasOrdenadas.add(11);
        fichasOrdenadas.add(12);
        fichasOrdenadas.add(13);
        fichasOrdenadas.add(14);
        fichasOrdenadas.add(15);
        fichasOrdenadas.add(0);
    }

}
