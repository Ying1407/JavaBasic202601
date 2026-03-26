package BaiTapJava01;

public class SinhVien {
    //Khai báo biến instance
    String name = "Ying Ying";
    int age = 27;

    // Khai báo biến static
    public static String type = "Chính quy";

    //Khai báo biến local
    public void getInfor1(){
        String Class = "Ngôn ngữ";
        System.out.println(Class); // gọi trực tiếp trong hàm, không gọi ở main được.
    }

    //Hàm main
    public static void main(String[] args){
        System.out.println(type); // gọi biến static trực tiếp

        // Gọi các biến không phải static
        SinhVien sv1 = new SinhVien();
        sv1.getInfor1(); //local
        System.out.println(sv1.name);//instance
        System.out.println(sv1.age); //instance

        //Khai báo các biến static ở class Thông tin
        System.out.println(ThongTin.UniversityName); //Gọi trực tiếp thông qua class (chỉ mỗi static)
        System.out.println(ThongTin.adress);

    }



}
