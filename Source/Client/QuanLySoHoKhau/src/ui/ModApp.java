package ui;

import controller.QuanLyDSKiemDuyetController;
import controller.QuanLyDSSoHoKhauController;
import controller.QuanLyLogController;
import controller.QuanLyNhanKhauController;
import controller.QuanLyThongBaoController;
import controller.QuanLyYeuCauController;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.MouseInfo;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import supporter.JSONResponse;
import model.NguoiDung;
import model.QuanLyDSKiemDuyet;
import model.QuanLyDSSoHoKhau;
import model.QuanLyLog;
import model.QuanLyThongBao;
import model.QuanLyYeuCau;
import org.apache.http.client.HttpClient;
import supporter.HttpSupporter;

public class ModApp extends javax.swing.JFrame {

    NguoiDung userLogin;
    HttpClient client;
    QuanLyThongBaoController qlyThongBaoController;
    QuanLyLogController qlyLogController;
    QuanLyYeuCauController qlyYeuCauController;
    QuanLyDSKiemDuyetController qlyDSKiemDuyetController;
    QuanLyDSSoHoKhauController qlyDSSoHoKhauController;

    public ModApp() {
        initComponents();
        CustomInitComponents();
    }

    public ModApp(NguoiDung NguoiDung, HttpClient _client) {
        client = _client;
        userLogin = NguoiDung;
        initComponents();
        CustomInitComponents();
        this.setTitle("Người kiểm duyệt: " + userLogin.getThongTinCaNhan().getHoTen().toString());
    }

    public void CustomInitComponents() {
        //this.setTitle("Người kiểm duyệt");

        pnlThongTin.setBackground(new Color(0, 0, 0, 80));
        ScaleImageIcon("resource\\images\\banner.png", lblBanner);
        ScaleImageIcon("resource\\images\\menu.png", lblMenu);
        ScaleImageIcon("resource\\images\\quochuy.png", lblQuocHuy);
        ScaleImageIcon("resource\\images\\slogo.png", lblLogo);

        //Xử lý click default tab
        tabMain.setSelectedIndex(0);
        btnTabQLThongTin.setBackground(new Color(120, 120, 120));
        curTabBtnClick = btnTabQLThongTin;

        qlyLogController = new QuanLyLogController(new QuanLyLog(), tbDSLog);
        //qlyThongBaoController = new QuanLyThongBaoController(new QuanLyThongBao(), tbDSYeuCau);
        qlyYeuCauController = new QuanLyYeuCauController(new QuanLyYeuCau(), tbDSYeuCau);
        qlyDSKiemDuyetController = new QuanLyDSKiemDuyetController(new QuanLyDSKiemDuyet(), tbDSPhanHoiYeuCau);
        qlyDSSoHoKhauController = new QuanLyDSSoHoKhauController(new QuanLyDSSoHoKhau(), tbDSSoHoKhau);
        LoadQuanLyThongTin();
    }

    public void ScaleImageIcon(String path, JLabel lbl) {
        ImageIcon icoBanner = new ImageIcon(path);
        Image img = icoBanner.getImage();
        Image newImg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lbl.setIcon(image);
    }

    void LoadQuanLyThongTin() {
        lblHoTen.setText(userLogin.getThongTinCaNhan().getHoTen());
        lblNgaySinh.setText(userLogin.getThongTinCaNhan().getNgaySinh());
        lblQueQuan.setText(userLogin.getThongTinCaNhan().getQueQuan());
        lblSoCMND.setText(userLogin.getThongTinCaNhan().getCMND());
        lblSDT.setText(userLogin.getThongTinTaiKhoan().getSDT());
        lblGioiTinh.setText(userLogin.getThongTinCaNhan().getGioiTinh());
        lblDanToc.setText(userLogin.getThongTinCaNhan().getDanToc());
        lblTonGiao.setText(userLogin.getThongTinCaNhan().getTonGiao());
    }

