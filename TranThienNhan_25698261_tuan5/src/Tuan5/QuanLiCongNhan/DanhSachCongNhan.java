package Tuan5.QuanLiCongNhan;
import java.util.Scanner;

public class DanhSachCongNhan {
    private CongNhan[] ds;
    private int count;
//hàm construct khởi tạo danh sách công nhân mới
    //nếu khởi tạo mà danh sách có độ dài n <0 , có nghĩa là hệ thống lỗi và tạo ds mới  
    //với giới hạn 0 công nhân , để không bị lỗi
    public DanhSachCongNhan(int n) {
        if (n <= 0) {
            this.ds = new CongNhan[0];
        } else {
            this.ds = new CongNhan[n];
        }
        this.count = 0;
    }
//method thêm công nhân mới , nếu sl count công nhân bé hơn độ lớn của danh sách thì có thể nhập 
//Công nhân mới , còn ngược lại quá giới hạn công nhân trong ds thì trả 
    public boolean themCongNhan(CongNhan cn) {
        if (this.count < this.ds.length) {
            this.ds[this.count] = cn;
            this.count++;
            return true;
        }
        return false;
    }
//Hàm xuất thông tin của công nhân, count bao nhiêu trong danh sách thì in ra bấy nhiêu
//chứ không in ra toàn bộ độ dài danh sách vì có khi xuất hiện null.
    public void xuatToanBo() {
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.ds[i].toString());
        }
    }
//trả về số lượng công nhân thông qua biến đếm count
    public int tinhSoLuong() {
        return this.count;
    }
// giống hàm xuất toàn bộ công nhân nhưng mà gán thêm điều kiện là số SP > 200
    public void xuatCongNhanTren200SP() {
        for (int i = 0; i < this.count; i++) {
            if (this.ds[i].getmSoSP() > 200) {
                System.out.println(this.ds[i].toString());
            }
        }
    }
// dùng thuật toán sort để sắp xếp nhân viên theo số lượng SP giảm 
    public void sapXepGiamDanTheoSP() {
        for (int i = 0; i < this.count - 1; i++) {
            for (int j = i + 1; j < this.count; j++) {
                if (this.ds[i].getmSoSP() < this.ds[j].getmSoSP()) {
                    CongNhan temp = this.ds[i];
                    this.ds[i] = this.ds[j];
                    this.ds[j] = temp;
                }
            }
        }
    }
 //câu c . hàm main dùng để nhập lựa chọn và vận hành quản lí danh sách
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            

            System.out.print("Nhap so luong toi da cua danh sach: ");
            int n = sc.nextInt();
            DanhSachCongNhan danhSach = new DanhSachCongNhan(n);
            
            int choice;
            do {
                System.out.println("\n===== MENU QUAN LY CONG NHAN =====");
                System.out.println("1. Them mot cong nhan");
                System.out.println("2. Xuat toan bo thong tin cong nhan vien");
                System.out.println("3. Tinh so luong cong nhan vien co trong danh sach");
                System.out.println("4. Xuat thong tin cac cong nhan lam tren 200 san pham");
                System.out.println("5. Sap xep cong nhan theo so san pham giam dan");
                System.out.println("0. Thoat chuong trinh");
                System.out.print("Nhap lua chon cua ban: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("\n--- Nhap Thong Tin Cong Nhan ---");
                        System.out.print("Nhap Ma CN: ");
                        int ma = sc.nextInt();
                        sc.nextLine();  
                        
                        System.out.print("Nhap Ho: ");
                        String ho = sc.nextLine();
                        
                        System.out.print("Nhap Ten: ");
                        String ten = sc.nextLine();
                        
                        System.out.print("Nhap So San Pham: ");
                        int sp = sc.nextInt();
                        
                        CongNhan cn = new CongNhan(ma, ho, ten, sp);
                        

                        if (danhSach.themCongNhan(cn)) {
                            System.out.println("=> Them cong nhan thanh cong!");
                        } else {
                            System.out.println("=> Them that bai! Danh sach da dat kich thuoc toi da.");
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n--- Toan Bo Danh Sach Cong Nhan ---");
                        danhSach.xuatToanBo();
                        break;
                        
                    case 3:
                        System.out.println("\n=> So luong cong nhan hien co: " + danhSach.tinhSoLuong());
                        break;
                        
                    case 4:
                        System.out.println("\n--- Danh Sach Cong Nhan > 200 San Pham ---");
                        danhSach.xuatCongNhanTren200SP();
                        break;
                        
                    case 5:
                        danhSach.sapXepGiamDanTheoSP();
                        System.out.println("\n=> Da sap xep xong! Vui long chon chuc nang 2 de xem ket qua.");
                        break;
                        
                    case 0:
                        System.out.println("Cam on da su dung chuong trinh!");
                        break;
                        
                    default:
                        System.out.println("Lua chon khong hop le, vui long chon lai!");
                }
            } while (choice != 0);
            
            sc.close();
        }
    }
}