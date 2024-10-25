package vistacontrolador;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import static modelo.GestorBBDD.controlExisteUsuario;
import static modelo.GestorBBDD.crearNuevoUsuario;

public class NuevaCuenta extends javax.swing.JFrame {

    public NuevaCuenta() {
        initComponents();
        TextoErrorContra.setVisible(false);
        ImagenCheck.setVisible(false);
        esconderMostrarTextos(TextoConfirmacion, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CajaConfContraseña = new javax.swing.JTextField();
        TextoCorreo = new javax.swing.JLabel();
        TextoContraseña = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        TextoConfContra = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        TextoErrorContra = new javax.swing.JLabel();
        TextoOpcional = new javax.swing.JLabel();
        CajaFechaNacimiento = new com.toedter.calendar.JDateChooser();
        CajaNombre = new javax.swing.JTextField();
        TextoConfirmacion = new javax.swing.JLabel();
        CajaApellido = new javax.swing.JTextField();
        ImagenCheck = new javax.swing.JLabel();
        TextoNuevo = new javax.swing.JLabel();
        CajaCorreo = new javax.swing.JTextField();
        TextoUsuario = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JLabel();
        CajaTextoNewUsuario = new javax.swing.JTextField();
        TextoApellido = new javax.swing.JLabel();
        CajaTextoNewContra = new javax.swing.JTextField();
        TextoFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CajaConfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaConfContraseñaKeyReleased(evt);
            }
        });

        TextoCorreo.setText("Correo:");

        TextoContraseña.setText("Contraseña:");

        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        TextoConfContra.setText("Confirmar contraseña:");

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        TextoErrorContra.setText("*La contraseña no coincide");

        TextoOpcional.setText("Agregar datos opcionales del nuevo usuario:");

        CajaFechaNacimiento.setDateFormatString("yyyy-MM-dd");

        TextoConfirmacion.setText("*Escribe una direccion de correo valida");

        ImagenCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Check_chiquito.png"))); // NOI18N

        TextoNuevo.setText("Por favor introduzca la informacion del nuevo usuario:");

        CajaCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaCorreoKeyReleased(evt);
            }
        });

        TextoUsuario.setText("Usuario:");

        TextoNombre.setText("Nombre:");

        TextoApellido.setText("Apellido:");

        CajaTextoNewContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaTextoNewContraKeyReleased(evt);
            }
        });

        TextoFecha.setText("Fecha de Nacimiento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(TextoNuevo)
                                    .addGap(39, 39, 39))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(TextoConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TextoApellido)
                                        .addComponent(TextoFecha)
                                        .addComponent(TextoNombre)
                                        .addComponent(TextoCorreo))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CajaFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ImagenCheck))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(BotonVolver)
                                    .addGap(60, 60, 60)
                                    .addComponent(BotonAgregar))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextoErrorContra)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TextoContraseña)
                                        .addComponent(TextoUsuario)
                                        .addComponent(TextoConfContra))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CajaTextoNewContra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CajaTextoNewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CajaConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(TextoOpcional)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoNuevo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoUsuario)
                    .addComponent(CajaTextoNewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaTextoNewContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoContraseña))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoConfContra))
                .addGap(15, 15, 15)
                .addComponent(TextoErrorContra)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoOpcional)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombre))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoApellido))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoFecha)
                    .addComponent(CajaFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenCheck)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoCorreo)))
                .addGap(18, 18, 18)
                .addComponent(TextoConfirmacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVolver)
                    .addComponent(BotonAgregar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaConfContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaConfContraseñaKeyReleased
        controlarVacioCajaContraseña();
        controlIgualCajasContra();
    }//GEN-LAST:event_CajaConfContraseñaKeyReleased

    private void controlarVacioCajaContraseña() {
        if (CajaTextoNewContra.getText().isEmpty() || CajaConfContraseña.getText().isEmpty()) {
            ponerCajasOriginal(CajaTextoNewContra, CajaConfContraseña);
        }
    }

    private void controlIgualCajasContra() {
        if (!CajaTextoNewContra.getText().equals(CajaConfContraseña.getText())) {
            ponerCajasRojas(CajaTextoNewContra, CajaConfContraseña);
            esconderMostrarTextos(TextoErrorContra, true);
        } else {
            ponerCajasOriginal(CajaTextoNewContra, CajaConfContraseña);
            esconderMostrarTextos(TextoErrorContra, false);
        }
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
        Border defecto = CajaApellido.getBorder();
        //Border original = BorderFactory.createLineBorder(Color.gray);
        j.setBorder(defecto);
        f.setBorder(defecto);
    }

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        resetearVentana();
        textoImagenBordePorDefecto();
        //controlar desde donde volver
    }//GEN-LAST:event_BotonVolverActionPerformed
    private void resetearVentana() {
        Border defecto = CajaApellido.getBorder();
        CajaTextoNewUsuario.setText("");
        CajaTextoNewContra.setText("");
        CajaTextoNewContra.setBorder(defecto);
        CajaConfContraseña.setText("");
        CajaConfContraseña.setBorder(defecto);
        TextoErrorContra.setVisible(false);
        CajaNombre.setText("");
        CajaApellido.setText("");
        CajaCorreo.setText("");
        CajaFechaNacimiento.setDate(null);
    }


    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        //controles antes de crear el nuevo usuario
        if (camposVacios() || contraseñaCoincide() || correoValido() || existeUsuario()) {
            return;
        }

        //FechaNacimiento.setDateFormatString("yyyy-MM-dd");
        crearNuevoUsuario(CajaTextoNewUsuario.getText(), CajaTextoNewContra.getText(), CajaNombre.getText(), CajaApellido.getText(), CajaFechaNacimiento.getDate(), CajaCorreo.getText());
        JOptionPane.showMessageDialog(this, "Se ha creado correctamente el usuario " + CajaTextoNewUsuario.getText(), "Usuario Registrado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private boolean camposVacios() {
        //compruebo campos vacios antes de ver si existe en la BD
        if (CajaTextoNewUsuario.getText().isEmpty() || CajaTextoNewContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alguno de los campos estan vacios", "Campos Vacios", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean existeUsuario() {
        if (controlExisteUsuario(CajaTextoNewUsuario.getText())) {
            JOptionPane.showMessageDialog(this, "El usuario " + CajaTextoNewUsuario.getText() + " ya existe en el sistema", "Usuario Repetido", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean contraseñaCoincide() {
        if (!CajaTextoNewContra.getText().equals(CajaConfContraseña.getText())) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Contraseñas no iguales", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean correoValido() {
        Border cruz_rojo = BorderFactory.createLineBorder(Color.RED, 2);
        NO FUNCIONA EL IF
        if (CajaCorreo.getBorder() == cruz_rojo ) {
            JOptionPane.showMessageDialog(this, "El correo es invalido", "Correo Invalido", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private void CajaCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaCorreoKeyReleased
        //Para cambiar de iconos cuando se equivoque o este bien, no usar rutas absolutas
        ImageIcon cruz = new ImageIcon("./src/imagenes/cruz.png");
        ImageIcon check = new ImageIcon("./src/imagenes/Check_chiquito.png");

        Border check_verde = BorderFactory.createLineBorder(Color.green, 2);
        Border cruz_rojo = BorderFactory.createLineBorder(Color.RED, 2);
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{3,4}$";

        //Cuando esta vacio no muestro nada y lo dejo sin imagen ni mensaje de confirmacion
        if (CajaCorreo.getText().equals("")) {
            textoImagenBordePorDefecto();
            return;
        }

        //si entra en el if es que el correo no es valido
        if (!CajaCorreo.getText().matches(regex)) {
            CajaCorreo.setBorder(cruz_rojo);
            Imagen_visible();
            ImagenCheck.setIcon(cruz);
            esconderMostrarTextos(TextoConfirmacion, true);
            TextoConfirmacion.setText("* Escribe una direccion de correo valida");

        } else {
            CajaCorreo.setBorder(check_verde);
            Imagen_visible();
            ImagenCheck.setIcon(check);
            TextoConfirmacion.setText("Correo verificado correctamente");

        }
    }//GEN-LAST:event_CajaCorreoKeyReleased

    private void CajaTextoNewContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaTextoNewContraKeyReleased
        controlarVacioCajaContraseña();
        controlIgualCajasContra();
    }//GEN-LAST:event_CajaTextoNewContraKeyReleased

    private void Imagen_visible() {
        ImagenCheck.setVisible(true);
    }

    private void textoImagenBordePorDefecto() {
        Border defecto = CajaApellido.getBorder();
        CajaCorreo.setBorder(defecto);
        TextoConfirmacion.setVisible(false);
        ImagenCheck.setVisible(false);
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
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CajaApellido;
    private javax.swing.JTextField CajaConfContraseña;
    private javax.swing.JTextField CajaCorreo;
    private com.toedter.calendar.JDateChooser CajaFechaNacimiento;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaTextoNewContra;
    private javax.swing.JTextField CajaTextoNewUsuario;
    private javax.swing.JLabel ImagenCheck;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JLabel TextoConfContra;
    private javax.swing.JLabel TextoConfirmacion;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoErrorContra;
    private javax.swing.JLabel TextoFecha;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoNuevo;
    private javax.swing.JLabel TextoOpcional;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
