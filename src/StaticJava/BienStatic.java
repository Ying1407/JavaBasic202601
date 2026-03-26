package StaticJava;

public class BienStatic {

    public String email = "admin@example.com";

    public static String password = "12345";

    public static void main(String[] args) {

        BienStatic object1 = new BienStatic();// khai bao doi tuong class
        System.out.println(object1.email);

        System.out.println(password); //Biến stactic không phải khởi tạo đối tượng class mà gọi trực tiếp
        System.out.println(BienStatic.password); // lay ten class.tenbien

        System.out.println(ConfigData.browser);
    }

}
