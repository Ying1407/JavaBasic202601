package ToanTu;

public class ToanTuLogic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println((a > b) && (b < c)); // dùng dấu ngoặc để thể hiện thứ tự ưu tiên bằng ()

        //Điều kiện and (&&)  - chỉ đúng khi tất cả đều đúng
        int age = 20;
        boolean hasID = true;
        String address = "Hà Nội";

        if (age >= 18 && hasID && address.equals("Hàn Quốc")) { //thay vì viết hasID == true, thì không viết cũng được
            System.out.println("Được phép vào");
        }

        //Toán tử Or (||) - chỉ cần một điều kiện T thì tất cả đêu T
        boolean isAdmin = false;
        boolean isManager = true;

        if (isAdmin || isManager) {//Nếu là isadmin hoặc isManager thì có quyền truy câp
            System.out.println("Có quyền truy cập");
        }

        //Toán tử Not (!) - toán tử phủ định ngược lại
        if (!(age > 20)){ //tuơng đương với age < 20 - chú ý có hai dấu ngoặc vì nó là biểu thức.
            System.out.println("Được xét đi NVQS");
        }

        //Gán giá trị - gỉam thiểu được số dòng code
        int number1, number2;
        number1 = number2 = 5;
        System.out.println(number1 + number2);






    }


}
