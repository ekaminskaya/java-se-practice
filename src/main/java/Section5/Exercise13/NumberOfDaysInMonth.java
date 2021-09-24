package Section5.Exercise13;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int daysInMonth = getDaysInMonth(1,2020);
        System.out.println(daysInMonth);
        int daysInMonth2 = getDaysInMonth(2,2000);
        System.out.println(daysInMonth2);
        int daysInMonth3 = getDaysInMonth(2,2017);
        System.out.println(daysInMonth3);
        int daysInMonth4 = getDaysInMonth(10,1999);
        System.out.println(daysInMonth4);
        int daysInMonth5 = getDaysInMonth(6,2020);
        System.out.println(daysInMonth5);
        int daysInMonth6 = getDaysInMonth(13,9999);
        System.out.println(daysInMonth6);
        int daysInMonth7 = getDaysInMonth(-7,1);
        System.out.println(daysInMonth7);
        int daysInMonth8 = getDaysInMonth(9,999977);
        System.out.println(daysInMonth8);
        System.out.println(getDaysInMonth(3,-578));

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

    public static int getDaysInMonth(int month, int year){
        boolean checkYear = isLeapYear(year);
        if (year<1 || year>9999){
            return -1;
        } else if (checkYear) {
                switch (month) {
                    case 2:
                        return 29;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return -1;
                }
            } else if (!checkYear) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 28;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return -1;
                }
            } else {
                return -1;
        }
    }
}
