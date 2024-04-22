public class Main {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", "Microsoft");
        sam.display();

        System.out.println();
        Person bob = new Employee("Bob", "Oracle");
        bob.display();
    }
}