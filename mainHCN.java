package lab2;
import java.util.Scanner;
public class mainHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        HCN hcn = new HCN(dai, rong);
        System.out.println("\n" + hcn.toString());
    }
}
