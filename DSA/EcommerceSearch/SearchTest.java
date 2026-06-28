public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(
                        101,
                        "Keyboard",
                        "Electronics"),

                new Product(
                        102,
                        "Laptop",
                        "Electronics"),

                new Product(
                        103,
                        "Mobile",
                        "Electronics"),

                new Product(
                        104,
                        "Mouse",
                        "Electronics")
        };

        System.out.println("Linear Search:");

        Product result1 =
                SearchOperations.linearSearch(
                        products,
                        "Mouse");

        if (result1 != null) {
            result1.display();
        }

        System.out.println("\nBinary Search:");

        Product result2 =
                SearchOperations.binarySearch(
                        products,
                        "Mouse");

        if (result2 != null) {
            result2.display();
        }
    }
}