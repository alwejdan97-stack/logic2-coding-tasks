public class squirrelPlayTask {
    public static void main(String[] args) {
        int temp = 95;
        boolean isSummer = true;
        System.out.println(squirrelPlay(temp,isSummer));
    }
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if(isSummer == false){
            if(temp >= 60 || temp <= 90){
                return true;
            }else{
                return false;
            }
        }else if(isSummer == true){
            if(temp >= 60 || temp <= 100){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}
