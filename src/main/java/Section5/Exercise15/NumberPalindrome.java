package Section5.Exercise15;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("The number is Pelidrom - " + isPalindrome(-121));
        System.out.println("The number is Pelidrom - " + isPalindrome(1221));
        System.out.println("The number is Pelidrom - " + isPalindrome(1451));
        System.out.println("The number is Pelidrom - " + isPalindrome(707));
        System.out.println("The number is Pelidrom - " + isPalindrome(221133));
    }

    public static boolean isPalindrome(int number){
        int reverse=0;
        int temp = number;
        while (number > 0 || number < 0){
            int lastDigit = number%10;
            reverse*=10;
            reverse+=lastDigit;
            number = number/10;
        }
        System.out.println("The reverse number is " +reverse);
        if (temp == reverse){
            return true;
        } else {
            return false;
        }
    }
}
