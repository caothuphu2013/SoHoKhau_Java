
use master


create database SoHoKhau2
go

use SoHoKhau2 

create table SoHoKhau(
	IDSoHoKhau char(12) not null primary key,
	IDTaiKhoan char(12) not null,
	CMNDChuHo char(12) not null,
	DiaChi nvarchar(MAX),
	NgayLapSo date,
	NoiCap nvarchar(MAX),
	IDQuanLyGhiChu int
) 

create table ThongTinCaNhan(
	CMND char(12) not null primary key,
	HoTen nvarchar(MAX),
	NgaySinh date,
	GioiTinh nvarchar(3),
	QueQuan nvarchar(MAX),
	DanToc nvarchar(MAX),
	TonGiao nvarchar(MAX)
)

create table NhanKhau(
	CMND char(12) not null,
	IDSoHoKhau char(12) not null,
	IDQuanLyGhiChu int,
	NgayNhapSoHoKhau date,
	QuanHeVoiChuHo nvarchar(MAX),
	primary key (CMND,IDSoHoKhau)
)

create table NguoiDungUngDung(
	IDTaiKhoan char(12) not null primary key,
	MatKhauTaiKhoan nvarchar(MAX) not null,
	LoaiTaiKhoan int not null,
	Email varchar(MAX),
	Phone varchar(11),
	TrangThai char(3),
	CMND char(12)
)

create table LichSuUngDung(
	IDTaiKhoan char(12) not null,
	STT int not null,
	ThoiGian datetime,
	NoiDung nvarchar(MAX),
	primary key(IDTaiKhoan, STT)
)


create table YeuCau(
	IDNguoiYeuCau char(12) not null,
	STT int not null,
	TieuDe nvarchar(MAX),
	NoiDung nvarchar(MAX),
	ThoiGian datetime,
	TrangThai int, check (TrangThai in (1,2,3)), -- 1: Duyệt | 2: Không Duyệt | 3: Chưa xem
	TraLoi nvarchar(MAX)
	primary key (IDNguoiYeuCau, STT)
)

create table PhanQuyen(
	LoaiTaiKhoan int not null primary key,
	TenLoaiTaiKhoan nvarchar(MAX)
)

create table QuanLyGhiChu(
	IDQuanLyGhiChu int not null primary key
)

create table GhiChu(
	IDGhiChu int not null,
	STT int not null,
	TieuDe nvarchar(MAX),
	NoiDung nvarchar(MAX),
	ThoiGian datetime,
	constraint PK_GhiChu primary key (IDGhiChu, STT)
)

create table ThongBao(
	STT int not null,
	IDTaiKhoanFrom char(12) not null,
	IDTaiKhoanTo char(12) not null,
	NoiDung nvarchar(MAX),
	ThoiGian datetime,
	constraint PK_ThongBao primary key (STT, IDTaiKhoanFrom, IDTaiKhoanTo)
)

Create table TrangThaiYeuCau(
	MaTrangThai int not null primary key,
	LoaiTrangThai nvarchar(MAX)
)


create table SESSIONID(
	ssid nvarchar(32) not null  primary key,
	IDTaiKhoan char(12)
)

create table UpdateTable(
	idUpdate int not null primary key,
	name nvarchar(20)
)

create table ThongTinTam(
	CMND char(12) not null primary key,
	stt int,
	IDSoHoKhau char(12),
	idUpdate int,
	HoTen nvarchar(MAX),
	NgaySinh date,
	GioiTinh char(3),
	QueQuan nvarchar(MAX),
	DanToc nvarchar(MAX),
	TonGiao nvarchar(MAX),
	IDQuanLyGhiChu int,
	NgayNhapSoHoKhau date,
	QuanHeVoiChuHo nvarchar(MAX)
)
create table LogTable(
	Id BIGINT not null primary key,
	IdTaiKhoan char(12),
	ThoiGian Datetime,
	NoiDung nvarchar(MAX),
	Victim char(12)
)
alter table SESSIONID add constraint FK_SESSIONID_IDTaiKhoan_NguoiDungUngDung_IDTaiKhoan
foreign key (IDTaiKhoan) references NguoiDungUngDung(IDTaiKhoan)

go

alter table ThongBao add constraint FK_Thongbao_IDTaiKhoanFrom_NguoiDung_IdTaiKhoan 
foreign key (IDTaiKhoanFrom) references NguoiDungUngDung(IDTaiKhoan)

go

alter table ThongBao add constraint FK_Thongbao_IDTaiKhoanTo_NguoiDung_IdTaiKhoan 
foreign key (IDTaiKhoanTo) references NguoiDungUngDung(IDTaiKhoan)

go


alter table NguoiDungUngDung add constraint FK_NguoiDungUngDung_PhanQuyen 
foreign key (LoaiTaiKhoan) references PhanQuyen(LoaiTaiKhoan)

go

alter table NguoiDungUngDung add constraint FK_NguoiDungUngDung_CMND_ThongTinCaNhan_CMND
foreign key (CMND) references ThongTinCaNhan(CMND)

go

alter table GhiChu add constraint FK_GhiChu_QuanLyGhiChu 
foreign key (IDGhiChu) references QuanLyGhiChu(IDQuanLyGhiChu)

go

alter table NhanKhau add constraint FK_NhanKhau_QuanLyGhiChu 
foreign key (IDQuanLyGhiChu) references QuanLyGhiChu(IDQuanLyGhiChu)

go

alter table NhanKhau add constraint FK_NhanKhau_SoHoKhau 
foreign key (IDSoHoKhau) references SoHoKhau (IDSoHoKhau)

go

alter table NhanKhau add constraint FK_NhanKhau_CMND_ThongTin_CMND
foreign key (CMND) references ThongTinCaNhan (CMND)

