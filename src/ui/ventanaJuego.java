package ui;

import clases.Fichas;
import clases.Tablero;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class ventanaJuego extends javax.swing.JFrame {

    private ArrayList<Integer> fichas;
    private Tablero tablero;

    public ventanaJuego() {
         
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.setTitle("Los 15 puzzle");
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icono.png"));
        this.setIconImage(icono);

        fichas = Fichas.generarFichas();
        tablero = new Tablero(fichas);
        asignarFichas();
        casillaVacia();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        contenedorTablero = new javax.swing.JPanel();
        pos0 = new javax.swing.JButton();
        pos1 = new javax.swing.JButton();
        pos2 = new javax.swing.JButton();
        pos3 = new javax.swing.JButton();
        pos4 = new javax.swing.JButton();
        pos5 = new javax.swing.JButton();
        pos6 = new javax.swing.JButton();
        pos7 = new javax.swing.JButton();
        pos8 = new javax.swing.JButton();
        pos9 = new javax.swing.JButton();
        pos10 = new javax.swing.JButton();
        pos11 = new javax.swing.JButton();
        pos12 = new javax.swing.JButton();
        pos13 = new javax.swing.JButton();
        pos14 = new javax.swing.JButton();
        pos15 = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        contenedorTablero.setBackground(new java.awt.Color(51, 51, 51));
        contenedorTablero.setAlignmentX(0.3F);
        contenedorTablero.setLayout(new java.awt.GridLayout(4, 4));

        pos0.setBackground(new java.awt.Color(102, 204, 255));
        pos0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos0.setText("x");
        pos0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos0.setFocusable(false);
        contenedorTablero.add(pos0);

        pos1.setBackground(new java.awt.Color(102, 204, 255));
        pos1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos1.setText("x");
        pos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos1.setFocusable(false);
        contenedorTablero.add(pos1);

        pos2.setBackground(new java.awt.Color(102, 204, 255));
        pos2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos2.setText("x");
        pos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos2.setFocusable(false);
        contenedorTablero.add(pos2);

        pos3.setBackground(new java.awt.Color(102, 204, 255));
        pos3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos3.setText("x");
        pos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos3.setFocusable(false);
        contenedorTablero.add(pos3);

        pos4.setBackground(new java.awt.Color(102, 204, 255));
        pos4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos4.setText("x");
        pos4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos4.setFocusable(false);
        contenedorTablero.add(pos4);

        pos5.setBackground(new java.awt.Color(102, 204, 255));
        pos5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos5.setText("x");
        pos5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos5.setFocusable(false);
        contenedorTablero.add(pos5);

        pos6.setBackground(new java.awt.Color(102, 204, 255));
        pos6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos6.setText("x");
        pos6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos6.setFocusable(false);
        contenedorTablero.add(pos6);

        pos7.setBackground(new java.awt.Color(102, 204, 255));
        pos7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos7.setText("x");
        pos7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos7.setFocusable(false);
        contenedorTablero.add(pos7);

        pos8.setBackground(new java.awt.Color(102, 204, 255));
        pos8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos8.setText("x");
        pos8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos8.setFocusable(false);
        contenedorTablero.add(pos8);

        pos9.setBackground(new java.awt.Color(102, 204, 255));
        pos9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos9.setText("x");
        pos9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos9.setFocusable(false);
        contenedorTablero.add(pos9);

        pos10.setBackground(new java.awt.Color(102, 204, 255));
        pos10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos10.setText("x");
        pos10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos10.setFocusable(false);
        contenedorTablero.add(pos10);

        pos11.setBackground(new java.awt.Color(102, 204, 255));
        pos11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos11.setText("x");
        pos11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos11.setFocusable(false);
        contenedorTablero.add(pos11);

        pos12.setBackground(new java.awt.Color(102, 204, 255));
        pos12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos12.setText("x");
        pos12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos12.setFocusable(false);
        contenedorTablero.add(pos12);

        pos13.setBackground(new java.awt.Color(102, 204, 255));
        pos13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos13.setText("x");
        pos13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos13.setFocusable(false);
        contenedorTablero.add(pos13);

        pos14.setBackground(new java.awt.Color(102, 204, 255));
        pos14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos14.setText("x");
        pos14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos14.setFocusable(false);
        contenedorTablero.add(pos14);

        pos15.setBackground(new java.awt.Color(102, 204, 255));
        pos15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos15.setText("x");
        pos15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos15.setFocusable(false);
        contenedorTablero.add(pos15);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbTitulo.setText("Los Quince Puzzle");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(contenedorTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(contenedorTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaJuego().setVisible(true);
            }
        });
    }

    private void casillaVacia() {
        switch (fichas.indexOf(0)) {
            case 0:
                pos0.setVisible(false);
                break;
            case 1:
                pos1.setVisible(false);
                break;
            case 2:
                pos2.setVisible(false);
                break;
            case 3:
                pos3.setVisible(false);
                break;
            case 4:
                pos7.setVisible(false);
                break;
            case 5:
                pos6.setVisible(false);
                break;
            case 6:
                pos5.setVisible(false);
                break;
            case 7:
                pos4.setVisible(false);
                break;
            case 8:
                pos8.setVisible(false);
                break;
            case 9:
                pos9.setVisible(false);
                break;
            case 10:
                pos10.setVisible(false);
                break;
            case 11:
                pos11.setVisible(false);
                break;
            case 12:
                pos15.setVisible(false);
                break;
            case 13:
                pos14.setVisible(false);
                break;
            case 14:
                pos13.setVisible(false);
                break;
            case 15:
                pos12.setVisible(false);
                break;
        }
    }

    private void asignarFichas() {
        pos0.setText(String.valueOf(fichas.get(0)));
        pos1.setText(String.valueOf(fichas.get(1)));
        pos2.setText(String.valueOf(fichas.get(2)));
        pos3.setText(String.valueOf(fichas.get(3)));
        pos4.setText(String.valueOf(fichas.get(4)));
        pos5.setText(String.valueOf(fichas.get(5)));
        pos6.setText(String.valueOf(fichas.get(6)));
        pos7.setText(String.valueOf(fichas.get(7)));
        pos8.setText(String.valueOf(fichas.get(8)));
        pos9.setText(String.valueOf(fichas.get(9)));
        pos10.setText(String.valueOf(fichas.get(10)));
        pos11.setText(String.valueOf(fichas.get(11)));
        pos12.setText(String.valueOf(fichas.get(12)));
        pos13.setText(String.valueOf(fichas.get(13)));
        pos14.setText(String.valueOf(fichas.get(14)));
        pos15.setText(String.valueOf(fichas.get(15)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorTablero;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JButton pos0;
    private javax.swing.JButton pos1;
    private javax.swing.JButton pos10;
    private javax.swing.JButton pos11;
    private javax.swing.JButton pos12;
    private javax.swing.JButton pos13;
    private javax.swing.JButton pos14;
    private javax.swing.JButton pos15;
    private javax.swing.JButton pos2;
    private javax.swing.JButton pos3;
    private javax.swing.JButton pos4;
    private javax.swing.JButton pos5;
    private javax.swing.JButton pos6;
    private javax.swing.JButton pos7;
    private javax.swing.JButton pos8;
    private javax.swing.JButton pos9;
    // End of variables declaration//GEN-END:variables
}
