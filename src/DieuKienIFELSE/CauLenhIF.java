package DieuKienIFELSE;

public class CauLenhIF { //thường là toán tử quan hệ lớn, bé...

    public void createBrowser (String browers){

        String browersSystem = System.getProperty("browers");
        if (browersSystem != null){
            browers = browersSystem;
        }

        System.out.println(browers);

    }
    public static void main(String[] args) {

        String actualCustomerNam = "Ying0123";// Từ AutoTést lấy được
        int customerID = 123;

        if(actualCustomerNam.equals("Ying01") || customerID == 123){ //equals là bằng trong chuỗi
            System.out.println("Test case Add New Customer passed.1");
        }

        if (customerID == 123){
            System.out.println("Test case Add New Customer passed.2");
        }
    }

}
