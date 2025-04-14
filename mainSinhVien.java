package lab2;
import java.util.Scanner;
public class mainSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(1250080061, "Pham Bui Tien Hoang", 8.5f, 9.0f);
        SinhVien sv2 = new SinhVien(1250080073, "Nguyen Huynh Huy", 7.5f, 8.0f);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhap ma sinh vien sv3: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhap ho va ten sv3: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.print("Nhap diem LT sv3: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.print("Nhap diem TH sv3: ");
        sv3.setDiemTH(scanner.nextFloat());
        System.out.println("\nDANH SACH SINH VIEN:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "MSSV", "Ho va ten", "diem LT", "diem TH", "diem TB");
        System.out.println("---------------------------------------------------------------");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}
 
