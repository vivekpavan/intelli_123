import java.util.Scanner;

public class Money_change {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println(money_change(amount));
    }
    public static int money_change(int amount){
        final int Ten = 10;
        final int Five = 5;
        final int One = 1;
        int count = 0;
        while (amount != 0){
            while(amount >= Ten){
                amount = amount - Ten;
                count++;
            }
            while(amount >= Five){
                amount = amount - Five;
                count++;
            }
             while(amount >= One){
                 amount = amount - One;
                 count++;
             }
        }
        return count;
    }
}
