package Bai9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptManager {
    public ArrayList<Receipt> receipts = new ArrayList<>();

    public void addReceipt(Scanner scanner) {
        Receipt staff = createReceipt(scanner);
        receipts.add(staff);
        writeListReceipt(receipts);
    }

    private Client createClient(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Nhập vào tên của hộ gia đình");
                String name = scanner.next();
                scanner.nextLine();
                System.out.println("Nhập vào địa chỉ nhà ");
                int address = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập vào mã số công tơ điện");
                double id = scanner.nextDouble();
                scanner.nextLine();
                return new Client(name, address, id);

            } catch (Exception e) {
                System.out.println("Lỗi");
                scanner.nextLine();
            }
        }
    }

    private Receipt createReceipt(Scanner scanner) {
        Client Client = createClient(scanner);
        System.out.println("Nhập vào mã điện cũ");
        double codeOld = scanner.nextDouble();
        System.out.println("Nhập vào mã số điện mới");
        double codeNew = scanner.nextDouble();
        double money = getMoney(codeOld, codeNew);
        return new Receipt(Client, codeOld, codeNew, money);
    }

    private double getMoney(double codeOld, double codeNew) {
        double money = (codeNew - codeOld) * 5;
        return money;
    }

    public void updateReceipt(Scanner scanner) {
        System.out.println("Nhập vào số nhà bạn muốn cập nhật: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (Receipt receipt : receipts) {
            if (num != receipt.getClient().getAddress()) {
                System.out.println("Số nhà không phù hợp mời bạn nhập lại");
            } else {
                System.out.println("Nhập vào tên mới của GĐ :");
                String name = scanner.nextLine();
                receipt.getClient().setName(name);
                System.out.println("Nhập vào số nhà mới GĐ :");
                int address = scanner.nextInt();
                receipt.getClient().setAddress(address);
                System.out.println("Nhập vào mã số : ");
                double id = scanner.nextDouble();
                receipt.getClient().setId(id);
                System.out.println("Nhập vào số điện cũ ");
                double codeOld = scanner.nextDouble();
                receipt.setCodeOld(codeOld);
                System.out.println("Nhập vào số điện mới ");
                double codeNew = scanner.nextDouble();
                receipt.setCodeNew(codeNew);
                double money = getMoney(codeOld, codeNew);
                receipt.setMoney(money);
                writeListReceipt(receipts);
            }
        }
    }

    public void deleteReceipt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nhà bạn muốn xóa: ");
        int number = input.nextInt();
        for (int i = 0; i < receipts.size(); i++) {
            if (receipts.get(i).getClient().getAddress() == number) {
                receipts.remove(i);

            }
        }
    }

    public void displayAll() {
        for (Receipt staff : receipts) {
            System.out.println(staff);

        }
    }

    public void writeListReceipt(ArrayList<Receipt> receipts) {
        File file = new File("demo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(receipts);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile2() {
        File file = new File("demo.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

            receipts = (ArrayList<Receipt>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
