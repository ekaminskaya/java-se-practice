package Section5.Exercise27;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int xx = 0;
        double avg = 0;
        long yy = 0;
        int count = 0;
        //System.out.println("Enter the number: ");
        while (true){

            boolean isHasNextInt = scanner.hasNextInt();

            if (isHasNextInt){
                int number = scanner.nextInt();
                count++;
                xx +=number;
                avg = (double) xx/count;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + xx +  " AVG = " + Math.round(avg));
        scanner.close();
    }
}
