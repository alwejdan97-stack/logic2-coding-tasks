public class inOrderEqualTask {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 11;
        boolean equalOk = false;
        System.out.println(inOrderEqual(a, b, c, equalOk));
    }
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        if(equalOk == false ){
            if(a < b && b < c){
                return true;
            }else{
                return false;
            }
        }else if(equalOk == true){
            if(a <= b && b <= c){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}
