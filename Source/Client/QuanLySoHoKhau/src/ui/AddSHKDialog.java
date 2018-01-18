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

public class AddSHKDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddSHKDialog
     */
    public AddSHKDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Initialize();
    }

    public void Initialize(){
        ((JTextField)tfNgayLapSo.getDateEditor()).setEditable(false);
        jPanel2.setBackground(new Color(0,0,0,80));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCMNDChuHo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNgayLapSo = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tfNoiCapSo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTenChuHo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        tfMatKhau = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(693, 570));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM SỔ HỘ KHẨU");
        jLabel1.setMaximumSize(new java.awt.Dimension(261, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(261, 34));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(212, 13, 290, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CMND Chủ hộ:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 220, 128, 32);

        tfCMNDChuHo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfCMNDChuHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDChuHoKeyTyped(evt);
            }
        });
        jPanel1.add(tfCMNDChuHo);
        tfCMNDChuHo.setBounds(210, 220, 270, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Địa chỉ:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 290, 73, 32);

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(tfDiaChi);
        tfDiaChi.setBounds(210, 290, 270, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày lập sổ:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 360, 111, 32);
        jPanel1.add(tfNgayLapSo);
        tfNgayLapSo.setBounds(210, 360, 270, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nơi cấp sổ:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 430, 95, 32);

        tfNoiCapSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(tfNoiCapSo);
        tfNoiCapSo.setBounds(210, 430, 270, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tên chủ hộ:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 80, 143, 32);

        tfTenChuHo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(tfTenChuHo);
        tfTenChuHo.setBounds(210, 80, 270, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mật khẩu:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 150, 90, 32);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThem.setForeground(new java.awt.Color(49, 166, 72));
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(270, 490, 138, 41);

        tfMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(tfMatKhau);
        tfMatKhau.setBounds(210, 150, 270, 40);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 60, 570, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCMNDChuHoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCMNDChuHoKeyTyped
        // TODO add your handling code here:
        char checkChar = evt.getKeyChar();
        if(!Character.isDigit(checkChar))
        evt.consume();
        if(tfCMNDChuHo.getText().length()>8)
        evt.consume();
    }//GEN-LAST:event_tfCMNDChuHoKeyTyped

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String strTenChuHo = tfTenChuHo.getText();
        String strNgayLapSo = ((JTextField)tfNgayLapSo.getDateEditor().getUiComponent()).getText();
        String strMatKhau = new String(tfMatKhau.getPassword());
        String strDiaChi = tfDiaChi.getText();
        String strNoiCapSo = tfNoiCapSo.getText();
        String strCMNDChuHo = tfCMNDChuHo.getText();

        String pattern = "[a-zA-Zàáảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệýỳỷỹỵúùủũụưứừửữựíìỉĩịóòỏõọôốồổỗộơớờởỡợ\\s*]+";

        int errorFlag = 0;
        if(strTenChuHo.length()<1     || strNgayLapSo.length()<1
            || strMatKhau.length()<1  || strDiaChi.length()<1
            || strNoiCapSo.length()<1 || strCMNDChuHo.length()<1){
            errorFlag = 1;  // Lỗi nhập bỏ trống.
        }
        else{
            if(!strTenChuHo.matches(pattern))
            errorFlag = 2;  // Lỗi nhập sai định dạng họ tên
            else{
                //if(_tuoi <18 )
                if(strCMNDChuHo.length()<9)
                errorFlag = 3;  // CMND sai
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
            JOptionPane.showMessageDialog(rootPane, "CMND chưa đủ 9 kí tự!");
            break;
            default:
            break;
        }
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(AddSHKDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSHKDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSHKDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSHKDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddSHKDialog dialog = new AddSHKDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfCMNDChuHo;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JPasswordField tfMatKhau;
    private com.toedter.calendar.JDateChooser tfNgayLapSo;
    private javax.swing.JTextField tfNoiCapSo;
    private javax.swing.JTextField tfTenChuHo;
    // End of variables declaration//GEN-END:variables
}
