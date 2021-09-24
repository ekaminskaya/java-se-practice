package Section5.Exercise21;

public class AllFactors {
    public static void main(String[] args) {
       printFactors(9);
        printFactors(10);
        printFactors(0);
        printFactors(-5);
    }
    public static void printFactors(int number){
        if (number<1){
           System.out.println("Invalid Value");
        } else {
            for (int i=1; i<=number; i++){
                if (number%i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
