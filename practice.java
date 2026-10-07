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

        System.out.println("Size: " + names.size());
    }
}