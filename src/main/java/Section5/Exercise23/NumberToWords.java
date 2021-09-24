package Section5.Exercise23;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(120300);
        numberToWords(9988);
        numberToWords(0);
        numberToWords(-5);
        System.out.println(getDigitCount(-4));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(775511));
        System.out.println(getDigitCount(100));

        System.out.println(reverse(123456789));
        System.out.println(-34);

    }
    public static void numberToWords(int number) {
        int digit = 0;
        int reverseNumber = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int i=0;
        while (i < getDigitCount(number)) {
            digit = reverseNumber % 10;
            reverseNumber /= 10;
            switch (digit){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            i++;
        }
    }

    public static int reverse(int number){
        int element = 0;
        int total = 0;
        while(number!=0){
            element = number%10;
            total*=10;
            total+=element;
            number/=10;
        } return total;
    }

    public static int getDigitCount(int number){
        int count =1;
        if (number<0){
            return -1;
        } else {
            while (number>9){
                number/=10;
                count++;
            } return count;
        }
    }
}
