package nhan25698261;
public class Main {
    public static void main(String[] args) {
        QuanLyDanhSachPhongHoc ql = new QuanLyDanhSachPhongHoc();

        // 1. Hardcode dữ liệu mẫu
        ql.themPhongHoc(new PhongLyThuyet("LT101", "A", 60.0, 8, true));   // Đạt chuẩn
        ql.themPhongHoc(new PhongLyThuyet("LT102", "C", 80.0, 4, false));  // Không đạt
        ql.themPhongHoc(new PhongMayTinh("PM201", "B", 50.0, 6, 30));      // Đạt chuẩn
        ql.themPhongHoc(new PhongMayTinh("PM202", "A", 90.0, 10, 60));     // 60 máy tính, Đạt
        ql.themPhongHoc(new PhongThiNghiem("TN301", "B", 100.0, 12, "Hóa Học", 40, true)); // Đạt
        ql.themPhongHoc(new PhongThiNghiem("TN302", "C", 70.0, 5, "Sinh Học", 30, false));  // Không đạt

        System.out.println("================ 1. TOÀN BỘ DANH SÁCH PHÒNG HỌC ================");
        ql.xuatToanBo();

        System.out.println("\n================ 2. DANH SÁCH PHÒNG HỌC ĐẠT CHUẨN ================");
        ql.xuatDanhSach(ql.getDanhSachDatChuan());

        System.out.println("\n================ 3. SẮP XẾP TĂNG DẦN THEO DÃY NHÀ ================");
        ql.sapXepTheoDayNha();
        ql.xuatToanBo();

        System.out.println("\n================ 4. SẮP XẾP GIẢM DẦN THEO DIỆN TÍCH ================");
        ql.sapXepTheoDienTichGiamDan();
        ql.xuatToanBo();

        System.out.println("\n================ 5. TÌM KIẾM PHÒNG 'PM201' ================");
        PhongHoc phTim = ql.timKiem("PM201");
        System.out.println(phTim != null ? phTim : "Không tìm thấy!");

        System.out.println("\n================ 6. CẬP NHẬT SỐ MÁY PHÒNG 'PM201' THÀNH 25 ================");
        ql.capNhatSoMayTinh("PM201", 25);
        System.out.println(ql.timKiem("PM201"));

        System.out.println("\n================ 7. PHÒNG MÁY TÍNH CÓ ĐÚNG 60 MÁY ================");
        ql.xuatDanhSach(ql.getDanhSachPhongMayTinh60May());

        System.out.println("\n================ 8. XÓA PHÒNG 'LT102' VÀ IN LẠI ================");
        ql.xoaPhongHoc("LT102");
        ql.xuatToanBo();
    }
}