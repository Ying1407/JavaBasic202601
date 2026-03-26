package StaticJava;

public class LoginTest {

    public void testLoginSuccess(){
        System.out.println(ConfigData.browser);

        PhuongThucStatic.clickElement("Search input");
        PhuongThucStatic.setText("10", "Search input"); //muốn gọi hàm static thì phải lấy tên class


        PhuongThucStatic.clickElement("Add customer button");
        PhuongThucStatic.setText("10", "VAT");
        PhuongThucStatic.setText("Cần Thơ", "Address");


    }

    public static void main(String[] args) {
        LoginTest object1 = new LoginTest();
        object1.testLoginSuccess();
    }
}
