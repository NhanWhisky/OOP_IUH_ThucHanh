
package nhan25698261;


public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen); // Gọi Constructor của lớp cha
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() { return coMayChieu; }
    public void setCoMayChieu(boolean coMayChieu) { this.coMayChieu = coMayChieu; }

    @Override
    public boolean isDatChuan() {
        return isDuAnhSang() && coMayChieu;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Lý Thuyết | Máy chiếu: %s]", coMayChieu ? "Có" : "Không");
    }
}