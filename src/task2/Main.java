package task2;

/**
 * Задание: Отсортируйте массив [5,6,3,2,5,1,4,9]
 */

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {5,6,3,2,5,1,4,9};
        printArray(arr);
        bubleSort(arr);
        System.out.println(" ");
        printArray(arr);

    }

    private static void bubleSort(int[] arr){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i< arr.length; i++){
                if (arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j);
        }
    }

}
