package scannerExample;

import java.util.Scanner;

public class UserInputTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            String userInput = scanner.nextLine();
            System.out.println("Users name: " + userInput);
        } catch (Exception ex) {
            ex.getLocalizedMessage();
        } finally {
            scanner.close();
        }
    }
}
