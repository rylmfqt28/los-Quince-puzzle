package ui;

import clases.Fichas;
import clases.Tablero;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import mensaje.JuegoTerminado;

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
        /*fichas = nuevo();
        tablero = new Tablero(nuevo());*/
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
        if(pos1.isVisible() == false){
            tablero.setTablero(0, 1, Integer.parseInt(pos0.getText().trim()));
            pos1.setText(pos0.getText());
            pos0.setVisible(false);
            pos1.setVisible(true);
            pos0.setText("0");
        }
        if(pos4.isVisible() == false){
            tablero.setTablero(0, 4, Integer.parseInt(pos0.getText().trim()));
            pos4.setText(pos0.getText());
            pos0.setVisible(false);
            pos4.setVisible(true);
            pos0.setText("0");
        }
    }//GEN-LAST:event_pos0ActionPerformed

    private void pos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos1ActionPerformed
        if(pos0.isVisible() == false){
            tablero.setTablero(1, 0, Integer.parseInt(pos1.getText().trim()));
            pos0.setText(pos1.getText());
            pos1.setVisible(false);
            pos0.setVisible(true);
            pos1.setText("0");
        }
        if(pos2.isVisible() == false){
            tablero.setTablero(1, 2, Integer.parseInt(pos1.getText().trim()));
            pos2.setText(pos1.getText());
            pos1.setVisible(false);
            pos2.setVisible(true);
            pos1.setText("0");
        }
        if(pos5.isVisible() == false){
            tablero.setTablero(1, 5, Integer.parseInt(pos1.getText().trim()));
            pos5.setText(pos1.getText());
            pos1.setVisible(false);
            pos5.setVisible(true);
            pos1.setText("0");
        }
    }//GEN-LAST:event_pos1ActionPerformed

    private void pos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos2ActionPerformed
        if(pos1.isVisible() == false){
            tablero.setTablero(2, 1, Integer.parseInt(pos2.getText().trim()));
            pos1.setText(pos2.getText());
            pos2.setVisible(false);
            pos1.setVisible(true);
            pos2.setText("0");
        }
        if(pos3.isVisible() == false){
            tablero.setTablero(2, 3, Integer.parseInt(pos2.getText().trim()));
            pos3.setText(pos2.getText());
            pos2.setVisible(false);
            pos3.setVisible(true);
            pos2.setText("0");
        }
        if(pos6.isVisible() == false){
            tablero.setTablero(2, 6, Integer.parseInt(pos2.getText().trim()));
            pos6.setText(pos2.getText());
            pos2.setVisible(false);
            pos6.setVisible(true);
            pos2.setText("0");
        }
    }//GEN-LAST:event_pos2ActionPerformed

    private void pos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos3ActionPerformed
        if(pos2.isVisible() == false){
            tablero.setTablero(3, 2, Integer.parseInt(pos3.getText().trim()));
            pos2.setText(pos3.getText());
            pos3.setVisible(false);
            pos2.setVisible(true);
            pos3.setText("0");
        }
        if(pos7.isVisible() == false){
            tablero.setTablero(3, 7, Integer.parseInt(pos3.getText().trim()));
            pos7.setText(pos3.getText());
            pos3.setVisible(false);
            pos7.setVisible(true);
            pos3.setText("0");
        }
    }//GEN-LAST:event_pos3ActionPerformed

    private void pos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos4ActionPerformed
        if(pos0.isVisible() == false){
            tablero.setTablero(4, 0, Integer.parseInt(pos4.getText().trim()));
            pos0.setText(pos4.getText());
            pos4.setVisible(false);
            pos0.setVisible(true);
            pos4.setText("0");
        }
        if(pos5.isVisible() == false){
            tablero.setTablero(4, 5, Integer.parseInt(pos4.getText().trim()));
            pos5.setText(pos4.getText());
            pos4.setVisible(false);
            pos5.setVisible(true);
            pos4.setText("0");
        }
        if(pos8.isVisible() == false){
            tablero.setTablero(4, 8, Integer.parseInt(pos4.getText().trim()));
            pos8.setText(pos4.getText());
            pos4.setVisible(false);
            pos8.setVisible(true);
            pos4.setText("0");
        }
    }//GEN-LAST:event_pos4ActionPerformed

    private void pos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos5ActionPerformed
        if(pos1.isVisible() == false){
            tablero.setTablero(5, 1, Integer.parseInt(pos5.getText().trim()));
            pos1.setText(pos5.getText());
            pos5.setVisible(false);
            pos1.setVisible(true);
            pos5.setText("0");
        }
        if(pos4.isVisible() == false){
            tablero.setTablero(5, 4, Integer.parseInt(pos5.getText().trim()));
            pos4.setText(pos5.getText());
            pos5.setVisible(false);
            pos4.setVisible(true);
            pos5.setText("0");
        }
        if(pos6.isVisible() == false){
            tablero.setTablero(5, 6, Integer.parseInt(pos5.getText().trim()));
            pos6.setText(pos5.getText());
            pos5.setVisible(false);
            pos6.setVisible(true);
            pos5.setText("0");
        }
        if(pos9.isVisible() == false){
            tablero.setTablero(5, 9, Integer.parseInt(pos5.getText().trim()));
            pos9.setText(pos5.getText());
            pos5.setVisible(false);
            pos9.setVisible(true);
            pos5.setText("0");
        }
    }//GEN-LAST:event_pos5ActionPerformed

    private void pos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos6ActionPerformed
        if(pos2.isVisible() == false){
            tablero.setTablero(6, 2, Integer.parseInt(pos6.getText().trim()));
            pos2.setText(pos6.getText());
            pos6.setVisible(false);
            pos2.setVisible(true);
            pos6.setText("0");
        }
        if(pos5.isVisible() == false){
            tablero.setTablero(6, 5, Integer.parseInt(pos6.getText().trim()));
            pos5.setText(pos6.getText());
            pos6.setVisible(false);
            pos5.setVisible(true);
            pos6.setText("0");
        }
        if(pos7.isVisible() == false){
            tablero.setTablero(6, 7, Integer.parseInt(pos6.getText().trim()));
            pos7.setText(pos6.getText());
            pos6.setVisible(false);
            pos7.setVisible(true);
            pos6.setText("0");
        }
        if(pos10.isVisible() == false){
            tablero.setTablero(6, 10, Integer.parseInt(pos6.getText().trim()));
            pos10.setText(pos6.getText());
            pos6.setVisible(false);
            pos10.setVisible(true);
            pos6.setText("0");
        }
    }//GEN-LAST:event_pos6ActionPerformed

    private void pos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos7ActionPerformed
        if(pos3.isVisible() == false){
            tablero.setTablero(7, 3, Integer.parseInt(pos7.getText().trim()));
            pos3.setText(pos7.getText());
            pos7.setVisible(false);
            pos3.setVisible(true);
            pos7.setText("0");
        }
        if(pos6.isVisible() == false){
            tablero.setTablero(7, 6, Integer.parseInt(pos7.getText().trim()));
            pos6.setText(pos7.getText());
            pos7.setVisible(false);
            pos6.setVisible(true);
            pos7.setText("0");
        }
        if(pos11.isVisible() == false){
            tablero.setTablero(7, 11, Integer.parseInt(pos7.getText().trim()));
            pos11.setText(pos7.getText());
            pos7.setVisible(false);
            pos11.setVisible(true);
            pos7.setText("0");
        }
    }//GEN-LAST:event_pos7ActionPerformed

    private void pos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos8ActionPerformed
        if(pos4.isVisible() == false){
            tablero.setTablero(8, 4, Integer.parseInt(pos8.getText().trim()));
            pos4.setText(pos8.getText());
            pos8.setVisible(false);
            pos4.setVisible(true);
            pos8.setText("0");
        }
        if(pos9.isVisible() == false){
            tablero.setTablero(8, 9, Integer.parseInt(pos8.getText().trim()));
            pos9.setText(pos8.getText());
            pos8.setVisible(false);
            pos9.setVisible(true);
            pos8.setText("0");
        }
        if(pos12.isVisible() == false){
            tablero.setTablero(8, 12, Integer.parseInt(pos8.getText().trim()));
            pos12.setText(pos8.getText());
            pos8.setVisible(false);
            pos12.setVisible(true);
            pos8.setText("0");
        }
    }//GEN-LAST:event_pos8ActionPerformed

    private void pos9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos9ActionPerformed
        if(pos5.isVisible() == false){
            tablero.setTablero(9, 5, Integer.parseInt(pos9.getText().trim()));
            pos5.setText(pos9.getText());
            pos9.setVisible(false);
            pos5.setVisible(true);
            pos9.setText("0");
        }
        if(pos8.isVisible() == false){
            tablero.setTablero(9, 8, Integer.parseInt(pos9.getText().trim()));
            pos8.setText(pos9.getText());
            pos9.setVisible(false);
            pos8.setVisible(true);
            pos9.setText("0");
        }
        if(pos10.isVisible() == false){
            tablero.setTablero(9, 10, Integer.parseInt(pos9.getText().trim()));
            pos10.setText(pos9.getText());
            pos9.setVisible(false);
            pos10.setVisible(true);
            pos9.setText("0");
        }
        if(pos13.isVisible() == false){
            tablero.setTablero(9, 13, Integer.parseInt(pos9.getText().trim()));
            pos13.setText(pos9.getText());
            pos9.setVisible(false);
            pos13.setVisible(true);
            pos9.setText("0");
        }
    }//GEN-LAST:event_pos9ActionPerformed

    private void pos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos10ActionPerformed
        if(pos6.isVisible() == false){
            tablero.setTablero(10, 6, Integer.parseInt(pos10.getText().trim()));
            pos6.setText(pos10.getText());
            pos10.setVisible(false);
            pos6.setVisible(true);
            pos10.setText("0");
        }
        if(pos9.isVisible() == false){
            tablero.setTablero(10, 9, Integer.parseInt(pos10.getText().trim()));
            pos9.setText(pos10.getText());
            pos10.setVisible(false);
            pos9.setVisible(true);
            pos10.setText("0");
        }
        if(pos11.isVisible() == false){
            tablero.setTablero(10, 11, Integer.parseInt(pos10.getText().trim()));
            pos11.setText(pos10.getText());
            pos10.setVisible(false);
            pos11.setVisible(true);
            pos10.setText("0");
        }
        if(pos14.isVisible() == false){
            tablero.setTablero(10, 14, Integer.parseInt(pos10.getText().trim()));
            pos14.setText(pos10.getText());
            pos10.setVisible(false);
            pos14.setVisible(true);
            pos10.setText("0");
        }
    }//GEN-LAST:event_pos10ActionPerformed

    private void pos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos11ActionPerformed
        if(pos7.isVisible() == false){
            tablero.setTablero(11, 7, Integer.parseInt(pos11.getText().trim()));
            pos7.setText(pos11.getText());
            pos11.setVisible(false);
            pos7.setVisible(true);
            pos11.setText("0");
        }
        if(pos10.isVisible() == false){
            tablero.setTablero(11, 10, Integer.parseInt(pos11.getText().trim()));
            pos10.setText(pos11.getText());
            pos11.setVisible(false);
            pos10.setVisible(true);
            pos11.setText("0");
        }
        if(pos15.isVisible() == false){
            tablero.setTablero(11, 15, Integer.parseInt(pos11.getText().trim()));
            pos15.setText(pos11.getText());
            pos11.setVisible(false);
            pos15.setVisible(true);
            pos11.setText("0");
        }
    }//GEN-LAST:event_pos11ActionPerformed

    private void pos12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos12ActionPerformed
        if(pos8.isVisible() == false){
            tablero.setTablero(12, 8, Integer.parseInt(pos12.getText().trim()));
            pos8.setText(pos12.getText());
            pos12.setVisible(false);
            pos8.setVisible(true);
            pos12.setText("0");
        }
        if(pos13.isVisible() == false){
            tablero.setTablero(12, 13, Integer.parseInt(pos12.getText().trim()));
            pos13.setText(pos12.getText());
            pos12.setVisible(false);
            pos13.setVisible(true);
            pos12.setText("0");
        }
    }//GEN-LAST:event_pos12ActionPerformed

    private void pos13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos13ActionPerformed
        if(pos9.isVisible() == false){
            tablero.setTablero(13, 9, Integer.parseInt(pos13.getText().trim()));
            pos9.setText(pos13.getText());
            pos13.setVisible(false);
            pos9.setVisible(true);
            pos13.setText("0");
        }
        if(pos12.isVisible() == false){
            tablero.setTablero(13, 12, Integer.parseInt(pos13.getText().trim()));
            pos12.setText(pos13.getText());
            pos13.setVisible(false);
            pos12.setVisible(true);
            pos13.setText("0");
        }
        if(pos14.isVisible() == false){
            tablero.setTablero(13, 14, Integer.parseInt(pos13.getText().trim()));
            pos14.setText(pos13.getText());
            pos13.setVisible(false);
            pos14.setVisible(true);
            pos13.setText("0");
        }
    }//GEN-LAST:event_pos13ActionPerformed

    private void pos14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos14ActionPerformed
        if(pos10.isVisible() == false){
            tablero.setTablero(14, 10, Integer.parseInt(pos14.getText().trim()));
            pos10.setText(pos14.getText());
            pos14.setVisible(false);
            pos10.setVisible(true);
            pos14.setText("0");
        }
        if(pos13.isVisible() == false){
            tablero.setTablero(14, 13, Integer.parseInt(pos14.getText().trim()));
            pos13.setText(pos14.getText());
            pos14.setVisible(false);
            pos13.setVisible(true);
            pos14.setText("0");
        }
        if(pos15.isVisible() == false){
            tablero.setTablero(14, 15, Integer.parseInt(pos14.getText().trim()));
            pos15.setText(pos14.getText());
            pos14.setVisible(false);
            pos15.setVisible(true);
            pos14.setText("0");
        }
    }//GEN-LAST:event_pos14ActionPerformed

    private void pos15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos15ActionPerformed
        if(pos11.isVisible() == false){
            tablero.setTablero(15, 11, Integer.parseInt(pos15.getText().trim()));
            pos11.setText(pos15.getText());
            pos15.setVisible(false);
            pos11.setVisible(true);
            pos15.setText("0");
            if(tablero.ganador()){
                JuegoTerminado juegoTerminado = new JuegoTerminado(this, true);
                juegoTerminado.setVisible(true);
                reiniciarJuego();
            }
        }
        if(pos14.isVisible() == false){
            tablero.setTablero(15, 14, Integer.parseInt(pos15.getText().trim()));
            pos14.setText(pos15.getText());
            pos15.setVisible(false);
            pos14.setVisible(true);
            pos15.setText("0");
            if(tablero.ganador()){
                JuegoTerminado juegoTerminado = new JuegoTerminado(this, true);
                juegoTerminado.setVisible(true);
                reiniciarJuego();
            }
        }
        
    }//GEN-LAST:event_pos15ActionPerformed

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
    
    private void fichasVisibles(){
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
    
    private void reiniciarJuego(){
        fichas = null;
        fichas = tablero.nuevoJuego();
        tablero.setActual(fichas);
        asignarFichas();
        fichasVisibles();
        casillaVacia();
    }
    
    /*private ArrayList<Integer> nuevo(){
        ArrayList<Integer>lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        lista.add(0);
        lista.add(13);
        lista.add(14);
        lista.add(15);
        lista.add(12);
        return lista;
    }*/

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
