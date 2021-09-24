package Section5.Exercise20;

import qaa_academy.oop.Button;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("The last divisor is " + getGreatestCommonDivisor(2,30));
    }
    public static int getGreatestCommonDivisor (int first, int second){
        if (first<10 || second<10) return -1;
        else {

           int min  = (first>second) ? second:first;
            int i=min;
            while (i!=1) {
                if (first%i==0 && second%i==0) {
                    return i;
                }
                i--;
            }
            return -1;
        }
    }
}






