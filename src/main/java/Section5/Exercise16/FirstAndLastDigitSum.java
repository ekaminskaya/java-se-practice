package Section5.Exercise16;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum is " + sumFirstAndLastDigit(202342));
        System.out.println("The sum is " + sumFirstAndLastDigit(555));
        System.out.println("The sum is " + sumFirstAndLastDigit(-42));
        System.out.println("The sum is " + sumFirstAndLastDigit(0));
        System.out.println("The sum is " + sumFirstAndLastDigit(7));

    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        } else {
            int lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            return lastDigit + number;
        }
    }
}
