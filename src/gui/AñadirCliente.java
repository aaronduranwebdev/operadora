package gui;

import bd.BDInsertar;
import java.sql.SQLException;
import operadora.Cliente;
import utils.Log;
import utils.Nacionalidades;
import utils.Provincias;

/**
 * Interfaz para añadir cliente
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class AñadirCliente extends javax.swing.JDialog {

    /**
     * Creates new form AñadirCliente
     */
    public AñadirCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("Añadir nuevo cliente");
        for (Nacionalidades nacionalidad : Nacionalidades.values()) {
            cmbNacionalidad.addItem(nacionalidad.toString());
        }
        for (Provincias provincia : Provincias.values()) {
            cmbProvincia.addItem(provincia.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAñadirCliente = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtDNICliente = new javax.swing.JTextField();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilioCliente = new javax.swing.JTextField();
        txtLocalidadCliente = new javax.swing.JTextField();
        lblLocalidad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        txtApellido1Cliente = new javax.swing.JTextField();
        lblApellido2 = new javax.swing.JLabel();
        txtApellido2Cliente = new javax.swing.JTextField();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        cmbProvincia = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblNombre.setText("Nombre");

        txtNombreCliente.setMaximumSize(new java.awt.Dimension(70, 2147483647));
        txtNombreCliente.setMinimumSize(new java.awt.Dimension(70, 22));

        lblDNI.setText("DNI");

        lblDomicilio.setText("Domicilio");

        lblLocalidad.setText("Localidad");

        lblProvincia.setText("Provincia");

        lblNacionalidad.setText("Nacionalidad");

        lblApellido1.setText("Apellido 1");

        lblApellido2.setText("Apellido 2");

        cmbProvincia.setMinimumSize(new java.awt.Dimension(68, 22));
        cmbProvincia.setPreferredSize(new java.awt.Dimension(68, 22));

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAñadirClienteLayout = new javax.swing.GroupLayout(panelAñadirCliente);
        panelAñadirCliente.setLayout(panelAñadirClienteLayout);
        panelAñadirClienteLayout.setHorizontalGroup(
            panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                        .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellido1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                            .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNombre)
                                                .addComponent(lblDNI))
                                            .addGap(78, 78, 78)
                                            .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblApellido1)
                                                .addComponent(lblNacionalidad)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAñadirClienteLayout.createSequentialGroup()
                                            .addComponent(txtDNICliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido2)
                                    .addComponent(txtApellido2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAñadir)
                                    .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                        .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDomicilioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDomicilio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLocalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLocalidad))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                        .addComponent(lblProvincia)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCerrar))
                                    .addComponent(cmbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAñadirClienteLayout.setVerticalGroup(
            panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirClienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido1)
                    .addComponent(lblApellido2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(lblNacionalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(lblLocalidad)
                    .addComponent(lblProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnAñadir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAñadirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAñadirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // Cierra el JDialog
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        Cliente nuevoCliente;
        nuevoCliente = new Cliente(txtDNICliente.getText(), txtNombreCliente.getText(), txtApellido1Cliente.getText(),
                txtApellido2Cliente.getText(), txtDomicilioCliente.getText(), txtLocalidadCliente.getText(),
                Provincias.valueOf(cmbProvincia.getSelectedItem().toString()), Nacionalidades.valueOf(cmbNacionalidad.getSelectedItem().toString()));
        try {
            String[] resultado;
            resultado = BDInsertar.insertarCliente(nuevoCliente);
            if (resultado[0].equals("1")) {
                Log.escribirLog(Log.INFO, "Cliente insertado: " + resultado[1]);
            } else {
                Log.escribirLog(Log.ERROR, "No se ha podido insertar el cliente");
            }
        } catch (SQLException e) {
            Log.escribirLog(Log.ERROR, "No se ha podido insertar el cliente");
            System.err.println("No se ha podido insertar el cliente. " + e.getSQLState());
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AñadirCliente dialog = new AñadirCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private javax.swing.JComboBox<String> cmbProvincia;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JPanel panelAñadirCliente;
    private javax.swing.JTextField txtApellido1Cliente;
    private javax.swing.JTextField txtApellido2Cliente;
    private javax.swing.JTextField txtDNICliente;
    private javax.swing.JTextField txtDomicilioCliente;
    private javax.swing.JTextField txtLocalidadCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
