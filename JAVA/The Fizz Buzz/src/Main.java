import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String message;
        for (int i = 1; i <=100 ; i++) {
            message = (i % 3 == 0 && i % 5 == 0)
                    ? " Fizz-Buzz": (i % 3 == 0)
                    ? " Fizz" : (i % 5 == 0)
                    ? " Buzz":"";
            System.out.println(i + message );
        }

    }
}