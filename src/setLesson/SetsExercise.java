package setLesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsExercise {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();
        numbers.add("1");
        numbers.add("1");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("4");
        numbers.add("5");
        numbers.add("5");
        numbers.add("6");;

        Set<String> uniqueNums = new HashSet<String>(numbers);

        for (String nums : uniqueNums){
            System.out.println(nums);
        }

    }
}
