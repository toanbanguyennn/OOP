package Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class QuanLiCanBo {
   public ArrayList<CanBo> CanBos = new ArrayList<>();

   public void addStaff() {
      CanBo staff = createNewCanBo();
      CanBos.add(staff);
      writeCB(CanBos);
   }
   public void addCanBoByIndex() {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập vào index muốn thêm :");
      int index = input.nextInt();
      if (index < 0 || index >= CanBos.size()) {
         System.out.println("Index không phù hợp");
      } else {
         CanBo staff = createNewCanBo();
         CanBos.add(index, staff);
      }
      writeCB(CanBos);
   }
   public void addKySuIndex() {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập vào index muốn thêm :");
      int index = input.nextInt();
      if (index < 0 || index >= CanBos.size()) {
         System.out.println("Index không phù hợp");
      } else {
         CanBo staff = createNewCanBo();
         CanBos.add(index, staff);
      }
   }
   private CanBo createNewCanBo() {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập vào tên của CanBo");
      String name = input.nextLine();
      System.out.println("Nhập vào tuổi của CanBo");
      int age = input.nextInt();
      System.out.println("Nhập vào giơi tính của CanBo");
      input.nextLine();
      String gender = input.nextLine();

      return new CanBo(name, age, gender);
   }

   public void  SeachCanBo() {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập tên muốn tìm kiếm :");
      String name1 = input.nextLine();
      for (CanBo canBo : CanBos) {
         if (canBo.name.equals(name1)) {
            System.out.println(canBo);
         }
      }
   }
   public void DeleteCanBo(){
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập Id muốn xoá:");
      int num = input.nextInt();
      if(num<0||num>=CanBos.size()){
         System.out.println("nhập lại Id");
      } else {
         CanBos.remove(num);
      }
   }
   public void DeleteTheoTen(){
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập tên muốn xoá:");
      String name1 = input.nextLine();
      ArrayList<CanBo> arrayListDelete = new ArrayList<>();
      for (int i = 0; i < CanBos.size() ; i++) {
         if(CanBos.get(i).name.equals(name1)){
           arrayListDelete.add(CanBos.get(i));
         }
         CanBos.removeAll(arrayListDelete);
      }

   }
   public void writeCB(ArrayList<CanBo> CanBos){
      File file = new File("test.txt");
      try {
         if (!file.exists()){
            file.createNewFile();
         }
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
         objectOutputStream.writeObject(CanBos);
         objectOutputStream.close();
      }catch (Exception e){
         System.out.println(e.getMessage());
      }
   }
   public void readCB(){
      File file = new File("test.txt");
      try{
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
         CanBos = (ArrayList<CanBo>) objectInputStream.readObject();
         objectInputStream.close();
      }catch(Exception e){
         System.out.println(e.getMessage());
      }
   }
   public void displayAll() {
         for (CanBo staff : CanBos) {
            System.out.println(staff);
         }
      }

}