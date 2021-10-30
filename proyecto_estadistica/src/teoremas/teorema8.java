/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoremas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import vistas.menu2;

/**
 *
 * @author edgar
 */
public class teorema8 extends javax.swing.JFrame {

    ArrayList<String> dato = new ArrayList<String>();
    double contador = -1;
    double resul = 0.00, valor = 0.00;
    String parcial, conver;

    public teorema8() {
        initComponents();
        this.setLocationRelativeTo(null);
        numero.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero = new javax.swing.JTextField();
        btnmini = new javax.swing.JLabel();
        resu = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        regreso = new javax.swing.JLabel();
        btncerrrar = new javax.swing.JLabel();
        btncalc = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 195, 80, 30));

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
        getContentPane().add(resu, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 410, 420, 30));

        texto2.setFont(new java.awt.Font("Arial Black", 0, 32)); // NOI18N
        texto2.setForeground(new java.awt.Color(8, 0, 65));
        texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 390, 30));

        regreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnida-11.png"))); // NOI18N
        regreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresoMouseClicked(evt);
            }
        });
        getContentPane().add(regreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, -1, -1));

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
        getContentPane().add(btncalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btn-16.png"))); // NOI18N
        btnlimpiar.setToolTipText("");
        btnlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        fondo.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        fondo.setForeground(new java.awt.Color(8, 0, 65));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoteo8.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            contador++;
            dato.add(numero.getText());
            numero.setText("");
            parcial = texto2.getText();
            //AGREGAR A PANTALLA
            for (int i = 0; i <= contador; i++) {
                texto2.setText(parcial + dato.get(i) + "+");
            }
        }

    }//GEN-LAST:event_numeroKeyPressed

    private void btnminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminiMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminiMouseClicked

    private void btncerrrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncerrrarMouseClicked

    private void btncalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncalcMouseClicked

        //numero.setVisible(false);

        for (int i = 0; i <= contador; i++) {
            valor = Double.parseDouble(dato.get(i));
            resul += valor;

        }

        resu.setText(String.valueOf("R// " + resul));


    }//GEN-LAST:event_btncalcMouseClicked

    private void btncalcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncalcKeyPressed

    }//GEN-LAST:event_btncalcKeyPressed

    private void btnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarMouseClicked
        dato.clear();
        contador = -1;
        resul = 0.00;
        valor = 0.00;
        parcial = "";
        conver = "";
        texto2.setText("");
        numero.setText("");
        resu.setText("");
    }//GEN-LAST:event_btnlimpiarMouseClicked

    private void regresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresoMouseClicked
        menu2 ventana2 = new menu2();
        ventana2.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresoMouseClicked

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
            java.util.logging.Logger.getLogger(teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teorema8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teorema8().setVisible(true);
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
    private javax.swing.JLabel regreso;
    private javax.swing.JLabel resu;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
