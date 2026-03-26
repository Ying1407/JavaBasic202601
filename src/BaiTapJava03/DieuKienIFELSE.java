package BaiTapJava03;

public class DieuKienIFELSE {
        //Tạo biến
        int number = 100;

        //Tạo hàm truyền tham số  "n" - sử dụng hàm không trả về
    public void checkNumber (int n) {

        //dùng câu lệnh if else if vì check nhiều điều kiện
        if(n == number){
            System.out.println(n + "bằng" + number);
        } else if (n < number) {
            System.out.println(n + "nhỏ hơn" + number);
        }else {
            System.out.println(n + "lớn hơn" + number);
        }

    }

    //gọi xuống hàm main
    public static void main(String[] args) {
        DieuKienIFELSE object1 = new DieuKienIFELSE();
        object1.checkNumber(150);
        object1.checkNumber(100);
        object1.checkNumber(50);
    }



}
