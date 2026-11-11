package Tuan5.QuanLiCongNhan;

public class CongNhan {
	private int maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	private double DonGia;
	public int getMaCN() {
		return maCN;
	}
	
	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}

	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	public double tinhLuong() {
	    if (this.mSoSP >= 1 && this.mSoSP <= 199) {
	        DonGia = 0.5;
	    } else if (this.mSoSP >= 200 && this.mSoSP <= 399) {
	        DonGia = 0.55;
	    } else if (this.mSoSP >= 400 && this.mSoSP <= 599) {
	        DonGia = 0.6;
	    } else if (this.mSoSP >= 600) {
	       DonGia = 0.65;
	    }
	    return this.mSoSP * DonGia;
	}

	@Override
	public String toString() {
	    return "CongNhan [maCN=" + maCN 
	            + ", mHo=" + mHo 
	            + ", mTen=" + mTen 
	            + ", mSoSP=" + mSoSP 
	            + ", luong=" + tinhLuong() + "]"; 
	}
}