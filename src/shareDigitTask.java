public class shareDigitTask {
    public static void main(String[] args) {
        int a = 12;
        int b = 43;
        System.out.println(shareDigit(a, b));
    }
    public static boolean shareDigit(int a, int b){
        int leftA = a / 10;
        int rightA = a % 10;
        int leftB = b / 10;
        int rightB = b % 10;
        if((a >= 10 || a <= 99) || (b >= 10 || b <= 99)){
            if(leftA==leftB || leftA == rightB || rightA == rightB || rightA == leftB){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
