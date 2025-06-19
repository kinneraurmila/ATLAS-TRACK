
// Abstract class representing a Person
abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Driver class to demonstrate the functionality
public class Task14 {
    public static void main(String[] args) {
        //Customer customer = new Customer("Alice", 30, "C123", "alice@example.com");
        Emp employee = new Emp("Bob", 25, "E456", "Sales");
        Manag manager = new Manag("Charlie", 40, "M789", "Management", 5);

       // System.out.println(customer);
        System.out.println(employee);
        System.out.println(manager);
    }
}
