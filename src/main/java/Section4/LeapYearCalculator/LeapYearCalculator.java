package Section4.LeapYearCalculator;

public class LeapYearCalculator {
    public static void main(String[] args) {
       boolean isLeapYear = isLeapYear(-1200);
        System.out.println("The year is a leap year = " + isLeapYear);
    }

    public static boolean isLeapYear(int year){
        if ((year >=1 && year <=9999) && (year%100 !=0 && year%4 == 0)) {
            return true;
        } else if ((year >=1 && year <=9999) && (year%100 ==0 && year%400==0)){
            return true;
        }
        else {
            return false;
        }
    }
}
