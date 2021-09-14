package Section4.EqualSumChecker;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean sum = hasEqualSum(1,-1,0);
        System.out.println("the sum of the first and second parameters is equal to the third parameter = " + sum);
    }

    public static boolean hasEqualSum(int value1, int value2, int value3){
        if ((value1 + value2) == value3){
            return true;
        }
        return false;
    }
}
