package PhuongThuc;

public class HamCoThamSo {
    public int cong2So(int number1, int number2){//tham số dùng để nhận giá trị đầu vào cho cái hàm đó
        return number1 + number2;
    }

    public void loginTest(String email, String password){
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);//cộng chuỗi với giá trị
        System.out.println("Click login button");
        System.out.println("Verify login success");

    }
    public void loginTestWithEmailInvalid(String email, String password){
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);//cộng chuỗi với giá trị
        System.out.println("Click login button");
        System.out.println("Verify login fail");

    }


    public static void main(String[] args) {
        HamCoThamSo object1 = new HamCoThamSo();

        System.out.println(object1.cong2So(5,10));

        object1.loginTest("admin@example", "123456");
        object1.loginTestWithEmailInvalid("admin@emxple", "2345");

    }

}
