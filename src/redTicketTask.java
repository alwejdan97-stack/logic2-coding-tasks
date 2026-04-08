public class redTicketTask {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 1;
        System.out.println(redTicket(a, b, c));

    }
    public static int redTicket(int a, int b, int c){
        if(a==2 || b==2 || c==2){
            return 10;
        }else if(a==b && a==c && b==c){
            return 5;
        }else if(b==c){
            return 1;
        }else{
            return 0;
        }
    }

}
