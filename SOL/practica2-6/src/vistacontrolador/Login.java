package vistacontrolador;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo_Bienvenido = new javax.swing.JLabel();
        Texto_Usuario_Logueado = new javax.swing.JLabel();
        Boton_cerrrar_sesion = new javax.swing.JButton();
        Imagen_sesion = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Titulo_Bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo_Bienvenido.setText("Bienvenid@");

        Texto_Usuario_Logueado.setText("El usuario Pol esta logueado");

        Boton_cerrrar_sesion.setText("Cerrar sesion");
        Boton_cerrrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cerrrar_sesionActionPerformed(evt);
            }
        });

        Imagen_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        BotonNuevo.setText("Nuevo usuario");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Texto_Usuario_Logueado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Titulo_Bienvenido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_cerrrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Imagen_sesion)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo_Bienvenido)
                .addGap(18, 18, 18)
                .addComponent(Imagen_sesion)
                .addGap(38, 38, 38)
                .addComponent(Texto_Usuario_Logueado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BotonNuevo)
                .addGap(18, 18, 18)
                .addComponent(Boton_cerrrar_sesion)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_cerrrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cerrrar_sesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_Boton_cerrrar_sesionActionPerformed

    public void setUsuario(String usuario) {
        Texto_Usuario_Logueado.setText("El usuario " + usuario + " esta logueado");
    }
    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        activarVentanaNuevaCuenta();
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void activarVentanaNuevaCuenta() {
        NuevaCuenta n = new NuevaCuenta();
        n.setLocationRelativeTo(this);
        n.setResizable(false);
        n.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton Boton_cerrrar_sesion;
    private javax.swing.JLabel Imagen_sesion;
    private javax.swing.JLabel Texto_Usuario_Logueado;
    private javax.swing.JLabel Titulo_Bienvenido;
    // End of variables declaration//GEN-END:variables
}
