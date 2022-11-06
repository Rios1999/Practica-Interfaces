package practicacompartidainterfaces;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaBombilla extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBombilla
     */
    boolean[] bombillas;
    Color encendido = new Color(255,255,0);
    Color apagado = new Color(240,240,240);

    public VentanaBombilla() {
        initComponents();
        bombillas = new boolean[6];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bombilla1 = new javax.swing.JButton();
        Bombilla2 = new javax.swing.JButton();
        Bombilla3 = new javax.swing.JButton();
        Bombilla4 = new javax.swing.JButton();
        Bombilla5 = new javax.swing.JButton();
        Bombilla0 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Bombilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla1ActionPerformed(evt);
            }
        });

        Bombilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla2ActionPerformed(evt);
            }
        });

        Bombilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla3ActionPerformed(evt);
            }
        });

        Bombilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla4ActionPerformed(evt);
            }
        });

        Bombilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla5ActionPerformed(evt);
            }
        });

        Bombilla0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla0ActionPerformed(evt);
            }
        });

        jButton7.setText("Volver a Empezar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Bombilla0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bombilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bombilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bombilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bombilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bombilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bombilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bombilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bombilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bombilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bombilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bombilla0, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bombilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla5ActionPerformed
        cambiaB(5);
        if (bombillas[4] == true) {
            Bombilla4.setBackground(encendido);
        }else{
            Bombilla4.setBackground(apagado);
        }
        ganar();
    }//GEN-LAST:event_Bombilla5ActionPerformed

    private void Bombilla0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla0ActionPerformed
        cambiaB(0);
        if (bombillas[1] == true) {
            Bombilla1.setBackground(encendido);
        }else{
            Bombilla1.setBackground(apagado);
        }
        ganar();
    }//GEN-LAST:event_Bombilla0ActionPerformed

    private void Bombilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla1ActionPerformed
        cambiaB(1);
        if (bombillas[2] == true) {
            Bombilla2.setBackground(encendido);
        }else{
            Bombilla2.setBackground(apagado);
        }
        
        if (bombillas[0] == true) {
            Bombilla0.setBackground(encendido);
        }else{
            Bombilla0.setBackground(apagado);
        }
        ganar();
    }//GEN-LAST:event_Bombilla1ActionPerformed

    private void Bombilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla2ActionPerformed
        cambiaB(2);
        if (bombillas[3] == true) {
            Bombilla3.setBackground(encendido);
        }else{
            Bombilla3.setBackground(apagado);
        }
        
        if (bombillas[1] == true) {
            Bombilla1.setBackground(encendido);
        }else{
            Bombilla1.setBackground(apagado);
        }
        ganar();
    }//GEN-LAST:event_Bombilla2ActionPerformed

    private void Bombilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla3ActionPerformed
        cambiaB(3);
        if (bombillas[4] == true) {
            Bombilla4.setBackground(encendido);
        }else{
            Bombilla4.setBackground(apagado);
        }
        
        if (bombillas[2] == true) {
            Bombilla2.setBackground(encendido);
        }else{
            Bombilla2.setBackground(apagado);
        }
        ganar();
    }//GEN-LAST:event_Bombilla3ActionPerformed

    private void Bombilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla4ActionPerformed
        cambiaB(4);
        if (bombillas[5] == true) {
            Bombilla5.setBackground(encendido);
        }else{
            Bombilla5.setBackground(apagado);
        }
        
        if (bombillas[3] == true) {
            Bombilla3.setBackground(encendido);
        }else{
            Bombilla3.setBackground(apagado);
        }
        ganar();
    }//GEN-LAST:event_Bombilla4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Apaga();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaBombilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBombilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBombilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBombilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBombilla().setVisible(true);
            }
        });
    }

    private void cambiaB(int pos) {
        if (pos < bombillas.length-1) {
            if (bombillas[pos + 1] != true) {
                bombillas[pos + 1] = true;
            } else {
                bombillas[pos + 1] = false;
            }

        }
        if (pos >  0) {
            if (bombillas[pos - 1] != true) {
                bombillas[pos - 1] = true;
            } else {
                bombillas[pos - 1] = false;
            }

        }
    }
    
    private void Apaga(){
        for (int i = 0; i < bombillas.length; i++) {
            bombillas[i]=false;
        }
        Bombilla0.setBackground(apagado);
        Bombilla1.setBackground(apagado);
        Bombilla2.setBackground(apagado);
        Bombilla3.setBackground(apagado);
        Bombilla4.setBackground(apagado);
        Bombilla5.setBackground(apagado);
    }
    
    private void ganar(){
        boolean G = false;
        for (int i = 0; i < bombillas.length; i++) {
            if (bombillas[i] == true) {
                G = true;
            }else{
                G = false;
                i = bombillas.length;
            }
        }
        if (G) {
            String rt = "bombilla.png";
            ImageIcon incon = new ImageIcon(getClass().getResource(rt));
            JOptionPane.showMessageDialog(this, "Felicidades has conseguido encender todas las bombillas!!", "VICTORIA", JOptionPane.INFORMATION_MESSAGE, incon);
            Apaga();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bombilla0;
    private javax.swing.JButton Bombilla1;
    private javax.swing.JButton Bombilla2;
    private javax.swing.JButton Bombilla3;
    private javax.swing.JButton Bombilla4;
    private javax.swing.JButton Bombilla5;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables

}
