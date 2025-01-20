import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Are you european?");
        String yesorno = scanner.nextLine();

        boolean european;

        if (yesorno.equalsIgnoreCase("yes")) {
            european = true;
        }
        else if (yesorno.equalsIgnoreCase("no")) {
            european = false;
        }
        else {
            System.out.println("Invalid answer");
            return;
        }
        int usDrink = 21;
        int euDrink = 18;

        boolean userCanDrink = age>=18 && european || age>=21;
        System.out.println("User can drink: " + userCanDrink);

    }
}