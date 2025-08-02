package productmanagement;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayProducts(List<Product> products) {
        System.out.println("\n-- Product List --");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("ID: " + product.getId());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("--------------------------------------");
        }
    }

    public Product createProduct() {
        Product product = new Product();
        System.out.println("\n--- Create New Product ---");

        System.out.print("Enter product name: ");
        product.setName(scanner.nextLine());

        System.out.print("Enter product price: ");
        product.setPrice(scanner.nextDouble());
        scanner.nextLine();  // consume newline

        System.out.print("Enter product ID: ");
        product.setId(scanner.nextLine());

        return product;
    }
}
