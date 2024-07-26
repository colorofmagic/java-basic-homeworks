package homework3;

public class MainApplication3 {
    public static void main(String[] args) {
        int[][] array = {{5, -8, 6}};
        //System.out.println(sumOfPositiveElements(array));
        printSquare(6);
        //zeroDiagonal(array);
        //System.out.println(findMax(array));
        //System.out.println(sumSecond(array));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }


    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            int j = 0;
            while (j < size) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    public static void zeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }


    public static int sumSecond(int[][] array) {
        if (array.length < 2) {
            return -1;
        }
        int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[1][i];
            }
        return sum;
    }
}


