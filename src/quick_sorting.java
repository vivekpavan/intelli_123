import java.util.Scanner;

public class quick_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        sort(array);

        for (int m : array)
            System.out.println(m);
    }
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start >= end)
            return;

        int boundary = partiton(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private static int partiton(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        }
        return boundary;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
