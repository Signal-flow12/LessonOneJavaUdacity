package genericsAndcollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();
        names.add("Thomas");
        names.add("Zack");
        names.add("Holly");
        names.add("Don");

        //before sorting
        for (String name : names){
            System.out.println(name);
        }

        Collections.sort(names);
        System.out.println("--------Sorted--------");

        for (String name : names){
            System.out.println(name);
        }
    }
}
