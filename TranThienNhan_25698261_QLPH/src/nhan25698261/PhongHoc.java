package nhan25698261;

import java.util.Objects;

public abstract class PhongHoc {
    // Sử dụng protected để các lớp con truy cập trực tiếp
    protected final String maPhong; // Khóa chính không cho phép sửa sau khi tạo
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    // Constructor đầy đủ
    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        if (maPhong == null || maPhong.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: Mã phòng không được để rỗng!");
        }
        this.maPhong = maPhong;
        setDayNha(dayNha);
        setDienTich(dienTich);
        setSoBongDen(soBongDen);
    }

    // Getter & Setter kèm kiểm tra ràng buộc
    public String getMaPhong() { return maPhong; }
    public String getDayNha() { return dayNha; }
    public double getDienTich() { return dienTich; }
    public int getSoBongDen() { return soBongDen; }

    public void setDayNha(String dayNha) { this.dayNha = dayNha; }
    public void setDienTich(double dienTich) {
        if (dienTich <= 0) throw new IllegalArgumentException("Diện tích phải > 0");
        this.dienTich = dienTich;
    }
    public void setSoBongDen(int soBongDen) {
        if (soBongDen < 0) throw new IllegalArgumentException("Số bóng đèn phải >= 0");
        this.soBongDen = soBongDen;
    }

    // Phương thức chung: Kiểm tra đủ ánh sáng (Trung bình <= 10m2 / 1 bóng đèn)
    public boolean isDuAnhSang() {
        if (soBongDen == 0) return false;
        return (dienTich / soBongDen) <= 10;
    }

    // Phương thức trừu tượng: Lớp con bắt buộc phải @Override
    public abstract boolean isDatChuan();

    // Override equals để so sánh trùng mã phòng (phục vụ cho ArrayList.contains)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PhongHoc other = (PhongHoc) obj;
        return Objects.equals(maPhong, other.maPhong);
    }

    @Override
    public String toString() {
        String datChuanStr = isDatChuan() ? "Đạt chuẩn" : "Không đạt chuẩn";
        return String.format("%-10s %-10s %-10.1f %-10d %-15s", 
                maPhong, dayNha, dienTich, soBongDen, datChuanStr);
    }
}