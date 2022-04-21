import java.util.Arrays;
import java.util.Scanner;

public class max_ad_revenue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        int[] seq_1 = new int[inputs];
        int[] seq_2 = new int[inputs];
        for(int i = 0;i < inputs;i++)
            seq_1[i] = sc.nextInt();
        for(int i = 0;i < inputs;i++)
            seq_2[i] = sc.nextInt();
        System.out.println(max_ad(seq_1,seq_2));
    }
    public static long max_ad(int[] seq_1,int[] seq_2){
        Arrays.sort(seq_1);
        Arrays.sort(seq_2);
        long result = 0;
        for(int i = 0;i < seq_1.length;i++){
                result += ((long)seq_1[i] * seq_2[i]);
            }
        return result;
    }
}
