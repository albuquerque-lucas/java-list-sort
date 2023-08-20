package albuquerque.main.service;

import albuquerque.main.models.Product;

import java.util.*;

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

    public void listAll(List<Product> productList)
    {
        for( Product product : productList) {
            System.out.println("--------------------------");
            System.out.println("ID " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Valor: " + product.getPrice());
            System.out.println("--------------------------");
        }
    }

    public void sort(List<Product> productList, Comparator<Product> comparator) {
        productList.sort(comparator);
    }

}
