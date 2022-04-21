import java.math.BigInteger;
import java.util.Scanner;

public class fib_last_digit {
    public static BigInteger Fib(int n) {
        BigInteger n1 = BigInteger.valueOf(0);
        BigInteger n2 = BigInteger.valueOf(1);
        BigInteger n3;
        if(n  < 2)
            return BigInteger.valueOf(n);
        for (int i = 2; i <= n; ++i){
            n3 = n1.add(n2);
            n1 = n2;
            n2 = n3;
        }

        return n2.mod(BigInteger.TEN);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fib(n));
    }
}

