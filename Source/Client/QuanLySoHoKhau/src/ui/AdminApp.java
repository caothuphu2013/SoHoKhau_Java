package ui;

import controller.QuanLyLogController;
import controller.QuanLyNguoiKiemDuyetController;
import controller.QuanLyNhanKhauController;
import controller.QuanLyThongBaoController;
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

public class AdminApp extends javax.swing.JFrame {

    NguoiDung userLogin;
    HttpClient client;
    QuanLyLogController qlyLogController;
    QuanLyThongBaoController qlyThongBaoController;
    QuanLyNguoiKiemDuyetController qlyNguoiKiemDuyet;
    
    public AdminApp() {
        initComponents();
        CustomInitComponents();
    }
    
    public AdminApp(NguoiDung NguoiDung, HttpClient _client) {
        client = _client;

        userLogin = NguoiDung;  
        
        //LoadThongTinSoHoKhau();
        initComponents();
        CustomInitComponents();
        this.setTitle("Người quản lý: "+userLogin.getThongTinCaNhan().getHoTen().toString());

    }
    
    void LoadThongTinLichSu() {
        
        qlyLogController.updateModel(client, HttpSupporter.URLGetLishSuUngDung, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyLogController.updateView();

    }

//    void LoadDanhSachThongBao() {
//
//        qlyThongBaoController.updateModel(client, HttpSupporter.URLGetThongBao, userLogin.getThongTinTaiKhoan().getTaiKhoan());
//        qlyThongBaoController.updateView();
//    }
    
    void LoadThongTinAdmin() {
        lblDanToc.setText(userLogin.getThongTinCaNhan().getDanToc());
        lblHoTen.setText(userLogin.getThongTinCaNhan().getHoTen());
        lblNgaySinh.setText(userLogin.getThongTinCaNhan().getNgaySinh());
        lblQueQuan.setText(userLogin.getThongTinCaNhan().getQueQuan());
        lblSDT.setText(userLogin.getThongTinTaiKhoan().getSDT());
        lblSoCMND.setText(userLogin.getThongTinCaNhan().getCMND());
        lblTonGiao.setText(userLogin.getThongTinCaNhan().getTonGiao());
        lblGioiTinh.setText(userLogin.getThongTinCaNhan().getGioiTinh());
    }
    
    void LoadDanhSachNguoiKiemDuyet() {
        try {
            qlyNguoiKiemDuyet.updateModel(client, HttpSupporter.URLGetDSNguoiKiemDuyet, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AdminApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        qlyNguoiKiemDuyet.updateView();
    }
    
    public void CustomInitComponents() {

        this.setTitle("Người quản lý");
        
        pnlThongTin.setBackground(new Color(0, 0, 0, 80));
        ScaleImageIcon("resource\\images\\banner.png", lblBanner);
        ScaleImageIcon("resource\\images\\menu.png", lblMenu);
        ScaleImageIcon("resource\\images\\quochuy.png", lblQuocHuy);
        ScaleImageIcon("resource\\images\\slogo.png", lblLogo);

        //Xử lý click default tab
        tabMain.setSelectedIndex(0);
        btnTabQLThongTin.setBackground(new Color(120, 120, 120));
        curTabBtnClick = btnTabQLThongTin;
        LoadThongTinAdmin();
        
        //Khởi tạo controller
        qlyLogController = new QuanLyLogController(new QuanLyLog(), tbLichSuTuongTac);
        //qlyThongBaoController = new QuanLyThongBaoController(new QuanLyThongBao(), tbThongBao);
        qlyNguoiKiemDuyet = new QuanLyNguoiKiemDuyetController(new QuanLyNguoiKiemDuyet(), tbQuanLyKiemDuyet);

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
        miRefresh = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miDoiMatKhau = new javax.swing.JMenuItem();
        miDangXuat = new javax.swing.JMenuItem();
        pnlMain = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();
        btnTabQLThongTin = new javax.swing.JButton();
        btnQuanLyKiemDuyet = new javax.swing.JButton();
        btnBaoCaoThongKe = new javax.swing.JButton();
        btnThongBao = new javax.swing.JButton();
        btnLichSuTuongTac = new javax.swing.JButton();
        tabMain = new javax.swing.JTabbedPane();
        pnlQuanLyThongTin = new javax.swing.JPanel();
        lblQuocHuy = new javax.swing.JLabel();
        pnlThongTin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTieuDe = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblQueQuan = new javax.swing.JLabel();
        lblSoCMND = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblDanToc = new javax.swing.JLabel();
        lblTonGiao = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnlQuanLyKiemDuyet = new javax.swing.JPanel();
        scQuanLyKiemDuyet = new javax.swing.JScrollPane();
        tbQuanLyKiemDuyet = new javax.swing.JTable();
        btnThemNguoiKiemDuyet = new javax.swing.JButton();
        pnlBaoCaoThongKe = new javax.swing.JPanel();
        scBaoCaoThongKe = new javax.swing.JScrollPane();
        tbBaoCaoThongKe = new javax.swing.JTable();
        pnlThongBao = new javax.swing.JPanel();
        btnGuiThongBao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfNoiDung = new javax.swing.JTextArea();
        pnlLichSuTuongTac = new javax.swing.JPanel();
        scLichSuTuongTac = new javax.swing.JScrollPane();
        tbLichSuTuongTac = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        miRefresh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Restart_20px.png"))); // NOI18N
        miRefresh.setText("Refresh");
        miRefresh.setToolTipText("");
        ppMenu.add(miRefresh);
        ppMenu.add(jSeparator1);

        miDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/password.png"))); // NOI18N
        miDoiMatKhau.setText("Đổi mật khẩu");
        miDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDoiMatKhauActionPerformed(evt);
            }
        });
        ppMenu.add(miDoiMatKhau);

        miDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Sign Out_20px.png"))); // NOI18N
        miDangXuat.setText("Đăng xuất");
        miDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miDangXuatMouseClicked(evt);
            }
        });
        miDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDangXuatActionPerformed(evt);
            }
        });
        ppMenu.add(miDangXuat);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlMain.setBackground(new java.awt.Color(49, 166, 72));
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

        btnTabQLThongTin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabQLThongTin.setText("Quản lý thông tin");
        btnTabQLThongTin.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabQLThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabQLThongTin);
        btnTabQLThongTin.setBounds(0, 140, 200, 60);
        btnTabQLThongTin.getAccessibleContext().setAccessibleName("btnQuanLyThongTin");

        btnQuanLyKiemDuyet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyKiemDuyet.setText("Quản lý kiểm duyệt");
        btnQuanLyKiemDuyet.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnQuanLyKiemDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnQuanLyKiemDuyet);
        btnQuanLyKiemDuyet.setBounds(200, 140, 200, 60);
        btnQuanLyKiemDuyet.getAccessibleContext().setAccessibleName("btnQuanLyKiemDuyet");

        btnBaoCaoThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBaoCaoThongKe.setText("Báo cáo thống kê");
        btnBaoCaoThongKe.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnBaoCaoThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnBaoCaoThongKe);
        btnBaoCaoThongKe.setBounds(400, 140, 200, 60);
        btnBaoCaoThongKe.getAccessibleContext().setAccessibleName("btnBaoCaoThongKe");

        btnThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongBao.setText("Thêm Thông báo");
        btnThongBao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnThongBao);
        btnThongBao.setBounds(600, 140, 200, 60);
        btnThongBao.getAccessibleContext().setAccessibleName("btnThongBao");

        btnLichSuTuongTac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLichSuTuongTac.setText("Lịch sử tương tác");
        btnLichSuTuongTac.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnLichSuTuongTac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnLichSuTuongTac);
        btnLichSuTuongTac.setBounds(800, 140, 200, 60);
        btnLichSuTuongTac.getAccessibleContext().setAccessibleName("btnLichSuTuongTac");

        tabMain.setBackground(new java.awt.Color(49, 166, 72));
        tabMain.setForeground(new java.awt.Color(49, 166, 72));
        tabMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlQuanLyThongTin.setBackground(new java.awt.Color(49, 166, 72));
        pnlQuanLyThongTin.setLayout(null);
        pnlQuanLyThongTin.add(lblQuocHuy);
        lblQuocHuy.setBounds(400, 180, 200, 200);

        pnlThongTin.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên");
        pnlThongTin.add(jLabel2);
        jLabel2.setBounds(120, 100, 80, 30);

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
        lblTieuDe.setText("Thông tin người quản lý");
        pnlThongTin.add(lblTieuDe);
        lblTieuDe.setBounds(270, 20, 390, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SĐT");
        pnlThongTin.add(jLabel8);
        jLabel8.setBounds(570, 100, 80, 30);

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

        lblSDT.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblSDT.setForeground(new java.awt.Color(255, 255, 255));
        lblSDT.setText("2308");
        pnlThongTin.add(lblSDT);
        lblSDT.setBounds(680, 100, 150, 30);

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

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(":");
        pnlThongTin.add(jLabel18);
        jLabel18.setBounds(670, 100, 30, 30);

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

        pnlQuanLyThongTin.add(pnlThongTin);
        pnlThongTin.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab1", pnlQuanLyThongTin);
        pnlQuanLyThongTin.getAccessibleContext().setAccessibleParent(tabMain);

        pnlQuanLyKiemDuyet.setBackground(new java.awt.Color(49, 166, 72));
        pnlQuanLyKiemDuyet.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pnlQuanLyKiemDuyet.setLayout(null);

        scQuanLyKiemDuyet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tbQuanLyKiemDuyet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbQuanLyKiemDuyet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CMND", "Họ và tên"
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
        tbQuanLyKiemDuyet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbQuanLyKiemDuyet.setGridColor(new java.awt.Color(49, 166, 72));
        tbQuanLyKiemDuyet.setPreferredSize(new java.awt.Dimension(195, 465));
        tbQuanLyKiemDuyet.setRowHeight(32);
        tbQuanLyKiemDuyet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbQuanLyKiemDuyet.setShowHorizontalLines(false);
        tbQuanLyKiemDuyet.setShowVerticalLines(false);
        tbQuanLyKiemDuyet.getTableHeader().setReorderingAllowed(false);
        tbQuanLyKiemDuyet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyKiemDuyetMouseClicked(evt);
            }
        });
        scQuanLyKiemDuyet.setViewportView(tbQuanLyKiemDuyet);
        if (tbQuanLyKiemDuyet.getColumnModel().getColumnCount() > 0) {
            tbQuanLyKiemDuyet.getColumnModel().getColumn(0).setMinWidth(200);
            tbQuanLyKiemDuyet.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        pnlQuanLyKiemDuyet.add(scQuanLyKiemDuyet);
        scQuanLyKiemDuyet.setBounds(40, 35, 930, 430);

        btnThemNguoiKiemDuyet.setBackground(new java.awt.Color(102, 102, 102));
        btnThemNguoiKiemDuyet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemNguoiKiemDuyet.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNguoiKiemDuyet.setText("Thêm người kiêm duyệt");
        btnThemNguoiKiemDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNguoiKiemDuyetActionPerformed(evt);
            }
        });
        pnlQuanLyKiemDuyet.add(btnThemNguoiKiemDuyet);
        btnThemNguoiKiemDuyet.setBounds(740, 480, 230, 40);

        tabMain.addTab("tab2", pnlQuanLyKiemDuyet);
        pnlQuanLyKiemDuyet.getAccessibleContext().setAccessibleParent(tabMain);

        pnlBaoCaoThongKe.setBackground(new java.awt.Color(49, 166, 72));
        pnlBaoCaoThongKe.setLayout(null);

        tbBaoCaoThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbBaoCaoThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Thời gian", "ID Chủ hộ", "Yêu cầu", "Kiểm duyệt", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBaoCaoThongKe.setPreferredSize(new java.awt.Dimension(185, 470));
        tbBaoCaoThongKe.setRowHeight(32);
        tbBaoCaoThongKe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbBaoCaoThongKe.setShowHorizontalLines(false);
        tbBaoCaoThongKe.setShowVerticalLines(false);
        tbBaoCaoThongKe.getTableHeader().setReorderingAllowed(false);
        tbBaoCaoThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBaoCaoThongKeMouseClicked(evt);
            }
        });
        scBaoCaoThongKe.setViewportView(tbBaoCaoThongKe);

        pnlBaoCaoThongKe.add(scBaoCaoThongKe);
        scBaoCaoThongKe.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab3", pnlBaoCaoThongKe);

        pnlThongBao.setBackground(new java.awt.Color(49, 166, 72));
        pnlThongBao.setLayout(null);

        btnGuiThongBao.setBackground(new java.awt.Color(102, 102, 102));
        btnGuiThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuiThongBao.setForeground(new java.awt.Color(255, 255, 255));
        btnGuiThongBao.setText("Gửi thông báo");
        btnGuiThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiThongBaoActionPerformed(evt);
            }
        });
        pnlThongBao.add(btnGuiThongBao);
        btnGuiThongBao.setBounds(740, 480, 230, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nội dung:");
        pnlThongBao.add(jLabel1);
        jLabel1.setBounds(30, 20, 78, 50);

        tfNoiDung.setColumns(20);
        tfNoiDung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNoiDung.setRows(5);
        jScrollPane1.setViewportView(tfNoiDung);

        pnlThongBao.add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 940, 380);

        tabMain.addTab("tab4", pnlThongBao);

        pnlLichSuTuongTac.setBackground(new java.awt.Color(49, 166, 72));
        pnlLichSuTuongTac.setPreferredSize(new java.awt.Dimension(1250, 530));
        pnlLichSuTuongTac.setLayout(null);

        scLichSuTuongTac.setBackground(new java.awt.Color(255, 255, 255));

        tbLichSuTuongTac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbLichSuTuongTac.setModel(new javax.swing.table.DefaultTableModel(
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
        tbLichSuTuongTac.setGridColor(new java.awt.Color(49, 166, 72));
        tbLichSuTuongTac.setPreferredSize(new java.awt.Dimension(195, 480));
        tbLichSuTuongTac.setRowHeight(32);
        tbLichSuTuongTac.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbLichSuTuongTac.setShowHorizontalLines(false);
        tbLichSuTuongTac.setShowVerticalLines(false);
        tbLichSuTuongTac.getTableHeader().setReorderingAllowed(false);
        tbLichSuTuongTac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLichSuTuongTacMouseClicked(evt);
            }
        });
        scLichSuTuongTac.setViewportView(tbLichSuTuongTac);
        if (tbLichSuTuongTac.getColumnModel().getColumnCount() > 0) {
            tbLichSuTuongTac.getColumnModel().getColumn(0).setMinWidth(150);
            tbLichSuTuongTac.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        pnlLichSuTuongTac.add(scLichSuTuongTac);
        scLichSuTuongTac.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab5", pnlLichSuTuongTac);

        pnlMain.add(tabMain);
        tabMain.setBounds(-5, 170, 1010, 560);
        tabMain.getAccessibleContext().setAccessibleName("tabMain");
        tabMain.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Powered by");
        pnlMain.add(jLabel7);
        jLabel7.setBounds(810, 755, 100, 20);
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

        if (btnClick == btnTabQLThongTin) {
            LoadThongTinAdmin();
            idx = 0;
        } else if (btnClick == btnQuanLyKiemDuyet) {
            LoadDanhSachNguoiKiemDuyet();
            idx = 1;
        } else if (btnClick == btnBaoCaoThongKe) {
            idx = 2;
        } else if (btnClick == btnThongBao) {
//            LoadDanhSachThongBao();
            idx = 3;
        } else if (btnClick == btnLichSuTuongTac) {
            LoadThongTinLichSu();
            idx = 4;
        }

        btnClick.setBackground(new Color(120, 120, 120));
        curTabBtnClick.setBackground(new Color(192, 192, 192));

        curTabBtnClick = btnClick;
        tabMain.setSelectedIndex(idx);
    }//GEN-LAST:event_btnChangeTab

    private void miDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDangXuatActionPerformed
        // TODO add your handling code here:
        HttpSupporter.sendGetRequest(client, HttpSupporter.URLLogout, null);
        new LoginFrame().setVisible(true);
        this.setVisible(false);
        this.removeAll();
    }//GEN-LAST:event_miDangXuatActionPerformed

    private void tbQuanLyKiemDuyetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyKiemDuyetMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbQuanLyKiemDuyet.getSelectedRow();

