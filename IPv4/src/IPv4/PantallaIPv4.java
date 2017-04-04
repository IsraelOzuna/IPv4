package IPv4;

import javax.swing.JOptionPane;

/**
 *
 * @author Ozuna
 */
public class PantallaIPv4 extends javax.swing.JFrame {
    
    private int ipValor = 0;
    
    public PantallaIPv4() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public int regresaClase(){
        int ipClase;
        
        ipClase = Integer.parseInt(campo1.getText());
               
        if(ipClase >= 0 && ipClase <= 127){
            ipValor = 1;
        }
        if(ipClase >= 128 && ipClase <= 191){
            ipValor = 2;
        }
        if(ipClase >= 192 && ipClase <= 223){
            ipValor = 3;
        }
        
        return ipValor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Calcualr direcciones IPv4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));
        getContentPane().add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, 30));
        getContentPane().add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 80, 30));
        getContentPane().add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 80, 30));

        jLabel2.setText(".");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel3.setText(".");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel4.setText(".");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        bCalcular.setText("Calcular");
        bCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(bCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo1ActionPerformed

    private void bCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularActionPerformed
        
        if(campo1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo está vacío");
        }else{
            
            ipValor = regresaClase();
                switch(ipValor){
                    case 1:
                        JOptionPane.showMessageDialog(null, "IPv4 Clase A. Dirección de red: " + campo1.getText() +".0.0.0 "+ "Dirección de broadcast: "
                            + campo1.getText()+ ".255.255.255 " + "Mascara: 255.0.0.0 /8");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "IPv4 Clase B. Dirección de red: " + campo1.getText() +"." + campo2.getText()+".0.0 "+ 
                                     "Dirección de broadcast: " + campo1.getText()+"." + campo2.getText()+ ".255.255 " + "Mascara: 255.255.0.0 /16");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "IPv4 Clase C . Dirección de red: " + campo1.getText()+"."+ campo2.getText()+ 
                                   "."+campo3.getText() +".0 "+ "Dirección de broadcast: " + campo1.getText()+"." + campo2.getText()+ campo3.getText() + 
                                   ".255 " + "Mascara: 255.255.255.0 /24");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una IPv4 valida");
                        break;
                }
            campo1.setText(null);
            campo2.setText(null);
            campo3.setText(null);
            campo4.setText(null);
        }
    }//GEN-LAST:event_bCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaIPv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaIPv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaIPv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaIPv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaIPv4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
