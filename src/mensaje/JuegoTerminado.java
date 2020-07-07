
package mensaje;


public class JuegoTerminado extends javax.swing.JDialog {

    
    public JuegoTerminado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorMensaje = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        contenedorMensaje.setBackground(new java.awt.Color(0, 0, 0));

        mensaje.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("GANASTE !!!!!");

        reiniciar.setBackground(new java.awt.Color(255, 255, 255));
        reiniciar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reiniciar.setText("Volver a jugar");
        reiniciar.setFocusable(false);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        salir.setText("Salir");
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorMensajeLayout = new javax.swing.GroupLayout(contenedorMensaje);
        contenedorMensaje.setLayout(contenedorMensajeLayout);
        contenedorMensajeLayout.setHorizontalGroup(
            contenedorMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMensajeLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(reiniciar)
                .addGap(60, 60, 60)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(contenedorMensajeLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(mensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorMensajeLayout.setVerticalGroup(
            contenedorMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMensajeLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(mensaje)
                .addGap(42, 42, 42)
                .addGroup(contenedorMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reiniciar)
                    .addComponent(salir))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        this.dispose();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JuegoTerminado dialog = new JuegoTerminado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorMensaje;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
