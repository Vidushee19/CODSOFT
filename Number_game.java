import java.util.Random;
import java.util.Scanner;

public class Number_game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5; 
        int score = 0;

        do {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("Guess a number between 1 and 100 (You have " + maxAttempts + " attempts):");

            while (attempts < maxAttempts) {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
               
            }
            
            // if (attempts == maxAttempts) {
            //     System.out.println("Sorry, you ran out of attempts. The number was " + randomNumber);
            // }

            

            System.out.println("Do you want to play again? (y/n)");
           
        } 
        while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();

        System.out.println("Thank you for playing! Your final score is: " + score);
      
    }
}
