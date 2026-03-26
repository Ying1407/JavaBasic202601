package BaiTapJava01;

public class Calculator {
    //Tạo hàm tính tổng hai số nguyên
    public int cong2So(int a, int b){
        return a + b;
    }

    //Tạo hàm tính tích hai thực
    public double tich2So(double x, double y){
        return x * y;
    }

    //Tạo hàm main và truyền giá trị
    public static void main(String[] args) {
        Calculator object1 = new Calculator();

        System.out.println(object1.cong2So(14,4));
        System.out.println(object1.tich2So(2.5D, 10.5D));



    }


    }

