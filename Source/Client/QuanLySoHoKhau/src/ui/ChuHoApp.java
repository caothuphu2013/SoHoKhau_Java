/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.QuanLyLogController;
import controller.QuanLyNhanKhauController;
import controller.QuanLyThongBaoController;
import controller.QuanLyYeuCauController;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.MouseInfo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import model.*;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import supporter.*;

/**
 *
 * @author MichaelScofield
 */
public class ChuHoApp extends javax.swing.JFrame {

    NguoiDung userLogin = null;
    HttpClient client = null;
    QuanLyLogController qlyLogController = null;
    QuanLyNhanKhauController qlyNhanKhauController = null;
    QuanLyThongBaoController qlyThongBaoController = null;
    QuanLyYeuCauController qlyYeuCauController = null;
    /**
     * Creates new form MainFrame
     */
    public ChuHoApp() {
        initComponents();
        CustomInitComponents();
        
    }

    public ChuHoApp(NguoiDung ngDung, HttpClient _client) {
        client = _client;

        userLogin = ngDung;

        //LoadThongTinSoHoKhau();
        initComponents();
        CustomInitComponents();
        LoadThongTinSoHoKhau();
        this.setTitle("Người chủ hộ: " + userLogin.getThongTinCaNhan().getHoTen().toString());
    }

    public void LoadThongTinLichSu() {

        qlyLogController.updateModel(client, HttpSupporter.URLGetLishSuUngDung, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyLogController.updateView();

    }
    
    public void LoadDanhSachGuiYeuCau()
    {
        qlyYeuCauController.updateModel(client, HttpSupporter.URLGetYeuCau, null);
        qlyYeuCauController.updateView();
    }
    
    public void LoadDanhSachNhanKhau() {

        try {
            qlyNhanKhauController.updateModel(client, HttpSupporter.URLGetNhanKhau, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ChuHoApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        qlyNhanKhauController.updateView();

    }

    public void LoadDanhSachThongBao() {

        qlyThongBaoController.updateModel(client, HttpSupporter.URLGetThongBao, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyThongBaoController.updateView();
    }

    public void LoadThongTinSoHoKhau() {
        lblHoTen.setText(userLogin.getThongTinCaNhan().getHoTen());
        lblNgaySinh.setText(userLogin.getThongTinCaNhan().getNgaySinh());
        lblQueQuan.setText(userLogin.getThongTinCaNhan().getQueQuan());
        lblSoCMND.setText(userLogin.getThongTinCaNhan().getCMND());
        lblGioiTinh.setText(userLogin.getThongTinCaNhan().getGioiTinh());
        lblDanToc.setText(userLogin.getThongTinCaNhan().getDanToc());
    }

    public void CustomInitComponents() {
        //this.setTitle("Chủ hộ - ID: xxxxxxxxxxxx");

        pnlThongTin.setBackground(new Color(0, 0, 0, 80));
        ScaleImageIcon("resource\\images\\banner.png", lblBanner);
        ScaleImageIcon("resource\\images\\menu.png", lblMenu);
        ScaleImageIcon("resource\\images\\quochuy.png", lblQuocHuy);
        ScaleImageIcon("resource\\images\\slogo.png", lblLogo);

        //Xử lý click default tab
        tabMain.setSelectedIndex(0);
        btnTabThongTin.setBackground(new Color(120, 120, 120));
        curTabBtnClick = btnTabThongTin;

        qlyLogController = new QuanLyLogController(new QuanLyLog(), tbDSLog);
        qlyNhanKhauController = new QuanLyNhanKhauController(new QuanLyNhanKhau(), tbDSNhanKhau);
        qlyThongBaoController = new QuanLyThongBaoController(new QuanLyThongBao(), tbDSThongBao);
        qlyYeuCauController = new QuanLyYeuCauController(new QuanLyYeuCau(), tbDSYeuCauHoTro);
        
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

        ppMenu = new javax.swing.JPopupMenu();
        mnuRefresh = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuDoiMatKhau = new javax.swing.JMenuItem();
        mnuDangXuat = new javax.swing.JMenuItem();
        pnlMain = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();
        btnTabThongTin = new javax.swing.JButton();
        btnTabThongBao = new javax.swing.JButton();
        btnTabDSNhanKhau = new javax.swing.JButton();
        btnTabGuiYeuCau = new javax.swing.JButton();
        btnTabLog = new javax.swing.JButton();
        tabMain = new javax.swing.JTabbedPane();
        pnlTTHoKhau = new javax.swing.JPanel();
        lblQuocHuy = new javax.swing.JLabel();
        pnlThongTin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTieuDe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblQueQuan = new javax.swing.JLabel();
        lblSoCMND = new javax.swing.JLabel();
        lblIDSoHoKhau = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblDanToc = new javax.swing.JLabel();
        lblTonGiao = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnlThongBao = new javax.swing.JPanel();
        scDSThongBao = new javax.swing.JScrollPane();
        tbDSThongBao = new javax.swing.JTable();
        pnlDSNhanKhau = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDSNhanKhau = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pnlHoTro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDSYeuCauHoTro = new javax.swing.JTable();
        btnThemYeuCau = new javax.swing.JButton();
        pnlLog = new javax.swing.JPanel();
        scDSLog = new javax.swing.JScrollPane();
        tbDSLog = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        mnuRefresh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuRefresh.setText("Refresh");
        mnuRefresh.setToolTipText("");
        ppMenu.add(mnuRefresh);
        ppMenu.add(jSeparator1);

        mnuDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuDoiMatKhau.setText("Đổi mật khẩu");
        mnuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMatKhauActionPerformed(evt);
            }
        });
        ppMenu.add(mnuDoiMatKhau);

        mnuDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        ppMenu.add(mnuDangXuat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlMain.setBackground(new java.awt.Color(49, 166, 72));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.setForeground(new java.awt.Color(49, 166, 72));
        pnlMain.setToolTipText("");
        pnlMain.setPreferredSize(new java.awt.Dimension(1030, 720));
        pnlMain.setLayout(null);

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        pnlMain.add(lblMenu);
        lblMenu.setBounds(920, 10, 50, 50);
        pnlMain.add(lblBanner);
        lblBanner.setBounds(210, 20, 590, 100);

        btnTabThongTin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabThongTin.setText("Thông tin sổ hộ khẩu");
        btnTabThongTin.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabThongTin);
        btnTabThongTin.setBounds(0, 140, 200, 60);

        btnTabThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabThongBao.setText("Thông báo");
        btnTabThongBao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabThongBao);
        btnTabThongBao.setBounds(200, 140, 200, 60);

        btnTabDSNhanKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabDSNhanKhau.setText("Danh sách nhân khẩu");
        btnTabDSNhanKhau.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabDSNhanKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabDSNhanKhau);
        btnTabDSNhanKhau.setBounds(400, 140, 200, 60);

