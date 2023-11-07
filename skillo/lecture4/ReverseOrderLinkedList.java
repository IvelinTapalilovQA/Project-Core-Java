package skillo.lecture4;

import java.util.LinkedList;

public class ReverseOrderLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Volvo");
        list.add("BMW");
        list.add("Audi");
        list.add("Mazda");
        list.add("Toyota");
        list.add("Kia");

        System.out.println("The list with original order: " + list);

        String currentString;

        for (int i = 0; i < list.size(); i++) {
            currentString = list.getLast();
            list.removeLast();
            list.add(i, currentString);
        }
        System.out.println("The list with reversed order: " + list);
    }
}
