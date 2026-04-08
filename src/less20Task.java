public class less20Task {
    public static void main(String[] args) {
        int number = 24;
        System.out.println( less20(number));
    }
    public static boolean less20(int number){
        if(number > 0){
            if(number % 20 == 18 || number % 20 == 19){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
