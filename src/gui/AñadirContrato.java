package gui;

import bd.BDInsertar;
import excepciones.IBANIncorrectoExcepcion;
import java.sql.SQLException;
import javax.swing.CellEditor;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import operadora.Contrato;
import operadora.LineaMovil;
import utils.Log;
import utils.Utilidades;

/**
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class AñadirContrato extends javax.swing.JDialog {

    /**
     * Atributo que almacena el DNI del cliente
     */
    private static String dniCliente;

    /**
     * Creates new form AñadirContrato
     */
    public AñadirContrato(java.awt.Frame parent, boolean modal, String dni) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);

        SpinnerNumberModel spinnerFijo = new SpinnerNumberModel(4.99, 0.0, 1000.0, 0.15);
        SpinnerNumberModel spinnerInternet = new SpinnerNumberModel(4.99, 0.0, 1000.0, 0.15);
        txtPrecioFijo.setModel(spinnerFijo);
        txtPrecioInternet.setModel(spinnerInternet);
        if (dni.isEmpty()) {
            this.dniCliente = JOptionPane.showInputDialog("Introduce el DNI:");
        } else {
            this.dniCliente = dni;
        }
        setTitle(this.dniCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBasico = new javax.swing.JPanel();
        lblIBAN = new javax.swing.JLabel();
        chkFijo = new javax.swing.JCheckBox();
        lblPrecioFijo = new javax.swing.JLabel();
        txtPrecioFijo = new javax.swing.JSpinner();
        chkInternet = new javax.swing.JCheckBox();
        lblPrecioInternet = new javax.swing.JLabel();
        txtPrecioInternet = new javax.swing.JSpinner();
        chkMoviles = new javax.swing.JCheckBox();
        txtIBAN = new javax.swing.JTextField();
        lblCaracteresIBAN = new javax.swing.JLabel();
        panelLineasMoviles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLineasMoviles = new javax.swing.JTable();
        btnAñadirLinea = new javax.swing.JButton();
        btnQuitarLinea = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelBasico.setBorder(javax.swing.BorderFactory.createTitledBorder("Básico"));

        lblIBAN.setText("IBAN");

        chkFijo.setText("Fijo");
        chkFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFijoActionPerformed(evt);
            }
        });

        lblPrecioFijo.setText("Precio");

        txtPrecioFijo.setEnabled(false);

        chkInternet.setText("Internet");
        chkInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInternetActionPerformed(evt);
            }
        });

        lblPrecioInternet.setText("Precio");

        txtPrecioInternet.setEnabled(false);

        chkMoviles.setText("Líneas móviles");
        chkMoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMovilesActionPerformed(evt);
            }
        });

        txtIBAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIBANKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelBasicoLayout = new javax.swing.GroupLayout(panelBasico);
        panelBasico.setLayout(panelBasicoLayout);
        panelBasicoLayout.setHorizontalGroup(
            panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicoLayout.createSequentialGroup()
                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBasicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIBAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaracteresIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBasicoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMoviles)
                            .addGroup(panelBasicoLayout.createSequentialGroup()
                                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkFijo)
                                    .addComponent(chkInternet))
                                .addGap(61, 61, 61)
                                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrecioInternet)
                                    .addComponent(lblPrecioFijo))
                                .addGap(18, 18, 18)
                                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBasicoLayout.setVerticalGroup(
            panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIBAN)
                    .addComponent(txtIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaracteresIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFijo)
                    .addComponent(txtPrecioFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioFijo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkInternet)
                    .addComponent(txtPrecioInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioInternet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMoviles)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelLineasMoviles.setBorder(javax.swing.BorderFactory.createTitledBorder("Líneas móviles"));

        tblLineasMoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº teléfono", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLineasMoviles.setEnabled(false);
        jScrollPane1.setViewportView(tblLineasMoviles);

        btnAñadirLinea.setText("+");
        btnAñadirLinea.setEnabled(false);
        btnAñadirLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirLineaActionPerformed(evt);
            }
        });

        btnQuitarLinea.setText("-");
        btnQuitarLinea.setEnabled(false);
        btnQuitarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLineasMovilesLayout = new javax.swing.GroupLayout(panelLineasMoviles);
        panelLineasMoviles.setLayout(panelLineasMovilesLayout);
        panelLineasMovilesLayout.setHorizontalGroup(
            panelLineasMovilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLineasMovilesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAñadirLinea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitarLinea)
                .addGap(7, 7, 7))
            .addGroup(panelLineasMovilesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLineasMovilesLayout.setVerticalGroup(
            panelLineasMovilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLineasMovilesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLineasMovilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadirLinea)
                    .addComponent(btnQuitarLinea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLineasMoviles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLineasMoviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnAñadir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFijoActionPerformed
        txtPrecioFijo.setEnabled(chkFijo.isSelected());
    }//GEN-LAST:event_chkFijoActionPerformed

    private void chkInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInternetActionPerformed
        txtPrecioInternet.setEnabled(chkInternet.isSelected());
    }//GEN-LAST:event_chkInternetActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void chkMovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMovilesActionPerformed
        tblLineasMoviles.setEnabled(chkMoviles.isSelected());
        btnAñadirLinea.setEnabled(chkMoviles.isSelected());
        btnQuitarLinea.setEnabled(chkMoviles.isSelected());
    }//GEN-LAST:event_chkMovilesActionPerformed

    private void btnAñadirLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirLineaActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblLineasMoviles.getModel();
        tabla.addRow(new Object[]{});
    }//GEN-LAST:event_btnAñadirLineaActionPerformed

    private void btnQuitarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarLineaActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblLineasMoviles.getModel();
        tabla.removeRow(tblLineasMoviles.getSelectedRow());
    }//GEN-LAST:event_btnQuitarLineaActionPerformed
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        try {
            if (Utilidades.comprobarIBAN(txtIBAN.getText())) {
                Contrato nuevoContrato = new Contrato(0, this.dniCliente, txtIBAN.getText(),
                        chkFijo.isSelected(), (Double) txtPrecioFijo.getValue(),
                        chkInternet.isSelected(), (Double) txtPrecioInternet.getValue(),
                        chkMoviles.isSelected());
                try {
                    // ID del último contrato añadido
                    String[] resultado;
                    resultado = BDInsertar.insertarContrato(nuevoContrato);
                    if (resultado[0].equals("1")) {
                        if (chkMoviles.isSelected()) {
                            LineaMovil nuevoMovil;
                            DefaultTableModel tabla = (DefaultTableModel) tblLineasMoviles.getModel();
                            /*
                            Estas dos líneas son requeridas para que las celdas dejen de ser editadas
                            al pulsar el botón
                             */
                            CellEditor celda = tblLineasMoviles.getCellEditor();
                            celda.stopCellEditing();
                            if (tabla.getRowCount() > 0) {
                                for (int i = 0; i < tabla.getRowCount(); i++) {
                                    nuevoMovil = new LineaMovil(Integer.parseInt(resultado[1]), tabla.getValueAt(i, 0).toString(), (Double) tabla.getValueAt(i, 1));
                                    BDInsertar.insertarLineaMovil(nuevoMovil);
                                }
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo insertar el contrato", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                    System.err.println(e.getSQLState());
                } catch (NullPointerException e) {
                    System.err.println(e.getMessage());
                }
            }

        } catch (IBANIncorrectoExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtIBANKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIBANKeyReleased
        lblCaracteresIBAN.setText(String.valueOf(txtIBAN.getText().length()));
    }//GEN-LAST:event_txtIBANKeyReleased

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
            java.util.logging.Logger.getLogger(AñadirContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AñadirContrato dialog = new AñadirContrato(new javax.swing.JFrame(), true, dniCliente);
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
    private javax.swing.JButton btnAñadirLinea;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnQuitarLinea;
    private javax.swing.JCheckBox chkFijo;
    private javax.swing.JCheckBox chkInternet;
    private javax.swing.JCheckBox chkMoviles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaracteresIBAN;
    private javax.swing.JLabel lblIBAN;
    private javax.swing.JLabel lblPrecioFijo;
    private javax.swing.JLabel lblPrecioInternet;
    private javax.swing.JPanel panelBasico;
    private javax.swing.JPanel panelLineasMoviles;
    private javax.swing.JTable tblLineasMoviles;
    private javax.swing.JTextField txtIBAN;
    private javax.swing.JSpinner txtPrecioFijo;
    private javax.swing.JSpinner txtPrecioInternet;
    // End of variables declaration//GEN-END:variables
}
