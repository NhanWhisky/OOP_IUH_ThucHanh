package TranThienNhan25698261;
import java.util.*;
class QuanLyKH implements IQuanLyKH {
    List<KhachHang> ls;

    public QuanLyKH() {
        ls = new ArrayList<KhachHang>(2);
    }

    @Override
    public Boolean themKH(KhachHang kh) {
        if (ls.contains(kh)) {
            return false;
        } else {
            return ls.add(kh);
        }
    }

    @Override
    public boolean capNhat(String ma, double gia) {
        for (KhachHang kh : ls) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean xoaMa(String ma) {
        for (KhachHang kh : ls) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
                ls.remove(kh);
                return true;
            }
        }
        return false;
    }

    @Override
    public void sapXep() {
        Collections.sort(ls, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                String x = new String(o1.getMaKhachHang());
                String y = new String(o2.getMaKhachHang());
                return x.compareToIgnoreCase(y);
            }
        });
    }

    public List<KhachHang> getLs() {
        return ls;
    }

    public void inDanhSach() {
        for (KhachHang kh : ls) {
            System.out.println(kh);
        }
    }
}