public class App {
    public static void main(String[] args) {
        System.out.println("=== Running Tests ===");
        TestUser.main(args);
        TestTime.main(args);
        TestRecursion.main(args);

        System.out.println("=== Running Review Demos ===");
        AccessControlDemo.main(args);
        InitializationDemo.main(args);
        ReuseClassDemo.main(args);
        PolymorphismDemo.main(args);
        InterfaceDemo.main(args);
    }
}