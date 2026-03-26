package Variable;

public class DemoVariable2 {

     String name = "Ying Ying"; //Biến toàn cục ( không thuộc hàm nào khác)- được sử dụng cho nhiềuu hàm khác nhau
    //Biến toàn cục có thể có phạm vi truy cập, biến local thì không
    // Biến không có static thì không được phép gọi trong hàm static

    public static int age = 30; //Đây là biến static-lưu trữ giá trị để sử dụng được trong hàm static/ hoặc hàm bình thường
    //dùng để lưu trữ giá trị có thể cập nhật được/ hoặc gọi trực tiếp thông qua tên class

    //Cấu trúc của một hàm
    public void getInfo1(){
        String address = "Han Quoc";// Biến local-chỉ sử dụng trong hàm getInfo1đó, không được mang ra ngoài

        System.out.println(address);
        System.out.println(name);
    }

    public void getInfo2(){
        String address = "Viet Nam";

        System.out.println(name);
        System.out.println(address);
    }

// Đây là hàm static (hàm main)
    public static void main(String[] args) {
        System.out.println(age);// gọi trực tiếp
        System.out.println(DemoVariable2.age);//Chỉ những biến static mới được phép gọi qua tên class


        //Gọi hàm không có static-phải thông qua đối tượng class
        DemoVariable2 demo2 = new DemoVariable2();
        demo2.getInfo1();
        demo2.getInfo2();
        System.out.println(demo2.name);


    }
}
