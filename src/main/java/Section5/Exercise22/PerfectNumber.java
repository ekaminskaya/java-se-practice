package Section5.Exercise22;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("The number is perfect " + isPerfectNumber(5));
        System.out.println("The number is perfect " + isPerfectNumber(6));
        System.out.println("The number is perfect " + isPerfectNumber(28));
        System.out.println("The number is perfect " + isPerfectNumber(-3));
        System.out.println("The number is perfect " + isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        } else {
            int sum = 0;
            int i=1;
            while (sum<number){
                if (number%i == 0){
                    sum+=i;
                } i++;
            }
            if (sum==number) {return true;}
            else {return false;}
        }
    }
}
