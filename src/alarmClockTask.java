public class alarmClockTask {
    public static void main(String[] args) {
        int day = 5;
        boolean vacation = false;
        System.out.println(alarmClock(day,vacation));
    }
    public static String alarmClock(int day, boolean vacation) {
        if(day >= 1 && day <= 5){
            if( vacation == false ){
                return "7:00";
            }else{
                return "10:00";
            }
        }else if(day == 0 || day == 6) {
            if (vacation == false) {
                return "10:00";
            } else {
                return "off";
            }
        }
        return "off";
    }

}
