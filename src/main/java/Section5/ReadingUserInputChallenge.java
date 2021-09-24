package Section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count<=10){
            System.out.println("Enter number #" + count + ":");

            boolean hasNextInt = numbers.hasNextInt();

            if (hasNextInt) {
            int number = numbers.nextInt();
            sum +=number;
            count++;
            } else{
                System.out.println("Invalid number");
            }
                numbers.nextLine();// handle end of line (enter key)
            }
        System.out.println("The sum of 10 numbers is = " + sum);
        numbers.close();
    }
}
