package nhan25698261;
class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, 
                           String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setChuyenNganh(chuyenNganh);
        setSucChua(sucChua);
        setCoBonRua(coBonRua);
    }

    public String getChuyenNganh() { return chuyenNganh; }
    public void setChuyenNganh(String chuyenNganh) { this.chuyenNganh = chuyenNganh; }
    public int getSucChua() { return sucChua; }
    public void setSucChua(int sucChua) { 
    	if (sucChua < 0 ) throw new IllegalArgumentException("suc chua phai lon hon hoac bang 0");
    	this.sucChua = sucChua; }
    public boolean isCoBonRua() { return coBonRua; }
    public void setCoBonRua(boolean coBonRua) { this.coBonRua = coBonRua; }

    @Override
    public boolean isDatChuan() {
        return isDuAnhSang() && coBonRua;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Thí Nghiệm | Ngành: %s, Sức chứa: %d, Bồn rửa: %s]", 
                chuyenNganh, sucChua, coBonRua ? "Có" : "Không");
    }
}