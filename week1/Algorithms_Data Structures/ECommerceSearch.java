import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Product Class
    static class Product {
        private int productId;
        private String productName;
        private String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        public int getProductId() {
            return productId;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId +
                   ", Product Name: " + productName +
                   ", Category: " + category;
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == targetId) {
                return products[mid];
            }

            if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "Mobile", "Electronics"),
            new Product(110, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(108, "Headphones", "Electronics")
        };

        int searchId = 103;

        // Linear Search
        Product linearResult = linearSearch(products, searchId);

        System.out.println("=== Linear Search ===");
        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found");
        }

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        // Binary Search
        Product binaryResult = binarySearch(products, searchId);

        System.out.println("\n=== Binary Search ===");
        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nAnalysis:");
        System.out.println("Linear Search -> Best: O(1), Average: O(n), Worst: O(n)");
        System.out.println("Binary Search -> Best: O(1), Average: O(log n), Worst: O(log n)");
        System.out.println("Binary Search is more efficient for large sorted datasets.");
    }
}