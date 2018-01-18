package ui;

import supporter.*;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.NhanKhau;
import org.apache.http.client.HttpClient;
import supporter.HttpSupporter;

public class CensoringNhanKhauDialog extends javax.swing.JDialog {

    HttpClient client = null;
    public CensoringNhanKhauDialog(java.awt.Frame parent, boolean modal,HttpClient _client, NhanKhau _NhanKhau) {
        super(parent, modal);
        initComponents();
        Initialize();
        CustomInitComponents();
        client = _client;
        setData(_NhanKhau);
    }

    public void Initialize() {
        ((JTextField) tfNgaySinh.getDateEditor()).setEditable(false);
        tfHoVaTen.setEditable(false);
        cbbGioiTinh.setEnabled(false);
        tfQueQuan.setEditable(false);
        tfDanToc.setEditable(false);
        tfTonGiao.setEditable(false);
        tfCMND.setEditable(false);
        tfQHVCH.setEditable(false);
    }

    public void setData(NhanKhau _NhanKhau) {
        ((JTextField) tfNgaySinh.getDateEditor()).setText(_NhanKhau.getThongTinCaNhan().getNgaySinh());
        tfHoVaTen.setText(_NhanKhau.getThongTinCaNhan().getHoTen());
        if (_NhanKhau.getThongTinCaNhan().getGioiTinh().equals("Nam")) {
            cbbGioiTinh.setSelectedIndex(0);
        } else {
            cbbGioiTinh.setSelectedIndex(1);
        }

        tfQueQuan.setText(_NhanKhau.getThongTinCaNhan().getQueQuan());
        tfDanToc.setText(_NhanKhau.getThongTinCaNhan().getDanToc());
        tfTonGiao.setText(_NhanKhau.getThongTinCaNhan().getTonGiao());
        tfCMND.setText(_NhanKhau.getThongTinCaNhan().getCMND());
        tfQHVCH.setText(_NhanKhau.getQuanHe());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfHoVaTen = new javax.swing.JTextField();
        tfQueQuan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        pnlBody = new javax.swing.JPanel();
        tfQHVCH = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        tfCMND = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDanToc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfTonGiao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfTraLoi = new javax.swing.JTextField();
        btnAgree = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 650));

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("NHÂN KHẨU");
        jPanel1.add(lblTieuDe);
        lblTieuDe.setBounds(300, 10, 180, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 90, 83, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày sinh:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 160, 84, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quê quán:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 230, 83, 22);

        tfHoVaTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfHoVaTen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfHoVaTen.setMinimumSize(new java.awt.Dimension(6, 50));
        tfHoVaTen.setPreferredSize(new java.awt.Dimension(60, 40));
        tfHoVaTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHoVaTenKeyTyped(evt);
            }
        });
        jPanel1.add(tfHoVaTen);
        tfHoVaTen.setBounds(270, 80, 395, 40);

        tfQueQuan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQueQuan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfQueQuan.setMinimumSize(new java.awt.Dimension(6, 50));
        tfQueQuan.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfQueQuan);
        tfQueQuan.setBounds(270, 220, 395, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Giới tính:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 160, 72, 22);

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbbGioiTinh.setPreferredSize(new java.awt.Dimension(53, 40));
        cbbGioiTinh.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbbGioiTinhPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(cbbGioiTinh);
        cbbGioiTinh.setBounds(565, 150, 100, 40);

        tfNgaySinh.setDateFormatString("dd/MM/yyyy");
        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNgaySinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNgaySinhKeyTyped(evt);
            }
        });
        jPanel1.add(tfNgaySinh);
        tfNgaySinh.setBounds(270, 150, 166, 40);

        pnlBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfQHVCH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQHVCH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfQHVCH.setPreferredSize(new java.awt.Dimension(6, 40));
        pnlBody.add(tfQHVCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 150, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("QH với chủ hộ:");
        pnlBody.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnClose.setForeground(new java.awt.Color(49, 166, 72));
        btnClose.setText("Đóng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlBody.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 510, 120, 41));

        tfCMND.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfCMND.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfCMND.setMinimumSize(new java.awt.Dimension(6, 50));
        tfCMND.setPreferredSize(new java.awt.Dimension(60, 40));
        tfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDKeyTyped(evt);
            }
        });
        pnlBody.add(tfCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 145, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số CMND:");
        pnlBody.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        tfDanToc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDanToc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfDanToc.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDanToc.setPreferredSize(new java.awt.Dimension(60, 40));
        pnlBody.add(tfDanToc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 145, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dân tộc:");
        pnlBody.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tôn giáo:");
        pnlBody.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        tfTonGiao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfTonGiao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfTonGiao.setMinimumSize(new java.awt.Dimension(6, 50));
        tfTonGiao.setPreferredSize(new java.awt.Dimension(6, 40));
        pnlBody.add(tfTonGiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 145, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trả lời:");
        pnlBody.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
        pnlBody.add(tfTraLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 395, 120));

        btnAgree.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAgree.setForeground(new java.awt.Color(49, 166, 72));
        btnAgree.setText("Đồng ý");
        btnAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreeActionPerformed(evt);
            }
        });
        pnlBody.add(btnAgree, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 120, 41));

        btnReject.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReject.setForeground(new java.awt.Color(49, 166, 72));
        btnReject.setText("Từ chối");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        pnlBody.add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 120, 41));

        jPanel1.add(pnlBody);
        pnlBody.setBounds(70, 60, 660, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfHoVaTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHoVaTenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoVaTenKeyTyped

    private void tfCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCMNDKeyTyped
        // TODO add your handling code here:
        char checkChar = evt.getKeyChar();
        if (!Character.isDigit(checkChar)) {
            evt.consume();
        }
        if (tfCMND.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCMNDKeyTyped

    private void tfNgaySinhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNgaySinhKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgaySinhKeyTyped

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbbGioiTinhPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbbGioiTinhPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        jPanel1.updateUI();
    }//GEN-LAST:event_cbbGioiTinhPopupMenuWillBecomeInvisible

    private void btnAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgreeActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRejectActionPerformed

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
            java.util.logging.Logger.getLogger(CensoringNhanKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CensoringNhanKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CensoringNhanKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CensoringNhanKhauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CensoringNhanKhauDialog dialog = new CensoringNhanKhauDialog(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JButton btnAgree;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReject;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDanToc;
    private javax.swing.JTextField tfHoVaTen;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfQHVCH;
    private javax.swing.JTextField tfQueQuan;
    private javax.swing.JTextField tfTonGiao;
    private javax.swing.JTextField tfTraLoi;
    // End of variables declaration//GEN-END:variables

    private void CustomInitComponents() {
        //To change body of generated methods, choose Tools | Templates.
        pnlBody.setBackground(new Color(0, 0, 0, 80));
    }
}
