package vistacontrolador;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import static modelo.GestorBBDD.crearBD;
import modelo.Usuario;
import static modelo.Usuario.usuariosHarcodeados;

public class Ventana_Principal extends javax.swing.JFrame {

    public Ventana_Principal() {

        initComponents();
        TextoEnlace.setText("<html><a href=''>Hacer click para crear una nueva cuenta</a></html>");
        //TextoEnlace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoError.setVisible(false);
        Defecto.setVisible(false);
        crearBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto_login = new javax.swing.JLabel();
        Defecto = new javax.swing.JTextField();
        Texto_Usuario = new javax.swing.JLabel();
        Texto_contraseña = new javax.swing.JLabel();
        Caja_usuario = new javax.swing.JTextField();
        Check_mostrar_contraseña = new javax.swing.JCheckBox();
        Caja_contraseña = new javax.swing.JPasswordField();
        Boton_login = new javax.swing.JButton();
        TextoEnlace = new javax.swing.JLabel();
        TextoError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("VentanaLogin"); // NOI18N

        Texto_login.setText("Introduzca sus credenciales para acceder:");

        Texto_Usuario.setText("Usuario");

        Texto_contraseña.setText("Password");

        Caja_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Caja_usuarioKeyReleased(evt);
            }
        });

        Check_mostrar_contraseña.setText("Mostrar");
        Check_mostrar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_mostrar_contraseñaActionPerformed(evt);
            }
        });

        Caja_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Caja_contraseñaKeyReleased(evt);
            }
        });

        Boton_login.setText("Loguear");
        Boton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_loginActionPerformed(evt);
            }
        });

        TextoEnlace.setText("Hacer click para crear una nueva cuenta");
        TextoEnlace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoEnlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoEnlaceMouseClicked(evt);
            }
        });

        TextoError.setText("*Credenciales incorrectas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Texto_login)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texto_Usuario)
                            .addComponent(Texto_contraseña))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoError)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Caja_usuario)
                                            .addComponent(Caja_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                        .addGap(26, 26, 26)
                                        .addComponent(Check_mostrar_contraseña)))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Boton_login)
                                .addGap(154, 154, 154))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Defecto, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Texto_login)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Usuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_contraseña)
                    .addComponent(Check_mostrar_contraseña))
                .addGap(18, 18, 18)
                .addComponent(TextoError)
                .addGap(21, 21, 21)
                .addComponent(Boton_login)
                .addGap(18, 18, 18)
                .addComponent(TextoEnlace)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Defecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        //compruebo campos vacios antes de ver si existe en la BD
        if (Caja_usuario.getText().isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alguno de los campos estan vacios", "Campos Vacios", JOptionPane.ERROR_MESSAGE);
            return;
        }
        existeUsuario(usuario, contraseña);
    }//GEN-LAST:event_Boton_loginActionPerformed
    
    public void existeUsuario(String usuario, String contraseña) {
        ArrayList<Usuario> usuarios = usuariosHarcodeados();
        for (Usuario it : usuarios) {
            if (usuario.equalsIgnoreCase(it.getUsuario()) && contraseña.equals(it.getContrasenia())) {
                //irse a la otra ventana
                ponerCajasOriginal(Caja_contraseña, Caja_usuario);
                reset();
                Login l = new Login();
                l.setUsuario(usuario);
                l.setLocationRelativeTo(this);
                l.setVisible(true);
                esconderMostrarTextos(TextoError, false);
                return;
            }
        }


        JOptionPane.showMessageDialog(null, "El usuario no existe" + "\n" + "Por favor vuelva a introducir las credenciales", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);

        //intensidad y duracion
        vibrarVentana(this, 9, 50);

        reset();
        ponerCajasRojas(Caja_contraseña, Caja_usuario);
        esconderMostrarTextos(TextoError, true);
    }

    private void esconderMostrarTextos(JLabel j, boolean visible) {
        if (visible) {
            j.setVisible(true);
            return;
        }
        j.setVisible(false);

    }

    //este metodo recibe como entrada los Jtext fiel que son las cajas que van a cambiar el color del borde
    private void ponerCajasRojas(JTextField j, JTextField f) {
        Border rojo = BorderFactory.createLineBorder(Color.RED, 2);
        j.setBorder(rojo);
        f.setBorder(rojo);
    }

    private void ponerCajasOriginal(JTextField j, JTextField f) {
        Border original = Defecto.getBorder();
        j.setBorder(original);
        f.setBorder(original);
    }

    public void reset() {
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
CAMBIAR CONTRASEÑA PARA EL USUARIO?
    private void TextoEnlaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoEnlaceMouseClicked
        activarVentanaNuevaCuenta();
    }//GEN-LAST:event_TextoEnlaceMouseClicked
    private void activarVentanaNuevaCuenta() {
        NuevaCuenta n = new NuevaCuenta();
        n.setLocationRelativeTo(this);
        n.setResizable(false);
        n.setVisible(true);
    }
    
    private void Caja_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Caja_usuarioKeyReleased
        ponerCajasOriginal(Caja_usuario, Caja_contraseña);
        TextoError.setVisible(false);
    }//GEN-LAST:event_Caja_usuarioKeyReleased

    private void Caja_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Caja_contraseñaKeyReleased
        ponerCajasOriginal(Caja_usuario, Caja_contraseña);
        TextoError.setVisible(false);
    }//GEN-LAST:event_Caja_contraseñaKeyReleased

    public void vibrarVentana(JFrame frame, int intensidad, int duracion) {
        Point puntoOriginal = frame.getLocation();

        for (int i = 0; i < duracion; i++) {
            int x = puntoOriginal.x + (int) (Math.random() * intensidad) - (intensidad / 2);
            int y = puntoOriginal.y + (int) (Math.random() * intensidad) - (intensidad / 2);
            frame.setLocation(x, y);

            // Hacemos una pausa breve entre los movimientos
            try {
                Thread.sleep(20); // Pausa de 20 ms entre cada movimiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
    private javax.swing.JButton Boton_login;
    private javax.swing.JPasswordField Caja_contraseña;
    private javax.swing.JTextField Caja_usuario;
    private javax.swing.JCheckBox Check_mostrar_contraseña;
    private javax.swing.JTextField Defecto;
    private javax.swing.JLabel TextoEnlace;
    private javax.swing.JLabel TextoError;
    private javax.swing.JLabel Texto_Usuario;
    private javax.swing.JLabel Texto_contraseña;
    private javax.swing.JLabel Texto_login;
    // End of variables declaration//GEN-END:variables
}
