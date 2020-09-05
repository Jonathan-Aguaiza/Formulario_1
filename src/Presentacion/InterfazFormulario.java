/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import Negocio.Control.Persona;
import Negocio.Modelo.Agenda;

/**
 *
 * @author Aguaiza Jonathan, Pico Ana
 */
public class InterfazFormulario extends javax.swing.JFrame {

    Agenda agenda = new Agenda();
    
    javax.swing.ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes/Aprobado.png"));
    
    public InterfazFormulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLTitulo = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JLApellidos = new javax.swing.JLabel();
        JLCedula = new javax.swing.JLabel();
        JLEmail = new javax.swing.JLabel();
        JLTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        JLImagenNombre = new javax.swing.JLabel();
        JLImageApellidos = new javax.swing.JLabel();
        JLImagenValidador = new javax.swing.JLabel();
        JLImagenEmail = new javax.swing.JLabel();
        JLImagenTelefono = new javax.swing.JLabel();
        txtValidador = new javax.swing.JTextField();
        BotonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLTitulo.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 153, 0));
        JLTitulo.setText("Formulario de datos");

        JLNombre.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        JLNombre.setForeground(new java.awt.Color(255, 255, 255));
        JLNombre.setText("Nombre");

        JLApellidos.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        JLApellidos.setForeground(new java.awt.Color(255, 255, 255));
        JLApellidos.setText("Apellidos");

        JLCedula.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        JLCedula.setForeground(new java.awt.Color(255, 255, 255));
        JLCedula.setText("Cédula");

        JLEmail.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        JLEmail.setForeground(new java.awt.Color(255, 255, 255));
        JLEmail.setText("email");

        JLTelefono.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        JLTelefono.setForeground(new java.awt.Color(255, 255, 255));
        JLTelefono.setText("Télefono");

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        JLImagenNombre.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenNombre.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenNombre.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImageApellidos.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImageApellidos.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImageApellidos.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenValidador.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenValidador.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenValidador.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenEmail.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenEmail.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenEmail.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenTelefono.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenTelefono.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenTelefono.setPreferredSize(new java.awt.Dimension(30, 30));

        txtValidador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValidadorFocusLost(evt);
            }
        });
        txtValidador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValidadorKeyTyped(evt);
            }
        });

        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JLEmail)
                    .addComponent(JLTelefono)
                    .addComponent(BotonGuardar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValidador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BotonMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(BotonLimpiar)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLImagenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImageApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenValidador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSalir))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLTitulo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLImageApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLApellidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenValidador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLTelefono)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonSalir)
                    .addComponent(BotonMostrar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        FondoFormulario AplicarFondo = new FondoFormulario();
        
        this.add( AplicarFondo , BorderLayout.SOUTH);
        AplicarFondo.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed

        dispose();

    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed

        txtNombre.setText("");
        txtApellidos.setText("");
        txtCedula.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtValidador.setText("");

    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }

        if(txtApellidos.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos");
            return;
        }

        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese su cédula");
            return;
        }

        if(txtValidador.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el Codigo validador");
            return;
        }

        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el email");
            return;
        }

        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el télefono");
            return;
        }
        /////////////////////////////////////////
        //Limpiaremos el codigo haciendo variables

        String Nombre, Apellidos, Cedula, Email, Telefono;
        //los llamaremos con las variables

        Nombre = txtNombre.getText();
        Apellidos = txtApellidos.getText();
        Cedula = txtCedula.getText()+"-"+txtValidador.getText();
        Email = txtEmail.getText();
        Telefono = txtTelefono.getText();

        /*
        JOptionPane.showMessageDialog(null, "Nombre: "+Nombre+" Apellido: "
            +Apellidos+" Cédula: "+Cedula+" Email: "+Email+" Télefono: "+Telefono);
        */
        ////////////////////////////////////////////
        //aqui muestra la respuesta de los datos bien arreglados
        
        Persona persona = new Persona(Nombre,Apellidos,Cedula,Email,Telefono);
        agenda.GuardarPersona(persona);

    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)){
            evt.consume();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost

        if(txtTelefono.getText().length()>=2){
            JLImagenTelefono.setIcon(icono);
        }else{
            JLImagenTelefono.setIcon(null);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost

        if(txtEmail.getText().length()>=2){
            JLImagenEmail.setIcon(icono);
        }else{
            JLImagenEmail.setIcon(null);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        
        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)){
            evt.consume();
        }

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost

      /*String codigo;
      int multiplo = 2;
      int cont = 0;
      
      for (int x=0;x<txtCedula.getText().length();x++){
        cont=cont+(Integer.parseInt(txtCedula.getText().substring(txtCedula.getText().length()-x-1, txtCedula.getText().length()-x))*multiplo);
        multiplo++;
        if(multiplo==8){
            multiplo=2;
        }
        
    }
      cont=11-(cont%11);
      
      if(cont<=9){
          codigo=""+cont;
      }else if(cont==11){
          codigo="0";
      }else{
          codigo="K";
      }
      if(codigo!=null){
          txtValidador.setText(codigo);
      }*/
        
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped

        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost

        if(txtApellidos.getText().length()>=2){
            JLImageApellidos.setIcon(icono);
        }else{
            JLImageApellidos.setIcon(null);
        }

    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        if(txtNombre.getText().length()>=12){
            evt.consume();
        }

        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost

        if(txtNombre.getText().length()>=2){
            JLImagenNombre.setIcon(icono);
        }else{
            JLImagenNombre.setIcon(null);
        }

    }//GEN-LAST:event_txtNombreFocusLost

    private void txtValidadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidadorKeyTyped
        
        if(txtCedula.getText().length()>=2){
            JLImagenValidador.setIcon(icono);
        }else{
            JLImagenValidador.setIcon(null);
        }
    }//GEN-LAST:event_txtValidadorKeyTyped

    private void txtValidadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValidadorFocusLost
        
        if(txtValidador.getText().length()>=1){
            JLImagenValidador.setIcon(icono);
        }else{
            JLImagenValidador.setIcon(null);
        }
        
    }//GEN-LAST:event_txtValidadorFocusLost

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        
        JOptionPane.showMessageDialog(null, agenda.MostrarAgenda());
        
    }//GEN-LAST:event_BotonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel JLApellidos;
    private javax.swing.JLabel JLCedula;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLImageApellidos;
    private javax.swing.JLabel JLImagenEmail;
    private javax.swing.JLabel JLImagenNombre;
    private javax.swing.JLabel JLImagenTelefono;
    private javax.swing.JLabel JLImagenValidador;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLTelefono;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValidador;
    // End of variables declaration//GEN-END:variables
}
