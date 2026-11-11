package nhan25698261;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyDanhSachPhongHoc {
    // Khai báo danh sách Generic kiểu Lớp Cha
    private List<PhongHoc> ds = new ArrayList<>();

    // 1. Thêm phòng học (chặn trùng mã)
    public boolean themPhongHoc(PhongHoc ph) {
        if (ph == null || ds.contains(ph)) {
            return false; // Trùng mã
        }
        return ds.add(ph);
    }

    // 2. Tìm kiếm phòng học theo mã
    public PhongHoc timKiem(String maPhong) {
        for (PhongHoc ph : ds) {
            if (ph.getMaPhong().equalsIgnoreCase(maPhong)) {
                return ph;
            }
        }
        return null;
    }

    // 3. Xóa phòng học khi biết mã
    public boolean xoaPhongHoc(String maPhong) {
        PhongHoc ph = timKiem(maPhong);
        if (ph != null) {
            return ds.remove(ph);
        }
        return false;
    }

    // 4. Lấy danh sách các phòng học đạt chuẩn
    public List<PhongHoc> getDanhSachDatChuan() {
        List<PhongHoc> res = new ArrayList<>();
        for (PhongHoc ph : ds) {
            if (ph.isDatChuan()) {
                res.add(ph);
            }
        }
        return res;
    }

    // 5. Cập nhật số máy tính cho phòng máy tính
    public boolean capNhatSoMayTinh(String maPhong, int soMayMoi) {
        if (timKiem(maPhong) instanceof PhongMayTinh pmt) {
            pmt.setSoMayTinh(soMayMoi);
            return true;
        }
        return false;
    }

    // 6. Sắp xếp tăng dần theo Dãy nhà
    public void sapXepTheoDayNha() {
        ds.sort(Comparator.comparing(PhongHoc::getDayNha));
    }

    // 7. Sắp xếp giảm dần theo Diện tích
    public void sapXepTheoDienTichGiamDan() {
        ds.sort(Comparator.comparingDouble(PhongHoc::getDienTich).reversed());
    }

    // 8. Lấy danh sách phòng máy tính có đúng 60 máy
    public List<PhongMayTinh> getDanhSachPhongMayTinh60May() {
        return ds.stream()
                .filter(ph -> ph instanceof PhongMayTinh pmt && pmt.getSoMayTinh() == 60)
                .map(ph -> (PhongMayTinh) ph)
                .toList(); 
    }
    

 // In danh sách ra màn hình
    public void xuatDanhSach(List<? extends PhongHoc> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        list.forEach(System.out::println);
    }

    public void xuatToanBo() {
        xuatDanhSach(this.ds);
    }
}