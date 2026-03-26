package VonglapFor;

public class ForCaiTien {
    public static void main(String[] args) {


        //Dùng để duyệt từ đầu đến cuối, cú pháp sẽ gọn hơn
        // không dùng để lặp (vì không có điểm bắt đầu và điểm dừng)

        int array1[] = new int[]{5,10,15,20,25,30};

        //Khai báo for cải tiến để Duyệt mảng/arraylist
        for(int tenbien1 : array1){
            System.out.println(tenbien1);
        }

    }


}
