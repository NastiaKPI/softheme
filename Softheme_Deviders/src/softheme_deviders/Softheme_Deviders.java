package softheme_deviders;

import java.util.Scanner;

public class Softheme_Deviders {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer:");
        int number = keyboard.nextInt();
        
        System.out.println("\nDeviders:");
        System.out.println(1);
        for (int div = 2; div<number; div++) {
            if (number % div == 0)
                System.out.println(div);
        }
        System.out.println(number);
    }
}
