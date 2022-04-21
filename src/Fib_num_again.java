import java.math.BigInteger;
import java.util.Scanner;

public class Fib_num_again {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        int m = sc.nextInt();
        sc.close();
        System.out.println(fib(n,m));
    }
    public static BigInteger fib(BigInteger n,int m){
        BigInteger n1 = BigInteger.valueOf(0);
        BigInteger n2 = BigInteger.valueOf(1);
        BigInteger n3;
        if(n.longValue()  < 2)
            return n;
        for (int i = 2; i <= n.longValue(); ++i){
            n3 = n1.add(n2);
            n1 = n2;
            n2 = n3;
        }

        return n2.mod(BigInteger.valueOf(m));
    }
}
