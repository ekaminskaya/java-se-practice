package Section5.Exercise14;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println("The sum of all odd numbers equals = " + sumOdd(1,100));
        System.out.println("The sum of all odd numbers equals = " + sumOdd(100,1000));
        System.out.println("The sum of all odd numbers equals = " + sumOdd(-1,100));
        System.out.println("The sum of all odd numbers equals = " + sumOdd(100,100));
        System.out.println("The sum of all odd numbers equals = " + sumOdd(7,7));
        System.out.println("The sum of all odd numbers equals = " + sumOdd(100,-100));
    }
    public static boolean isOdd(int number){
        if (number<0) {
            return false;
        } else if (number%2!=0){
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((end >= start) && (end >0) && (start>0)){
            for (int i=start; i<=end; i++){
                if (isOdd(i)){
                    sum +=i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
