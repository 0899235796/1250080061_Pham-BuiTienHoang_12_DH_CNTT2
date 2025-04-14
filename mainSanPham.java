package lab2;

public class mainSanPham {
    public static void main(String[] args) {
        // Tạo đối tượng SanPham
        SanPham sp = new SanPham();

        // Nhập thông tin sản phẩm
        System.out.println("=== Nhập thông tin sản phẩm ===");
        sp.nhap();

        // Xuất thông tin sản phẩm
        System.out.println("\n=== Thông tin sản phẩm ===");
        sp.xuat();
    }
}

