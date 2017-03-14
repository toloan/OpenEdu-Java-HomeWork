package bachdx96.javaintroduction;

import java.util.Scanner;

/**
 * Created by Bach on 3/13/2017.
 */

public class ArraySample {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        n = scanner.nextInt();
        int[] arrayNumbers = new int[n];
        for (int i=0;i< n;i++) {
            System.out.println("Input a["+i+"]: ");
            arrayNumbers[i] = scanner.nextInt();
        }
        for (int i=0;i<arrayNumbers.length;i++){
            System.out.print(arrayNumbers[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<arrayNumbers.length;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }
        for (int i=0;i<arrayNumbers.length;i++){
            System.out.print(arrayNumbers[i]+"\t");
        }
        System.out.println();
        System.out.print("Input rows: ");
        int rows = scanner.nextInt();
        System.out.print("Input cols: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                System.out.print("Input a["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
