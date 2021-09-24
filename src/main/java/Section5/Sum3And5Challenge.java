package Section5;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i=1; i<=1000; i++){
           if ((i%3==0) && (i%5==0)){
               System.out.println("Number that is divided with 3 and 5 = " + i);
               count++;
               sum += i;
           }
            if (count==5){
                break;
            }
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
