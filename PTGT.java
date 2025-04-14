package lab2;
public class PTGT {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public PTGT(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public double getTriGia() {
        return triGia;
    }
}

