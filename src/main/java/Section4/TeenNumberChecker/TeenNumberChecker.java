package Section4.TeenNumberChecker;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 17, 16));
        System.out.println(isTeen(-19));
    }

    public static boolean hasTeen(int value1, int value2, int value3){
        if ((value1>=13 && value1<=19) || (value2>=13 && value2<=19) || (value3>=13 && value3<=19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int teen) {
        if (teen>=13 && teen<=19){
            return true;
        }
        return false;
    }
}
