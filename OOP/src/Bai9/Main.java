package Bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReceiptManager receiptManager = new ReceiptManager();
        Scanner scanner = new Scanner(System.in);

        receiptManager.readFile2();
//        receiptManager.readFile();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add Hoa Đơn :");
            System.out.println("2. Display All:");
            System.out.println("3. Update :");
            System.out.println("4. Delete :");
            System.out.println("0. Exit:");
            while (true){
                try{
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("Lỗi");
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1: receiptManager.addReceipt(scanner);
                    break;
                case 2:  receiptManager.displayAll();
                    break;
                case 3: receiptManager.updateReceipt(scanner);
                    break;
                case 4:receiptManager.deleteReceipt();
                    break;
            }
        } while (choice != 0);
    }
}
