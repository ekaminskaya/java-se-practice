package Section4.Challenge;

public class Challenge3_Overloading {
    public static void main(String[] args) {
        double value1 = calcFeetAndInchesToCentimeters(4, 19);
        System.out.println(value1);
        double value2 = calcFeetAndInchesToCentimeters(-9);
        System.out.println(value2);

        calcFeetAndInchesToCentimeters(157);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (!(feet>=0 && (inches>=0 && inches<=12))) {
            System.out.println("Invalid value");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches<0){
            return -1;
        } else {
            double feetAreInTheInches = (int) (inches / 12);
            double remainingInches = (int) (inches % 12);
            System.out.println(inches + " inches is equal to " + feetAreInTheInches + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feetAreInTheInches, remainingInches);
        }

    }
}
