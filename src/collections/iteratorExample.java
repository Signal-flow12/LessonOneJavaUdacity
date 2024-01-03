package collections;

import java.util.*;

public class iteratorExample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();
        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        Iterator iterator = names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Queue<String> strings = new ArrayDeque<>();
        strings.add("Sally");
        strings.add("Cesar");

        iterator = strings.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
