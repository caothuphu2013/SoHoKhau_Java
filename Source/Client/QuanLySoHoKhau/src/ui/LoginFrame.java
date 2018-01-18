package ui;

import supporter.JSONResponse;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import model.*;
import static model.NguoiDung.JSONValue_LoaiTaiKhoan;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.simple.JSONObject;
import supporter.HttpSupporter;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        CustomInitComponents();
    }

    public void CustomInitComponents() {
        pnlBody.setBackground(new Color(0, 0, 0, 80));
        tfTenDangNhap.setBackground(new Color(0, 0, 0, 0));
        tfMatKhau.setBackground(new Color(0, 0, 0, 0));
        ScaleImageIcon("resource\\images\\sbanner.png", jLabel1);
        ScaleImageIcon("resource\\images\\slogo.png", jLabel5);
        btnDangNhap.setBackground(Color.white);
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
        lblTenDangNhap = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        tfTenDangNhap = new javax.swing.JTextField();
        tfMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnlBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(700, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(75, 30, 530, 80);

        lblTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblTenDangNhap.setText("Tên đăng nhập:");
        jPanel1.add(lblTenDangNhap);
        lblTenDangNhap.setBounds(103, 187, 126, 22);

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblMatKhau.setText("Mật khẩu:");
        jPanel1.add(lblMatKhau);
        lblMatKhau.setBounds(150, 248, 79, 22);

        tfTenDangNhap.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        tfTenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        tfTenDangNhap.setBorder(null);
        tfTenDangNhap.setMaximumSize(new java.awt.Dimension(300, 50));
        jPanel1.add(tfTenDangNhap);
        tfTenDangNhap.setBounds(255, 182, 300, 30);

        tfMatKhau.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        tfMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        tfMatKhau.setBorder(null);
        jPanel1.add(tfMatKhau);
        tfMatKhau.setBounds(255, 243, 300, 30);

        btnDangNhap.setBackground(new java.awt.Color(46, 131, 57));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(46, 131, 57));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap);
        btnDangNhap.setBounds(255, 304, 199, 50);

        jLabel5.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(609, 377, 70, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Powered by ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(514, 403, 88, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(255, 215, 300, 10);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(255, 276, 300, 10);

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(pnlBody);
        pnlBody.setBounds(75, 140, 530, 240);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String url = HttpSupporter.URLHost + "/api/login";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        //post.setHeader("User-Agent", USER_AGENT);
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

        String username = tfTenDangNhap.getText();
        String password = new String(tfMatKhau.getPassword());

        urlParameters.add(new BasicNameValuePair("username", username));
        urlParameters.add(new BasicNameValuePair("password", password));

        try {
            post.setEntity(new UrlEncodedFormEntity(urlParameters));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        HttpResponse response = null;
        try {
            response = client.execute(post);
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

//        System.out.println("\nSending 'POST' request to URL : " + url);
//        System.out.println("Post parameters : " + post.getEntity());
//        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedOperationException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        StringBuffer result = new StringBuffer();
        String line = "";
        try {
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        String res = result.toString();

        JSONResponse JSResLogin = new JSONResponse(res);

        if (!JSResLogin.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(this, JSResLogin.getMessage(), "Thông báo1", JOptionPane.ERROR_MESSAGE);
            return;
        }

        NguoiDung userLogin = new NguoiDung(JSResLogin.getJSValue(), username, password);
        LoaiNguoiDung type = userLogin.getLoaiNguoiDung();

        if (type == LoaiNguoiDung.CITIZEN) {
            setVisible(false);
            try {
                new ChuHoApp(userLogin, client).setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }

        } else if (type == LoaiNguoiDung.MOD) {
            setVisible(false);
            new ModApp(userLogin, client).setVisible(true);
        } else if (type == LoaiNguoiDung.ADMIN) {
            setVisible(false);
            new AdminApp(userLogin, client).setVisible(true);
        }
        dispose();
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPasswordField tfMatKhau;
    private javax.swing.JTextField tfTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