        btnTabGuiYeuCau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabGuiYeuCau.setText("Hỗ trợ");
        btnTabGuiYeuCau.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabGuiYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabGuiYeuCau);
        btnTabGuiYeuCau.setBounds(600, 140, 200, 60);

        btnTabLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabLog.setText("Lịch sử hoạt động");
        btnTabLog.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabLog);
        btnTabLog.setBounds(800, 140, 200, 60);

        tabMain.setBackground(new java.awt.Color(49, 166, 72));
        tabMain.setForeground(new java.awt.Color(49, 166, 72));
        tabMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlTTHoKhau.setBackground(new java.awt.Color(49, 166, 72));
        pnlTTHoKhau.setLayout(null);
        pnlTTHoKhau.add(lblQuocHuy);
        lblQuocHuy.setBounds(400, 180, 200, 200);

        pnlThongTin.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ tên chủ hộ");
        pnlThongTin.add(jLabel2);
        jLabel2.setBounds(120, 100, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày sinh");
        pnlThongTin.add(jLabel3);
        jLabel3.setBounds(120, 160, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quê quán");
        pnlThongTin.add(jLabel4);
        jLabel4.setBounds(120, 220, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dân tộc");
        pnlThongTin.add(jLabel5);
        jLabel5.setBounds(570, 220, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số CMND");
        pnlThongTin.add(jLabel6);
        jLabel6.setBounds(120, 280, 80, 30);

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("Hộ khẩu số:");
        pnlThongTin.add(lblTieuDe);
        lblTieuDe.setBounds(240, 20, 200, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Giới tính");
        pnlThongTin.add(jLabel9);
        jLabel9.setBounds(570, 160, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tôn giáo");
        pnlThongTin.add(jLabel10);
        jLabel10.setBounds(570, 280, 110, 30);

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(255, 255, 255));
        lblHoTen.setText("Võ Minh Trí");
        pnlThongTin.add(lblHoTen);
        lblHoTen.setBounds(250, 100, 260, 30);

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        lblNgaySinh.setText("15/10/1980");
        pnlThongTin.add(lblNgaySinh);
        lblNgaySinh.setBounds(250, 160, 230, 30);

        lblQueQuan.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblQueQuan.setForeground(new java.awt.Color(255, 255, 255));
        lblQueQuan.setText("Đồng Tháp");
        pnlThongTin.add(lblQueQuan);
        lblQueQuan.setBounds(250, 220, 270, 30);

        lblSoCMND.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblSoCMND.setForeground(new java.awt.Color(255, 255, 255));
        lblSoCMND.setText("015846229");
        pnlThongTin.add(lblSoCMND);
        lblSoCMND.setBounds(250, 280, 150, 30);

        lblIDSoHoKhau.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblIDSoHoKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblIDSoHoKhau.setText("84515154862");
        pnlThongTin.add(lblIDSoHoKhau);
        lblIDSoHoKhau.setBounds(460, 20, 230, 50);

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        lblGioiTinh.setText("Nam");
        pnlThongTin.add(lblGioiTinh);
        lblGioiTinh.setBounds(680, 160, 150, 30);

        lblDanToc.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblDanToc.setForeground(new java.awt.Color(255, 255, 255));
        lblDanToc.setText("Kinh");
        pnlThongTin.add(lblDanToc);
        lblDanToc.setBounds(680, 220, 150, 30);

        lblTonGiao.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblTonGiao.setForeground(new java.awt.Color(255, 255, 255));
        lblTonGiao.setText("Công giáo");
        pnlThongTin.add(lblTonGiao);
        lblTonGiao.setBounds(680, 280, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");
        pnlThongTin.add(jLabel11);
        jLabel11.setBounds(240, 160, 30, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        pnlThongTin.add(jLabel14);
        jLabel14.setBounds(240, 160, 30, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        pnlThongTin.add(jLabel15);
        jLabel15.setBounds(240, 100, 30, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(":");
        pnlThongTin.add(jLabel16);
        jLabel16.setBounds(240, 220, 30, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(":");
        pnlThongTin.add(jLabel19);
        jLabel19.setBounds(670, 160, 30, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(":");
        pnlThongTin.add(jLabel20);
        jLabel20.setBounds(670, 220, 30, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(":");
        pnlThongTin.add(jLabel22);
        jLabel22.setBounds(670, 280, 30, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(":");
        pnlThongTin.add(jLabel23);
        jLabel23.setBounds(240, 280, 30, 30);

        pnlTTHoKhau.add(pnlThongTin);
        pnlThongTin.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab1", pnlTTHoKhau);
        pnlTTHoKhau.getAccessibleContext().setAccessibleParent(tabMain);

        pnlThongBao.setBackground(new java.awt.Color(49, 166, 72));
        pnlThongBao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pnlThongBao.setLayout(null);

        scDSThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tbDSThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSThongBao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Tháng", "Nội dung"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDSThongBao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbDSThongBao.setGridColor(new java.awt.Color(49, 166, 72));
        tbDSThongBao.setPreferredSize(new java.awt.Dimension(195, 465));
        tbDSThongBao.setRowHeight(32);
        tbDSThongBao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSThongBao.setShowHorizontalLines(false);
        tbDSThongBao.setShowVerticalLines(false);
        tbDSThongBao.getTableHeader().setReorderingAllowed(false);
        tbDSThongBao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSThongBaoMouseClicked(evt);
            }
        });
        scDSThongBao.setViewportView(tbDSThongBao);
        if (tbDSThongBao.getColumnModel().getColumnCount() > 0) {
            tbDSThongBao.getColumnModel().getColumn(0).setMinWidth(200);
            tbDSThongBao.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        pnlThongBao.add(scDSThongBao);
        scDSThongBao.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab2", pnlThongBao);
        pnlThongBao.getAccessibleContext().setAccessibleParent(tabMain);

        pnlDSNhanKhau.setBackground(new java.awt.Color(49, 166, 72));
        pnlDSNhanKhau.setLayout(null);

        tbDSNhanKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSNhanKhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Họ tên", "Giới tính", "Ngày nhập hộ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDSNhanKhau.setPreferredSize(new java.awt.Dimension(185, 470));
        tbDSNhanKhau.setRowHeight(32);
        tbDSNhanKhau.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSNhanKhau.setShowHorizontalLines(false);
        tbDSNhanKhau.setShowVerticalLines(false);
        tbDSNhanKhau.getTableHeader().setReorderingAllowed(false);
        tbDSNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSNhanKhauMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDSNhanKhau);
        if (tbDSNhanKhau.getColumnModel().getColumnCount() > 0) {
            tbDSNhanKhau.getColumnModel().getColumn(0).setMinWidth(50);
            tbDSNhanKhau.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        pnlDSNhanKhau.add(jScrollPane2);
        jScrollPane2.setBounds(40, 35, 930, 450);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Thêm Nhân Khẩu");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlDSNhanKhau.add(jButton1);
        jButton1.setBounds(780, 490, 190, 31);

        tabMain.addTab("tab3", pnlDSNhanKhau);

        pnlHoTro.setBackground(new java.awt.Color(49, 166, 72));
        pnlHoTro.setLayout(null);

        tbDSYeuCauHoTro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSYeuCauHoTro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Ngày tháng", "Tiêu đề", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDSYeuCauHoTro.setPreferredSize(new java.awt.Dimension(185, 470));
        tbDSYeuCauHoTro.setRowHeight(32);
        tbDSYeuCauHoTro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSYeuCauHoTro.setShowHorizontalLines(false);
        tbDSYeuCauHoTro.setShowVerticalLines(false);
        tbDSYeuCauHoTro.getTableHeader().setReorderingAllowed(false);
        tbDSYeuCauHoTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSYeuCauHoTroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDSYeuCauHoTro);
        if (tbDSYeuCauHoTro.getColumnModel().getColumnCount() > 0) {
            tbDSYeuCauHoTro.getColumnModel().getColumn(0).setMinWidth(200);
            tbDSYeuCauHoTro.getColumnModel().getColumn(0).setMaxWidth(200);
            tbDSYeuCauHoTro.getColumnModel().getColumn(1).setMinWidth(550);
            tbDSYeuCauHoTro.getColumnModel().getColumn(1).setMaxWidth(550);
        }

        pnlHoTro.add(jScrollPane3);
        jScrollPane3.setBounds(40, 35, 930, 430);

        btnThemYeuCau.setBackground(new java.awt.Color(102, 102, 102));
        btnThemYeuCau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemYeuCau.setForeground(new java.awt.Color(255, 255, 255));
        btnThemYeuCau.setText("Thêm yêu cầu mới");
        btnThemYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemYeuCauActionPerformed(evt);
            }
        });
        pnlHoTro.add(btnThemYeuCau);
        btnThemYeuCau.setBounds(740, 480, 230, 40);

        tabMain.addTab("tab4", pnlHoTro);

        pnlLog.setBackground(new java.awt.Color(49, 166, 72));
        pnlLog.setPreferredSize(new java.awt.Dimension(1250, 530));
        pnlLog.setLayout(null);

        scDSLog.setBackground(new java.awt.Color(255, 255, 255));

        tbDSLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Tháng", "Hoạt động"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDSLog.setGridColor(new java.awt.Color(49, 166, 72));
        tbDSLog.setPreferredSize(new java.awt.Dimension(195, 480));
        tbDSLog.setRowHeight(32);
        tbDSLog.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSLog.setShowHorizontalLines(false);
        tbDSLog.setShowVerticalLines(false);
        tbDSLog.getTableHeader().setReorderingAllowed(false);
        tbDSLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSLogMouseClicked(evt);
            }
        });
        scDSLog.setViewportView(tbDSLog);
        if (tbDSLog.getColumnModel().getColumnCount() > 0) {
            tbDSLog.getColumnModel().getColumn(0).setMinWidth(200);
            tbDSLog.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        pnlLog.add(scDSLog);
        scDSLog.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab5", pnlLog);

        pnlMain.add(tabMain);
        tabMain.setBounds(-5, 170, 1010, 560);
        tabMain.getAccessibleContext().setAccessibleName("tabMain");
        tabMain.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Powered by");
        pnlMain.add(jLabel7);
        jLabel7.setBounds(820, 755, 100, 20);
        pnlMain.add(lblLogo);
        lblLogo.setBounds(905, 735, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        ppMenu.show(this, 845, 90);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnChangeTab(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTab
        // TODO add your handling code here:
        int idx = 0;
        JButton btnClick = (JButton) evt.getSource();

        if (btnClick == curTabBtnClick) {
            return;
        }

        if (btnClick == btnTabThongTin) {
            LoadThongTinSoHoKhau();
            idx = 0;
        } else if (btnClick == btnTabThongBao) {
            LoadDanhSachThongBao();
            idx = 1;
        } else if (btnClick == btnTabDSNhanKhau) {
            LoadDanhSachNhanKhau();
            idx = 2;
        } else if (btnClick == btnTabGuiYeuCau) {
            LoadDanhSachGuiYeuCau();
            idx = 3;
        } else if (btnClick == btnTabLog) {
            LoadThongTinLichSu();

            idx = 4;
        }

        btnClick.setBackground(new Color(120, 120, 120));
        curTabBtnClick.setBackground(new Color(192, 192, 192));

        curTabBtnClick = btnClick;
        tabMain.setSelectedIndex(idx);
    }//GEN-LAST:event_btnChangeTab

    private void tbDSThongBaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSThongBaoMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSThongBao.getSelectedRow();
            TableModel model = tbDSThongBao.getModel();
            String ngayThang = model.getValueAt(index, 0).toString();
            String noiDung = model.getValueAt(index, 1).toString();

            JOptionPane.showMessageDialog(rootPane, ngayThang + noiDung);
        }

    }//GEN-LAST:event_tbDSThongBaoMouseClicked

    private void tbDSNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSNhanKhauMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSNhanKhau.getSelectedRow();
            TableModel model = tbDSNhanKhau.getModel();
            String stt = model.getValueAt(index, 0).toString();
            String hoTen = model.getValueAt(index, 1).toString();
            String gioiTinh = model.getValueAt(index, 2).toString();
            String ngayNhapHo = model.getValueAt(index, 3).toString();

            ViewEditNhanKhauDialog venkd = new ViewEditNhanKhauDialog(this, rootPaneCheckingEnabled, client,qlyNhanKhauController.getModel().getAt(index));
            venkd.setVisible(true);
        }

    }//GEN-LAST:event_tbDSNhanKhauMouseClicked

    private void tbDSLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSLogMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSLog.getSelectedRow();
            TableModel model = tbDSLog.getModel();
            String ngayThang = model.getValueAt(index, 0).toString();
            String hoatDong = model.getValueAt(index, 1).toString();

            JOptionPane.showMessageDialog(rootPane, ngayThang + hoatDong);
        }

    }//GEN-LAST:event_tbDSLogMouseClicked

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
        HttpSupporter.sendGetRequest(client, HttpSupporter.URLLogout, null);
        new LoginFrame().setVisible(true);
        this.setVisible(false);
        this.removeAll();
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMatKhauActionPerformed
        // TODO add your handling code here:
        ChangePasswordDialog cpd = new ChangePasswordDialog(this, rootPaneCheckingEnabled, client, userLogin);
        cpd.setVisible(true);
    }//GEN-LAST:event_mnuDoiMatKhauActionPerformed

    private void tbDSYeuCauHoTroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSYeuCauHoTroMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSYeuCauHoTro.getSelectedRow();
            index = tbDSYeuCauHoTro.getModel().getRowCount() - index - 1;
            
            ViewRequestDialog vrd = new ViewRequestDialog(this, rootPaneCheckingEnabled, false, client, qlyYeuCauController.getModel().getAt(index));
            vrd.setVisible(true);
        }

    }//GEN-LAST:event_tbDSYeuCauHoTroMouseClicked

    private void btnThemYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemYeuCauActionPerformed
        // TODO add your handling code here:
        SendRequestDialog srd = new SendRequestDialog(this, rootPaneCheckingEnabled, client);
        srd.setVisible(true);
    }//GEN-LAST:event_btnThemYeuCauActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new AddNhanKhauDialog(this, rootPaneCheckingEnabled, client).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        HttpSupporter.sendGetRequest(client, HttpSupporter.URLLogout, null);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ChuHoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuHoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuHoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuHoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuHoApp().setVisible(true);
            }
        });
    }

    //variables declaration for flags
    private JButton curTabBtnClick;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTabDSNhanKhau;
    private javax.swing.JButton btnTabGuiYeuCau;
    private javax.swing.JButton btnTabLog;
    private javax.swing.JButton btnTabThongBao;
    private javax.swing.JButton btnTabThongTin;
    private javax.swing.JButton btnThemYeuCau;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblDanToc;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblIDSoHoKhau;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblQueQuan;
    private javax.swing.JLabel lblQuocHuy;
    private javax.swing.JLabel lblSoCMND;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTonGiao;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDoiMatKhau;
    private javax.swing.JMenuItem mnuRefresh;
    private javax.swing.JPanel pnlDSNhanKhau;
    private javax.swing.JPanel pnlHoTro;
    private javax.swing.JPanel pnlLog;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTTHoKhau;
    private javax.swing.JPanel pnlThongBao;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JPopupMenu ppMenu;
    private javax.swing.JScrollPane scDSLog;
    private javax.swing.JScrollPane scDSThongBao;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTable tbDSLog;
    private javax.swing.JTable tbDSNhanKhau;
    private javax.swing.JTable tbDSThongBao;
    private javax.swing.JTable tbDSYeuCauHoTro;
    // End of variables declaration//GEN-END:variables
}
