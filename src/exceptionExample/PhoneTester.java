package exceptionExample;

public class PhoneTester {
    public static void main(String[] args) {
        String[] numbers = new String [] {"732-555-5555", "630-555-4343", null, "555-333-3434"};

        for (int i = 0; i < numbers.length; i ++) {
            try {
                System.out.println(new Phone("Iphone", numbers[i]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }
        for (int i = 0; i < numbers.length; i ++) {
            System.out.println(new Phone("Iphone", numbers[i]));
        }
    }
}
