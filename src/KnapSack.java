import java.util.Scanner;

public class KnapSack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for(int i = 0;i < n;i++){
            values[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        System.out.println(value(capacity,values,weights));
    }
    public static double value(int capacity,int[] values,int[] weights){
        double value = 0;
        int ratio;
        int count  = weights.length;
        while(capacity != 0 && count != 0){
            for(int i = 0;i < weights.length;i++) {
                if (capacity >= weights[i]){
                    value = value + values[i];
                    capacity = capacity - weights[i];
                    count--;
                }
                if(i == weights.length - 1 && capacity <= weights[i] && capacity != 0){
                    ratio = weights[i] / capacity;
                    value = value + ((float)values[i] / ratio);
                    capacity = capacity - (weights[i] / ratio);
                    count--;
                }
            }
        }
        return value;
    }
}
