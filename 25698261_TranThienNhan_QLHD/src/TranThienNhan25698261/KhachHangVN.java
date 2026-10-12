package TranThienNhan25698261;

import java.time.LocalDate;

class KhachHangVN extends KhachHang {
    private String doiTuong;
    private double dinhMuc;

    public KhachHangVN(String ma, String ten, LocalDate ngay,
                            double soKW, double donGia,
                            String doiTuong, double dinhMuc) {
        super(ma, ten, ngay, soKW, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc  = dinhMuc;
    }

    public String getDoiTuong() { return doiTuong; }
    public double getDinhMuc()  { return dinhMuc; }

    @Override
    public double thanhTien() {
        return soKW <= dinhMuc
            ? soKW * donGia
            : dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2.5;
    }
}