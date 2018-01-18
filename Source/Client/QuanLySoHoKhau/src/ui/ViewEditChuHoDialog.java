package ui;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.SoHoKhau;

public class ViewEditChuHoDialog extends javax.swing.JDialog {

    SoHoKhau model;
    
    public ViewEditChuHoDialog(java.awt.Frame parent, boolean modal, SoHoKhau _model) {
        super(parent, modal);
        initComponents();
        Initialize();
        model = _model;
        CustomInitComponents();
        fillData();
    }
    
    void fillData()
    {
        if(model != null)
        {
            lblTieuDe.setText("Sổ hộ khẩu: " + model.getThongTinSoHoKhau().getIDSoHoKhau());
            tfHoVaTen.setText(model.getThongTinSoHoKhau().getThongTinChuHo().getHoTen());
            tfCMND.setText(model.getThongTinSoHoKhau().getThongTinChuHo().getCMND());
            tfNgaySinh.setText(model.getThongTinSoHoKhau().getThongTinChuHo().getNgaySinh());
            
            if (model.getThongTinSoHoKhau().getThongTinChuHo().getGioiTinh().equals("Nam"))
            {
                cbbGioiTinh.setSelectedIndex(0);
            }
            else cbbGioiTinh.setSelectedIndex(1);
            
            tfQueQuan.setText(model.getThongTinSoHoKhau().getThongTinChuHo().getQueQuan());
            tfDanToc.setText(model.getThongTinSoHoKhau().getThongTinChuHo().getDanToc());
            tfTonGiao.setText(model.getThongTinSoHoKhau().getThongTinChuHo().getTonGiao());
            tfNgayLapSo.setText(model.getThongTinSoHoKhau().getNgayLapSo());
            tfDiaChi.setText(model.getThongTinSoHoKhau().getDiaChi());
        }
    }
    public void Initialize(){

        tfHoVaTen.setEditable(false);
        cbbGioiTinh.setEnabled(false);
        tfQueQuan.setEditable(false);
        tfDanToc.setEditable(false);
        tfTonGiao.setEditable(false);
        tfCMND.setEditable(false);
        tfDiaChi.setEditable(false);
        tfNgaySinh.setEditable(false);
        tfNgayLapSo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfHoVaTen = new javax.swing.JTextField();
        tfQueQuan = new javax.swing.JTextField();
        tfDanToc = new javax.swing.JTextField();
        tfCMND = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfTonGiao = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfNgayLapSo = new javax.swing.JTextField();
        tfNgaySinh = new javax.swing.JTextField();
        tfDanToc1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("Sổ hộ khẩu : ");
        jPanel1.add(lblTieuDe);
        lblTieuDe.setBounds(240, 10, 360, 34);

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dân tộc:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 300, 67, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số CMND:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 370, 81, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Địa chỉ:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 510, 60, 22);

        tfHoVaTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        tfQueQuan.setMinimumSize(new java.awt.Dimension(6, 50));
        tfQueQuan.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfQueQuan);
        tfQueQuan.setBounds(270, 220, 395, 40);

        tfDanToc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDanToc.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDanToc.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfDanToc);
        tfDanToc.setBounds(270, 290, 145, 40);

        tfCMND.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfCMND.setMinimumSize(new java.awt.Dimension(6, 50));
        tfCMND.setPreferredSize(new java.awt.Dimension(60, 40));
        tfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDKeyTyped(evt);
            }
        });
        jPanel1.add(tfCMND);
        tfCMND.setBounds(270, 360, 145, 40);

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDiaChi.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDiaChi.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfDiaChi);
        tfDiaChi.setBounds(270, 500, 395, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Giới tính:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 160, 72, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tôn giáo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 300, 76, 22);

        tfTonGiao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfTonGiao.setMinimumSize(new java.awt.Dimension(6, 50));
        tfTonGiao.setPreferredSize(new java.awt.Dimension(6, 40));
        jPanel1.add(tfTonGiao);
        tfTonGiao.setBounds(560, 290, 105, 40);

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

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnClose.setForeground(new java.awt.Color(49, 166, 72));
        btnClose.setText("Đóng");
        btnClose.setToolTipText("Lưu nhân khẩu");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setName("btnClose"); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);
        btnClose.setBounds(530, 570, 135, 41);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ngày lập sổ:");

        tfNgayLapSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfNgayLapSo.setMinimumSize(new java.awt.Dimension(6, 50));
        tfNgayLapSo.setPreferredSize(new java.awt.Dimension(60, 40));
        tfNgayLapSo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNgayLapSoKeyTyped(evt);
            }
        });

        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfNgaySinh.setMinimumSize(new java.awt.Dimension(6, 50));
        tfNgaySinh.setPreferredSize(new java.awt.Dimension(60, 40));

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(50, 50, 50)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNgayLapSo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNgayLapSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(159, 159, 159))
        );

        jPanel1.add(pnlBody);
        pnlBody.setBounds(70, 60, 660, 570);

        tfDanToc1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDanToc1.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDanToc1.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfDanToc1);
        tfDanToc1.setBounds(270, 290, 145, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(!Character.isDigit(checkChar))
        evt.consume();
        if(tfCMND.getText().length()>8)
        evt.consume();
    }//GEN-LAST:event_tfCMNDKeyTyped

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCloseActionPerformed

    private void cbbGioiTinhPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbbGioiTinhPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
         jPanel1.updateUI();
    }//GEN-LAST:event_cbbGioiTinhPopupMenuWillBecomeInvisible

    private void tfNgayLapSoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNgayLapSoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayLapSoKeyTyped

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
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEditChuHoDialog dialog = new ViewEditChuHoDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDanToc;
    private javax.swing.JTextField tfDanToc1;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoVaTen;
    private javax.swing.JTextField tfNgayLapSo;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfQueQuan;
    private javax.swing.JTextField tfTonGiao;
    // End of variables declaration//GEN-END:variables

    private void CustomInitComponents() {
         //To change body of generated methods, choose Tools | Templates.
         pnlBody.setBackground(new Color(0,0,0,80));
    }
}
