package Login;

import Login.Login;

import java.util.Scanner;

public class MenuAmin {
    public static void Menu() {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        login.readFileData();
        int choice;
        do {
            System.out.println("Quản lí sản phẩm");
            System.out.println("1. Thêm thông tin sản phẩm mới");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa thông sản phẩm");
            System.out.println("4. Hiển thị sản phẩm hiện có");
            System.out.println("5. Xóa hết thông tin sản phẩm");
            System.out.println("0. Quay lại Menu chính");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

            }
        } while (choice != 0);

    }
}
