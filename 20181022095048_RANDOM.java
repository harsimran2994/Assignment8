package random;

import java.util.Scanner;
import java.util.Random;

public class RANDOM {

    public static void main(String[] args) {
        int number, lineCount;
        int i, j;
        Random obj = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("how many lines?");
        lineCount = sc.nextInt();

        for (i = 1; i <= lineCount; i++) {
            System.out.println("");
            number = obj.nextInt(10);

            for (j = 1; j <= 10; j++) {
                if (number == j) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
        }

    }

}
