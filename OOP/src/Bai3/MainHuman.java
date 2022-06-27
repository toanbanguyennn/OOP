package Bai3;

import java.util.Scanner;

public class MainHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HumanManager human = new HumanManager();
        human.readHuman();
        int choice;
        int choice2;
        do {
            System.out.println("1. Thêm Học Sinh ");
            System.out.println("2. Find Human Theo ID ");
            System.out.println("3. Xoá Human Theo Tên ");
            System.out.println("4. Hiển Thị Thông Tin Học Sinh ");

            System.out.println("0. Thoát Chương Trình ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.println("1. Khối A");
                    System.out.println("2. Khối B");
                    System.out.println("3. Khối C");
                    choice2 = scanner.nextInt();
                    human.addHuman(scanner, choice2);
                }
                break;
                case 2 :human.findHumanById(scanner);
                break;
                case 3: human.deleteHumanByName(scanner);
                break;
                case 4 : human.displayHuman();
                    break;
            }
            System.out.println("-------------------------");
        }
        while (choice != 0) ;
    }

}
