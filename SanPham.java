package lab2;
public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void xuat() {
        System.out.println("Tên SP: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập tên SP: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }
}
