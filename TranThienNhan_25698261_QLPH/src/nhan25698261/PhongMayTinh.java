package nhan25698261;

public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setSoMayTinh(soMayTinh);
    }

    public int getSoMayTinh() { return soMayTinh; }
    public void setSoMayTinh(int soMayTinh) {
        if (soMayTinh < 0) throw new IllegalArgumentException("Số máy tính phải >= 0");
        this.soMayTinh = soMayTinh;
    }

    @Override
    public boolean isDatChuan() {
        if (soMayTinh == 0) return false;
        return isDuAnhSang() && (dienTich / soMayTinh <= 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Máy Tính  | Số máy: %d]", soMayTinh);
    }
}