
package teoremas;

import java.awt.event.KeyEvent;


public class teorema1 extends javax.swing.JFrame {
 int valor;
 long resul=1;
   
    public teorema1() {
        initComponents();
         this.setLocationRelativeTo(null);
         numero.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero = new javax.swing.JTextField();
        btnmini = new javax.swing.JLabel();
        btncerrrar = new javax.swing.JLabel();
        resu = new javax.swing.JLabel();
        btncalc = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        numero.setForeground(new java.awt.Color(8, 0, 65));
        numero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero.setBorder(null);
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });
        numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroKeyPressed(evt);
            }
        });
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        btnmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn_minimizar.png"))); // NOI18N
        btnmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminiMouseClicked(evt);
            }
        });
        getContentPane().add(btnmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 5, -1, -1));

        btncerrrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn_cerrar.png"))); // NOI18N
        btncerrrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrarMouseClicked(evt);
            }
        });
        getContentPane().add(btncerrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 5, -1, -1));

        resu.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        resu.setForeground(new java.awt.Color(8, 0, 65));
        resu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(resu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 310, -1));

        btncalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn-15.png"))); // NOI18N
        btncalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncalcMouseClicked(evt);
            }
        });
        btncalc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btncalcKeyPressed(evt);
            }
        });
        getContentPane().add(btncalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn-16.png"))); // NOI18N
        btnlimpiar.setToolTipText("");
        btnlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo01.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncerrrarMouseClicked

    private void btnminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminiMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminiMouseClicked

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyPressed
 if(evt.getKeyCode() == KeyEvent.VK_ENTER){
     valor=Integer.parseInt(numero.getText());
     resu.setText(String.valueOf(valor)+"! " + "= ");
     numero.setText("");
     } 
    }//GEN-LAST:event_numeroKeyPressed

    private void btncalcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncalcKeyPressed
       
    }//GEN-LAST:event_btncalcKeyPressed

    private void btncalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncalcMouseClicked
        for( int i = 1; i <= valor; i++ ) {
         resul *= i;
      }
       resu.setText(String.valueOf(valor)+"! " + "= "+String.valueOf(resul));
    }//GEN-LAST:event_btncalcMouseClicked

    private void btnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarMouseClicked
        resu.setText("");
    }//GEN-LAST:event_btnlimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teorema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teorema1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncalc;
    private javax.swing.JLabel btncerrrar;
    private javax.swing.JLabel btnlimpiar;
    private javax.swing.JLabel btnmini;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField numero;
    private javax.swing.JLabel resu;
    // End of variables declaration//GEN-END:variables
}
