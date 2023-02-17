/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tatianagarcia_examen1p2;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author tatig
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        bg_main.setVisible(true);
        bg_crud.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_agregar = new javax.swing.JFrame();
        bg_agregar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HOST = new javax.swing.JLabel();
        MASK = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        IP = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tipo = new javax.swing.JLabel();
        jt_ip = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jt_mask = new javax.swing.JTextField();
        jt_host = new javax.swing.JTextField();
        PC = new javax.swing.JRadioButton();
        Laptop = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        bg_laptop = new javax.swing.JPanel();
        ALMACEN1 = new javax.swing.JLabel();
        jt_marca = new javax.swing.JTextField();
        HOST3 = new javax.swing.JLabel();
        jt_pantalla = new javax.swing.JTextField();
        HOST5 = new javax.swing.JLabel();
        rgb_si = new javax.swing.JRadioButton();
        rgb_no = new javax.swing.JRadioButton();
        bg_escritorio = new javax.swing.JPanel();
        ALMACEN = new javax.swing.JLabel();
        jt_ram = new javax.swing.JTextField();
        HOST1 = new javax.swing.JLabel();
        jt_almacenimiento = new javax.swing.JTextField();
        HOST4 = new javax.swing.JLabel();
        SSD = new javax.swing.JRadioButton();
        HDD = new javax.swing.JRadioButton();
        bt_add = new javax.swing.JButton();
        btg_PC = new javax.swing.ButtonGroup();
        btg_tipo = new javax.swing.ButtonGroup();
        btg_rgb = new javax.swing.ButtonGroup();
        bg_main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb_crud = new javax.swing.JButton();
        jb_ingrese = new javax.swing.JButton();
        bg_crud = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jb_list = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_agregar = new javax.swing.JButton();
        jb_eliminar1 = new javax.swing.JButton();

        jf_agregar.setMaximumSize(new java.awt.Dimension(600, 500));
        jf_agregar.setMinimumSize(new java.awt.Dimension(600, 500));
        jf_agregar.setPreferredSize(new java.awt.Dimension(600, 500));
        jf_agregar.setSize(new java.awt.Dimension(600, 500));
        jf_agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_agregar.setBackground(new java.awt.Color(204, 204, 204));
        bg_agregar.setMaximumSize(new java.awt.Dimension(600, 500));
        bg_agregar.setMinimumSize(new java.awt.Dimension(600, 500));
        bg_agregar.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Computadora\n");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(183, 183, 183))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );

        bg_agregar.add(jPanel3);
        jPanel3.setBounds(0, 0, 600, 82);

        HOST.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        HOST.setForeground(new java.awt.Color(255, 255, 255));
        HOST.setText("HOST");
        bg_agregar.add(HOST);
        HOST.setBounds(12, 112, 38, 19);

        MASK.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        MASK.setText("MASCARA DE RED:");
        bg_agregar.add(MASK);
        MASK.setBounds(12, 290, 132, 19);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg_agregar.add(jSeparator1);
        jSeparator1.setBounds(12, 175, 208, 20);

        IP.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        IP.setForeground(new java.awt.Color(255, 255, 255));
        IP.setText("IP");
        bg_agregar.add(IP);
        IP.setBounds(12, 201, 13, 19);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg_agregar.add(jSeparator2);
        jSeparator2.setBounds(12, 348, 208, 20);

        tipo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tipo.setText("TIPO:");
        bg_agregar.add(tipo);
        tipo.setBounds(12, 374, 50, 19);

        jt_ip.setBorder(null);
        jt_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_ipActionPerformed(evt);
            }
        });
        bg_agregar.add(jt_ip);
        jt_ip.setBounds(12, 226, 208, 27);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg_agregar.add(jSeparator7);
        jSeparator7.setBounds(12, 259, 208, 19);

        jt_mask.setBorder(null);
        jt_mask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_maskActionPerformed(evt);
            }
        });
        bg_agregar.add(jt_mask);
        jt_mask.setBounds(12, 315, 208, 27);
        bg_agregar.add(jt_host);
        jt_host.setBounds(12, 137, 208, 32);

        PC.setBackground(new java.awt.Color(204, 204, 204));
        btg_PC.add(PC);
        PC.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        PC.setForeground(new java.awt.Color(0, 0, 0));
        PC.setText("PC Escritorio");
        PC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCMouseClicked(evt);
            }
        });
        bg_agregar.add(PC);
        PC.setBounds(12, 401, 130, 26);

        Laptop.setBackground(new java.awt.Color(204, 204, 204));
        btg_PC.add(Laptop);
        Laptop.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Laptop.setForeground(new java.awt.Color(0, 0, 0));
        Laptop.setText("Laptop");
        Laptop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaptopMouseClicked(evt);
            }
        });
        bg_agregar.add(Laptop);
        Laptop.setBounds(12, 435, 91, 26);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setText("Salir\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg_agregar.add(jButton1);
        jButton1.setBounds(503, 434, 66, 28);

        bg_laptop.setBackground(new java.awt.Color(0, 0, 0));
        bg_laptop.setMaximumSize(new java.awt.Dimension(350, 330));
        bg_laptop.setMinimumSize(new java.awt.Dimension(350, 330));
        bg_laptop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALMACEN1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        ALMACEN1.setForeground(new java.awt.Color(255, 255, 255));
        ALMACEN1.setText("Trae RGB?");
        bg_laptop.add(ALMACEN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 50));

        jt_marca.setForeground(new java.awt.Color(255, 255, 255));
        bg_laptop.add(jt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 30));

        HOST3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        HOST3.setForeground(new java.awt.Color(255, 255, 255));
        HOST3.setText("Definicion de pantalla: ");
        bg_laptop.add(HOST3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 50));

        jt_pantalla.setForeground(new java.awt.Color(255, 255, 255));
        bg_laptop.add(jt_pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 30));

        HOST5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        HOST5.setForeground(new java.awt.Color(255, 255, 255));
        HOST5.setText("Marca:");
        bg_laptop.add(HOST5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 50));

        rgb_si.setBackground(new java.awt.Color(0, 0, 0));
        btg_rgb.add(rgb_si);
        rgb_si.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rgb_si.setForeground(new java.awt.Color(255, 255, 255));
        rgb_si.setText("SI");
        bg_laptop.add(rgb_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        rgb_no.setBackground(new java.awt.Color(0, 0, 0));
        btg_rgb.add(rgb_no);
        rgb_no.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rgb_no.setForeground(new java.awt.Color(255, 255, 255));
        rgb_no.setText("NO");
        rgb_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgb_noActionPerformed(evt);
            }
        });
        bg_laptop.add(rgb_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        bg_agregar.add(bg_laptop);
        bg_laptop.setBounds(230, 100, 350, 330);

        bg_escritorio.setBackground(new java.awt.Color(0, 0, 0));
        bg_escritorio.setMaximumSize(new java.awt.Dimension(350, 330));
        bg_escritorio.setMinimumSize(new java.awt.Dimension(350, 330));
        bg_escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALMACEN.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        ALMACEN.setForeground(new java.awt.Color(255, 255, 255));
        ALMACEN.setText("TIpo de almacenimiento:");
        bg_escritorio.add(ALMACEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 50));

        jt_ram.setForeground(new java.awt.Color(255, 255, 255));
        bg_escritorio.add(jt_ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 30));

        HOST1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        HOST1.setForeground(new java.awt.Color(255, 255, 255));
        HOST1.setText("Capacidad de almacenimiento:");
        bg_escritorio.add(HOST1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 50));

        jt_almacenimiento.setForeground(new java.awt.Color(255, 255, 255));
        bg_escritorio.add(jt_almacenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 30));

        HOST4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        HOST4.setForeground(new java.awt.Color(255, 255, 255));
        HOST4.setText("Capacidad de RAM:");
        bg_escritorio.add(HOST4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 50));

        SSD.setBackground(new java.awt.Color(0, 0, 0));
        SSD.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        SSD.setForeground(new java.awt.Color(255, 255, 255));
        SSD.setText("SSD");
        bg_escritorio.add(SSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        HDD.setBackground(new java.awt.Color(0, 0, 0));
        HDD.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        HDD.setForeground(new java.awt.Color(255, 255, 255));
        HDD.setText("HDD");
        bg_escritorio.add(HDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        bg_agregar.add(bg_escritorio);
        bg_escritorio.setBounds(230, 100, 350, 330);

        bt_add.setBackground(new java.awt.Color(0, 204, 204));
        bt_add.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_add.setText("Agregar\n");
        bt_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addMouseClicked(evt);
            }
        });
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });
        bg_agregar.add(bt_add);
        bt_add.setBounds(230, 440, 90, 30);

        jf_agregar.getContentPane().add(bg_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_main.setBackground(new java.awt.Color(204, 204, 204));
        bg_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg_main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jb_crud.setBackground(new java.awt.Color(0, 0, 0));
        jb_crud.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_crud.setForeground(new java.awt.Color(255, 255, 255));
        jb_crud.setText("INGRESAR PC");
        jb_crud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crudActionPerformed(evt);
            }
        });
        bg_main.add(jb_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 56));

        jb_ingrese.setBackground(new java.awt.Color(0, 0, 0));
        jb_ingrese.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_ingrese.setForeground(new java.awt.Color(255, 255, 255));
        jb_ingrese.setText("CRUD PC");
        jb_ingrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ingreseActionPerformed(evt);
            }
        });
        bg_main.add(jb_ingrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 56));

        getContentPane().add(bg_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        bg_crud.setBackground(new java.awt.Color(204, 204, 204));
        bg_crud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg_crud.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jb_list.setBackground(new java.awt.Color(0, 0, 0));
        jb_list.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_list.setForeground(new java.awt.Color(255, 255, 255));
        jb_list.setText("Listar");
        jb_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listActionPerformed(evt);
            }
        });
        bg_crud.add(jb_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, 40));

        jb_modificar.setBackground(new java.awt.Color(0, 0, 0));
        jb_modificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        bg_crud.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 190, -1, 40));

        jb_eliminar.setBackground(new java.awt.Color(0, 0, 0));
        jb_eliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar.setText("Eliminar");
        bg_crud.add(jb_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 100, 40));

        jb_agregar.setBackground(new java.awt.Color(0, 0, 0));
        jb_agregar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_agregar.setForeground(new java.awt.Color(255, 255, 255));
        jb_agregar.setText("Agregar");
        jb_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarActionPerformed(evt);
            }
        });
        bg_crud.add(jb_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, 40));

        jb_eliminar1.setBackground(new java.awt.Color(204, 0, 51));
        jb_eliminar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jb_eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar1.setText("Salir");
        jb_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminar1ActionPerformed(evt);
            }
        });
        bg_crud.add(jb_eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 30));

        getContentPane().add(bg_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ingreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ingreseActionPerformed
        bg_main.setVisible(false);
        bg_crud.setVisible(true);
    }//GEN-LAST:event_jb_ingreseActionPerformed

    private void jb_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_listActionPerformed

    private void jb_crudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crudActionPerformed
        bg_main.setVisible(false);
        //COnsola de Ingresar PC
    }//GEN-LAST:event_jb_crudActionPerformed

    private void jb_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminar1ActionPerformed
        bg_main.setVisible(true);
        bg_crud.setVisible(false);
    }//GEN-LAST:event_jb_eliminar1ActionPerformed

    private void jt_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_ipActionPerformed

    private void jt_maskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_maskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_maskActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jf_agregar.setVisible(false);
        this.setVisible(true);
        bg_crud.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarActionPerformed
        jf_agregar.setVisible(true);
        jf_agregar.setLocationRelativeTo(null);
        bg_crud.setVisible(false);
        this.setVisible(false);
        bg_laptop.setVisible(false);
        bg_escritorio.setVisible(true);
        
    }//GEN-LAST:event_jb_agregarActionPerformed

    private void PCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCMouseClicked
        bg_escritorio.setVisible(true);
        bg_laptop.setVisible(false);
        
    }//GEN-LAST:event_PCMouseClicked

    private void LaptopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopMouseClicked
        bg_escritorio.setVisible(false);
        bg_laptop.setVisible(true);
    }//GEN-LAST:event_LaptopMouseClicked

    private void rgb_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgb_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgb_noActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addMouseClicked
        try{
            String host = jt_host.getText();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt_addMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALMACEN;
    private javax.swing.JLabel ALMACEN1;
    private javax.swing.JRadioButton HDD;
    private javax.swing.JLabel HOST;
    private javax.swing.JLabel HOST1;
    private javax.swing.JLabel HOST3;
    private javax.swing.JLabel HOST4;
    private javax.swing.JLabel HOST5;
    private javax.swing.JLabel IP;
    private javax.swing.JRadioButton Laptop;
    private javax.swing.JLabel MASK;
    private javax.swing.JRadioButton PC;
    private javax.swing.JRadioButton SSD;
    private javax.swing.JPanel bg_agregar;
    private javax.swing.JPanel bg_crud;
    private javax.swing.JPanel bg_escritorio;
    private javax.swing.JPanel bg_laptop;
    private javax.swing.JPanel bg_main;
    private javax.swing.JButton bt_add;
    private javax.swing.ButtonGroup btg_PC;
    private javax.swing.ButtonGroup btg_rgb;
    private javax.swing.ButtonGroup btg_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_crud;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_eliminar1;
    private javax.swing.JButton jb_ingrese;
    private javax.swing.JButton jb_list;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JFrame jf_agregar;
    private javax.swing.JTextField jt_almacenimiento;
    private javax.swing.JTextField jt_host;
    private javax.swing.JTextField jt_ip;
    private javax.swing.JTextField jt_marca;
    private javax.swing.JTextField jt_mask;
    private javax.swing.JTextField jt_pantalla;
    private javax.swing.JTextField jt_ram;
    private javax.swing.JRadioButton rgb_no;
    private javax.swing.JRadioButton rgb_si;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
