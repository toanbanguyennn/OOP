package model;

import Product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public Product createProduct(Scanner scanner) {
        System.out.println("Nhập vào id");
        int id = scanner.nextInt();
        System.out.println("Nhập vào tên sản phẩm");
        String name = scanner.nextLine();
        return new Product(id, name);
    }
}
