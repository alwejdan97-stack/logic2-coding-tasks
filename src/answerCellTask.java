public class answerCellTask {
    public static void main(String[] args) {
        boolean isMorning = false;
        boolean isMom = false;
        boolean isAsleep = false;
        System.out.println(answerCell(isMorning, isMom, isAsleep));
    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if( isAsleep == true ){
            return false;
        }else if(isMorning == true){
            if(isMom == true){
                return true;
            }else{
                return true;
            }
        }else if(isMorning == false){
            return true;
        }
        return false;
    }
}
