package StaticJava;

public class KhoiStatic {

    static String browser = "";

    static String getBrowser(){
        return browser;
    }
    static  {//Không có dấu ngoặc tròn nên không thể truyền tham số, chỉ đc phép gọi để chạy
        //Dùng để setup dữ liệu trước khi run testcase
        System.out.println("Browser Initialized");
        browser = System.getProperty("browser");
        getBrowser();
    }
    public static void main(String[] args) {
        System.out.println("Chạy test case");
    }
}
