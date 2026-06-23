public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer computer1 =
                new Computer.Builder()
                        .setCpu("Intel i5")
                        .setRam("8GB")
                        .setStorage("512GB SSD")
                        .build();

        Computer computer2 =
                new Computer.Builder()
                        .setCpu("Intel i7")
                        .setRam("16GB")
                        .setStorage("1TB SSD")
                        .build();

        System.out.println("Computer 1");
        computer1.display();

        System.out.println();

        System.out.println("Computer 2");
        computer2.display();
    }
}