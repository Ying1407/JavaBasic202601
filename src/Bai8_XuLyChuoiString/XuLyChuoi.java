package Bai8_XuLyChuoiString;

public class XuLyChuoi {
    public static void main(String[] args) {

        String str1 = "Selenium Java - Web Test Automation";
        String str2 = "Playwright Java  - Web&API Test Automation";


        System.out.println(str1.toUpperCase());//chuyển toàn bộ sang chữ viết hoa
        System.out.println(str1.toLowerCase());//chuyển toàn bộ sang chữ viết thường

        //Lấy ra ký tự tại vị trí n
        System.out.println(str1.charAt(0));// Bắt đầu bằng số 0

        System.out.println("++++++++++++++");
        //Độ dài chuỗi
        System.out.println(str1.length());// Độ dài toàn bộ chuỗi
        System.out.println(str1.substring(16));// bắt đầu từ vị trí số 16
        System.out.println(str1.substring(16,19));

        System.out.println("++++++++++++");
        //So sánh
        System.out.println("Có chứa chuỗi Selenium: "+str1.contains("Selenium"));// So sánh có chuỗi có chứa phần tử "N" không?
        System.out.println("Có chứa chuỗi Playwright: "+str1.contains("Playwright"));

        System.out.println(str1.equals("Selenium Java - Web Test Automation")); // So sánh bằng
        System.out.println(str2.equals("Playwright"));


        System.out.println("***************");//áp dụng trong autotest
        String textTableFooter = "Showing 1 to 25 of 40 entries";
        //Lấy số 40 trong chuỗi
        System.out.println(textTableFooter.substring(19,21)); //cách 1: không tốt lắm

        //cách 2 - Tách chuỗi thành các mảng theo khoảng trắng - sử dụng split
        String mangGiaTriSauTach[] = textTableFooter.split(" ");
        System.out.println(mangGiaTriSauTach[5]);


        System.out.println("***************");
        //Kiểm tra chuỗi bị rỗng hay không?
        String chuoi1 = "";
        String chuoi2 = " ";
        boolean check = chuoi1.isEmpty();
        System.out.println(check);
        System.out.println(chuoi2.isEmpty());
        //isEmpty có khoảng trắng thì không phải chuỗi rỗng
        // Tức là có không có khoảng trắng là TRUE, có là FLASE

        System.out.println(chuoi1.isBlank());
        System.out.println(chuoi1.isBlank());
        //Blank có khoảng trắng là chuỗi rỗng
        //Tức là không có khoảng trắng là FLASE


        System.out.println("***************");
        //Nối chuỗi
        String str3 = "Thư viện automation: "+"Selenium";
        System.out.println(str3);
        System.out.println(str3.concat(" Playwrigth"));

        //Thay thế chuỗi
        System.out.println(str1.replace("Java","C#"));
        String str4 = " Selenium Java Selenium C# Selenium Python";
        System.out.println(str4.replaceAll("Selenium", "Playwright"));//Thay thế toàn bộ chữ Selenium

        System.out.println("+++++++++++++++++++++");
        //Kiểm tra chuỗi có bắt đầu hoặc kết thức bằng giá trị "n" hay không?
        System.out.println("startsWith: "+str1.startsWith("Selenium"));
        System.out.println("endsWith: "+str1.endsWith("Automation"));


        System.out.println("+++++++++++++++++++++");
        //Loại bỏ khoảng trắng đầu và cuối
        String str5 = " Kiểm thử phần mềm ";
        System.out.println(str5.trim());
        System.out.println(str5);
        System.out.println(str5.trim().replaceAll(" ",""));

        System.out.println("+++++++++++++++++++++");
        //Chuyển đổi số thành chuỗi
        String stringNumber = "1000";
        int number = 2000;
        System.out.println(stringNumber + 5);
        System.out.println("Chuyển số thành chuỗi:" + (String.valueOf(number) + 10));//
        System.out.println("Chuyển chuỗi số thành số:" + (Integer.valueOf(stringNumber) + 5));

        System.out.println("Chuyển số thành chuỗi:" + String.valueOf(number) + 10);// Ghep chuoi
        System.out.println("Chuyển chuỗi số thành số:" + Integer.valueOf(stringNumber) + 5);



    }
}
