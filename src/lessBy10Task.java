public class lessBy10Task {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        System.out.println(lessBy10(a, b, c));

    }
    public static boolean lessBy10(int a, int b, int c) {
        if( Math.abs(a-b) >= 10){
            return true;
        }else if(Math.abs(a-c) >= 10){
            return true;
        }else if(Math.abs(b-c) >= 10){
            return true;
        }else{
            return false;
        }
    }

}
