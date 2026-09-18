package Tuan1.baiHinhTron;

public class hinhTron {
	private toaDo tam;
	private double banKinh;
	public final double PI = 3.1416;
	
	public toaDo getTam() {
		return tam;
	}
	
	public void setTam(toaDo tam) {
		this.tam = tam;
	}
	
	public double getBanKinh() {
		return banKinh;
	}
	
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public hinhTron(toaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}
	
	public static void main(String arg[]) {
		// Khởi tạo đối tượng đúng theo cấu trúc lớp toaDo của bạn
		hinhTron h1 = new hinhTron(new toaDo("cua", 3, 4), 12);
		
		System.out.println("Thông tin hình tròn: ");
		System.out.print("Bán kính là: ");
		System.out.println(h1.getBanKinh()); // Dùng getter để đúng chuẩn lập trình hướng đối tượng
		
		System.out.println("Tâm là: " + h1.getTam().getTen() + "(" + h1.getTam().getX() + ", " + h1.getTam().getY() + ")");
	}
}


