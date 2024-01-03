package collections;

import java.util.ArrayList;

public class CollectionsExersice {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Mike");
        strings.add("abe");

        for (String name : strings){
            System.out.println(name.length());
        }
    }
}
