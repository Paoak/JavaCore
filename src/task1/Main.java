package task1;

/**
 * Задание: Заполнить двумерный массив случайными числами
 * и выведите максимальное, минимальное и среднее значение.
 */

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arrFill(arr);
        System.out.println("Двумерный массив представлен в виде:");
        arrToConsole(arr);
        System.out.println("Максимальное значение: " + maxValue(arr));
        System.out.println("Минимальное значение: " + minValue(arr));
        System.out.println("Среднее арифметическое значение: " + avgValue(arr));
    }

    public static int randomNumberGenerate() {
        int rangeBegin = -999;
        int rangeEnd = 999;
        return (int) (rangeBegin + (System.nanoTime()%((rangeEnd - rangeBegin) - 1)));
    }

    public static void arrFill(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNumberGenerate();
            }
        }
    }

    public static int maxValue(int[][] someArr){
        if (someArr.length == 0){
            throw new IllegalArgumentException();
        }
        int result = Integer.MIN_VALUE;
        for (int[] anArr : someArr) {
            for (int anAnArr : anArr)
                result = Math.max(result, anAnArr);
        }
        return result;
    }

    public static int minValue(int[][] someArr){
        if (someArr.length == 0){
            throw new IllegalArgumentException();
        }
        int result = Integer.MAX_VALUE;
        for (int[] anArr : someArr) {
            for (int anAnArr : anArr)
                result = Math.min(result, anAnArr);
        }
        return result;
    }

    public static float avgValue(int[][] someArr){
        if (someArr.length == 0){
            throw new IllegalArgumentException();
        }
        int counter=0;
        float sum = 0;
        for (int[] anArr : someArr) {
            for (int anAnArr : anArr) {
                sum = sum + anAnArr;
                counter++;
            }
        }
        return sum / counter;
    }

    public static void arrToConsole(int[][] someArr){
        for (int[] anArr : someArr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
