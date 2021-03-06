package Section5;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number: ");
            boolean isHasNextInt = scanner.hasNextInt();

            if(isHasNextInt){
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The min number is " + min);
        System.out.println("The max number is " + max);
        scanner.close();
    }
}
