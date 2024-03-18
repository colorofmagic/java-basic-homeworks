package homework2;
import java.util.Arrays;

public class MainApplication2 {
    public static void main(String[] args) {
        printString(3, "Hello World");
        sumElements(new int[] {3,4,5,6,7});
        fillArray(3, new int[6]);
        arrayIncreaseNumber(3, new int[] {1, 2, 3, 4});
        sumHalfArr(new int[] {3,12,6,4,5,5,6,7,9});
    }

    public static void printString(int a, String string) {

        for (int i = 0; i < a; i++) {
            System.out.println(string);

        }
    }

    public static void sumElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayIncreaseNumber(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sumHalfArr(int arr[]) {
        int sum1 = 0; //сумма первой половины массива
        int sum2 = 0; //сумма второй половины массива
        for (int i = 0; i < arr.length/2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма элементов первой половины массива больше");
        } else if (sum1 < sum2) {
            System.out.println("Сумма элементов второй половины массива больше");
        } else {
            System.out.println("Суммы элементов половины массива равны");
        }
    }
}
