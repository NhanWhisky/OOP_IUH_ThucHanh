package TranThienNhan25698261;
import java.time.LocalDate;
public class QuanLyHoaDon_Ver2 {
    public static void main(String[] args) {
        QuanLyKH ql = new QuanLyKH();

        // 1. Thêm khách hàng vào danh sách
        ql.themKH(new KhachHangVN("VN03", "Le Van C", LocalDate.of(2019, 1, 20), 80, 1800, "sản xuất", 60));
        ql.themKH(new KhachHangVN("VN01", "Nguyen Van A", LocalDate.of(2018, 9, 10), 100, 1500, "sinh hoạt", 50));
        ql.themKH(new KhachHangNuocNgoai("NN02", "Yuki Tanaka", LocalDate.of(2018, 8, 15), 120, 3000, "Nhật"));
        ql.themKH(new KhachHangNuocNgoai("NN01", "John Smith", LocalDate.of(2018, 9, 25), 150, 2500, "Mỹ"));

        System.out.println("========== DANH SÁCH BAN ĐẦU ==========");
        ql.inDanhSach();

        // 2. Thử nghiệm cập nhật đơn giá theo mã
        System.out.println("\n========== CẬP NHẬT ĐƠN GIÁ VN01 THÀNH 2200 ==========");
        if (ql.capNhat("VN01", 2200)) {
            System.out.println(">> Cập nhật thành công!");
        }
        ql.inDanhSach();

        // 3. Thử nghiệm sắp xếp theo mã khách hàng (A-Z)
        System.out.println("\n========== DANH SÁCH SAU KHI SẮP XẾP ==========");
        ql.sapXep();
        ql.inDanhSach();

        // 4. Thử nghiệm xóa khách hàng theo mã
        System.out.println("\n========== XÓA KHÁCH HÀNG MÃ NN02 ==========");
        if (ql.xoaMa("NN02")) {
            System.out.println(">> Đã xóa thành công mã NN02!");
        }
        ql.inDanhSach();
    }
}