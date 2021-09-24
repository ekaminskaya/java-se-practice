package Section5.Exercise19;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Is the number valid - " + isValid(12));
        System.out.println("Is the number valid - " + isValid(1500));
        System.out.println("Is the number valid - " + isValid(9));
        System.out.println("Is the number valid - " + isValid(999));

        System.out.println("There is shared last digit " + hasSameLastDigit(12, 542, 400));
        System.out.println("There is shared last digit " + hasSameLastDigit(999, 55, 409));
        System.out.println("There is shared last digit " + hasSameLastDigit(10, 897, 27));
        System.out.println("There is shared last digit " + hasSameLastDigit(2, 542, 400));
        System.out.println("There is shared last digit " + hasSameLastDigit(1257, 542, 400));
    }

    public static boolean hasSameLastDigit(int numberFirst, int numberSecond, int numberThird){
        int digitOfNumberFirst = numberFirst % 10;
        int digitOfNumberSecond = numberSecond % 10;
        int digitOfNumberThird = numberThird % 10;
        if ((!isValid(numberFirst)) || (!isValid(numberSecond)) || (!isValid(numberThird))){
            return false;
        } else if (digitOfNumberFirst==digitOfNumberSecond || digitOfNumberFirst==digitOfNumberThird || digitOfNumberSecond==digitOfNumberThird){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValid(int number){
        if (number>=10 && number<=1000){
            return true;
        } else {
            return false;
        }
    }
}
