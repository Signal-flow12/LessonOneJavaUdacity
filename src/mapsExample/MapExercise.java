package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<String, Person>();

        Person mike = new Person("Mike", "mike@email.com");
        Person thomas = new Person("thomas", "thomas@email.com");
        Person joe = new Person("Joe", "joe@email.com");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(mike);
        people.add(thomas);
        people.add(joe);

        //or
//        mapOfPeople.put(mike.getEmail(), mike);
//        mapOfPeople.put(thomas.getEmail(), thomas);
//        mapOfPeople.put(joe.getEmail(), joe);


        for (Person person : people){
            MapExercise.addToMap(mapOfPeople, person);
        }

        for (String email : mapOfPeople.keySet()){
            System.out.println(email);
        }

        for (Person person : mapOfPeople.values()){
            System.out.println(person);
        }

        System.out.println("Get Mike " + mapOfPeople.get("mike@email.com"));
        System.out.println("Get Linda " + mapOfPeople.get("linda@gmail.com")); // will be null does not exsist
        System.out.println("Contains thomas " + mapOfPeople.containsKey("thomas@gmail.com"));
    }

    private static void addToMap(Map<String, Person> map, Person person){
        map.put(person.getEmail(), person);

    }
}
