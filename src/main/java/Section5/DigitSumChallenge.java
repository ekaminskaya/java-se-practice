package Section5;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits " + sumDigits(111));

    }

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while (number >0) { // number = 125  iteration2 number = 12 iteration3 number = 1 iteration 4 number =0 <0
          digit = number%10; // 125 % 10 = 5 iteration2 12%10=2 iteration3 1%10=1
          sum += digit; // 0+5=5 iteration2 5+2=7 iteration3 7+1=8
          number=number/10; // 125/10 = 12 iteration2 12/10=1 iteration3 1/10=0
        }
        return sum; //return 8
    }
}
