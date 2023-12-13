package javaLesson3;

public class PersonTester {
    public static void main(String[] args) {
        Person Thomas = new Person("Thomas", "Craven");
        System.out.println(Thomas);
        Student Mike = new Student("Mike", "Smith", "15348");
        System.out.println(Mike);
        StudentEmployee Holly = new StudentEmployee("Holly",
                "Craven", 1.55, "1051", "1051E");
        System.out.println(Holly);
    }
}
