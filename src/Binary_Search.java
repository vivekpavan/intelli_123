import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[] sort = new int[input1];
        for(int i = 0;i < input1;i++)
            sort[i] = sc.nextInt();
        int input2 = sc.nextInt();
        int[] search = new int[input2];
        for(int i = 0;i < input2;i++)
            search[i] = sc.nextInt();
        List<Integer> list = binary_search(sort,search);
        for(int number : list)
            System.out.println(number);
    }
    public static List<Integer> binary_search(int[] sort, int[] search){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < search.length;i++){
            int high = sort.length - 1;
            int low = 0;

            while(low <= high){
                int middle = (low + high) / 2;  //  middle = low + Math.floor(high - low)/2

                if(sort[middle] == search[i]) {
                    int[] array = where_present(sort,middle,sort[middle]);
                    int index = array[0];
                    int count = array[1];
                    if(index == middle) {
                        list.add(i, middle);
                    }
                    else{
                        list.add(i,middle - count + 1);
                    }
                    break;

                }
                if(search[i] < sort[middle])
                    high = middle - 1;
                else
                    low = middle + 1;
            }
            if(low > high)
                list.add(i,-1);
        }
        return list;
    }
    public static int[] where_present(int[] sort, int middle,int number){
        int[] array = new int[2];
        int count = 0;
        for(int i = 0;i < sort.length;i++){
            if(sort[i] == number)
                if(i <= middle)
                    count += 1;
            }
        array[0] = present_at(sort,number);
        array[1] = count;
        return array;
    }
    public static int present_at(int[] sort, int number){
        int index = 0;
        for(int i = 0;i < sort.length;i++){
            if(sort[i] == number) {
                return i;
            }
        }
        return index;
    }
}