go

alter table SoHoKhau add constraint FK_SoHoKhau_QuanLyGhiChu 
foreign key (IDQuanLyGhiChu) references QuanLyGhiChu(IDQuanLyGhiChu)

go

alter table SoHoKhau add constraint FK_SoHoKhau_CMNDChuHo_ThongTinCaNhan_CMND
foreign key (CMNDChuHo) references ThongTinCaNhan(CMND)

go

alter table SoHoKhau add constraint FK_SoHoKhau_IDTaiKhoan_NguoiDungUngDung_IDTaiKhoan
foreign key (IDTaiKhoan) references NguoiDungUngDung(IDTaiKhoan)

go

alter table ThongTinCaNhan add constraint CHK_ThongTinCaNhan_GioiTinh check (GioiTinh in (N'Nam', N'Nữ'))
alter table NguoiDungUngDung add constraint CHK_NguoiDungUngDung_TrangThai check (TrangThai in (N'On', N'Off'))


go

alter table YeuCau add constraint FK_YeuCau_IDNguoiYeuCau_NguoiDungUngDung_IDTaiKhoan 
foreign key  (IDNguoiYeuCau) references NguoiDungUngDung(IDTaiKhoan)

go

alter table YeuCau add constraint FK_YeuCau_TrangThai_TrangThaiYeuCau_MaTrangThai
foreign key  (TrangThai) references TrangThaiYeuCau(MaTrangThai)

go

alter table LichSuUngDung add constraint FK_LichSuUngDung_IDTaiKhoan_NguoiDungUngDung_IDTaiKhoan 
foreign key  (IDTaiKhoan) references NguoiDungUngDung(IDTaiKhoan)

go

alter table ThongTinTam add constraint FK_ThongTinTam_idUpdate_UpdateTable_idUpdate
foreign key (idUpdate) references UpdateTable(idUpdate)

go

alter table LogTable add constraint FK_LogTable_IDTaiKhoan_NguoiDungUngDung_IDTaiKhoan
foreign key  (IdTaiKhoan) references NguoiDungUngDung(IDTaiKhoan)


go

alter table LogTable add constraint FK_LogTable_Victim_NguoiDungUngDung_IDTaiKhoan
foreign key  (IdTaiKhoan) references NguoiDungUngDung(IDTaiKhoan)

go

insert into PhanQuyen values(1, N'User')
go
insert into PhanQuyen values(2, N'Mod')
go
insert into PhanQuyen values(3, N'Admin')
go


insert into TrangThaiYeuCau values(1,N'Đã gửi thành công')
go
insert into TrangThaiYeuCau values(2,N'Đã phản hồi')
go
insert into TrangThaiYeuCau values(3,N'Đã gửi yêu cầu chỉnh sửa/xóa')
go

insert into UpdateTable values(0,N'none')
go
insert into UpdateTable values(1,N'Thêm nhân khẩu')
go
insert into UpdateTable values(2,N'Sửa nhân khẩu')
go
insert into UpdateTable values(3,N'Xóa nhân khẩu')


insert into ThongTinCaNhan values('123456789100' ,N'Nguyễn Văn Anh', '12/02/1997', 'Nam', N'TP HCM', N'Kinh', N'Không')
insert into ThongTinCaNhan values('249862324512' ,N'Nguyễn Thị Bé', '08/20/1997', N'Nữ', N'Bến Tre', N'Kinh', N'Không')
insert into ThongTinCaNhan values('346236569456' ,N'Nguyễn Thanh Trí', '07/22/1997', N'Nữ', N'TP HCM', N'Kinh', N'Không')
insert into ThongTinCaNhan values('846232541236' ,N'Bùi Châu Minh Tùng', '10/11/1997', N'Nam', N'An Giang', N'Kinh', N'Không')

insert into ThongTinCaNhan values('695463665412' ,N'Huỳnh Trọng Thoại', '11/30/1997', N'Nam', N'An Giang', N'Kinh', N'Không')
insert into ThongTinCaNhan values('421346124076' ,N'Võ Minh Trí', '10/11/1997', N'Nam', N'Đồng Nai', N'Kinh', N'Phật Giáo')
insert into ThongTinCaNhan values('272461522365' ,N'Nguyễn Anh Tuấn', '02/20/1997', N'Nam', N'Đồng Nai', N'Kinh', N'Thiên Chúa')


insert into NguoiDungUngDung values('user12345678','123456',1,'user12345678@gmail.com','0909346243','On','695463665412')
insert into NguoiDungUngDung values('mod123456789','123456',2,'mod12345678@gmail.com','01652362351','On','421346124076')
insert into NguoiDungUngDung values('admin1234567','123456',3,'adim123456789@gmail.com','01652091716','On','272461522365')

insert into QuanLyGhiChu values(1)
insert into QuanLyGhiChu values(2)
insert into QuanLyGhiChu values(3)
insert into QuanLyGhiChu values(4)
insert into QuanLyGhiChu values(5)

insert into SoHoKhau values('SHK132328951','user12345678','695463665412',N'154/43/20 Âu Dương Lân, Phường 3, Quận 8, TP HCM', '1/1/2018' , N'TP HCM', 1)

insert into NhanKhau values('123456789100','SHK132328951',2,'2/1/2018',N'Con')
insert into NhanKhau values('249862324512','SHK132328951',3,'2/1/2018',N'Con')
insert into NhanKhau values('346236569456','SHK132328951',4,'2/1/2018',N'Con')
insert into NhanKhau values('846232541236','SHK132328951',5,'1/1/2018',N'Chủ hộ')


delete from NguoiDungUngDung

select * from NguoiDungUngDung
select * from ThongTinCaNhan
select * from SoHoKhau
select * from NhanKhau


