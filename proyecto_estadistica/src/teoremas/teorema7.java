/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoremas;

import java.awt.event.KeyEvent;

/**
 *
 * @author edgar
 */
public class teorema7 extends javax.swing.JFrame {

   String parcial;
   double valora,valorb,valorc,resultado=0.00;
    public teorema7() {
        initComponents();
        this.setLocationRelativeTo(null);
        numero.setBackground(new java.awt.Color(0, 0, 0, 1));
        numero2.setBackground(new java.awt.Color(0, 0, 0, 1));
        numero3.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero3 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        btnmini = new javax.swing.JLabel();
        resu = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        btncerrrar = new javax.swing.JLabel();
        btncalc = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero3.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        numero3.setForeground(new java.awt.Color(8, 0, 65));
        numero3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero3.setBorder(null);
        numero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numero3MouseClicked(evt);
            }
        });
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });
        numero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numero3KeyPressed(evt);
            }
        });
        getContentPane().add(numero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 198, 60, 30));

        numero2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        numero2.setForeground(new java.awt.Color(8, 0, 65));
        numero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero2.setBorder(null);
        numero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numero2MouseClicked(evt);
            }
        });
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        numero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numero2KeyPressed(evt);
            }
        });
        getContentPane().add(numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 198, 60, 30));

        numero.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
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
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 198, 60, 30));

        btnmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn_minimizar.png"))); // NOI18N
        btnmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminiMouseClicked(evt);
            }
        });
        getContentPane().add(btnmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        resu.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        resu.setForeground(new java.awt.Color(8, 0, 65));
        resu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(resu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 410, 30));

        texto2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        texto2.setForeground(new java.awt.Color(8, 0, 65));
        texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 400, 30));

        texto1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        texto1.setForeground(new java.awt.Color(8, 0, 65));
        texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 400, 30));

        btncerrrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn_cerrar.png"))); // NOI18N
        btncerrrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrarMouseClicked(evt);
            }
        });
        getContentPane().add(btncerrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

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
        getContentPane().add(btncalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn-16.png"))); // NOI18N
        btnlimpiar.setToolTipText("");
        btnlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        fondo.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        fondo.setForeground(new java.awt.Color(8, 0, 65));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoteo7.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2MouseClicked

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           parcial=texto2.getText();
           texto2.setText(parcial+"+"+numero2.getText());
           valorb=Double.parseDouble(numero2.getText());
           numero2.setText("");
           numero3.requestFocus();
        }
    }//GEN-LAST:event_numero2KeyPressed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            texto1.setText("P(AUB) = P(A) + P(B)- P(A ∩ B) = ");
            texto2.setText(numero.getText());
            valora=Double.parseDouble(numero.getText());
            numero.setText("");
            numero2.requestFocus();

        }
    }//GEN-LAST:event_numeroKeyPressed

    private void btnminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminiMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminiMouseClicked

    private void btncerrrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncerrrarMouseClicked

    private void btncalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncalcMouseClicked
     resultado=(valora+valorb)-valorc;
     resu.setText(String.format("R// "+ "%.2f",resultado));
    
    }//GEN-LAST:event_btncalcMouseClicked

    private void btncalcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncalcKeyPressed

    }//GEN-LAST:event_btncalcKeyPressed

    private void btnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarMouseClicked
       
    }//GEN-LAST:event_btnlimpiarMouseClicked

    private void numero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_numero3MouseClicked

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero3KeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           parcial=texto2.getText();
           texto2.setText(parcial+"-"+numero3.getText());
           valorc=Double.parseDouble(numero3.getText());
           numero3.setText("");

         
        }
    }//GEN-LAST:event_numero3KeyPressed

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
            java.util.logging.Logger.getLogger(teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teorema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teorema7().setVisible(true);
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
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField numero3;
    private javax.swing.JLabel resu;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
