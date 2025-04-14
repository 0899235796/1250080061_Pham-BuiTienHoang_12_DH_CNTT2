package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a.
        System.out.print("Nhap so lương phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // b.
        System.out.print("Mang vua nhap: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // c.
        System.out.print("Nhap so nguyen x can tim: ");
        int x = scanner.nextInt();
        boolean timThay = false;
        System.out.print("Vi tri cua x trong mang: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay " + x + " trong mang.");
        } else {
            System.out.println();
        }
        // d.
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang: " + max);
        // e.
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang: " + min);
        // f.
        System.out.print("Vi tri cua phan tu lon nhat: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // g.
        Arrays.sort(arr);
        System.out.print("Mang sau khi sap xep tang dan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
