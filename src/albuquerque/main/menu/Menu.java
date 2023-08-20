package albuquerque.main.menu;

import albuquerque.main.models.Product;
import albuquerque.main.service.ProductService;

import java.util.ArrayList;
import java.util.Comparator;

public class Menu {
    private static final int ADD_PRODUCT = 1;
    private static final int LIST_PRODUCTS = 2;
    private static final int SORT_BY_NAME = 3;
    private static final int SORT_BY_ID = 4;
    private static final int SORT_BY_PRICE = 5;
    private static final int EXIT_SYSTEM = 6;
    private static final ProductService productService = new ProductService();
    private final ArrayList<Product> productList = new ArrayList<>();

    public Menu(){
        Product television = new Product("Televisao Sambuns 22 polegadas", 959.99);
        Product notebook = new Product("Notebook Samsung 24 polegadas 144Hz", 2700.00);
        Product refrigerator = new Product("Refrigerador Brastemp", 1200.99);
        productList.add(television);
        productList.add(notebook);
        productList.add(refrigerator);
    }

    public void show(){
        System.out.println("OPTIONS MENU");
        System.out.println(ADD_PRODUCT + "   -   Cadastrar produto");
        System.out.println(LIST_PRODUCTS + "   -   Listar produtos");
        System.out.println(SORT_BY_NAME + "   -   Ordenar por nome");
        System.out.println(SORT_BY_ID + "   -   Ordenar por id");
        System.out.println(SORT_BY_PRICE + "   -   Ordenar por preco");
        System.out.println(EXIT_SYSTEM + "   -   Sair do sistema");
    }

    public void select(int option){
        switch (option) {
            case ADD_PRODUCT:
                System.out.println("Opção selecionada: Cadastrar produto");
                Product newProduct = productService.create();
                productList.add(newProduct);
                break;
            case LIST_PRODUCTS:
                System.out.println("Opção selecionada: Listar produtos");
                productService.listAll(productList);
                break;
            case SORT_BY_NAME:
                System.out.println("Opção selecionada: Ordenar produtos por nome");
                productService.sort(productList, Comparator.comparing(Product::getName));
                productService.listAll(productList);
                break;
            case SORT_BY_ID:
                System.out.println("Opção selecionada: Ordenar produtos por ID");
                productService.sort(productList, Comparator.comparing(Product::getId));
                productService.listAll(productList);
                break;
            case SORT_BY_PRICE:
                System.out.println("Opção selecionada: Ordenar produtos por preco");
                productService.sort(productList, Comparator.comparing(Product::getPrice));
                productService.listAll(productList);
                break;
            case EXIT_SYSTEM:
                System.out.println("Opção selecionada: Sair do sistema");
                break;
            default:
                System.out.println("Opção inválida");
                show();
        }
    }
}
