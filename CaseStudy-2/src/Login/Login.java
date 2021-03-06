package Login;

import model.AccountUser;
import model.Account;

import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;

public class Login {
    private final Scanner scanner = new Scanner(System.in);
    public ArrayList<AccountUser> accountUsers = new ArrayList<>();

    public Login() {
    }

    public AccountUser creatAccount(Scanner scanner) {
        System.out.println("1.Mời bạn vui lòng nhập tên đăng nhập mới : ");
        String userAccount = scanner.next();
        System.out.println("2. Mời bạn vui lòng nhập mật khẩu mới: ");
        String userPassword = scanner.next();
        System.out.println("3. Mời bạn nhập địa chỉ");
        String address = scanner.next();
        return new AccountUser(userAccount, userPassword,address);
    }

    public void addAccount(Scanner scanner) {
        AccountUser register = creatAccount(scanner);
        accountUsers.add(register);
        writerFileData(accountUsers);
    }
    public void inputAccount(Scanner scanner) {
        System.out.println("Tài khoản: ");
        String name = scanner.next();
        System.out.println("Mật khẩu: ");
        String password = scanner.next();
        Account admin = new Account(name, password);
        if (checkAdmin(admin)) {
            MenuAmin.Menu();
        } else {
            if(checkAccount(admin)){
                System.out.println("Đăng Nhập TK Thành Công");
                MenuAmin.Menu();
            }
        }
    }
    public boolean checkAdmin(Account admin) {
        if (admin.getName().equals("a") && admin.getPassword().equals("a")) {
            return true;
        } else
            return false;
    }
    public boolean checkAccount(Account admin) {
        for (AccountUser a : accountUsers) {
            if (admin.getName().equals(a.getUserAccount()) && admin.getPassword().equals(a.getUserPassword())) {
                return true;
            }
        }
        return false;
    }
    public void writerFileData(ArrayList<AccountUser> accountUsers) {
        File file = new File("demo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(accountUsers);
            objectOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void readFileData() {
        File file = new File("demo.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            accountUsers = (ArrayList<AccountUser>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("File đã tồn tại");
        }
    }
    public void displayAccount() {
        for (AccountUser a : accountUsers) {
            System.out.println(a);

        }
    }
}