package Arrays;


public class TimeData{
    public static String getTime(String time){
        String am_pm;
        char fist = time.charAt(0);
        char sec = time.charAt(1);
        char forth = time.charAt(3);
        char fifth = time.charAt(4);
        String t = fist+""+sec;
        String s = forth+""+fifth;
        float as = Float.valueOf(t+"."+s);
        if (as >= 12.00 && as<=23.59) {
            am_pm = "PM";
        } else {
            am_pm = "AM";
        }
        return am_pm;
    };
    public static void main(String[] args) {
       System.out.println(getTime("09:00"));
    }
}