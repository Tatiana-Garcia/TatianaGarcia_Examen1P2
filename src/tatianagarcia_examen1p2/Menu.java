/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tatianagarcia_examen1p2;

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
    private javax.swing.JPanel bg_crud;
    private javax.swing.JPanel bg_main;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_crud;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_eliminar1;
    private javax.swing.JButton jb_ingrese;
    private javax.swing.JButton jb_list;
    private javax.swing.JButton jb_modificar;
    // End of variables declaration//GEN-END:variables
}
