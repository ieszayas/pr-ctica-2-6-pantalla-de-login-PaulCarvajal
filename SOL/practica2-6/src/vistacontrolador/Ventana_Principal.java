package vistacontrolador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import static modelo.Usuario.usuariosHarcodeados;

public class Ventana_Principal extends javax.swing.JFrame {

    public Ventana_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JFrame();
        Titulo_Bienvenido = new javax.swing.JLabel();
        Texto_Usuario_Logueado = new javax.swing.JLabel();
        Boton_cerrrar_sesion = new javax.swing.JButton();
        Imagen_sesion = new javax.swing.JLabel();
        Texto_login = new javax.swing.JLabel();
        Texto_Usuario = new javax.swing.JLabel();
        Texto_contraseña = new javax.swing.JLabel();
        Caja_usuario = new javax.swing.JTextField();
        Check_mostrar_contraseña = new javax.swing.JCheckBox();
        Caja_contraseña = new javax.swing.JPasswordField();
        Boton_login = new javax.swing.JButton();

        Principal.setTitle("Principal");
        Principal.setResizable(false);

        Titulo_Bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo_Bienvenido.setText("Bienvenid@");

        Boton_cerrrar_sesion.setText("Cerrar sesion");

        Imagen_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistacontrolador/image_cambio.png"))); // NOI18N

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal.getContentPane());
        Principal.getContentPane().setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(Boton_cerrrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto_Usuario_Logueado)
                    .addComponent(Titulo_Bienvenido)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Imagen_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Titulo_Bienvenido)
                .addGap(18, 18, 18)
                .addComponent(Imagen_sesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Texto_Usuario_Logueado)
                .addGap(41, 41, 41)
                .addComponent(Boton_cerrrar_sesion)
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("VentanaLogin"); // NOI18N

        Texto_login.setText("Introduzca sus credenciales para acceder:");

        Texto_Usuario.setText("Usuario");

        Texto_contraseña.setText("Password");

        Check_mostrar_contraseña.setText("Mostrar");
        Check_mostrar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_mostrar_contraseñaActionPerformed(evt);
            }
        });

        Boton_login.setText("Loguear");
        Boton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Boton_login)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Texto_login)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texto_Usuario)
                            .addComponent(Texto_contraseña))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Caja_usuario)
                            .addComponent(Caja_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Check_mostrar_contraseña)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Texto_login)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Usuario)
                    .addComponent(Caja_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_contraseña)
                    .addComponent(Check_mostrar_contraseña)
                    .addComponent(Caja_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Boton_login)
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_loginActionPerformed
        String usuario = Caja_usuario.getText();
        String contraseña = "";
        //al devolver un array de chars, lo meto en un string para guardarlo
        for (int i = 0; i < Caja_contraseña.getPassword().length; i++) {
            contraseña += Caja_contraseña.getPassword()[i];
        }
        
        existeUsuario(usuario, contraseña);

    }//GEN-LAST:event_Boton_loginActionPerformed

    public  void existeUsuario(String usuario, String contraseña) {
        ArrayList<Usuario> usuarios = usuariosHarcodeados();
        boolean existe = false;
        for (Usuario it : usuarios) {
            if (usuario.equalsIgnoreCase(it.getNombre()) && contraseña.equalsIgnoreCase(it.getContrasenia())) {
                //irse a la otra ventana
                Principal.setSize(300,300);
                Texto_Usuario_Logueado.setText("El usuario " + usuario + " esta logueado");
                Principal.setLocationRelativeTo(this);
                Principal.setVisible(true);
                return;
            }
        }
        
        if(!existe){
            JOptionPane.showMessageDialog(null, "El usuario no existe" + "\n" + "Por favor vuelva a introducir las credenciales", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
            reset();
        }
        
    }
    
    public void reset(){
        Caja_usuario.setText("");
        Caja_contraseña.setText("");
    }
    private void Check_mostrar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_mostrar_contraseñaActionPerformed
        if (Check_mostrar_contraseña.isSelected()) {
            Caja_contraseña.setEchoChar((char) 0);
        } else {
            Caja_contraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_Check_mostrar_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_cerrrar_sesion;
    private javax.swing.JButton Boton_login;
    private javax.swing.JPasswordField Caja_contraseña;
    private javax.swing.JTextField Caja_usuario;
    private javax.swing.JCheckBox Check_mostrar_contraseña;
    private javax.swing.JLabel Imagen_sesion;
    private javax.swing.JFrame Principal;
    private javax.swing.JLabel Texto_Usuario;
    private javax.swing.JLabel Texto_Usuario_Logueado;
    private javax.swing.JLabel Texto_contraseña;
    private javax.swing.JLabel Texto_login;
    private javax.swing.JLabel Titulo_Bienvenido;
    // End of variables declaration//GEN-END:variables
}
