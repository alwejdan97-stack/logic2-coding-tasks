import java.util.Locale;

public class fizzStringTask {
    public static void main(String[] args){
        String str = "fig";
        System.out.println(fizzString(str));
    }
    public static String fizzString(String str){
        str = str.toLowerCase();
        if(str.startsWith("f")){
            return "Fizz";
        }else if(str.endsWith("b")){
            return "Buzz";

        }else if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }else {
            return str;
        }
    }
}
