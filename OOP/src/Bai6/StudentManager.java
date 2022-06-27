package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Scanner scanner, int number) {
        if (number == 1) {
            Student student = createStudentA(scanner);
            students.add(student);
        }
        if (number == 2) {
            Student student = createStudentB(scanner);
            students.add(student);
        }
        if (number == 3) {
            Student student = createStudentB(scanner);
            students.add(student);
        }

    }

    private Student createStudentA(Scanner scanner) {
        System.out.println("Nhập vào tên của Học Sinh");
        String name = scanner.next();
        System.out.println("Nhập vào tuổi của Học sinh");
        int age = scanner.nextInt();
        System.out.println("Nhập vào quê quán của Học sinh");
        scanner.nextLine();
        String address = scanner.nextLine();
        return new Student(name, age, address);
    }

    private Student createStudentB(Scanner scanner) {
        System.out.println("Nhập vào tên của Học Sinh");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Nhập vào tuổi của Học sinh");
        int age = scanner.nextInt();
        System.out.println("Nhập vào quê quán của Học sinh");
        scanner.nextLine();
        String address = scanner.nextLine();
        return new Student(name, age, address);
    }

    public void displayStudent() {
        for (Student value : students) {
            if (value.getAge() == 20) {
                System.out.println(value);
            }
        }
    }

    public void displayStudentDaNang() {
        String name1 = "Da Nang";
        int count = getCountByAddress(name1);
        System.out.println("Tổng số học sinh 23 tuổi ở Da NAng là :" + count);
    }

    private int getCountByAddress(String name1) {
        int count = 0;
        for (Student value : students) {
            if (value.getAge() == 23 && value.getAddress().equals(name1)) {
                count++;
            }
        }
        return count;
    }

    public void displayAllStudent() {
        for (Student value : students) {
            System.out.println(value);
        }

    }
}