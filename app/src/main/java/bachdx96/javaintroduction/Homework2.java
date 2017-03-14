package bachdx96.javaintroduction;
/**
 * Created by Bach on 3/13/2017.
 */

import java.util.Scanner;

public class Homework2 {
    public int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public boolean isPrime(int n) {
        //boolean isPrime_=false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int getNthPrime(int n) {
        int count = 1;
        int result = 1;
        while (count <= n) {
            result++;
            if (isPrime(result))
                count++;
        }
        return result;
    }

    public void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == n || i == j || i == n - j + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Homework2 m = new Homework2();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input n: ");
            int n = scanner.nextInt();
            System.out.println("n! = " + m.getFactorial(n));
            System.out.println(n + " is" + (m.isPrime(n) ? "" : " not") + " a prime");
            System.out.println("The nth prime is " + m.getNthPrime(n));
            m.printSquare(n);
        }
    }
}