package BaiTapJava04;

import java.util.ArrayList;

public class VongLapFor {
    public static void main(String[] args) {
        //Tạo vòn lặp for để in các số chẵn từ 0 đến 50

        for (int i = 0; i <= 50; i+=2){
            System.out.println(i);// nên sử dụng điều kiện if.
        }

        //Tạo mảng và lưu các số chẵn
        int[] mang1 = new int[26];
        for (int i = 0; i < 26; i++){
            mang1[i] = i * 2;
        }

        //Duyệt mảng để in ra
        for (int i = 0; i < mang1.length; i++) {
            System.out.println(mang1[i]);
        }
            



    }
}
