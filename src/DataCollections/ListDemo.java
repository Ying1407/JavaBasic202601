package DataCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //List cho phép lưu trữ gía trị trùng
        //Dữ liệu có thứ tự


        //Khai báo List dạng 1
        List <String> listMenu = new ArrayList<>();

        //Khai báo List dạng 2
        ArrayList<String> listMenu2 = new ArrayList<>();

        //Thêm phần tử vào List
        listMenu.add("Dashboard");
        listMenu.add("Custoomers");
        listMenu.add("Projects");
        listMenu.add("Tasks");
        listMenu.add("Dashboard");
        listMenu.add("Contracts");
        listMenu.add("Projects");



        //Get phần tử theo vị trí (bắt đầu là 0)
        System.out.println(listMenu.get(2));
        System.out.println("++++++++");

        //Duyệt các phần tử của list - dùng vòng lặp for
        for (String  menu: listMenu){
            System.out.println(menu);
        }

        System.out.println("==============");

        //Thêm phần tử
        listMenu.add("Reports");

        // Thêm phần tử theo vị trí chỉ định
        listMenu.add(1,"Supports");//vị trí bắt đầu là 0-1-2...
        for (String  menu: listMenu){
            System.out.println(menu);
        }

        System.out.println("=============");
        //Xoá phần tử
        listMenu.remove("Dashboard");//Xoá giá trị dashboard đầu tiên
        for (String  menu: listMenu){
            System.out.println(menu);
        }

        System.out.println("=========");

        //Kiểm tra giá trị trong list
        System.out.println("Kiểm tra menu Reporst: "+listMenu.contains("Reports"));

        System.out.println("***************");
        //Khai báo list menu1 và so sánh 2 list
        List<String> listMenu1 = new ArrayList<>();
        listMenu1.add("Dashboard");
        listMenu1.add("Custoomers");
        listMenu1.add("Projects");
        listMenu1.add("Tasks");
        listMenu1.add("Dashboard");
        listMenu1.add("Contracts");
        listMenu1.add("Projects");

        for (String  menu: listMenu1){
            System.out.println(menu);
        }

        System.out.println("So sánh 2 list: "+ listMenu.equals(listMenu1));// So sánh 2 list

        System.out.println("__________");
        //Sắp xếp phần tử tắng dần
        Collections.sort(listMenu);
        for (String menu: listMenu){
            System.out.println(menu);
        }
    }
}
