package MangArray;

public class DemoMang {
    public static void main(String[] args) {
        //Khai báo mảng một chiều
        //Mảng kiểu số nguyên

        int mangSoNguyen[] = new int[3];// Độ dài mảng là 3 phần tử

        //Thêm giá trị vào mảng
        // Vị trí bắt đầu là 0
        mangSoNguyen[0] = 5;
        mangSoNguyen[1] = 10;
        mangSoNguyen[2] = 20;
        //mangSoNguyen[3] = 30; - vượt ngưỡng độ dài là 3 phần tử

        System.out.println("Vị trí thứ hai: " + mangSoNguyen[1]);

        //Duyệt mảng dùng vòng lặp for
        for (int i = 0; i < mangSoNguyen.length; i++){ // Vì liền nhau nên nhảy lên một đơn vị
            System.out.println(mangSoNguyen[i]);
        }
        //i < mangSoNguyen.length - luôn bé hơn độ dài mảng

        System.out.println("************");

        //---Vừa khai báo mảng, vừa khởi tạo giá trị cho mảng
        //Không cần quan tâm kích cỡ của mảng ban đầu
        int mang2[] = new int[]{5,10,20,25,30,35,40};

        System.out.println(mang2[2]);// Khai báo giá trị

        //Duyệt mảng
        for (int i = 0; i < mang2.length; i++){ // Vì liền nhau nên nhảy lên một đơn vị
            System.out.println(mang2[i]);
        }


    }
}
