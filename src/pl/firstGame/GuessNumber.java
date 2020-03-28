package Zadanie1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(101);
        System.out.println("Random number: " + randomNum);

        System.out.println();

        boolean isDrawn = false;
        System.out.println("Zgadnij liczbę");
        while (!isDrawn) {
            int num = getInt();

            if (num < randomNum) {
                System.out.println("Za mało!");
            } else if (num > randomNum) {
                System.out.println("Za dużo!");
            } else if (num == randomNum) {
                System.out.println("Zgadłeś!");
                isDrawn = true;
            } else num = getInt();
        }
    }

    static int getInt() {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("To nie jest liczba");
        }
        return sc.nextInt();
    }

}
