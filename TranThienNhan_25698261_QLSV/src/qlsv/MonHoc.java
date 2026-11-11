package qlsv;

public enum MonHoc {

	LAP_TRINH_JAVA("lap trinh java",450_000f),
	CO_SO_DU_LIEU("co so du lieu",450_000f),
	TOAN_ROI_RAC("toan roi rac",400_000f),
	MANG_MAY_TINH("mang may tinh",500_000f),
	TRI_TUE_NHAN_TAO("tri tue nhan tao",600_000f),
   	KY_THUAT_PHAN_MEM("ky thuat phan mem",480_000f),
	LAP_TRINH_WEB("lap trinh web",500_000f),
	HE_DIEU_HANH("he dieu hanh",420_000f); 
	
	private final String tenMon;
	private final float donGia;
	
	private MonHoc(String tenMon, float donGia) {
		this.tenMon = tenMon;
		this.donGia = donGia;
	}
	
	public String getTenMon() {
		return tenMon;
	}
	
	public float getDonGia() {
		return donGia;
	}
	
	public static MonHoc fromTenMon(String tenMon) {
		for (MonHoc mh: values())
			if (mh.tenMon.equalsIgnoreCase(tenMon))
				return mh;
		return null;
			
	}
	@Override
	public String toString() {
		return String.format("%s (%,.0f VND/TC)", tenMon,donGia);
	}
}

	
