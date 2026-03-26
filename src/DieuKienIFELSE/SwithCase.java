package DieuKienIFELSE;

public class SwithCase {
    public static void main(String[] args) {

        String browser = "Chrome";// có thể thay bằng edge, firefox, sarafi
        //Kiểm tra trình duyệt mong muốn của người dùng là trình duyệt gì, đoạn code swith case
        // phân loại ra và khởi tạo trình duyệt đó
        switch (browser) {// đưa vào một phép toán, biến để nó trả ra kết quả
            case "Chrome":// tương ứng với một kết quả nào đó.
                System.out.println("Khởi tạo trình duyệt Chrome");
               //WebDrive drive = new ChormeDrive();-Khởi tạo trình duyệt Chorm
                break;// Thoát luôn, không cần phải kiểm tra tiếp- rơi vào trường hợp nào rồi thì dừng
            case "Edge":
                System.out.println("Khởi tạo trình duyệt Edge");
                //WebDrive drive = new EdgeDrive();-Khởi tạo trình duyệt Edge
                break;
            case "Friefox":
                System.out.println("Khởi tạo trình duyệt Friefox");
                break;
            default:// quan tâm kết quả trả ra, không quan tâm điều kiện
                System.out.println("Khởi tạo trình duyệt Defaule là Chrome");
        }
    }
}
//Cần đặt điều kiện thì dùng ifelse, nếu xét kết quả thôi thì dùng swithcase
