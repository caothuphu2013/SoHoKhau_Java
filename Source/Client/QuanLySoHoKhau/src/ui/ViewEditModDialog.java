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
import model.NguoiDung;

public class ViewEditModDialog extends javax.swing.JDialog {

    public ViewEditModDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Initialize();
        CustomInitComponents();
    }
    
    public void Initialize(){
        ((JTextField)tfNgaySinh.getDateEditor()).setEditable(false);
        btnLuu.setEnabled(false);
        tfHoVaTen.setEditable(false);
        cbbGioiTinh.setEnabled(false);
        tfQueQuan.setEditable(false);
        tfDanToc.setEditable(false);
        tfTonGiao.setEditable(false);
        tfCMND.setEditable(false);
        tfSDT.setEditable(false);

    }
    
    public void setData(NguoiDung ng) {
        tfSDT.setText(ng.getThongTinTaiKhoan().getSDT());
        tfHoVaTen.setText(ng.getThongTinCaNhan().getHoTen()); 
        tfCMND.setText(ng.getThongTinCaNhan().getCMND());
        tfDanToc.setText(ng.getThongTinCaNhan().getDanToc());
        tfTonGiao.setText(ng.getThongTinCaNhan().getTonGiao());
        tfQueQuan.setText(ng.getThongTinCaNhan().getQueQuan());
        String gioitinh = ng.getThongTinCaNhan().getGioiTinh();
        if (gioitinh.equals("Nam"))
            cbbGioiTinh.setSelectedIndex(0);
        else
            cbbGioiTinh.setSelectedIndex(1);
        
        ((JTextField)tfNgaySinh.getDateEditor().getUiComponent()).setText(ng.getThongTinCaNhan().getNgaySinh());
        
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
        tfHoVaTen = new javax.swing.JTextField();
        tfQueQuan = new javax.swing.JTextField();
        tfDanToc = new javax.swing.JTextField();
        tfCMND = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfTonGiao = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        btnLuu = new javax.swing.JButton();
        btnThayDoi = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("NGƯỜI KIỂM DUYỆT");
        jPanel1.add(lblTieuDe);
        lblTieuDe.setBounds(270, 10, 310, 34);

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Giới tính:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(480, 160, 72, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tôn giáo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 300, 76, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SĐT:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(470, 370, 40, 22);

        tfTonGiao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfTonGiao.setMinimumSize(new java.awt.Dimension(6, 50));
        tfTonGiao.setPreferredSize(new java.awt.Dimension(6, 40));
        jPanel1.add(tfTonGiao);
        tfTonGiao.setBounds(560, 290, 105, 40);

        tfSDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfSDT.setMinimumSize(new java.awt.Dimension(6, 50));
        tfSDT.setPreferredSize(new java.awt.Dimension(6, 40));
        tfSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSDTActionPerformed(evt);
            }
        });
        tfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSDTKeyTyped(evt);
            }
        });
        jPanel1.add(tfSDT);
        tfSDT.setBounds(515, 360, 150, 40);

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

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(49, 166, 72));
        btnLuu.setText("LƯU");
        btnLuu.setToolTipText("Lưu thông tin");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setName("btnLuu"); // NOI18N
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(530, 430, 135, 41);

        btnThayDoi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThayDoi.setForeground(new java.awt.Color(49, 166, 72));
        btnThayDoi.setText("THAY ĐỔI");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnThayDoi);
        btnThayDoi.setBounds(360, 430, 135, 41);

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel1.add(pnlBody);
        pnlBody.setBounds(70, 60, 660, 440);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

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

    private void tfSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSDTKeyTyped
        // TODO add your handling code here:
        char checkChar = evt.getKeyChar();
        if(!Character.isDigit(checkChar))
        evt.consume();
        if(tfSDT.getText().length()>10)
        evt.consume();
    }//GEN-LAST:event_tfSDTKeyTyped

    private void tfNgaySinhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNgaySinhKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgaySinhKeyTyped

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String strHoTen = tfHoVaTen.getText();
        String strNgaySinh = ((JTextField)tfNgaySinh.getDateEditor().getUiComponent()).getText();
        String strGioiTinh = cbbGioiTinh.getSelectedItem().toString();
        String strQueQuan = tfQueQuan.getText();
        String strDanToc = tfDanToc.getText();
        String strTonGiao = tfTonGiao.getText();
        String strCMND = tfCMND.getText();
        String strSDT = tfSDT.getText();
        
        String patternName = "[a-zA-Zàáảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệýỳỷỹỵúùủũụưứừửữựíìỉĩịóòỏõọôốồổỗộơớờởỡợ\\s*]+";
        String patternSDT = "0\\d{9,10}";

        Date _today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(_today);
        int _namHienTai = cal.get(Calendar.YEAR);

        Date _ngaySinh = new Date();
        try {
            _ngaySinh = sdf.parse(strNgaySinh);
        } catch (ParseException ex) {
            Logger.getLogger(ViewEditModDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        cal.setTime(_ngaySinh);
        int _namSinh = cal.get(Calendar.YEAR);

        int _tuoi = _namHienTai - _namSinh;

        int errorFlag = 0;
        if(    strHoTen.length()<1        || strNgaySinh.length()<1
            || strQueQuan.length()<1
            || strDanToc.length()<1       || strTonGiao.length()<1
            || strCMND.length()<1         || strSDT.length()<1
            ){
            errorFlag = 1;  // Lỗi nhập bỏ trống.
        }
        else{
            if(!strHoTen.matches(patternName))
            errorFlag = 2;  // Lỗi nhập sai định dạng họ tên
            else{
                if(_tuoi <18 )
                errorFlag = 3;  // Lỗi nhập chưa đủ tuổi
                else{
                    if(strCMND.length()<9)
                    errorFlag = 4;  // CMND sai định dạng
                    else{
                        if(!strSDT.matches(patternSDT))
                        errorFlag = 5;  // Lỗi nhập sai định dạng Sđt
                    }
                }
            }
        }
        switch(errorFlag){
            case 0:
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            dispose();
            break;
            case 1:
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đủ dữ liệu!");
            break;
            case 2:
            JOptionPane.showMessageDialog(rootPane, "Họ tên sai định dạng!");
            break;
            case 3:
            JOptionPane.showMessageDialog(rootPane, "Chưa đủ tuổi!");
            break;
            case 4:
            JOptionPane.showMessageDialog(rootPane, "CMND chưa đủ 9 kí tự!");
            break;
            case 5:
            JOptionPane.showMessageDialog(rootPane, "SĐT phải có dạng 0xxxxxxxxxx!");
            break;
            default:
            break;
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        // TODO add your handling code here:
        btnLuu.setEnabled(true);
        tfHoVaTen.setEditable(true);
        cbbGioiTinh.setEnabled(true);
        tfQueQuan.setEditable(true);
        tfDanToc.setEditable(true);
        tfTonGiao.setEditable(true);
        //tfCMND.setEditable(true);
        tfSDT.setEditable(true);
        btnThayDoi.setEnabled(false);
    }//GEN-LAST:event_btnThayDoiActionPerformed

    private void tfSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSDTActionPerformed

    private void cbbGioiTinhPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbbGioiTinhPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
         jPanel1.updateUI();
    }//GEN-LAST:event_cbbGioiTinhPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(ViewEditModDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditModDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditModDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditModDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEditModDialog dialog = new ViewEditModDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JComboBox<String> cbbGioiTinh;
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
    private javax.swing.JTextField tfQueQuan;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTonGiao;
    // End of variables declaration//GEN-END:variables

    private void CustomInitComponents() {
        //To change body of generated methods, choose Tools | Templates.
        pnlBody.setBackground(new Color(0,0,0,80));
    }
}