//            TableModel model = tbQuanLyKiemDuyet.getModel();
//            String cmnd = model.getValueAt(index, 0).toString();
//            String hoTen = model.getValueAt(index, 1).toString();

            ViewEditModDialog vemd = new ViewEditModDialog(this, rootPaneCheckingEnabled);
            vemd.setData(qlyNguoiKiemDuyet.getModel().getAt(index));
            vemd.setVisible(true);
        }
    }//GEN-LAST:event_tbQuanLyKiemDuyetMouseClicked

    private void tbBaoCaoThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBaoCaoThongKeMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2){
        int index = tbBaoCaoThongKe.getSelectedRow();
        TableModel model = tbBaoCaoThongKe.getModel();
        String thoiGian = model.getValueAt(index, 0).toString();
        String idChuHo = model.getValueAt(index, 1).toString();
        String yeuCau = model.getValueAt(index, 2).toString();
        String kiemDuyet = model.getValueAt(index, 3).toString();
        String trangThai = model.getValueAt(index, 4).toString();

        JOptionPane.showMessageDialog(rootPane, thoiGian + idChuHo + yeuCau + kiemDuyet);
        }
    }//GEN-LAST:event_tbBaoCaoThongKeMouseClicked

    private void tbLichSuTuongTacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLichSuTuongTacMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2){
        int index = tbLichSuTuongTac.getSelectedRow();
        TableModel model = tbLichSuTuongTac.getModel();
        String ngayThang = model.getValueAt(index, 0).toString();
        String hoatDong = model.getValueAt(index, 1).toString();

        JOptionPane.showMessageDialog(rootPane, ngayThang + hoatDong);
        }
    }//GEN-LAST:event_tbLichSuTuongTacMouseClicked

    private void miDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miDangXuatMouseClicked
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miDangXuatMouseClicked

    private void miDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDoiMatKhauActionPerformed
        // TODO add your handling code here:
        ChangePasswordDialog cpd = new ChangePasswordDialog(this, rootPaneCheckingEnabled, client, userLogin);
        cpd.setVisible(true);
    }//GEN-LAST:event_miDoiMatKhauActionPerformed

    private void btnGuiThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiThongBaoActionPerformed
        // TODO add your handling code here:
        String noiDung = tfNoiDung.getText();
        if(noiDung.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập nội dung");
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Gửi thông báo thành công");
        }

    }//GEN-LAST:event_btnGuiThongBaoActionPerformed

    private void btnThemNguoiKiemDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNguoiKiemDuyetActionPerformed
        // TODO add your handling code here:
        AddModDialog amd = new AddModDialog(this, rootPaneCheckingEnabled);
        amd.setVisible(true);
    }//GEN-LAST:event_btnThemNguoiKiemDuyetActionPerformed

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
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminApp().setVisible(true);
            }
        });
    }

    //variables declaration for flags
    private JButton curTabBtnClick;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoCaoThongKe;
    private javax.swing.JButton btnGuiThongBao;
    private javax.swing.JButton btnLichSuTuongTac;
    private javax.swing.JButton btnQuanLyKiemDuyet;
    private javax.swing.JButton btnTabQLThongTin;
    private javax.swing.JButton btnThemNguoiKiemDuyet;
    private javax.swing.JButton btnThongBao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblDanToc;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblQueQuan;
    private javax.swing.JLabel lblQuocHuy;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblSoCMND;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTonGiao;
    private javax.swing.JMenuItem miDangXuat;
    private javax.swing.JMenuItem miDoiMatKhau;
    private javax.swing.JMenuItem miRefresh;
    private javax.swing.JPanel pnlBaoCaoThongKe;
    private javax.swing.JPanel pnlLichSuTuongTac;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlQuanLyKiemDuyet;
    private javax.swing.JPanel pnlQuanLyThongTin;
    private javax.swing.JPanel pnlThongBao;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JPopupMenu ppMenu;
    private javax.swing.JScrollPane scBaoCaoThongKe;
    private javax.swing.JScrollPane scLichSuTuongTac;
    private javax.swing.JScrollPane scQuanLyKiemDuyet;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTable tbBaoCaoThongKe;
    private javax.swing.JTable tbLichSuTuongTac;
    private javax.swing.JTable tbQuanLyKiemDuyet;
    private javax.swing.JTextArea tfNoiDung;
    // End of variables declaration//GEN-END:variables
}
