package Section4.BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (((0 <= hourOfDay && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23 )) && barking == true) {
            return true;
        }
            return false;
    }
}
