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


    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {   //чтобы сортировать по убыванию просто меняй > на <, а indexMin на indexMax
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Перемещаем элементы массива, которые больше key, на одну позицию вперед
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}