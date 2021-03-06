
package GVB.Modulos.GestionEmpleados.GestionE.Vista;



import javax.swing.UIManager;


/**
 *
 * @author Vinche
 */
public class Vnt_Empleados extends javax.swing.JFrame {



    public Vnt_Empleados() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelCrearEF = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        TxtDNI = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtEdad = new javax.swing.JTextField();
        NoNom = new javax.swing.JLabel();
        NoDNI = new javax.swing.JLabel();
        NoFnac = new javax.swing.JLabel();
        DCFnac = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        NoEmail = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        VOLVER = new javax.swing.JButton();
        UsOk = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        PaneCli = new javax.swing.JLayeredPane();
        TxtSueldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTelef = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NoSueldo = new javax.swing.JLabel();
        NoTelef = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        Cliente = new javax.swing.JRadioButton();
        User = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ABOUT = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        FormaJson = new javax.swing.JMenuItem();
        FormaXml = new javax.swing.JMenuItem();
        FormaTxt = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CONF_MONEDA_EURO = new javax.swing.JMenuItem();
        CONF_MONEDA_DOLAR = new javax.swing.JMenuItem();
        CONF_MONEDA_LIBRA = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        CONF_DEC_1 = new javax.swing.JMenuItem();
        CONF_DEC_2 = new javax.swing.JMenuItem();
        CONF_DEC_3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        CONF_FECHA_1 = new javax.swing.JMenuItem();
        CONF_FECHA_2 = new javax.swing.JMenuItem();
        CONF_FECHA_3 = new javax.swing.JMenuItem();
        CONF_FECHA_4 = new javax.swing.JMenuItem();
        CONF_FECHA_5 = new javax.swing.JMenuItem();
        CONF_FECHA_6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCrearEF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCrearEF.setMaximumSize(new java.awt.Dimension(35000, 35000));
        PanelCrearEF.setPreferredSize(new java.awt.Dimension(640, 400));
        PanelCrearEF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre:");
        PanelCrearEF.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 64, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DNI:");
        PanelCrearEF.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 113, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");
        PanelCrearEF.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        TxtNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtNom.setName("Txt_Nom"); // NOI18N
        TxtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtNomMouseClicked(evt);
            }
        });
        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNomKeyReleased(evt);
            }
        });
        PanelCrearEF.add(TxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 63, 151, -1));

        TxtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtDNI.setName("Txt_DNI"); // NOI18N
        TxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDNIActionPerformed(evt);
            }
        });
        TxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtDNIKeyReleased(evt);
            }
        });
        PanelCrearEF.add(TxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 112, 151, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Edad:");
        PanelCrearEF.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 64, -1, -1));

        TxtEdad.setEditable(false);
        TxtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEdadActionPerformed(evt);
            }
        });
        PanelCrearEF.add(TxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 40, -1));

        NoNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/cancel.png"))); // NOI18N
        PanelCrearEF.add(NoNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 63, -1, -1));

        NoDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/cancel.png"))); // NOI18N
        PanelCrearEF.add(NoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 112, -1, -1));

        NoFnac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/cancel.png"))); // NOI18N
        PanelCrearEF.add(NoFnac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        DCFnac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DCFnac.setDateFormatString("dd-MM-yyyy");
        DCFnac.setOpaque(false);
        DCFnac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DCFnacMouseClicked(evt);
            }
        });
        PanelCrearEF.add(DCFnac, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Email:");
        PanelCrearEF.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        TxtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCrearEF.add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 111, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Password:");
        PanelCrearEF.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        PanelCrearEF.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 111, -1));

        NoEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/cancel.png"))); // NOI18N
        PanelCrearEF.add(NoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Usuario.setForeground(java.awt.Color.blue);
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelCrearEF.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 80, 10));

        Imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Imagen.setMaximumSize(new java.awt.Dimension(60, 60));
        Imagen.setMinimumSize(new java.awt.Dimension(60, 60));
        PanelCrearEF.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 60, 60));

        getContentPane().add(PanelCrearEF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 240));

        VOLVER.setText("Volver");
        VOLVER.setToolTipText("Volver al paginador");
        VOLVER.setOpaque(false);
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, -1));

        UsOk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UsOk.setForeground(java.awt.Color.red);
        UsOk.setText("Usuario Guardado con Exito");
        getContentPane().add(UsOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 170, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        PaneCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtSueldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtSueldo.setName("Txt_Sueldo"); // NOI18N
        TxtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSueldoActionPerformed(evt);
            }
        });
        TxtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtSueldoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSueldoKeyTyped(evt);
            }
        });
        PaneCli.add(TxtSueldo);
        TxtSueldo.setBounds(190, 20, 151, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Saldo:");
        PaneCli.add(jLabel4);
        jLabel4.setBounds(30, 20, 40, 14);

        TxtTelef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtTelef.setName("Txt_Telef"); // NOI18N
        TxtTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefActionPerformed(evt);
            }
        });
        TxtTelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtTelefKeyReleased(evt);
            }
        });
        PaneCli.add(TxtTelef);
        TxtTelef.setBounds(190, 60, 151, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Telefono:");
        PaneCli.add(jLabel3);
        jLabel3.setBounds(30, 60, 52, 14);

        NoSueldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/cancel.png"))); // NOI18N
        PaneCli.add(NoSueldo);
        NoSueldo.setBounds(350, 20, 16, 16);

        NoTelef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/cancel.png"))); // NOI18N
        PaneCli.add(NoTelef);
        NoTelef.setBounds(350, 60, 16, 16);

        getContentPane().add(PaneCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 380, 90));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        buttonGroup1.add(Cliente);
        Cliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cliente.setText("Cliente");
        Cliente.setOpaque(false);
        getContentPane().add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        buttonGroup1.add(User);
        User.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        User.setText("Visitante");
        User.setOpaque(false);
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/fondo_degradado2.jpeg"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(600, 628));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 690, 410));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/fileopen.png"))); // NOI18N

        MenuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuGuardar.setText("Guardar");
        MenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuGuardar);
        jMenu1.add(jSeparator1);

        ABOUT.setText("About");
        ABOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABOUTActionPerformed(evt);
            }
        });
        jMenu1.add(ABOUT);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/configure.png"))); // NOI18N

        jMenu3.setText("Formato de guardado");

        FormaJson.setText("Json");
        FormaJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaJsonActionPerformed(evt);
            }
        });
        jMenu3.add(FormaJson);

        FormaXml.setText("Xml");
        FormaXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaXmlActionPerformed(evt);
            }
        });
        jMenu3.add(FormaXml);

        FormaTxt.setText("Txt");
        FormaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaTxtActionPerformed(evt);
            }
        });
        jMenu3.add(FormaTxt);

        jMenu2.add(jMenu3);

        jMenu4.setText("Moneda");

        CONF_MONEDA_EURO.setText("Euro");
        CONF_MONEDA_EURO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_MONEDA_EUROActionPerformed(evt);
            }
        });
        jMenu4.add(CONF_MONEDA_EURO);

        CONF_MONEDA_DOLAR.setText("Dollar");
        CONF_MONEDA_DOLAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_MONEDA_DOLARActionPerformed(evt);
            }
        });
        jMenu4.add(CONF_MONEDA_DOLAR);

        CONF_MONEDA_LIBRA.setText("Libra");
        CONF_MONEDA_LIBRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_MONEDA_LIBRAActionPerformed(evt);
            }
        });
        jMenu4.add(CONF_MONEDA_LIBRA);

        jMenu2.add(jMenu4);

        jMenu5.setText("Numero de decimales");

        CONF_DEC_1.setText("1");
        CONF_DEC_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_DEC_1ActionPerformed(evt);
            }
        });
        jMenu5.add(CONF_DEC_1);

        CONF_DEC_2.setText("2");
        CONF_DEC_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_DEC_2ActionPerformed(evt);
            }
        });
        jMenu5.add(CONF_DEC_2);

        CONF_DEC_3.setText("3");
        CONF_DEC_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_DEC_3ActionPerformed(evt);
            }
        });
        jMenu5.add(CONF_DEC_3);

        jMenu2.add(jMenu5);

        jMenu6.setText("Formato de fecha");

        CONF_FECHA_1.setText("dd/mm/yyyy");
        CONF_FECHA_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_FECHA_1ActionPerformed(evt);
            }
        });
        jMenu6.add(CONF_FECHA_1);

        CONF_FECHA_2.setText("yyyy/mm/dd");
        CONF_FECHA_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_FECHA_2ActionPerformed(evt);
            }
        });
        jMenu6.add(CONF_FECHA_2);

        CONF_FECHA_3.setText("mm/dd/yyyy");
        CONF_FECHA_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_FECHA_3ActionPerformed(evt);
            }
        });
        jMenu6.add(CONF_FECHA_3);

        CONF_FECHA_4.setText("dd-mm-yyyy");
        CONF_FECHA_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_FECHA_4ActionPerformed(evt);
            }
        });
        jMenu6.add(CONF_FECHA_4);

        CONF_FECHA_5.setText("yyyy-mm-dd");
        CONF_FECHA_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_FECHA_5ActionPerformed(evt);
            }
        });
        jMenu6.add(CONF_FECHA_5);

        CONF_FECHA_6.setText("mm-dd-yyyy");
        CONF_FECHA_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONF_FECHA_6ActionPerformed(evt);
            }
        });
        jMenu6.add(CONF_FECHA_6);

        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed

    }//GEN-LAST:event_TxtNomActionPerformed

    private void TxtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDNIActionPerformed
    }//GEN-LAST:event_TxtDNIActionPerformed

    private void TxtTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefActionPerformed
    }//GEN-LAST:event_TxtTelefActionPerformed

    private void TxtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSueldoActionPerformed

    }//GEN-LAST:event_TxtSueldoActionPerformed

    private void TxtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyReleased

    }//GEN-LAST:event_TxtNomKeyReleased

    private void TxtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDNIKeyReleased

    }//GEN-LAST:event_TxtDNIKeyReleased

    private void TxtTelefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefKeyReleased
    }//GEN-LAST:event_TxtTelefKeyReleased

    private void TxtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSueldoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSueldoKeyTyped

    private void TxtSueldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSueldoKeyReleased
    }//GEN-LAST:event_TxtSueldoKeyReleased

    private void DCFnacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DCFnacMouseClicked

    }//GEN-LAST:event_DCFnacMouseClicked

    private void TxtNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNomMouseClicked

    }//GEN-LAST:event_TxtNomMouseClicked

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
    }//GEN-LAST:event_VOLVERActionPerformed

    private void MenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarActionPerformed
    }//GEN-LAST:event_MenuGuardarActionPerformed

    private void FormaJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaJsonActionPerformed
    }//GEN-LAST:event_FormaJsonActionPerformed

    private void FormaXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaXmlActionPerformed
    }//GEN-LAST:event_FormaXmlActionPerformed

    private void FormaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaTxtActionPerformed
    }//GEN-LAST:event_FormaTxtActionPerformed

    private void CONF_MONEDA_EUROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_MONEDA_EUROActionPerformed
    }//GEN-LAST:event_CONF_MONEDA_EUROActionPerformed

    private void CONF_MONEDA_DOLARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_MONEDA_DOLARActionPerformed
    }//GEN-LAST:event_CONF_MONEDA_DOLARActionPerformed

    private void CONF_MONEDA_LIBRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_MONEDA_LIBRAActionPerformed
    }//GEN-LAST:event_CONF_MONEDA_LIBRAActionPerformed

    private void CONF_DEC_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_DEC_1ActionPerformed
    }//GEN-LAST:event_CONF_DEC_1ActionPerformed

    private void CONF_DEC_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_DEC_2ActionPerformed
    }//GEN-LAST:event_CONF_DEC_2ActionPerformed

    private void CONF_DEC_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_DEC_3ActionPerformed
    }//GEN-LAST:event_CONF_DEC_3ActionPerformed

    private void CONF_FECHA_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_FECHA_1ActionPerformed
    }//GEN-LAST:event_CONF_FECHA_1ActionPerformed

    private void CONF_FECHA_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_FECHA_2ActionPerformed
    }//GEN-LAST:event_CONF_FECHA_2ActionPerformed

    private void CONF_FECHA_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_FECHA_3ActionPerformed
    }//GEN-LAST:event_CONF_FECHA_3ActionPerformed

    private void CONF_FECHA_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_FECHA_4ActionPerformed
    }//GEN-LAST:event_CONF_FECHA_4ActionPerformed

    private void CONF_FECHA_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_FECHA_5ActionPerformed
    }//GEN-LAST:event_CONF_FECHA_5ActionPerformed

    private void CONF_FECHA_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONF_FECHA_6ActionPerformed
    }//GEN-LAST:event_CONF_FECHA_6ActionPerformed

    private void ABOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUTActionPerformed
     
    }//GEN-LAST:event_ABOUTActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void TxtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem ABOUT;
    public javax.swing.JMenuItem CONF_DEC_1;
    public javax.swing.JMenuItem CONF_DEC_2;
    public javax.swing.JMenuItem CONF_DEC_3;
    public javax.swing.JMenuItem CONF_FECHA_1;
    public javax.swing.JMenuItem CONF_FECHA_2;
    public javax.swing.JMenuItem CONF_FECHA_3;
    public javax.swing.JMenuItem CONF_FECHA_4;
    public javax.swing.JMenuItem CONF_FECHA_5;
    public javax.swing.JMenuItem CONF_FECHA_6;
    public javax.swing.JMenuItem CONF_MONEDA_DOLAR;
    public javax.swing.JMenuItem CONF_MONEDA_EURO;
    public javax.swing.JMenuItem CONF_MONEDA_LIBRA;
    public static javax.swing.JRadioButton Cliente;
    public static com.toedter.calendar.JDateChooser DCFnac;
    public javax.swing.JMenuItem FormaJson;
    public javax.swing.JMenuItem FormaTxt;
    public javax.swing.JMenuItem FormaXml;
    public static javax.swing.JLabel Imagen;
    public javax.swing.JMenuItem MenuGuardar;
    public javax.swing.JLabel NoDNI;
    public javax.swing.JLabel NoEmail;
    public javax.swing.JLabel NoFnac;
    public javax.swing.JLabel NoNom;
    public javax.swing.JLabel NoSueldo;
    public javax.swing.JLabel NoTelef;
    public static javax.swing.JLayeredPane PaneCli;
    public static javax.swing.JLayeredPane PanelCrearEF;
    public static javax.swing.JPasswordField Password;
    public javax.swing.JTextField TxtDNI;
    public javax.swing.JTextField TxtEdad;
    public static javax.swing.JTextField TxtEmail;
    public javax.swing.JTextField TxtNom;
    public javax.swing.JTextField TxtSueldo;
    public javax.swing.JTextField TxtTelef;
    public static javax.swing.JLabel UsOk;
    public static javax.swing.JRadioButton User;
    public static javax.swing.JLabel Usuario;
    public javax.swing.JButton VOLVER;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
