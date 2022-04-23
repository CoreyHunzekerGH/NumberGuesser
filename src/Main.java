import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the range you would like to play? 1 to _:");
        int multiplier = input.nextInt();
        int num = (int) (Math.random() * multiplier);

        int guessNum;
        int guesses = 0;
        do {
            System.out.print("Guess a number 1-" + multiplier + ":");
            guessNum = input.nextInt();
            guesses += 1;
        } while(guessNum != num);
        System.out.println("Congratulations! You've guessed the number  in " + guesses + " guesses!");
        input.close();
    }
}
