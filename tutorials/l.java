class PassByValueExample {
    // Method to modify primitive value
    static void modifyPrimitive(int num) {
        num = 20; // Changing local copy
    }

    // Method to modify object reference
    static void modifyObject(Person p) {
        p.name = "Changed Name"; // Modifies original object
    }

    // Method to reassign object reference
    static void reassignObject(Person p) {
        p = new Person("New Object"); // Creates new reference, does not affect original
    }

    public static void main(String[] args) {
        // Example 1: Pass by Value (Primitive)
        int a = 10;
        modifyPrimitive(a);
        System.out.println("After modifyPrimitive: " + a); // Still 10

        // Example 2: Pass by Value (Reference Type)
        Person person = new Person("Original Name");
        modifyObject(person);
        System.out.println("After modifyObject: " + person.name); // Changed Name

        // Example 3: Reassigning Reference Inside Method
        reassignObject(person);
        System.out.println("After reassignObject: " + person.name); // Still Changed Name
    }
}

// Helper class
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
