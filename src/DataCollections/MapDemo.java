package DataCollections;

import StaticJava.ConfigData;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //Dạng key - value
        //Khai báo Map
        Map<String,String> map = new HashMap<>();// sắp xếp theo thứ tự dùng TreeMap

        //Thêm dữ liệu
        map.put("browser","chorme");
        map.put("OS","windows");
        map.put("headless","true");
        map.put("browser","edge");// Trùng lặp key nên giữ giá trị của key cuối cùng
        map.put("screenshot","true");

        //In ra
        //Truy xuất giá trị theo từng key
        System.out.println(map.get("OS"));

        System.out.println("++++++++");

        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("********");
        //Thêm,xoá, kiểm tra
        map.remove("headless");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("+++++++++++");
        //Kiểm tra key và value
        System.out.println("check key headless: "+ map.containsKey("headless"));
        System.out.println("check value edge: "+ map.containsValue("edge"));


        System.out.println("&&&&&&7777");
        if(map.containsKey("browser")== true){
            System.out.println(map.get("browser"));//nằm trong if là ưu tiên, trong elese là lựa chọn thứ 2
        }else {
            System.out.println(ConfigData.browser);//config này lấy ở staticJava
        }
        


    }
}
