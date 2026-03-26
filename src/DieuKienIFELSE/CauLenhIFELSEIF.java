package DieuKienIFELSE;

public class CauLenhIFELSEIF { //Kiểm thử case phân quyền

    public void checkRoleAnsMenuDisplay (String role){
        if (role.equals("Admin")){
            System.out.println("Thấy hết 15 menu");//Dùng autoTest để check đủ 15 menu
        } else if (role.equals("Customer")) {
            System.out.println("Thấy được 5 menu");
        } else if (role.equals("EmM")) {
            System.out.println("Chuyển đến trang User Home luôn");
        }else {
            System.out.println("Chuyển đến trang Manager");
        }

        //Bên trên có thể thay thế thành 4If
    }


    public static void main(String[] args) {

        float diemTrungBinh = 1F;//Thay đổi thông số

        if(diemTrungBinh >=8){
            System.out.println("Học sinh giỏi");
        } else if (diemTrungBinh < 8 && diemTrungBinh >= 6.5) {
            System.out.println("Học sinh khá");
        } else if (diemTrungBinh < 6.5 && diemTrungBinh >= 5) {
            System.out.println("Học sinh trung bình");
        } else if (diemTrungBinh <5 && diemTrungBinh >= 2) {
            System.out.println("Học sinh yếu");
        } else {// Ngược lại của các điều kiện bên trên
            System.out.println("Ở lại lớp");
        }
    }
}
