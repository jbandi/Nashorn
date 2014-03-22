import java.time.Duration;
import java.time.Instant;

public class FibDemo {
    public static void main(String[] args){

        for (int i = 30; i < 50; i++) {
            Instant start = Instant.now();
            long res = fibonacci(i);
            Instant end = Instant.now();
            System.out.println("Input: " + i + " Result: " + res + ", Time: " + Duration.between(start, end).toMillis());
        }

    }

    private static long fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
