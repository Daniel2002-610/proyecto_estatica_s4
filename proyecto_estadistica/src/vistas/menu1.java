/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author edgar
 */
public class menu1 extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu1() {
        initComponents();
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

        teo1 = new javax.swing.JLabel();
        teo2 = new javax.swing.JLabel();
        teo3 = new javax.swing.JLabel();
        teo4 = new javax.swing.JLabel();
        teo5 = new javax.swing.JLabel();
        teo6 = new javax.swing.JLabel();
        btnmini = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        marcador1 = new javax.swing.JLabel();
        marcador2 = new javax.swing.JLabel();
        sigue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teoremas 1");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/teorema1.png"))); // NOI18N
        teo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(teo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        teo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/teorema2.png"))); // NOI18N
        teo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(teo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 120, -1, -1));

        teo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/teorema3.png"))); // NOI18N
        teo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(teo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        teo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/teorema4.png"))); // NOI18N
        teo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(teo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 120, -1, -1));

        teo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/teorema5.png"))); // NOI18N
        teo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(teo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        teo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/teorema6.png"))); // NOI18N
        teo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(teo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 120, -1, -1));

        btnmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn_minimizar.png"))); // NOI18N
        btnmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminiMouseClicked(evt);
            }
        });
        getContentPane().add(btnmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 5, -1, -1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn_cerrar.png"))); // NOI18N
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 5, -1, -1));

        marcador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/marcador1.png"))); // NOI18N
        getContentPane().add(marcador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        marcador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/marcador2.png"))); // NOI18N
        getContentPane().add(marcador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        sigue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnida-11.png"))); // NOI18N
        sigue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sigue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigueMouseClicked(evt);
            }
        });
        getContentPane().add(sigue, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
       System.exit(0);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminiMouseClicked
         this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminiMouseClicked

    private void sigueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigueMouseClicked
       menu2 ventana2 = new menu2();
       ventana2.setVisible(true);
       dispose();
    }//GEN-LAST:event_sigueMouseClicked

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
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel btnmini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel marcador1;
    private javax.swing.JLabel marcador2;
    private javax.swing.JLabel sigue;
    private javax.swing.JLabel teo1;
    private javax.swing.JLabel teo2;
    private javax.swing.JLabel teo3;
    private javax.swing.JLabel teo4;
    private javax.swing.JLabel teo5;
    private javax.swing.JLabel teo6;
    // End of variables declaration//GEN-END:variables
}
