package TranThienNhan25698261;

import java.time.LocalDate;

abstract class KhachHang {
    protected String    maKhachHang;
    protected String    hoTen;
    protected LocalDate ngayLapHoaDon;
    protected double    soKW;
    protected double    donGia;

    public KhachHang(String ma, String ten, LocalDate ngay,
                     double soKW, double donGia) {
        this.maKhachHang   = ma;
        this.hoTen         = ten;
        this.ngayLapHoaDon = ngay;
        this.soKW          = soKW;
        this.donGia        = donGia;
    }

    public abstract double thanhTien();

    public LocalDate getNgayLapHoaDon() { return ngayLapHoaDon; }
    public String getMaKhachHang()      { return maKhachHang; }
    public String getHoTen()            { return hoTen; }

    @Override
    public String toString() {
        return String.format("%s | %-15s | Ngày: %s | TT: %,12.0f VNĐ",
                maKhachHang, hoTen, ngayLapHoaDon, thanhTien());
    }
}