    void LoadDanhSachHoTro() {

        qlyYeuCauController.updateModel(client, HttpSupporter.URLGetYeuCau, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyYeuCauController.updateViewMod();
    }

    void LoadThongTinLichSu() {

        qlyLogController.updateModel(client, HttpSupporter.URLGetLishSuUngDung, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyLogController.updateView();

    }

    void LoadDSSoHoKhau()
    {
        qlyDSSoHoKhauController.updateModel(client, HttpSupporter.URLGetAllSHK, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyDSSoHoKhauController.updateView();
    }
    
    void LoadDSCanKiemDuyet()
    {
        qlyDSKiemDuyetController.updateModel(client, HttpSupporter.URLGetDSCanKiemDuyet, userLogin.getThongTinTaiKhoan().getTaiKhoan());
        qlyDSKiemDuyetController.updateView();
    }
    
    
    void LoadThongTinSoHoKhau() {
        String username = "";

        // đưa vào frome //?
        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
        listParams.add(new Pair("username", username));

        JSONResponse JSResGetThongTin = HttpSupporter.sendGetRequest(client, HttpSupporter.URLGetLishSuUngDung, listParams);

        if (!JSResGetThongTin.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(this, JSResGetThongTin.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, JSResGetThongTin.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
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
        btnTabTimSHK = new javax.swing.JButton();
        btnTabLog = new javax.swing.JButton();
        btnTabHoTro = new javax.swing.JButton();
        btnTabPhanHoi = new javax.swing.JButton();
        tabMain = new javax.swing.JTabbedPane();
        pnlTab1 = new javax.swing.JPanel();
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
        lblQuocHuy = new javax.swing.JLabel();
        pnlTab2 = new javax.swing.JPanel();
        scDSThongBao = new javax.swing.JScrollPane();
        tbDSSoHoKhau = new javax.swing.JTable();
        tfTimSHK = new javax.swing.JTextField();
        btnTimSHK = new javax.swing.JButton();
        btnThemSoHoKhau = new javax.swing.JButton();
        pnlTab3 = new javax.swing.JPanel();
        scDSLog1 = new javax.swing.JScrollPane();
        tbDSLog = new javax.swing.JTable();
        pnlTab4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDSYeuCau = new javax.swing.JTable();
        btnThemThongBao = new javax.swing.JButton();
        pnlTab5 = new javax.swing.JPanel();
        scDSLog = new javax.swing.JScrollPane();
        tbDSPhanHoiYeuCau = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        miRefresh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Restart_20px.png"))); // NOI18N
        miRefresh.setText("Refresh");
        miRefresh.setPreferredSize(new java.awt.Dimension(155, 26));
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

        btnTabTimSHK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabTimSHK.setText("Tìm kiếm sổ hộ khẩu");
        btnTabTimSHK.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabTimSHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabTimSHK);
        btnTabTimSHK.setBounds(200, 140, 200, 60);

        btnTabLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabLog.setText("Lịch sử hoạt động");
        btnTabLog.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabLog);
        btnTabLog.setBounds(400, 140, 200, 60);

        btnTabHoTro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabHoTro.setText("Phản hồi hỗ trợ");
        btnTabHoTro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabHoTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabHoTro);
        btnTabHoTro.setBounds(600, 140, 200, 60);

        btnTabPhanHoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTabPhanHoi.setText("Kiểm Duyệt");
        btnTabPhanHoi.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnTabPhanHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTab(evt);
            }
        });
        pnlMain.add(btnTabPhanHoi);
        btnTabPhanHoi.setBounds(800, 140, 200, 60);

