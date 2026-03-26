package BaiTapJava05;

import java.util.ArrayList;

public class BaiTap05 {
    //Tạo hàm thêm thông tin nhân viên
    static ArrayList<String> Employees = new ArrayList<>();

    //Thêm thông tin của employee
    public static void addEmployee(int ID, String name, int age, String Position) {
        String list = "ID: " + ID + ", Name: " + name + ", Age: " + age + ", Position: " + Position;
        Employees.add(list);

    }

    public static void main(String[] args) {
        //Gọi hàm thêm nhân viên
        addEmployee(1,"Nguyen Van A", 30, "Dev");
        addEmployee(2, "Nguyen Thi B", 28, "BrSe");
        addEmployee(3, "Pham Thi C", 35, "Tester");
        System.out.println("Employees List");

        //Duyệt bằng mảng for
        for (String  menu: Employees){
            System.out.println(menu);
        }
    }

}
