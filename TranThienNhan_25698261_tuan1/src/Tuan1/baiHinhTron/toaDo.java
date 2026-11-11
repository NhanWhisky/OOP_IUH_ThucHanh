package Tuan1.baiHinhTron;

public class toaDo {
	
	private String ten;
	private double x;
	private double y;
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
	
	public toaDo( String ten,double x, double y) {
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	public toaDo() {
		
	}

}
