package Section5.Exercise17;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of even digit is equal = "+ getEvenDigitSum(23156));
        System.out.println("The sum of even digit is equal = "+ getEvenDigitSum(2468));
        System.out.println("The sum of even digit is equal = "+ getEvenDigitSum(0));
        System.out.println("The sum of even digit is equal = "+ getEvenDigitSum(-28));
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number<0){
            return -1;
        } else {
            while (number>0){
                int digit = number%10;
                if (digit%2==0){
                    sum+=digit;
                } number/=10;
            }
            return sum;
        }
    }
}
