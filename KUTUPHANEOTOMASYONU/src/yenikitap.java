
 import java.sql.*;
import javax.swing.JOptionPane;

import proje.Connectionprovider;
 
public class yenikitap extends javax.swing.JFrame {

    
    public yenikitap() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblkitapfiyati = new javax.swing.JLabel();
        lblkitapbasimyili = new javax.swing.JLabel();
        lblkitapyayini = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnkayıt = new javax.swing.JButton();
        lblkitapno = new javax.swing.JLabel();
        btncikiskitap = new javax.swing.JButton();
        lblkitapadi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lblkitapfiyati.setBackground(new java.awt.Color(0, 0, 0));
        lblkitapfiyati.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblkitapfiyati.setForeground(new java.awt.Color(0, 0, 0));
        lblkitapfiyati.setText("Kitap Fiyatı :");

        lblkitapbasimyili.setBackground(new java.awt.Color(0, 0, 0));
        lblkitapbasimyili.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblkitapbasimyili.setForeground(new java.awt.Color(0, 0, 0));
        lblkitapbasimyili.setText("Kitap Basım Yılı :");

        lblkitapyayini.setBackground(new java.awt.Color(0, 0, 0));
        lblkitapyayini.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblkitapyayini.setForeground(new java.awt.Color(0, 0, 0));
        lblkitapyayini.setText("Kitap Yayını :");

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField3.setBackground(new java.awt.Color(255, 255, 204));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnkayıt.setText("KAYDET");
        btnkayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkayıtActionPerformed(evt);
            }
        });

        lblkitapno.setBackground(new java.awt.Color(0, 0, 0));
        lblkitapno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblkitapno.setForeground(new java.awt.Color(0, 0, 0));
        lblkitapno.setText("Kitap Numarası :");

        btncikiskitap.setText("ÇIKIŞ");
        btncikiskitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikiskitapActionPerformed(evt);
            }
        });

        lblkitapadi.setBackground(new java.awt.Color(0, 0, 0));
        lblkitapadi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblkitapadi.setForeground(new java.awt.Color(0, 0, 0));
        lblkitapadi.setText("Kitap Adı :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblkitapyayini, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblkitapadi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblkitapfiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblkitapno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblkitapbasimyili)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnkayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btncikiskitap, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField5))))
                .addContainerGap(743, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkitapno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkitapadi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkitapyayini, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkitapfiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkitapbasimyili, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkayıt)
                    .addComponent(btncikiskitap))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btncikiskitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikiskitapActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_btncikiskitapActionPerformed

    private void btnkayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkayıtActionPerformed

        String kitap_numarasi=jTextField1.getText();
        String kitap_adi=jTextField2.getText();
        String kitap_yayini=jTextField3.getText();
        String kitap_fiyati=jTextField4.getText();
        String kitap_basimyili=jTextField5.getText();
        

       String sql="INSERT INTO kitaplar (kitap_numarasi, kitap_adi, kitap_yayini, kitap_fiyati, kitap_basimyili) VALUES ( ?, ?, ?, ?, ?)";

        
        try
        {
            Connection con=DatabaseConnection.getConnection();
        PreparedStatement preparedStatement=con.prepareStatement(sql);
        preparedStatement.setString(1, kitap_numarasi);
        preparedStatement.setString(2, kitap_adi);
        preparedStatement.setString(3, kitap_yayini);
        preparedStatement.setString(4, kitap_fiyati);
        preparedStatement.setString(5, kitap_basimyili);

        preparedStatement.executeUpdate();

        JOptionPane.showMessageDialog(null, "İşlem Başarılı...");
        this.dispose();
        new yenikitap().setVisible(true);

        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "işlem başarısız...");
            setVisible(false);
            new yenikitap().setVisible(true);
        }

    }//GEN-LAST:event_btnkayıtActionPerformed

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
            java.util.logging.Logger.getLogger(yenikitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yenikitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yenikitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yenikitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yenikitap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncikiskitap;
    private javax.swing.JButton btnkayıt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblkitapadi;
    private javax.swing.JLabel lblkitapbasimyili;
    private javax.swing.JLabel lblkitapfiyati;
    private javax.swing.JLabel lblkitapno;
    private javax.swing.JLabel lblkitapyayini;
    // End of variables declaration//GEN-END:variables
}
