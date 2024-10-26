package entity;

public class CaLamViec {
    private String maCa;
    private String tenCa;
    private String gioBatDau;
    private String gioKetThuc;

    public CaLamViec(String maCa, String tenCa, String gioBatDau, String gioKetThuc) {
        this.maCa = maCa;
        this.tenCa = tenCa;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    public String getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(String gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public String getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(String gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    @Override
    public String toString() {
        return String.format("CaLamViec [maCa=%s, tenCa=%s, gioBatDau=%s, gioKetThuc=%s]", 
            maCa, tenCa, gioBatDau, gioKetThuc);
    }
}
