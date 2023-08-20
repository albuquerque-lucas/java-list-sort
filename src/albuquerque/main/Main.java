package albuquerque.main;

import albuquerque.main.menu.Menu;
import albuquerque.main.models.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu mainMenu = new Menu();
        int option = 1;
        mainMenu.show();
        while (option != 6) {
            String userInput = scanner.nextLine();
            option = Integer.parseInt(userInput);
            mainMenu.select(option);

        }
        System.out.println("Finalizando App.");
    }
}
