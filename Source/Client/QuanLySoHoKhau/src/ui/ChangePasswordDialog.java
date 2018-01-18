package ui;

import java.awt.Color;
import java.awt.Image;
import java.util.*;
import javafx.util.Pair;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import supporter.JSONResponse;
import model.NguoiDung;
import org.apache.http.client.HttpClient;
import supporter.HttpSupporter;

public class ChangePasswordDialog extends javax.swing.JDialog {

    NguoiDung m_NgDung;
    HttpClient client;

    public ChangePasswordDialog(java.awt.Frame parent, boolean modal, HttpClient _client, NguoiDung _NgDung) {
        super(parent, modal);
        initComponents();
        CustomInitComponents();
        client = _client;
        m_NgDung = _NgDung;
    }

    public void CustomInitComponents() {
        ScaleImageIcon("resource\\images\\sbanner.png", jLabel1);
        ScaleImageIcon("resource\\images\\slogo.png", jLabel5);
        tfPasswordHienTai.setBackground(new Color(0, 0, 0, 0));
        tfPasswordMoi.setBackground(new Color(0, 0, 0, 0));
        tfNhapLaiPassword.setBackground(new Color(0, 0, 0, 0));
        btnDoiMatKhau.setBackground(Color.white);
        pnlBody.setBackground(new Color(0, 0, 0, 80));
    }

    public void ScaleImageIcon(String path, JLabel lbl) {
        ImageIcon icoBanner = new ImageIcon(path);
        Image img = icoBanner.getImage();
        Image newImg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lbl.setIcon(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNhapLaiPassword = new javax.swing.JPasswordField();
        tfPasswordMoi = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tfPasswordHienTai = new javax.swing.JPasswordField();
        pnlBody = new javax.swing.JPanel();
        btnDoiMatKhau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 520));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 30, 540, 80);

        jLabel5.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(620, 420, 70, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Powered by ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 450, 88, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật khẩu mới");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 230, 108, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu hiện tại");
        jLabel3.setMaximumSize(new java.awt.Dimension(128, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(128, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(128, 20));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 180, 138, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nhập lại mật khẩu");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 280, 144, 22);

        tfNhapLaiPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNhapLaiPassword.setForeground(new java.awt.Color(255, 255, 255));
        tfNhapLaiPassword.setBorder(null);
        jPanel1.add(tfNhapLaiPassword);
        tfNhapLaiPassword.setBounds(355, 280, 195, 22);

        tfPasswordMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPasswordMoi.setForeground(new java.awt.Color(255, 255, 255));
        tfPasswordMoi.setBorder(null);
        jPanel1.add(tfPasswordMoi);
        tfPasswordMoi.setBounds(355, 230, 195, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(305, 181, 8, 21);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(":");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(305, 230, 6, 21);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(305, 280, 6, 21);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(355, 205, 195, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(355, 255, 195, 5);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(355, 305, 195, 10);

        tfPasswordHienTai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPasswordHienTai.setForeground(new java.awt.Color(255, 255, 255));
        tfPasswordHienTai.setBorder(null);
        jPanel1.add(tfPasswordHienTai);
        tfPasswordHienTai.setBounds(355, 180, 195, 22);

        btnDoiMatKhau.setBackground(new java.awt.Color(46, 131, 57));
        btnDoiMatKhau.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(46, 131, 57));
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(pnlBody);
        pnlBody.setBounds(80, 140, 540, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        
        String strPasswordHienTai = new String(tfPasswordHienTai.getPassword());
        String strPasswordMoi = new String(tfPasswordMoi.getPassword());
        String strNhapLaiPassword = new String(tfNhapLaiPassword.getPassword());
        String test = m_NgDung.getThongTinTaiKhoan().getMatKhau();
        
        if (!strPasswordHienTai.equals(m_NgDung.getThongTinTaiKhoan().getMatKhau()))
        {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu hiện tại không chính xác");
        }
        else if (strPasswordHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu hiện tại trống");
        } else if (strPasswordMoi.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu mới trống");
        } else if (strNhapLaiPassword.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nhập lại mật khẩu trống");
        } else if (!strPasswordMoi.equals(strNhapLaiPassword)) {
            JOptionPane.showMessageDialog(rootPane, "Nhập lại mật khẩu không giống mật khẩu mới");
        } else if (strPasswordHienTai.equals(strPasswordMoi)) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu hiện tại trùng mật khẩu mới");
        } else {
            // Code here
            List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
            listParams.add(new Pair("password", strPasswordMoi));
            
            JSONResponse JSResGetDSKiemDuyet = HttpSupporter.sendGetRequest(client, HttpSupporter.URLDoiMatKhau, listParams);
            
            JOptionPane.showMessageDialog(this, JSResGetDSKiemDuyet.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
        }
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangePasswordDialog dialog = new ChangePasswordDialog(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPasswordField tfNhapLaiPassword;
    private javax.swing.JPasswordField tfPasswordHienTai;
    private javax.swing.JPasswordField tfPasswordMoi;
    // End of variables declaration//GEN-END:variables
}
