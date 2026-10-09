// Topic: LinkedList

import java.util.LinkedList;

class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Diya");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("Names: " + names);

        names.addFirst("Aman");

        names.addLast("Neha");

        System.out.println("After Adding: " + names);

        System.out.println("First Name: " + names.getFirst());

        System.out.println("Last Name: " + names.getLast());

    
        names.removeFirst();


        names.removeLast();

        System.out.println("After Removing: " + names);

        // Size
        System.out.println("Size: " + names.size());
    }
};

// Topic: Constructor

class LinkedListExample {

    String name;
    int age;

    // Constructor
    LinkedListExample(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        LinkedListExample student1 =
            new LinkedListExample("Diya", 20);

        student1.display();
    }
}
// Topic: this keyword

class LinkedListExample {

    String name;
    int age;

    // Constructor
    LinkedListExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        LinkedListExample student =
            new LinkedListExample("Diya", 20);

        student.display();
    }
}
// Topic: Static Keyword

class LinkedListExample {

    static String college = "IGNOU";

    String name;

    LinkedListExample(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        LinkedListExample student1 =
                new LinkedListExample("Diya");

        LinkedListExample student2 =
                new LinkedListExample("Rahul");

        student1.display();
        student2.display();
    }
}
// Topic: final keyword

class LinkedListExample {

    final int MAX_MARKS = 100;

    void display() {
        System.out.println("Maximum Marks: " + MAX_MARKS);
    }

    public static void main(String[] args) {

        LinkedListExample obj = new LinkedListExample();

        obj.display();
    }
}