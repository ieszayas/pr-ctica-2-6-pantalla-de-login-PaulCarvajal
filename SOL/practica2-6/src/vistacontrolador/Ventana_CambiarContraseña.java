package vistacontrolador;

import javax.swing.JOptionPane;
import modelo.GestorBBDD;

public class Ventana_CambiarContraseña extends javax.swing.JFrame {

    private String usuario;
    private String contra;

    public Ventana_CambiarContraseña(String usuario) {
        initComponents();

        this.usuario = usuario;
        //this.contra = contraseña;
    }

    public Ventana_CambiarContraseña() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoContra = new javax.swing.JLabel();
        Caja_Contraseña = new javax.swing.JTextField();
        Boton_Ok = new javax.swing.JButton();
        Boton_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextoContra.setText("Introduce la nueva contraseña:");

        Caja_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja_ContraseñaActionPerformed(evt);
            }
        });

        Boton_Ok.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Boton_Ok.setText("OK");
        Boton_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_OkActionPerformed(evt);
            }
        });

        Boton_Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Boton_Cancelar.setText("Cancelar");
        Boton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoContra, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Boton_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(Boton_Cancelar))
                        .addComponent(Caja_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(TextoContra)
                .addGap(30, 30, 30)
                .addComponent(Caja_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Ok)
                    .addComponent(Boton_Cancelar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_Boton_CancelarActionPerformed

    private void reset() {
        Caja_Contraseña.setText("");
    }
    private void Boton_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_OkActionPerformed
        if (Caja_Contraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacio", "Campo Vacio", JOptionPane.ERROR_MESSAGE);
            reset();
            return;
        }

        GestorBBDD.cambiarContraseña(Caja_Contraseña.getText(), usuario);
        JOptionPane.showMessageDialog(this, "La contraseña se ha modificado correctamente", "Contraseña cambiada", JOptionPane.INFORMATION_MESSAGE);

        reset();
    }//GEN-LAST:event_Boton_OkActionPerformed

    private void Caja_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja_ContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana_CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_CambiarContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Cancelar;
    private javax.swing.JButton Boton_Ok;
    private javax.swing.JTextField Caja_Contraseña;
    private javax.swing.JLabel TextoContra;
    // End of variables declaration//GEN-END:variables
}
