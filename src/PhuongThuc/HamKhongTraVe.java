package PhuongThuc;

public class HamKhongTraVe {
    //Khai báo hàm thì không được khai báo trong hàm main, vì nó là một hàm độc lập

    //Khai báo hàm không trả về giá trị để dùng lại - xử lý tính toán ra giá trị luôn và không lưu lai được
    //Công dụng của hàm: 1/ gom code lại, chia ra từng phần cho gọn
    //2- dùng để tái sử dụng (gọi đi gọi lại để sử dụng ở các class khác nhau)
    public void showInfo(){ // nếu dùng hàm void thì không sử dụng cho các trường hợp khác được, mà chỉ sử dụng 1 lần được thôi
        String name = "Lan";
        String address = "Hà Nội";
        System.out.println(name);
        System.out.println(address);
    }

    public void displayVersion(){
        String version = "1.0.0";
        System.out.println(version);
    }

    //Hai hàm trên muốn chạy được thì phải gọi xuống hàm main
    public static void main(String[] args) {
      HamKhongTraVe object1 = new HamKhongTraVe(); //cú pháp khởi tạo đối tượng class, vì nó không phải static nên không thể gọi trực tiếp như static
      object1.showInfo();
      object1.displayVersion();

      //String version = object1.showInfo();


    }

}
