package DieuKienIFELSE;

public class CauLenhIFELSE {
    public static void main(String[] args) {

        String actualCustomerNam = "Ying0123";// Từ AutoTést lấy được
        int customerID = 123;

        if(actualCustomerNam.equals("Ying01") && customerID == 123){ //equals là bằng trong chuỗi
            System.out.println("Test case Add New Customer passed.1");
        }else {
            System.out.println("Test case Add New Customer failed."); //đáp ứng đầy đủ kết quả trả về
            // đúng cũng có kết quả trả về mà sai cũng có kết quả trả về.
        }
    }
}
