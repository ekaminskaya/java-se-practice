package Section4.DecimalComparator;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean areEqual = areEqualByThreeDecimalPlaces(-3.506, 3.506);
        System.out.println(areEqual);

    }

    public static boolean areEqualByThreeDecimalPlaces(double paramFirst, double paramSecond){
        if ((int) (paramFirst*1000) == (int) (paramSecond*1000)) {
            return true;
        }
        return false;
    }
}
