package BaiTapJava03;

public class ToanTuQH_Logic {
    public static void main(String[] args) {

        // Tạo ra ba biến
        int a = 14;
        int b = 11;
        int c = 22;

        // Toán tử quan hệ
        System.out.println(a > b);
        System.out.println(b < c);
        System.out.println(a == c);

        // Tạo thêm biến
        int oderCount = 10;
        Boolean Membership = true;
        String customerName = "Ying";

        //Toán tử logic AND
        if(oderCount == 10 && ( Membership || customerName.equals("Yeon"))){
            System.out.println("Được giảm giá");
        }

        //Toán tử logic OR
        if (!(oderCount < 10) || (Membership && customerName.equals("Ying"))){
            System.out.println("Được nhận miễn phí một cốc Americano");
        }


    }




}
