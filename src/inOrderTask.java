public class inOrderTask {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 2;
        boolean bOk = true;
        System.out.println(inOrder(a, b, c, bOk));

    }
    public static boolean inOrder(int a, int b, int c, boolean bOk){
        if(bOk == false){
            if(b > a && b < c){
                return true;
            }
        }else if(bOk == true){
            if(b < c){
                return true;
            }
        }
            return false;
    }

}
