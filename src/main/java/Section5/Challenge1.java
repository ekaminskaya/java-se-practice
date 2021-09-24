package Section5;

public class Challenge1 {
    public static void main(String[] args) {
        char value = 'F';
        switch (value){
            case 'A':
                System.out.println("The value is " + value);
                break;
            case 'B':
                System.out.println("The value is " + value);
                break;
            case 'C':
                System.out.println("The value is " + value);
                break;
            case 'D':
                System.out.println("The value is " + value);
                break;
            case 'E': case 'F': case 'G':
                System.out.println("The value is " + value);
                break;
            default:
                System.out.println("The value didn't found");
                break;
        }
    }
}
// switch (value.toLowerCase())
