package Section5;

public class Loop {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(1000.0, 2.0));

       // for (init; termination; increment){}
        for (int i=1; i<5; i++){
            System.out.println("Loop " + i + " hello");
        }
        for (double i=2; i<9; i++){
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
        }
        for (double i=2; i<9; i++){
            System.out.println("10,000 at "+ i + "% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
