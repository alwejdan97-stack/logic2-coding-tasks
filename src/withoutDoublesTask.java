public class withoutDoublesTask {
    public static void main(String[] args) {
        int die1 = 3;
        int die2 = 3;
        boolean noDoubles = true;
        System.out.println(withoutDoubles(die1, die2, noDoubles));
    }
    public static int withoutDoubles(int die1, int die2, boolean noDoubles){
        if(noDoubles == false){
            return die1 + die2;
        }else if(noDoubles == true && die1 != die2){
            return die1 + die2;
        }else if(noDoubles == true && die1 == die2){
            return die1 + 1;
        }
        return die2 + 1;
    }

}
