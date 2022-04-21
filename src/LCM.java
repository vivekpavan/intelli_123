import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(lcm(a,b));
    }
    public static long lcm(long a, long b){
        if(a % b == 0)
            return a;
        if(b % a == 0)
            return b;
        return (a / gcd(a, b)) * b;

    }
    public static long gcd(long a,long b){
        while(b != 0){
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
