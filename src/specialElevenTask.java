public class specialElevenTask {
    public static void main(String[] args) {
        int number = 24;
        System.out.println(specialEleven(number));
    }
    public static boolean specialEleven(int number){
        if(number > 0){
            if(number % 11 == 0 || number % 11 == 1){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}
