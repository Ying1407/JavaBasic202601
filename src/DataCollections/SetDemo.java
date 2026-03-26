package DataCollections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        //Lưu trữ gía trị không trùng lặp và không theo thứ tự

        Set<String> setTabBrowser = new TreeSet<>(Collections.reverseOrder());//HashSet -Không tự động sắp xếp
        //TreeSet: tự động sắp xếp theo thứ tự gỉam dần /Collections.reverseOrder()- sắp xếp theo thứ tự tăng dần
        setTabBrowser.add("AN123456");
        setTabBrowser.add("PG123456789");
        setTabBrowser.add("AN123456");
        setTabBrowser.add("MN1234KJGOKGJ89");

        //In ra
        for(String tab: setTabBrowser){
            System.out.println(tab);
        }

        System.out.println("++++++++");
        //Kiểm tra phần tử PG123456789
        System.out.println("Kiểm tra phần tử PG123456789: "+ setTabBrowser.contains("PG123456789"));

        System.out.println("++++++++");
        //Xoá phần tử AN123456
        setTabBrowser.remove("AN123456");
        for(String tab: setTabBrowser){
            System.out.println(tab);
        }



    }
}
