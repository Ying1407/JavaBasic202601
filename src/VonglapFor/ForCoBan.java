package VonglapFor;

public class ForCoBan {

    public static void main(String[] args) {
        //main de chay doan code, bat buoc co

        //Khai báo vòng lặp for

        for(int i = 0; i<=10; i+=2){
            System.out.println("Selenium Java: " + i);//cộng số thứ tự như selenium java 1,2,3..
        }

        //Dùng để lặp một đoạn code bất kỳ- chức năng duy nhất có ở for cơ bản

        for(int i = 1; i<=10; i++){
            System.out.println("Navigate to url..");
            System.out.println("enter email:");
            System.out.println("enter password:");
            System.out.println("Click login button");

        }

        //Duyệt mảng hoặc arraylist để kiểm tra từng phần tử trong mảng
        // Mảng để lưu trữ các phần tử chuỗi hoặc phần tử

        //[2,5,6,8,9,24,0] //chuỗi phần tử bên trong
        //["Dashboard","Customer"]

        //Khai bao mảng
        int mang1[] = new int[]{2,5,6,8,9,24,0};
        String mang2[] = new String[]{"Dashboard","Customer"};

        //Duyet mảng bên trên

        for (int i = 0; i < mang1.length ; i++) {
            System.out.println(mang1[i]);

        }

        for (int i = 0; i < mang2.length; i++){
            System.out.println(mang2[i]);
        }



    }
}
