package Bai8_XuLyChuoiString;

public class EmptyBlank {
    public static void main(String[] args) {

        String chuoi1 = "";
        String chuoi2 = "   Test     ";

        if(chuoi2.isEmpty() == true){
            System.out.println("Rỗng");
        }else {
            System.out.println("Không rỗng");
        }

        //Nếu hệ thống chấp nhận khoảng trắng: dùng isEmpty()
        //Nếu hệ thống không chấp nhận khoảng trắng: dùng isBlank() - khi đó nếu isBlank trả ra true thì TC fail
    }
}
