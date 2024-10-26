package entity;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String soDienThoai;
    private String diaChi;
  
    public KhachHang(String maKH, String tenKH, String soDienThoai, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return String.format("KhachHang [maKH=%s, tenKH=%s, soDienThoai=%s, diaChi=%s]", 
            maKH, tenKH, soDienThoai, diaChi);
    }
}
