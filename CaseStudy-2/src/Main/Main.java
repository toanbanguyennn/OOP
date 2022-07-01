package Main;

import Login.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        login.readFileData();
        int choice;
        do {
            System.out.println("1 : Đăng nhập ");
            System.out.println("2 : Đăng kí tài khoản ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login.inputAccount(scanner);
                    break;
                case 2:
                    login.addAccount(scanner);
                    break;

            }
        } while (choice != 0);
    }

}
