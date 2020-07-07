package clases;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Integer> actual;
    private final ArrayList<Integer> fichasOrdenadas;

    public Tablero(ArrayList<Integer> actual) {
        this.actual = actual;
        fichasOrdenadas = new ArrayList<>();
        fichasGanador();

    }

    //para test
    public ArrayList<Integer> getTablero() {
        return actual;
    }

    public void setTablero(int posActual, int posNuevo, int valorFicha) {
        actual.set(posNuevo, valorFicha);
        actual.set(posActual, 0);
    }
    
    //para test
    public int getFicha(int index){
        return actual.get(index);
    }
    
    public boolean ganador(){
        if(fichasOrdenadas.equals(actual)){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Integer> nuevoJuego(){
        return Fichas.generarFichas();
    }
    
    public void setActual(ArrayList<Integer> nuevoActual){
        actual = null;
        actual = nuevoActual;
        
    }

    private void fichasGanador() {
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
