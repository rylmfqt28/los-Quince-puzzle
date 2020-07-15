package ui;

import clases.Fichas;
import clases.Tablero;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import mensaje.JuegoTerminado;

public class VentanaJuego extends javax.swing.JFrame {

    private ArrayList<Integer> fichas;
    private Tablero tablero;

    public VentanaJuego() {
        initComponents();
        modificarVentana();
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
        pos0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos0ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos0);

        pos1.setBackground(new java.awt.Color(102, 204, 255));
        pos1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos1.setText("x");
        pos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos1.setFocusable(false);
        pos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos1ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos1);

        pos2.setBackground(new java.awt.Color(102, 204, 255));
        pos2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos2.setText("x");
        pos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos2.setFocusable(false);
        pos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos2ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos2);

        pos3.setBackground(new java.awt.Color(102, 204, 255));
        pos3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos3.setText("x");
        pos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos3.setFocusable(false);
        pos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos3ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos3);

        pos4.setBackground(new java.awt.Color(102, 204, 255));
        pos4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos4.setText("x");
        pos4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos4.setFocusable(false);
        pos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos4ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos4);

        pos5.setBackground(new java.awt.Color(102, 204, 255));
        pos5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos5.setText("x");
        pos5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos5.setFocusable(false);
        pos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos5ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos5);

        pos6.setBackground(new java.awt.Color(102, 204, 255));
        pos6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos6.setText("x");
        pos6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos6.setFocusable(false);
        pos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos6ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos6);

        pos7.setBackground(new java.awt.Color(102, 204, 255));
        pos7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos7.setText("x");
        pos7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos7.setFocusable(false);
        pos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos7ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos7);

        pos8.setBackground(new java.awt.Color(102, 204, 255));
        pos8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos8.setText("x");
        pos8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos8.setFocusable(false);
        pos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos8ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos8);

        pos9.setBackground(new java.awt.Color(102, 204, 255));
        pos9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos9.setText("x");
        pos9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos9.setFocusable(false);
        pos9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos9ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos9);

        pos10.setBackground(new java.awt.Color(102, 204, 255));
        pos10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos10.setText("x");
        pos10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos10.setFocusable(false);
        pos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos10ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos10);

        pos11.setBackground(new java.awt.Color(102, 204, 255));
        pos11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos11.setText("x");
        pos11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos11.setFocusable(false);
        pos11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos11ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos11);

        pos12.setBackground(new java.awt.Color(102, 204, 255));
        pos12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos12.setText("x");
        pos12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos12.setFocusable(false);
        pos12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos12ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos12);

        pos13.setBackground(new java.awt.Color(102, 204, 255));
        pos13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos13.setText("x");
        pos13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos13.setFocusable(false);
        pos13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos13ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos13);

        pos14.setBackground(new java.awt.Color(102, 204, 255));
        pos14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos14.setText("x");
        pos14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos14.setFocusable(false);
        pos14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos14ActionPerformed(evt);
            }
        });
        contenedorTablero.add(pos14);

        pos15.setBackground(new java.awt.Color(102, 204, 255));
        pos15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pos15.setText("x");
        pos15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pos15.setFocusable(false);
        pos15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos15ActionPerformed(evt);
            }
        });
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

    private void pos0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos0ActionPerformed
        if (pos1.isVisible() == false) {
            moverFicha(pos0, pos1, 0, 1);
        }
        if (pos4.isVisible() == false) {
            moverFicha(pos0, pos4, 0, 4);
        }
    }//GEN-LAST:event_pos0ActionPerformed

    private void pos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos1ActionPerformed
        if (pos0.isVisible() == false) {
            moverFicha(pos1, pos0, 1, 0);
        }
        if (pos2.isVisible() == false) {
            moverFicha(pos1, pos2, 1, 2);
        }
        if (pos5.isVisible() == false) {
            moverFicha(pos1, pos5, 1, 5);
        }
    }//GEN-LAST:event_pos1ActionPerformed

    private void pos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos2ActionPerformed
        if (pos1.isVisible() == false) {
            moverFicha(pos2, pos1, 2, 1);
        }
        if (pos3.isVisible() == false) {
            moverFicha(pos2, pos3, 2, 3);
        }
        if (pos6.isVisible() == false) {
            moverFicha(pos2, pos6, 2, 6);
        }
    }//GEN-LAST:event_pos2ActionPerformed

    private void pos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos3ActionPerformed
        if (pos2.isVisible() == false) {
            moverFicha(pos3, pos2, 3, 2);
        }
        if (pos7.isVisible() == false) {
            moverFicha(pos3, pos7, 3, 7);
        }
    }//GEN-LAST:event_pos3ActionPerformed

    private void pos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos4ActionPerformed
        if (pos0.isVisible() == false) {
            moverFicha(pos4, pos0, 4, 0);
        }
        if (pos5.isVisible() == false) {
            moverFicha(pos4, pos5, 4, 5);
        }
        if (pos8.isVisible() == false) {
            moverFicha(pos4, pos8, 4, 8);
        }
    }//GEN-LAST:event_pos4ActionPerformed

    private void pos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos5ActionPerformed
        if (pos1.isVisible() == false) {
            moverFicha(pos5, pos1, 5, 1);
        }
        if (pos4.isVisible() == false) {
            moverFicha(pos5, pos4, 5, 4);
        }
        if (pos6.isVisible() == false) {
            moverFicha(pos5, pos6, 5, 6);
        }
        if (pos9.isVisible() == false) {
            moverFicha(pos5, pos9, 5, 9);
        }
    }//GEN-LAST:event_pos5ActionPerformed

    private void pos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos6ActionPerformed
        if (pos2.isVisible() == false) {
            moverFicha(pos6, pos2, 6, 2);
        }
        if (pos5.isVisible() == false) {
            moverFicha(pos6, pos5, 6, 5);
        }
        if (pos7.isVisible() == false) {
            moverFicha(pos6, pos7, 6, 7);
        }
        if (pos10.isVisible() == false) {
            moverFicha(pos6, pos10, 6, 10);
        }
    }//GEN-LAST:event_pos6ActionPerformed

    private void pos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos7ActionPerformed
        if (pos3.isVisible() == false) {
            moverFicha(pos7, pos3, 7, 3);
        }
        if (pos6.isVisible() == false) {
            moverFicha(pos7, pos6, 7, 6);
        }
        if (pos11.isVisible() == false) {
            moverFicha(pos7, pos11, 7, 11);
        }
    }//GEN-LAST:event_pos7ActionPerformed

    private void pos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos8ActionPerformed
        if (pos4.isVisible() == false) {
            moverFicha(pos8, pos4, 8, 4);
        }
        if (pos9.isVisible() == false) {
            moverFicha(pos8, pos9, 8, 9);
        }
        if (pos12.isVisible() == false) {
            moverFicha(pos8, pos12, 8, 12);
        }
    }//GEN-LAST:event_pos8ActionPerformed

    private void pos9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos9ActionPerformed
        if (pos5.isVisible() == false) {
            moverFicha(pos9, pos5, 9, 5);
        }
        if (pos8.isVisible() == false) {
            moverFicha(pos9, pos8, 9, 8);
        }
        if (pos10.isVisible() == false) {
            moverFicha(pos9, pos10, 9, 10);
        }
        if (pos13.isVisible() == false) {
            moverFicha(pos9, pos13, 9, 13);
        }
    }//GEN-LAST:event_pos9ActionPerformed

    private void pos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos10ActionPerformed
        if (pos6.isVisible() == false) {
            moverFicha(pos10, pos6, 10, 6);
        }
        if (pos9.isVisible() == false) {
            moverFicha(pos10, pos9, 10, 9);
        }
        if (pos11.isVisible() == false) {
            moverFicha(pos10, pos11, 10, 11);
        }
        if (pos14.isVisible() == false) {
            moverFicha(pos10, pos14, 10, 14);
        }
    }//GEN-LAST:event_pos10ActionPerformed

    private void pos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos11ActionPerformed
        if (pos7.isVisible() == false) {
            moverFicha(pos11, pos7, 11, 7);
        }
        if (pos10.isVisible() == false) {
            moverFicha(pos11, pos10, 11, 10);
        }
        if (pos15.isVisible() == false) {
            moverFicha(pos11, pos15, 11, 15);
        }
    }//GEN-LAST:event_pos11ActionPerformed

    private void pos12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos12ActionPerformed
        if (pos8.isVisible() == false) {
            moverFicha(pos12, pos8, 12, 8);
        }
        if (pos13.isVisible() == false) {
            moverFicha(pos12, pos13, 12, 13);
        }
    }//GEN-LAST:event_pos12ActionPerformed

    private void pos13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos13ActionPerformed
        if (pos9.isVisible() == false) {
            moverFicha(pos13, pos9, 13, 9);
        }
        if (pos12.isVisible() == false) {
            moverFicha(pos13, pos12, 13, 12);
        }
        if (pos14.isVisible() == false) {
            moverFicha(pos13, pos14, 13, 14);
        }
    }//GEN-LAST:event_pos13ActionPerformed

    private void pos14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos14ActionPerformed
        if (pos10.isVisible() == false) {
            moverFicha(pos14, pos10, 14, 10);
        }
        if (pos13.isVisible() == false) {
            moverFicha(pos14, pos13, 14, 13);
        }
        if (pos15.isVisible() == false) {
            moverFicha(pos14, pos15, 14, 15);
        }
    }//GEN-LAST:event_pos14ActionPerformed

    private void pos15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos15ActionPerformed
        if (pos11.isVisible() == false) {
            moverFicha(pos15, pos11, 15, 11);
            verificarPartidaFinalizada();
        }
        if (pos14.isVisible() == false) {
            moverFicha(pos15, pos14, 15, 14);
            verificarPartidaFinalizada();
        }
    }//GEN-LAST:event_pos15ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    private void modificarVentana() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Los 15 puzzle");
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icono.png"));
        this.setIconImage(icono);
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
                pos4.setVisible(false);
                break;
            case 5:
                pos5.setVisible(false);
                break;
            case 6:
                pos6.setVisible(false);
                break;
            case 7:
                pos7.setVisible(false);
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
                pos12.setVisible(false);
                break;
            case 13:
                pos13.setVisible(false);
                break;
            case 14:
                pos14.setVisible(false);
                break;
            case 15:
                pos15.setVisible(false);
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

    private void mostrarFichas() {
        pos0.setVisible(true);
        pos1.setVisible(true);
        pos2.setVisible(true);
        pos3.setVisible(true);
        pos4.setVisible(true);
        pos5.setVisible(true);
        pos6.setVisible(true);
        pos7.setVisible(true);
        pos8.setVisible(true);
        pos9.setVisible(true);
        pos10.setVisible(true);
        pos11.setVisible(true);
        pos12.setVisible(true);
        pos13.setVisible(true);
        pos14.setVisible(true);
        pos15.setVisible(true);
    }

    private void moverFicha(JButton casillaActual, JButton casillaNueva, int posActual, int posNueva) {
        tablero.setTablero(posActual, posNueva, Integer.parseInt(casillaActual.getText().trim()));
        casillaNueva.setText(casillaActual.getText());
        casillaActual.setVisible(false);
        casillaNueva.setVisible(true);
        casillaActual.setText("0");
    }

    private void verificarPartidaFinalizada() {
        if (tablero.ganador()) {
            JuegoTerminado juegoTerminado = new JuegoTerminado(this, true);
            juegoTerminado.setVisible(true);
            reiniciarJuego();
        }
    }

    private void reiniciarJuego() {
        fichas = null;
        fichas = tablero.iniciarJuego();
        tablero.setTableroActual(fichas);
        asignarFichas();
        mostrarFichas();
        casillaVacia();
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
