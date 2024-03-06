package main.Homeworks;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.abs;


public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Game. Find the number");
        System.out.println("The game picks a number from the range from 1 to 100");
        System.out.println("You can do no more than 30 guesses.");
        System.out.println("For every guess, the game tells you whether the picked number is less, greater or equal.");
        System.out.println("Your goal is to find the picked number.\n");

        System.out.println("START? (Y/N)");

        String a = scanner.next();
//        System.out.println(a);

        if (!Objects.equals(a, "Y"))
            return;

        int picked = abs(random.nextInt()) % 100 + 1;
//        System.out.println(picked);

        for (int iter = 0; iter < 30; iter++) {
            System.out.println(iter + " guess: ");
            int x = scanner.nextInt();
            if (x == picked) {
                System.out.println("Congrats! You win.");
                return;
            }
            if (x > picked) {
                System.out.println(x + " is greater than the picked number");
            } else {
                System.out.println(x + " is less than the picked number");
            }
        }

        System.out.println("Game over.");
    }

}