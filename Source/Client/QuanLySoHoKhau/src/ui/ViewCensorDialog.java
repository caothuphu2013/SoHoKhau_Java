package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import model.KiemDuyet;
import model.YeuCau;
import org.apache.http.client.HttpClient;
import supporter.HttpSupporter;
import supporter.JSONResponse;

public class ViewCensorDialog extends javax.swing.JDialog {

    private HttpClient client;
    private KiemDuyet model;

    public ViewCensorDialog(java.awt.Frame parent, boolean modal, HttpClient _Client, KiemDuyet _model) {
        super(parent, modal);

        initComponents();
        client = _Client;
        model = _model;

        CustomInitComponents();
        tfTieuDe.setText(_model.getTieuDe());

        String strNoiDung = new String();
        strNoiDung += "-Trước khi thay đổi:\n";
        strNoiDung += _model.getTruocKhiThayDoi().toString();
        strNoiDung += "-Sau khi thay đổi:\n";
        strNoiDung += _model.getSauKhiThayDoi().toString();;

        tfNoiDung.setText(strNoiDung);
    }

    public void CustomInitComponents() {
        ScaleImageIcon("resource\\images\\sbanner.png", jLabel1);
        tfTieuDe.setEditable(false);
        tfNoiDung.setEditable(false);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tfNoiDung = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfTieuDe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfTraLoi = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        btnAgree = new javax.swing.JButton();
        btnRep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfNoiDung.setColumns(20);
        tfNoiDung.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfNoiDung.setRows(5);
        jScrollPane2.setViewportView(tfNoiDung);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 370, 109));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tiêu đề");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nội dung");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 90, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 30, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, 520, 80));

        tfTieuDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(tfTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 370, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trả lời");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 335, 70, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(":");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 40));

        tfTraLoi.setColumns(20);
        tfTraLoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfTraLoi.setRows(5);
        jScrollPane1.setViewportView(tfTraLoi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 370, 100));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnClose.setForeground(new java.awt.Color(49, 166, 72));
        btnClose.setText("Đóng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 110, 30));

        btnAgree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgree.setForeground(new java.awt.Color(49, 166, 72));
        btnAgree.setText("Đồng ý");
        btnAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgree, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 120, 30));

        btnRep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRep.setForeground(new java.awt.Color(49, 166, 72));
        btnRep.setText("Từ chối");
        btnRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepActionPerformed(evt);
            }
        });
        jPanel1.add(btnRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreeActionPerformed
        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
        listParams.add(new Pair("cmnd", model.getSauKhiThayDoi().getCMND()));
        listParams.add(new Pair("idsohokhau", model.getIDSoHoKhau()));

        JSONResponse JSRes = HttpSupporter.sendGetRequest(client, HttpSupporter.URLChapNhanKiemDuyet, listParams);
        JOptionPane.showMessageDialog(this, JSRes.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        ModApp parent = (ModApp) this.getParent();
        parent.LoadDSCanKiemDuyet();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAgreeActionPerformed

    private void btnRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepActionPerformed
        // TODO add your handling code here:

        if (tfTraLoi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập trả lời !");
            return;
        } else {
            List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
            listParams.add(new Pair("cmnd", model.getSauKhiThayDoi().getCMND()));
            listParams.add(new Pair("idsohokhau", model.getIDSoHoKhau()));
            listParams.add(new Pair("traloi", tfTraLoi.getText()));

            JSONResponse JSRes = HttpSupporter.sendGetRequest(client, HttpSupporter.URLTuChoiKiemDuyet, listParams);
            JOptionPane.showMessageDialog(this, JSRes.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            ModApp parent = (ModApp) this.getParent();
            parent.LoadDSCanKiemDuyet();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnRepActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCensorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCensorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCensorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCensorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewCensorDialog dialog = new ViewCensorDialog(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JButton btnRep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tfNoiDung;
    private javax.swing.JTextField tfTieuDe;
    private javax.swing.JTextArea tfTraLoi;
    // End of variables declaration//GEN-END:variables
}
