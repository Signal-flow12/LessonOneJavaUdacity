package genericExample;

import java.util.ArrayList;

public class GenericExersixe {
    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<Object>();

        Double doubleNum = 1.5;
        String name = "sally";
        Integer intNumber = 1;
        Character letter = 'a';

        variables.add(intNumber);
        variables.add(doubleNum);
        variables.add(name);
        variables.add(letter);

        for (Object variable : variables) {
            GenericExersixe.displayClassName(variable);
        }

    }
    static <T> void displayClassName(T variable ) {
        System.out.println(variable.getClass().getName());
    }
}
