package MangArray;

public class MangChuoiMenu {
    public static void main(String[] args) {

        String menuList[] = new String[]{"Databoard","Customers","Project","Tasks"};
        boolean checkMenu = false;

        for (String menu: menuList){
            System.out.println(menu);

            if (menu.equals("Customers123")){
                System.out.println("Có chứa menu Customers123.");
                checkMenu = true;
                break;//Thoát luôn vòng lặp For, không kiểm tra tiếp.
            }
        }

        if (checkMenu == true){
            System.out.println("Có chứa menu Customers123.");
            System.out.println("Không tồn tại menu Customers123.");
        }
    }
}
