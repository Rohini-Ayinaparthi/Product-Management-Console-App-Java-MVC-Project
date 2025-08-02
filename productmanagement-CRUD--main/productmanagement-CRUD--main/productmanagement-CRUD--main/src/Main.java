package productmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Product Management System ---");
            System.out.println("1. Create product");
            System.out.println("2. View products");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    controller.createProduct();
                    break;
                case 2:
                    controller.displayProducts();
                    break;
                case 3:
                    System.out.println("Exiting application");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
