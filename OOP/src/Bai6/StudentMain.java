package Bai6;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice,choice2;
        do {
            System.out.println("Menu");
            System.out.println("1. Add Học Sinh:");
            System.out.println("2. Display Học sinh 20 tuổi:");
            System.out.println("3. Display Học sinh 23 tuổi ở DaNang:");
            System.out.println("4. Display all hoc sinh:");
            System.out.println("0. Exit:");
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:{
                    System.out.println("1. Lớp A");
                    System.out.println("2. Lớp B");
                    System.out.println("3. Lớp C");
                    choice2 = scanner.nextInt();
                    studentManager.addStudent(scanner, choice2);}
                    break;
                case 2:
                    studentManager.displayStudent();
                    break;
                case 3:
                    studentManager.displayStudentDaNang();
                    break;
                case 4:
                    studentManager.displayAllStudent();
                    break;

            }
        } while (choice != 0);
    }

}
