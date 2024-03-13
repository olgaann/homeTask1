import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 0, 4};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {               //чтобы сортировать по убыванию просто меняй > на <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));;
    }
}