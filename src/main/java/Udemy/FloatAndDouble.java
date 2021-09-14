package Udemy;

public class FloatAndDouble {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);
        float myMaxFloatTest = 3.4028235E38f;

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);
        double myMaxDoubleTest = 1.7976931348623157E308d;

        int myIntValue = 5;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.41d;
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
        System.out.println(myIntValue);

        //CHALLENGE
        int poundsAmount = 50;
        double kilogramsAmount = poundsAmount * 0.45359237d;
        System.out.println(kilogramsAmount);
    }
}
