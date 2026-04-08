public class fizzString2Task {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(fizzString2(number));
    }
    public static String fizzString2(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz!";
        }else if(number % 3 == 0){
            return "Fizz!" ;
        }else if( number % 5 == 0 ){
            return "Buzz!";
        }else{
            return number + "!";
        }
    }
}
