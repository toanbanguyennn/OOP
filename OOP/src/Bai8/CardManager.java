package Bai8;

import Bai6.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class CardManager {
    public ArrayList<Card> cards = new ArrayList<>();
    private Bai6.Student createStudent(Scanner scanner) {
        System.out.println("Nhập vào tên của Học Sinh");
        String name = scanner.next();
        System.out.println("Nhập vào tuổi của Học sinh");
        int age = scanner.nextInt();
        System.out.println("Nhập vào quê quán của Học sinh");
        scanner.nextLine();
        String address = scanner.nextLine();
        return new Student(name, age, address);
    }


}
