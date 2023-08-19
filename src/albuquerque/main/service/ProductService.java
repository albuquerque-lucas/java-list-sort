package albuquerque.main.service;

import albuquerque.main.models.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public Product create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do produto?");
        String name = scanner.nextLine();
        System.out.println("Qual o valor do produto?");
        String stringPrice = scanner.nextLine();
        double price = Double.parseDouble(stringPrice);
        Product product = new Product(name, price);
        System.out.println("Produto " + product.getName() + " adicionado com sucesso!");
        System.out.println("ID do produto: " + product.getId());
        return product;
    }

    public void listAll(ArrayList<Product> productList)
    {
        for( Product product : productList) {
            System.out.println("ID " + product.getId());
            System.out.println("Name: " + product.getName());
        }
    }

}
