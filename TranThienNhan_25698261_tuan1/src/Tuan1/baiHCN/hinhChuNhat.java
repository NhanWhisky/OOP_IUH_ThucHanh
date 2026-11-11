package Tuan1.baiHCN;

public class hinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double cD) {

		if (cD > 0) {
			this.chieuDai = cD;
		}
		
	}


	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	
	
	public hinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public hinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public double getDienTich() {
		return this.chieuDai*this.chieuRong;
	}
	public double getChuVi() {
		return (this.chieuDai+this.chieuRong)*2;
	}
	public static void main(String[] args) {
		hinhChuNhat h1 = new hinhChuNhat(7,5);
		System.out.println(h1.getChieuDai());
		System.out.println(h1.chieuRong);
		System.out.print("chu vi hinh chu nhat: ");
		System.out.println(h1.getChuVi());
		System.out.print("dien tich hinh chu nhat: ");
		System.out.println(h1.getDienTich());
	}

}
