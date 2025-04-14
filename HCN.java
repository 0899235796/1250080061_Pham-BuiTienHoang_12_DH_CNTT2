package lab2;
public class HCN {
    private double chieuDai;
    private double chieuRong;
    public HCN(double dai, double rong) {
        this.chieuDai = dai;
        this.chieuRong = rong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    @Override
    public String toString() {
        return "Hình chữ nhật có:\n" +
               "Chiều dài: " + chieuDai + "\n" +
               "Chiều rộng: " + chieuRong + "\n" +
               "Diện tích: " + tinhDienTich() + "\n" +
               "Chu vi: " + tinhChuVi();
    }
}

