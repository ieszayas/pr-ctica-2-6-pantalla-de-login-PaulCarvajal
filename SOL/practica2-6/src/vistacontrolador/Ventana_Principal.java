package vistacontrolador;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.Color;
import java.awt.Point;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import static modelo.GestorBBDD.controlExisteUsuario;
import static modelo.GestorBBDD.crearBD;
import static modelo.GestorBBDD.crearNuevoUsuario;
import modelo.Usuario;
import static modelo.Usuario.usuariosHarcodeados;

public class Ventana_Principal extends javax.swing.JFrame {

    public Ventana_Principal() {

        initComponents();
        TextoEnlace.setText("<html><a href=''>Hacer click para crear una nueva cuenta</a></html>");
        //TextoEnlace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoError.setVisible(false);
        TextoErrorContra.setVisible(false);
        

        crearBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        Titulo_Bienvenido = new javax.swing.JLabel();
        Texto_Usuario_Logueado = new javax.swing.JLabel();
        Boton_cerrrar_sesion = new javax.swing.JButton();
        Imagen_sesion = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JButton();
        NuevaCuenta = new javax.swing.JFrame();
        TextoNuevo = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JLabel();
        CajaTextoNewUsuario = new javax.swing.JTextField();
        CajaTextoNewContra = new javax.swing.JTextField();
        CajaConfContraseña = new javax.swing.JTextField();
        TextoContraseña = new javax.swing.JLabel();
        TextoConfContra = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TextoOpcional = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        CajaApellido = new javax.swing.JTextField();
        CajaCorreo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JLabel();
        TextoApellido = new javax.swing.JLabel();
        TextoFecha = new javax.swing.JLabel();
        TextoCorreo = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        TextoErrorContra = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        Texto_login = new javax.swing.JLabel();
        Texto_Usuario = new javax.swing.JLabel();
        Texto_contraseña = new javax.swing.JLabel();
        Caja_usuario = new javax.swing.JTextField();
        Check_mostrar_contraseña = new javax.swing.JCheckBox();
        Caja_contraseña = new javax.swing.JPasswordField();
        Boton_login = new javax.swing.JButton();
        TextoEnlace = new javax.swing.JLabel();
        TextoError = new javax.swing.JLabel();

        Login.setTitle("Principal");
        Login.setResizable(false);

        Titulo_Bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo_Bienvenido.setText("Bienvenid@");

        Texto_Usuario_Logueado.setText("El usuario Pol esta logueado");

        Boton_cerrrar_sesion.setText("Cerrar sesion");
        Boton_cerrrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_cerrrar_sesionActionPerformed(evt);
            }
        });

        Imagen_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistacontrolador/icono.png"))); // NOI18N

        BotonNuevo.setText("Nuevo usuario");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_cerrrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Texto_Usuario_Logueado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Titulo_Bienvenido))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Imagen_sesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo_Bienvenido)
                .addGap(18, 18, 18)
                .addComponent(Imagen_sesion)
                .addGap(38, 38, 38)
                .addComponent(Texto_Usuario_Logueado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BotonNuevo)
                .addGap(18, 18, 18)
                .addComponent(Boton_cerrrar_sesion)
                .addGap(16, 16, 16))
        );

        TextoNuevo.setText("Por favor introduzca la informacion del nuevo usuario:");

        TextoUsuario.setText("Usuario:");

        CajaConfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaConfContraseñaKeyReleased(evt);
            }
        });

        TextoContraseña.setText("Contraseña:");

        TextoConfContra.setText("Confirmar contraseña:");

        TextoOpcional.setText("Agregar datos opcionales del nuevo usuario:");

        CajaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaApellidoActionPerformed(evt);
            }
        });

        TextoNombre.setText("Nombre:");

        TextoApellido.setText("Apellido:");

        TextoFecha.setText("Fecha de Nacimiento:");

        TextoCorreo.setText("Correo:");

        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        TextoErrorContra.setText("*La contraseña no coincide");

        FechaNacimiento.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout NuevaCuentaLayout = new javax.swing.GroupLayout(NuevaCuenta.getContentPane());
        NuevaCuenta.getContentPane().setLayout(NuevaCuentaLayout);
        NuevaCuentaLayout.setHorizontalGroup(
            NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaCuentaLayout.createSequentialGroup()
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NuevaCuentaLayout.createSequentialGroup()
                        .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NuevaCuentaLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(TextoNuevo))
                            .addGroup(NuevaCuentaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextoContraseña)
                                    .addComponent(TextoUsuario)
                                    .addComponent(TextoConfContra))
                                .addGap(44, 44, 44)
                                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoErrorContra)
                                    .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CajaTextoNewContra)
                                        .addComponent(CajaTextoNewUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(CajaConfContraseña))))
                            .addGroup(NuevaCuentaLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NuevaCuentaLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(TextoOpcional))
                                    .addGroup(NuevaCuentaLayout.createSequentialGroup()
                                        .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextoApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TextoNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TextoFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TextoCorreo, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(44, 44, 44)
                                        .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CajaNombre)
                                            .addComponent(CajaApellido)
                                            .addComponent(CajaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(NuevaCuentaLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(BotonVolver)
                                .addGap(61, 61, 61)
                                .addComponent(BotonAgregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NuevaCuentaLayout.setVerticalGroup(
            NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoNuevo)
                .addGap(21, 21, 21)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoUsuario)
                    .addComponent(CajaTextoNewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoContraseña)
                    .addComponent(CajaTextoNewContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoConfContra))
                .addGap(15, 15, 15)
                .addComponent(TextoErrorContra)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoOpcional)
                .addGap(18, 18, 18)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombre))
                .addGap(26, 26, 26)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoApellido))
                .addGap(37, 37, 37)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoFecha)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVolver)
                    .addComponent(BotonAgregar))
                .addGap(14, 14, 14))
        );

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
                        .addComponent(Boton_login)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texto_Usuario)
                            .addComponent(Texto_contraseña))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoError)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Caja_usuario)
                                    .addComponent(Caja_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(Check_mostrar_contraseña)))
                        .addGap(23, 23, 23))))
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
            if (usuario.equalsIgnoreCase(it.getNombre()) && contraseña.equalsIgnoreCase(it.getContrasenia())) {
                //irse a la otra ventana
                ponerCajasOriginal(Caja_contraseña, Caja_usuario);
                reset();
                Login.setSize(300, 300);
                Texto_Usuario_Logueado.setText("El usuario " + usuario + " esta logueado");
                Login.setLocationRelativeTo(this);
                Login.setVisible(true);
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

    private void Boton_cerrrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cerrrar_sesionActionPerformed
        Login.dispose();
        reset();
    }//GEN-LAST:event_Boton_cerrrar_sesionActionPerformed

    private void TextoEnlaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoEnlaceMouseClicked
        activarVentanaNuevaCuenta();
    }//GEN-LAST:event_TextoEnlaceMouseClicked

    private void activarVentanaNuevaCuenta() {
        NuevaCuenta.setSize(439, 589);
        NuevaCuenta.setLocationRelativeTo(this);
        NuevaCuenta.setResizable(false);
        NuevaCuenta.setVisible(true);

    }
    private void CajaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaApellidoActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        NuevaCuenta.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
         //compruebo campos vacios antes de ver si existe en la BD
        if (CajaTextoNewUsuario.getText().isEmpty() || CajaTextoNewContra.getText().isEmpty() || CajaConfContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alguno de los campos estan vacios", "Campos Vacios", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (controlExisteUsuario(CajaTextoNewUsuario.getText(), CajaTextoNewContra.getText())) {
            JOptionPane.showMessageDialog(null, "El usuario " + CajaTextoNewUsuario.getText() + " ya existe en el sistema", "Usuario Repetido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //no se como hacer para que pueda meterme varios campos opcionales
        if(CajaNombre.getText().isEmpty()){
            
        }
        
        FechaNacimiento.setDateFormatString("yyyy-MM-dd");
        crearNuevoUsuario(CajaTextoNewUsuario.getText(), CajaTextoNewContra.getText(), CajaNombre.getText(), CajaApellido.getText(), FechaNacimiento.getDate(), CajaCorreo.getText());
        JOptionPane.showMessageDialog(null, "Se ha creado correctamente el usuario " + CajaTextoNewUsuario.getText(), "Usuario Registrado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonAgregarActionPerformed
   
    private void CajaConfContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaConfContraseñaKeyReleased
        if (!CajaTextoNewContra.getText().equals(CajaConfContraseña.getText())) {
            ponerCajasRojas(CajaTextoNewContra, CajaConfContraseña);
            esconderMostrarTextos(TextoErrorContra, true);
        } else {
            ponerCajasOriginal(CajaTextoNewContra, CajaConfContraseña);
            esconderMostrarTextos(TextoErrorContra, false);
        }
    }//GEN-LAST:event_CajaConfContraseñaKeyReleased

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        activarVentanaNuevaCuenta();
        Login.dispose();
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void Caja_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Caja_usuarioKeyReleased
        ponerCajasOriginal(Caja_usuario, Caja_contraseña);
        TextoError.setVisible(false);
    }//GEN-LAST:event_Caja_usuarioKeyReleased

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
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton Boton_cerrrar_sesion;
    private javax.swing.JButton Boton_login;
    private javax.swing.JTextField CajaApellido;
    private javax.swing.JTextField CajaConfContraseña;
    private javax.swing.JTextField CajaCorreo;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JTextField CajaTextoNewContra;
    private javax.swing.JTextField CajaTextoNewUsuario;
    private javax.swing.JPasswordField Caja_contraseña;
    private javax.swing.JTextField Caja_usuario;
    private javax.swing.JCheckBox Check_mostrar_contraseña;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JLabel Imagen_sesion;
    private javax.swing.JFrame Login;
    private javax.swing.JFrame NuevaCuenta;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JLabel TextoConfContra;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoEnlace;
    private javax.swing.JLabel TextoError;
    private javax.swing.JLabel TextoErrorContra;
    private javax.swing.JLabel TextoFecha;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoNuevo;
    private javax.swing.JLabel TextoOpcional;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JLabel Texto_Usuario;
    private javax.swing.JLabel Texto_Usuario_Logueado;
    private javax.swing.JLabel Texto_contraseña;
    private javax.swing.JLabel Texto_login;
    private javax.swing.JLabel Titulo_Bienvenido;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
