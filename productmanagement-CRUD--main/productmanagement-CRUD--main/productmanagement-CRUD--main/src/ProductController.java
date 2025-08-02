package productmanagement;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private final List<Product> products;
    private final ProductView productView;

    public ProductController() {
        products = new ArrayList<>();
        productView = new ProductView();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        productView.displayProducts(products);
    }

    public void createProduct() {
        Product product = productView.createProduct();
        addProduct(product);
        System.out.println("Product added successfully");
    }
}
