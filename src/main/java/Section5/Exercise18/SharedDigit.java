package Section5.Exercise18;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("Is there a shared digit - " + hasSharedDigit(72,67));
        System.out.println("Is there a shared digit - " + hasSharedDigit(13,32));
        System.out.println("Is there a shared digit - " + hasSharedDigit(1,59));
        System.out.println("Is there a shared digit - " + hasSharedDigit(15,104));
        System.out.println("Is there a shared digit - " + hasSharedDigit(0,0));
        System.out.println("Is there a shared digit - " + hasSharedDigit(-19,50));
        System.out.println("Is there a shared digit - " + hasSharedDigit(10,10));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int lastDigitOfNumber1 = number1 % 10;
        int firstDigitOfNumber1 = number1 / 10;
        int lastDigitOfNumber2 = number2 % 10;
        int firstDigitOfNumber2 = number2 / 10;
        if ((number1 >99 || number1<10) || (number2 >99 || number2<10)){
            return false;
        } else if (lastDigitOfNumber1==firstDigitOfNumber2 || lastDigitOfNumber1==lastDigitOfNumber2 || firstDigitOfNumber1==firstDigitOfNumber2 || firstDigitOfNumber1==lastDigitOfNumber2){
                return true;
            } else {
            return false;
        }
    }
}
