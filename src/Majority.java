import java.util.Arrays;
import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++)
            array[i] = sc.nextInt();
        Arrays.sort(array);
        int count = 0;
        for( int i = 0;i < n - 1;i++){
            if(array[i] == array[i+1]) {
                count += 1;
                if(count >= n/2) {
                    System.out.println(1);
                    break;
                }
            }
            else
                count = 0;
        }
        if(count < n/2)
            System.out.println(0);
    }
}
