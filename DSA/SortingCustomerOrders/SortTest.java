public class SortTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(
                        101,
                        "Tejasree",
                        5000),

                new Order(
                        102,
                        "Rahul",
                        2000),

                new Order(
                        103,
                        "Priya",
                        7000),

                new Order(
                        104,
                        "Kiran",
                        3000)
        };

        System.out.println(
                "Before Sorting:");

        for (Order order : orders) {
            order.display();
        }

        SortOperations.quickSort(
                orders,
                0,
                orders.length - 1);

        System.out.println(
                "\nAfter Sorting:");

        for (Order order : orders) {
            order.display();
        }
    }
}