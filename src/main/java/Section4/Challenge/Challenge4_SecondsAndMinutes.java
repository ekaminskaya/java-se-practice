package Section4.Challenge;

public class Challenge4_SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(130, 50));
        System.out.println(getDurationString(3669));

    }
    public static String getDurationString(int minutes, int seconds){
        if (!(minutes >=0 && (seconds>=0 && seconds<=59))){ // (minutes<0 || seconds<0 || seconds>59)
            return "Invalid value";
        } else {
            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }

    public static String  getDurationString(int seconds){
        if (seconds<0) {
           return "Invalid value";
        } else {
            int calcMinutes = seconds/60;
            int remainingSeconds = seconds % 60;
            return getDurationString(calcMinutes, remainingSeconds);
        }
    }
}

// to get format 01h 07m 05s
// String hourString = hours + "h";
// if (hours < 10){ hoursString = "0" + hoursString; }
// return hoursString + " " + minutesString + " " + secondsString;

// private static final String INVALID_VALUE_MESSAGE = "Invalid value"
// return INVALID_VALUE_MESSAGE;
