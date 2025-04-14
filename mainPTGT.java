package lab2;
public class mainPTGT {
    public static void main(String[] args) {
        PTGT xe1 = new PTGT("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
        PTGT xe2 = new PTGT("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
        PTGT xe3 = new PTGT("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);

        System.out.printf("%-20s %-15s %-10s %-20s %-15s\n", 
                          "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("----------------------------------------------------------------------");

        printVehicleInfo(xe1);
        printVehicleInfo(xe2);
        printVehicleInfo(xe3);
    }

    public static void printVehicleInfo(PTGT v) {
        System.out.printf("%-20s %-15s %-10d %-20.2f %-15.2f\n", 
                          v.getTenChuXe(), v.getLoaiXe(), v.getDungTich(), 
                          v.getTriGia(), v.tinhThue());
    }
}

