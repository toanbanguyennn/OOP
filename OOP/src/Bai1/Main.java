package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiCanBo qlcb = new QuanLiCanBo();
        Scanner scanner = new Scanner(System.in);
        qlcb.readCB();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add:");
            System.out.println("2. Seach:");
            System.out.println("3. Add by Index :");
            System.out.println("4. Delete theo Ten :");
            System.out.println("5. Delete by Index :");
            System.out.println("6. Display all:");

            System.out.println("0. Exit:");
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    qlcb.addStaff();
                    break;
                case 2:
                    qlcb.SeachCanBo();
                    break;
                case 3:
                    qlcb.addCanBoByIndex();
                    break;
                case 4:
                    qlcb.DeleteTheoTen();
                    break;
                case 5 :
                    qlcb.DeleteCanBo();
                    break;
                case 6 :
                    qlcb.displayAll();
                    break;
            }
        } while (choice != 0);
    }
}