        tabMain.setBackground(new java.awt.Color(49, 166, 72));
        tabMain.setForeground(new java.awt.Color(49, 166, 72));
        tabMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlTab1.setBackground(new java.awt.Color(49, 166, 72));
        pnlTab1.setLayout(null);

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
        lblTieuDe.setText("Thông tin người kiểm duyệt");
        pnlThongTin.add(lblTieuDe);
        lblTieuDe.setBounds(230, 20, 460, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SĐT");
        pnlThongTin.add(jLabel8);
        jLabel8.setBounds(570, 100, 110, 30);

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
        lblSDT.setText("093245481");
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

        pnlTab1.add(pnlThongTin);
        pnlThongTin.setBounds(40, 35, 930, 500);
        pnlTab1.add(lblQuocHuy);
        lblQuocHuy.setBounds(400, 180, 200, 200);

        tabMain.addTab("tab1", pnlTab1);

        pnlTab2.setBackground(new java.awt.Color(49, 166, 72));
        pnlTab2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pnlTab2.setLayout(null);

        scDSThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tbDSSoHoKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSSoHoKhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Sổ hộ khẩu", "Họ tên chủ hộ", "Ngày cấp", "Địa chỉ"
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
        tbDSSoHoKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbDSSoHoKhau.setGridColor(new java.awt.Color(49, 166, 72));
        tbDSSoHoKhau.setPreferredSize(new java.awt.Dimension(195, 465));
        tbDSSoHoKhau.setRowHeight(32);
        tbDSSoHoKhau.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSSoHoKhau.setShowHorizontalLines(false);
        tbDSSoHoKhau.setShowVerticalLines(false);
        tbDSSoHoKhau.getTableHeader().setReorderingAllowed(false);
        tbDSSoHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSSoHoKhauMouseClicked(evt);
            }
        });
        scDSThongBao.setViewportView(tbDSSoHoKhau);
        if (tbDSSoHoKhau.getColumnModel().getColumnCount() > 0) {
            tbDSSoHoKhau.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbDSSoHoKhau.getColumnModel().getColumn(1).setPreferredWidth(130);
            tbDSSoHoKhau.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbDSSoHoKhau.getColumnModel().getColumn(3).setPreferredWidth(175);
        }

        pnlTab2.add(scDSThongBao);
        scDSThongBao.setBounds(40, 80, 930, 450);

        tfTimSHK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfTimSHK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTimSHKKeyTyped(evt);
            }
        });
        pnlTab2.add(tfTimSHK);
        tfTimSHK.setBounds(650, 20, 180, 40);

        btnTimSHK.setBackground(new java.awt.Color(102, 102, 102));
        btnTimSHK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTimSHK.setForeground(new java.awt.Color(255, 255, 255));
        btnTimSHK.setText("Tìm kiếm");
        pnlTab2.add(btnTimSHK);
        btnTimSHK.setBounds(850, 20, 120, 40);

        btnThemSoHoKhau.setBackground(new java.awt.Color(255, 255, 255));
        btnThemSoHoKhau.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemSoHoKhau.setForeground(new java.awt.Color(49, 166, 72));
        btnThemSoHoKhau.setText("Thêm sổ hộ khẩu");
        btnThemSoHoKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSoHoKhauActionPerformed(evt);
            }
        });
        pnlTab2.add(btnThemSoHoKhau);
        btnThemSoHoKhau.setBounds(40, 20, 250, 40);
        btnThemSoHoKhau.getAccessibleContext().setAccessibleName("btnThemSoHoKhau");

        tabMain.addTab("tab2", pnlTab2);

        pnlTab3.setBackground(new java.awt.Color(49, 166, 72));
        pnlTab3.setLayout(null);

        scDSLog1.setBackground(new java.awt.Color(255, 255, 255));

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
        scDSLog1.setViewportView(tbDSLog);
        if (tbDSLog.getColumnModel().getColumnCount() > 0) {
            tbDSLog.getColumnModel().getColumn(0).setMinWidth(200);
            tbDSLog.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        pnlTab3.add(scDSLog1);
        scDSLog1.setBounds(40, 35, 930, 500);

        tabMain.addTab("tab3", pnlTab3);

        pnlTab4.setBackground(new java.awt.Color(49, 166, 72));
        pnlTab4.setLayout(null);

        tbDSYeuCau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSYeuCau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Thời gian", "ID Sổ hộ khẩu", "Tiêu đề"
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
        tbDSYeuCau.setPreferredSize(new java.awt.Dimension(185, 470));
        tbDSYeuCau.setRowHeight(32);
        tbDSYeuCau.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSYeuCau.setShowHorizontalLines(false);
        tbDSYeuCau.setShowVerticalLines(false);
        tbDSYeuCau.getTableHeader().setReorderingAllowed(false);
        tbDSYeuCau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSYeuCauMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDSYeuCau);
        if (tbDSYeuCau.getColumnModel().getColumnCount() > 0) {
            tbDSYeuCau.getColumnModel().getColumn(0).setMinWidth(200);
            tbDSYeuCau.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        pnlTab4.add(jScrollPane3);
        jScrollPane3.setBounds(40, 35, 930, 500);

        btnThemThongBao.setBackground(new java.awt.Color(102, 102, 102));
        btnThemThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemThongBao.setForeground(new java.awt.Color(255, 255, 255));
        btnThemThongBao.setText("Thêm thông báo mới");
        pnlTab4.add(btnThemThongBao);
        btnThemThongBao.setBounds(740, 480, 230, 40);

        tabMain.addTab("tab4", pnlTab4);

        pnlTab5.setBackground(new java.awt.Color(49, 166, 72));
        pnlTab5.setPreferredSize(new java.awt.Dimension(1250, 530));
        pnlTab5.setLayout(null);

        scDSLog.setBackground(new java.awt.Color(255, 255, 255));

        tbDSPhanHoiYeuCau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbDSPhanHoiYeuCau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Chủ hộ", "Tiêu đề"
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
        tbDSPhanHoiYeuCau.setGridColor(new java.awt.Color(49, 166, 72));
        tbDSPhanHoiYeuCau.setPreferredSize(new java.awt.Dimension(195, 480));
        tbDSPhanHoiYeuCau.setRowHeight(32);
        tbDSPhanHoiYeuCau.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDSPhanHoiYeuCau.setShowHorizontalLines(false);
        tbDSPhanHoiYeuCau.setShowVerticalLines(false);
        tbDSPhanHoiYeuCau.getTableHeader().setReorderingAllowed(false);
        tbDSPhanHoiYeuCau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSPhanHoiYeuCauMouseClicked(evt);
            }
        });
        scDSLog.setViewportView(tbDSPhanHoiYeuCau);
        if (tbDSPhanHoiYeuCau.getColumnModel().getColumnCount() > 0) {
            tbDSPhanHoiYeuCau.getColumnModel().getColumn(0).setMinWidth(150);
            tbDSPhanHoiYeuCau.getColumnModel().getColumn(0).setPreferredWidth(150);
            tbDSPhanHoiYeuCau.getColumnModel().getColumn(0).setMaxWidth(150);
            tbDSPhanHoiYeuCau.getColumnModel().getColumn(1).setResizable(false);
        }

        pnlTab5.add(scDSLog);
        scDSLog.setBounds(40, 35, 930, 460);

        tabMain.addTab("tab5", pnlTab5);

        pnlMain.add(tabMain);
        tabMain.setBounds(-5, 170, 1010, 560);

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

        if (btnClick == btnTabQLThongTin) {
            LoadQuanLyThongTin();
            idx = 0;
        } else if (btnClick == btnTabTimSHK) {
            LoadDSSoHoKhau();
            idx = 1;
        } else if (btnClick == btnTabLog) {
            LoadThongTinLichSu();
            idx = 2;
        } else if (btnClick == btnTabHoTro) {
            LoadDanhSachHoTro();
            idx = 3;
        } else if (btnClick == btnTabPhanHoi) {
            LoadDSCanKiemDuyet();
            idx = 4;
        }

        btnClick.setBackground(new Color(120, 120, 120));
        curTabBtnClick.setBackground(new Color(192, 192, 192));

        curTabBtnClick = btnClick;
        tabMain.setSelectedIndex(idx);
    }//GEN-LAST:event_btnChangeTab

    private void tfTimSHKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTimSHKKeyTyped
        // TODO add your handling code here:
        char checkChar = evt.getKeyChar();
        if (!Character.isDigit(checkChar)) {
            evt.consume();
        }
        if (tfTimSHK.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_tfTimSHKKeyTyped

    private void miDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDangXuatActionPerformed
        // TODO add your handling code here:
        HttpSupporter.sendGetRequest(client, HttpSupporter.URLLogout, null);
        new LoginFrame().setVisible(true);
        this.setVisible(false);
        this.removeAll();
    }//GEN-LAST:event_miDangXuatActionPerformed

    private void tbDSSoHoKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSSoHoKhauMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSSoHoKhau.getSelectedRow();
            ViewEditChuHoDialog vechd = new ViewEditChuHoDialog(this, rootPaneCheckingEnabled, qlyDSSoHoKhauController.getModel().getAt(index));
            vechd.setVisible(true);
        }
    }//GEN-LAST:event_tbDSSoHoKhauMouseClicked

    private void tbDSYeuCauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSYeuCauMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSYeuCau.getSelectedRow();
            index = tbDSYeuCau.getModel().getRowCount() - index - 1;

            ViewRequestDialog vrd = new ViewRequestDialog(this, rootPaneCheckingEnabled, true, client, qlyYeuCauController.getModel().getAt(index));
            vrd.setVisible(true);
        }
    }//GEN-LAST:event_tbDSYeuCauMouseClicked

    private void tbDSPhanHoiYeuCauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSPhanHoiYeuCauMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int index = tbDSPhanHoiYeuCau.getSelectedRow();
            index = tbDSPhanHoiYeuCau.getModel().getRowCount() - index - 1;
            ViewCensorDialog vrd = new ViewCensorDialog(this, rootPaneCheckingEnabled, client, qlyDSKiemDuyetController.getModel().getAt(index));
            vrd.setVisible(true);
        }

    }//GEN-LAST:event_tbDSPhanHoiYeuCauMouseClicked

    private void btnThemSoHoKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSoHoKhauActionPerformed
        // TODO add your handling code here:
        AddSHKDialog tes = new AddSHKDialog(this, rootPaneCheckingEnabled);
        tes.setVisible(true);
    }//GEN-LAST:event_btnThemSoHoKhauActionPerformed

    private void miDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDoiMatKhauActionPerformed
        // TODO add your handling code here:
        ChangePasswordDialog cpd = new ChangePasswordDialog(this, rootPaneCheckingEnabled, client, userLogin);
        cpd.setVisible(true);
    }//GEN-LAST:event_miDoiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(ModApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModApp().setVisible(true);
            }
        });
    }

    //variables declaration for flags
    private JButton curTabBtnClick;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTabHoTro;
    private javax.swing.JButton btnTabLog;
    private javax.swing.JButton btnTabPhanHoi;
    private javax.swing.JButton btnTabQLThongTin;
    private javax.swing.JButton btnTabTimSHK;
    private javax.swing.JButton btnThemSoHoKhau;
    private javax.swing.JButton btnThemThongBao;
    private javax.swing.JButton btnTimSHK;
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
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTab1;
    private javax.swing.JPanel pnlTab2;
    private javax.swing.JPanel pnlTab3;
    private javax.swing.JPanel pnlTab4;
    private javax.swing.JPanel pnlTab5;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JPopupMenu ppMenu;
    private javax.swing.JScrollPane scDSLog;
    private javax.swing.JScrollPane scDSLog1;
    private javax.swing.JScrollPane scDSThongBao;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTable tbDSLog;
    private javax.swing.JTable tbDSPhanHoiYeuCau;
    private javax.swing.JTable tbDSSoHoKhau;
    private javax.swing.JTable tbDSYeuCau;
    private javax.swing.JTextField tfTimSHK;
    // End of variables declaration//GEN-END:variables

}
