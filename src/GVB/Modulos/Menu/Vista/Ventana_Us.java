/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GVB.Modulos.Menu.Vista;

import javax.swing.UIManager;

/**
 *
 * @author Vinche
 */
public class Ventana_Us extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Us
     */
    public Ventana_Us() {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){}
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

        jPanel1 = new javax.swing.JPanel();
        btnPerf = new javax.swing.JButton();
        bntProd = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/Avatar/user-defec.png"))); // NOI18N
        btnPerf.setOpaque(false);
        jPanel1.add(btnPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 81, 69));

        bntProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/Productos.jpg"))); // NOI18N
        bntProd.setBorderPainted(false);
        bntProd.setOpaque(false);
        jPanel1.add(bntProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 80, 69));

        btnAbout.setOpaque(false);
        jPanel1.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 81, 69));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Perfil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Productos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 190, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/verde2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 100, 310));

        Imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LogOut.setText("Log Out");
        LogOut.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/photos/Fastburger.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GVB/img/verde2.jpg"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOut)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(LogOut)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    /**
     * @param args the command line arguments
     */
    

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
    public javax.swing.JMenuItem FormaJson;
    public javax.swing.JMenuItem FormaTxt;
    public javax.swing.JMenuItem FormaXml;
    public static javax.swing.JLabel Imagen;
    public static javax.swing.JButton LogOut;
    public javax.swing.JMenuItem MenuGuardar;
    public static javax.swing.JLabel Usuario;
    public static javax.swing.JButton bntProd;
    private javax.swing.JButton btnAbout;
    public static javax.swing.JButton btnPerf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
