package Province;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryManager {
    public ArrayList<Country> countries = new ArrayList<>();
    public ArrayList<Province> provinces = new ArrayList<>();
    public  CountryManager() {
        countries.add(new Country(" Nước Việt Nam :"));
        countries.add(new Country(" Nước Thái Lan :"));
        countries.add(new Country(" Nước Lào :"));
        countries.add(new Country(" Nước Mỹ :"));

    }
    public void addProvince(Scanner scanner) {
        Province a = createProvince(scanner);
        provinces.add(a);
        writeProvince(provinces);
    }

    private Province createProvince(Scanner scanner) {
        System.out.println( " Nhập Quốc gia :");
        int choice = scanner.nextInt();
        Country country = null;
        for (int i = 0; i < countries.size(); i++) {
            if((i+1) == choice){
                country = countries.get(i);
            }

        }
        while (true) {
            try {
                Country country1 = new Country();
                System.out.println("Nhập vào tên Province :");
                String name = String.valueOf(scanner.next());
                System.out.println("Nhập vào Gdp:");
                double gdp = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập vào dân số ");
                int number = Integer.parseInt( scanner.nextLine());
                System.out.println("Nhập vào area:");
                double area = Double.parseDouble(scanner.nextLine());
                return new Province(name, gdp, number, area, country1);


            } catch (Exception e) {
                System.out.println("Lỗi");
                scanner.nextLine();
            }
        }
    }



    public void writeProvince(ArrayList<Province> provinces) {
        File file = new File("Country.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(provinces);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readProvince() {
        File file = new File("Country.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            provinces = (ArrayList<Province>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAll() {
        for (Province staff : provinces) {
            System.out.println(staff);

        }
    }
}
