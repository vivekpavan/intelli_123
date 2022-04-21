import java.util.Scanner;

public class car_fuelling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int milage = sc.nextInt();
        int stop_interval = sc.nextInt();
        int[] stops = new int[stop_interval + 1];
        for(int i = 0;i < stop_interval;i++)
            stops[i] = sc.nextInt();
        stops[stop_interval] = distance;
        System.out.println(Car_fuelling(milage,stop_interval,stops));
    }

    public static int Car_fuelling(int milage,int stop_interval,int[] stops){
        int previous = 0;
        int count = 0;
        int difference = milage;
        for(int i = 0;i < stops.length;i++){
            if(milage - stops[i] <  0){
                if(i != 0)
                    previous = stops[i - 1];
                if(stops[i] - previous > difference)
                    return -1;
                milage += previous;
                count++;
            }
        }
        return count;
    }
}
