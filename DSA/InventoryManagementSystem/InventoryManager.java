import java.util.HashMap;

public class InventoryManager {

    private HashMap<Integer, Product> inventory =
            new HashMap<>();

    public void addProduct(Product product) {

        inventory.put(
                product.getProductId(),
                product);

        System.out.println(
                "Product Added Successfully");
    }

    public void updateProduct(
            int productId,
            int quantity,
            double price) {

        if (inventory.containsKey(productId)) {

            Product product =
                    inventory.get(productId);

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println(
                    "Product Updated Successfully");
        } else {

            System.out.println(
                    "Product Not Found");
        }
    }

    public void deleteProduct(int productId) {

        if (inventory.containsKey(productId)) {

            inventory.remove(productId);

            System.out.println(
                    "Product Deleted Successfully");
        } else {

            System.out.println(
                    "Product Not Found");
        }
    }

    public void displayProducts() {

        System.out.println(
                "\nInventory Products:");

        for (Product product :
                inventory.values()) {

            product.display();
        }
    }
}