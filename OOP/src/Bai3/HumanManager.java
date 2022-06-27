package Bai3;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    public ArrayList<Human> humans = new ArrayList<>();

    public void addHuman(Scanner scanner, int number) {
        if (number == 1) {
            khoiA human = createHumanA(scanner);
            humans.add(human);
            writeHuman(humans);
        }
        if (number == 2) {
           khoiB human = createHumanB(scanner);
            humans.add(human);
            writeHuman(humans);
        }
        if (number == 3) {
            khoiC human = createHumanC(scanner);
            humans.add(human);
            writeHuman(humans);
        }
    }

    public khoiA createHumanA(Scanner scanner) {
        System.out.print("Nhap So Bao Danh: ");
        int id = scanner.nextInt();
        System.out.print("Nhap Ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Nhap Dia Chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap Vung Uu Tien: ");
        int priority = scanner.nextInt();
        return new khoiA(id, name, address, priority);
    }

    public khoiB createHumanB(Scanner scanner) {
        System.out.print("Nhap So Bao Danh: ");
        int id = scanner.nextInt();
        System.out.print("Nhap Ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Nhap Dia Chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap Vung Uu Tien: ");
        int priority = scanner.nextInt();
        return new khoiB(id, name, address, priority);
    }

    public khoiC createHumanC(Scanner scanner) {
        System.out.print("Nhap So Bao Danh: ");
        int id = scanner.nextInt();
        System.out.print("Nhap Ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Nhap Dia Chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap Vung Uu Tien: ");
        int priority = scanner.nextInt();
        return new khoiC(id, name, address, priority);
    }


    public void findHumanById(Scanner scanner) {
        System.out.print("Nhập số báo danh cần tìm: ");
        int id = scanner.nextInt();
        int check = 0;
        for (Human human : humans) {
            if (human.getId() == id) {
                System.out.println(human);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Không có thí sinh nào mang số báo danh này !!!");
        }
    }

    public void deleteHumanByName(Scanner scanner) {
        System.out.print("Nhap vao ten can xoa: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                humans.remove(i);
                i--;
            }
        }
    }
    public void writeHuman(ArrayList<Human> humans){
        File file = new File("human.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(humans);
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void readHuman(){
        File file = new File("human.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            humans = (ArrayList<Human>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void displayHuman() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

}