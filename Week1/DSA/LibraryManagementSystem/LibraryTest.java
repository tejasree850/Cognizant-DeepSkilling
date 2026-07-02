public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(
                        101,
                        "C",
                        "Dennis Ritchie"),

                new Book(
                        102,
                        "Data Structures",
                        "Narasimha Karumanchi"),

                new Book(
                        103,
                        "Java",
                        "Herbert Schildt"),

                new Book(
                        104,
                        "Python",
                        "Guido Van Rossum")
        };

        System.out.println(
                "Linear Search Result:");

        Book book1 =
                LibrarySearch.linearSearch(
                        books,
                        "Java");

        if (book1 != null) {
            book1.display();
        }

        System.out.println(
                "\nBinary Search Result:");

        Book book2 =
                LibrarySearch.binarySearch(
                        books,
                        "Java");

        if (book2 != null) {
            book2.display();
        }
    }
}