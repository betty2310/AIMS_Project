public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public double LUONG_MAX;

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double x) {
        if (this.luongCoBan * x <= tinhLuong()) {
            this.heSoLuong = x;
            return true;
        }
        System.out.println("Khong duoc tang!");
        return false;
    }

    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    public void intTTin() {
        System.out.println(this.tenNhanVien + this.tinhLuong());
    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
    }
}
