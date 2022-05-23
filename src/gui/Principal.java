package gui;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblBusqueda = new javax.swing.JLabel();
        btnVerCliente = new javax.swing.JButton();
        btnVerTelefono = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblAñadir = new javax.swing.JLabel();
        btnAñadirCliente = new javax.swing.JButton();
        btnAñadirContrato = new javax.swing.JButton();
        btnAñadirMovil = new javax.swing.JButton();
        btnBuscarNombre = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mVerRegistro = new javax.swing.JMenuItem();
        mConfiguracion = new javax.swing.JMenuItem();
        mSeparadorArchivo = new javax.swing.JPopupMenu.Separator();
        mSalir = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        mBuscar = new javax.swing.JMenuItem();
        mListarClientes = new javax.swing.JMenuItem();
        mSeparador1 = new javax.swing.JPopupMenu.Separator();
        mAñadir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operadora TeisMobile");
        setResizable(false);

        panelPrincipal.setMinimumSize(new java.awt.Dimension(50, 100));

        lblBusqueda.setText("Búsqueda");

        btnVerCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerCliente.setText("DNI");
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });

        btnVerTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerTelefono.setText("Teléfono");
        btnVerTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTelefonoActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblAñadir.setText("Añadir");

        btnAñadirCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadirCliente.setMnemonic('S');
        btnAñadirCliente.setText("Cliente");
        btnAñadirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirClienteActionPerformed(evt);
            }
        });

        btnAñadirContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadirContrato.setText("Contrato");
        btnAñadirContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirContratoActionPerformed(evt);
            }
        });

        btnAñadirMovil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadirMovil.setText("Línea móvil");

        btnBuscarNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscarNombre.setText("Nombre/Apell.");
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblBusqueda))
                    .addComponent(btnVerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblAñadir))
                    .addComponent(btnAñadirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblAñadir)
                                .addGap(12, 12, 12)
                                .addComponent(btnAñadirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAñadirContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAñadirMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblBusqueda)
                                .addGap(12, 12, 12)
                                .addComponent(btnVerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );

        mArchivo.setText("Archivo");
        mArchivo.setToolTipText("");

        mVerRegistro.setText("Ver registro...");
        mVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVerRegistroActionPerformed(evt);
            }
        });
        mArchivo.add(mVerRegistro);

        mConfiguracion.setText("Configuración");
        mConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConfiguracionActionPerformed(evt);
            }
        });
        mArchivo.add(mConfiguracion);
        mArchivo.add(mSeparadorArchivo);

        mSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSalir.setText("Salir...");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mArchivo.add(mSalir);

        menuPrincipal.add(mArchivo);

        mClientes.setText("Clientes");

        mBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mBuscar.setText("Buscar");
        mBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBuscarActionPerformed(evt);
            }
        });
        mClientes.add(mBuscar);

        mListarClientes.setText("Listar clientes");
        mListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarClientesActionPerformed(evt);
            }
        });
        mClientes.add(mListarClientes);
        mClientes.add(mSeparador1);

        mAñadir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mAñadir.setText("Añadir");
        mAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAñadirActionPerformed(evt);
            }
        });
        mClientes.add(mAñadir);

        menuPrincipal.add(mClientes);

        jMenu1.setText("Ayuda");

        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuPrincipal.add(jMenu1);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBuscarActionPerformed

    }//GEN-LAST:event_mBuscarActionPerformed

    private void mAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAñadirActionPerformed

    private void mListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarClientesActionPerformed
        try {
            ListarClientes listarClientes = new ListarClientes(this, rootPaneCheckingEnabled);
            listarClientes.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_mListarClientesActionPerformed

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
        try {
            VerCliente verCliente = new VerCliente(this, rootPaneCheckingEnabled, "");
            verCliente.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnVerClienteActionPerformed

    private void btnAñadirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirClienteActionPerformed
        try {
            AñadirCliente añadirCliente = new AñadirCliente(this, rootPaneCheckingEnabled);
            añadirCliente.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAñadirClienteActionPerformed

    private void btnAñadirContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirContratoActionPerformed
        try {
            AñadirContrato añadirContrato = new AñadirContrato(this, rootPaneCheckingEnabled, "");
            añadirContrato.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAñadirContratoActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        if (JOptionPane.showOptionDialog(this, "¿Seguro que quieres salir?",
                "Salir...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "Non"},
                "Sí") == 0) {
            System.exit(0);
        };
    }//GEN-LAST:event_mSalirActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
        try {
            BuscarClientes buscarCliente = new BuscarClientes(this, rootPaneCheckingEnabled);
            buscarCliente.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVerRegistroActionPerformed
        try {
            VerLogs verLogs = new VerLogs(this, rootPaneCheckingEnabled);
            verLogs.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_mVerRegistroActionPerformed

    private void mConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConfiguracionActionPerformed
        try {
            Configuracion configuracion = new Configuracion(this, rootPaneCheckingEnabled);
            configuracion.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_mConfiguracionActionPerformed

    private void btnVerTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTelefonoActionPerformed
        /*try {
            
        }*/
    }//GEN-LAST:event_btnVerTelefonoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirCliente;
    private javax.swing.JButton btnAñadirContrato;
    private javax.swing.JButton btnAñadirMovil;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JButton btnVerTelefono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAñadir;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenuItem mAñadir;
    private javax.swing.JMenuItem mBuscar;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem mConfiguracion;
    private javax.swing.JMenuItem mListarClientes;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JPopupMenu.Separator mSeparador1;
    private javax.swing.JPopupMenu.Separator mSeparadorArchivo;
    private javax.swing.JMenuItem mVerRegistro;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
