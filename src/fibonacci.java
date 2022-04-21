import java.util.Scanner;

public class fibonacci {
    public static long Fib(int n) {
        long n1 = 0;
        long n2 = 1;
        long n3 = 0;
        if(n < 2)
            return n;
        for (int i = 2; i <= n; ++i){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fib(n));
    }
}