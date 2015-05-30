package GVB.Modulos.GestionPedidos.Vista;




import GVB.Modulos.GestionProd.Pager.Vista.*;
import GVB.Modulos.GestionEmpleados.GestionE.Modelo.Classe.SimpleTableModel_E;
import javax.swing.UIManager;


public class Paginador extends javax.swing.JFrame {


    public Paginador() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        initComponents();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        ANTERIOR = new javax.swing.JButton();
        SIGUIENTE = new javax.swing.JButton();
        CAJA = new javax.swing.JTextField();
        primero = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VOLVER = new javax.swing.JButton();
        MUESTRA = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        MuestraSelected = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        MuestraSelected2 = new javax.swing.JTextArea();
        Proceds = new javax.swing.JTextField();
        buscador = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        btnTxt = new javax.swing.JButton();
        btnJson = new javax.swing.JButton();
        btnXml = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ImgPro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        setTitle("Paginacion");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLA.setModel(new SimpleTableModel_E());
        TABLA.setToolTipText("Click para seleccionar producto");
        TABLA.setName("_TABLA"); // NOI18N
        TABLA.setOpaque(false);
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 646, 342));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 670, 368));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ANTERIOR.setText("<");
        ANTERIOR.setOpaque(false);
        ANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANTERIORActionPerformed(evt);
            }
        });
        jPanel2.add(ANTERIOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        SIGUIENTE.setText(">");
        SIGUIENTE.setOpaque(false);
        SIGUIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGUIENTEActionPerformed(evt);
            }
        });
        jPanel2.add(SIGUIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        CAJA.setEditable(false);
        CAJA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAJA.setPreferredSize(new java.awt.Dimension(140, 20));
        jPanel2.add(CAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 80, -1));

        primero.setText("|<");
        primero.setOpaque(false);
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });
        jPanel2.add(primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        ultimo.setText(">|");
        ultimo.setOpaque(false);
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });
        jPanel2.add(ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 560, 43));

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 444, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Filtrar por ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 95, -1));

        VOLVER.setText("Volver");
        VOLVER.setToolTipText("Volver al menú principal");
        VOLVER.setOpaque(false);
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 493, 113, -1));

        MUESTRA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "50", "100" }));
        MUESTRA.setOpaque(false);
        MUESTRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUESTRAActionPerformed(evt);
            }
        });
        getContentPane().add(MUESTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 413, 88, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mostrar entradas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 390, 151, -1));

        MuestraSelected.setEditable(false);
        MuestraSelected.setColumns(20);
        MuestraSelected.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        MuestraSelected.setRows(5);
        MuestraSelected.setBorder(null);
        jScrollPane4.setViewportView(MuestraSelected);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 310, 120));

        MuestraSelected2.setEditable(false);
        MuestraSelected2.setColumns(20);
        MuestraSelected2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        MuestraSelected2.setRows(5);
        MuestraSelected2.setBorder(null);
        jScrollPane3.setViewportView(MuestraSelected2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 360, 120));
        getContentPane().add(Proceds, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 130, -1));

        buscador.setName("_BUSCADOR"); // NOI18N
        getContentPane().add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 130, -1));

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/refresh.jpg"))); // NOI18N
        Refresh.setOpaque(false);
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 20, 20));

        btnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/photos/Txt.png"))); // NOI18N
        btnTxt.setOpaque(false);
        getContentPane().add(btnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 50, 50));

        btnJson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/photos/Json.png"))); // NOI18N
        btnJson.setOpaque(false);
        getContentPane().add(btnJson, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 50, 50));

        btnXml.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/photos/Xml.png"))); // NOI18N
        btnXml.setOpaque(false);
        btnXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXmlActionPerformed(evt);
            }
        });
        getContentPane().add(btnXml, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 50, 50));

        Imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Imagen.setMaximumSize(new java.awt.Dimension(60, 60));
        Imagen.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Usuario.setForeground(java.awt.Color.blue);
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 80, 10));

        Logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Logout.setForeground(java.awt.Color.blue);
        Logout.setText("Logout");
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));
        getContentPane().add(ImgPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 90, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/fondo_degradado3.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 671));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153), 2));
        jMenuBar1.setOpaque(false);

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

    private void SIGUIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGUIENTEActionPerformed
        
    }//GEN-LAST:event_SIGUIENTEActionPerformed

    private void ANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANTERIORActionPerformed
        
    }//GEN-LAST:event_ANTERIORActionPerformed

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
       
    }//GEN-LAST:event_primeroActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        
    }//GEN-LAST:event_ultimoActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
       
    }//GEN-LAST:event_VOLVERActionPerformed

    private void MUESTRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUESTRAActionPerformed
 
    }//GEN-LAST:event_MUESTRAActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        
    }//GEN-LAST:event_TABLAMouseClicked

    private void MenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarActionPerformed

    }//GEN-LAST:event_MenuGuardarActionPerformed

    private void ABOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUTActionPerformed

    }//GEN-LAST:event_ABOUTActionPerformed

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

    private void btnXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXmlActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem ABOUT;
    public static javax.swing.JButton ANTERIOR;
    public static javax.swing.JTextField CAJA;
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
    public javax.swing.JMenuItem FormaJson;
    public javax.swing.JMenuItem FormaTxt;
    public javax.swing.JMenuItem FormaXml;
    public static javax.swing.JLabel Imagen;
    public static javax.swing.JLabel ImgPro;
    public static javax.swing.JLabel Logout;
    public javax.swing.JComboBox MUESTRA;
    public javax.swing.JMenuItem MenuGuardar;
    public static javax.swing.JTextArea MuestraSelected;
    public static javax.swing.JTextArea MuestraSelected2;
    public static javax.swing.JTextField Proceds;
    public static javax.swing.JButton Refresh;
    public static javax.swing.JButton SIGUIENTE;
    public static javax.swing.JTable TABLA;
    public static javax.swing.JLabel Usuario;
    public javax.swing.JButton VOLVER;
    public static javax.swing.JButton btnJson;
    public static javax.swing.JButton btnTxt;
    public static javax.swing.JButton btnXml;
    public static javax.swing.JTextField buscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JButton primero;
    public static javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
