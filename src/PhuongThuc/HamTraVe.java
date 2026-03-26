package PhuongThuc;

public class HamTraVe {

    //Khai báo hàm có trả về gía trị để dùng lại được

    public String getVersion(){
        String version = "1.0.0";//Chỉ cần sửa giá trị một chỗ thì các chỗ khác sẽ thay đổi theo
        return version;// Trả về giá trị và có thể sử dụng ở các trường hợp khác nhau, class khác nhau
    }

    public int getCategoryTotal(){
        int categoryTotal = 100;
        return categoryTotal;
    }

    public float getPriceTotla(){
        float priceTotal = 80.5F;
        System.out.println("Navigate get Cart page");
        System.out.println("Vertify product price");
        System.out.println("Get product total price");

        return priceTotal;
    }

    public static void main(String[] args) {
        HamTraVe object1 = new HamTraVe();

        String version1 = object1.getVersion();
        System.out.println(version1);

        String version2 = object1.getVersion();
        System.out.println(version2);
    }


}
