package bachdx96.javaintroduction;

import java.util.Scanner;

/**
 * Created by Bach on 3/14/2017.
 */

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = scanner.nextLine();
        // Count nummber of character 'a' in string
        int countChar = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                countChar++;
            }
        }
        System.out.printf("There %s %s 'a' character%s%n", (countChar == 1 || countChar == 0) ? "is" : "are", countChar == 0 ? "no" : countChar, (countChar == 1 || countChar == 0) ? "" : "s");
        // Trim start and end spacing and use regex to trim multiple space
        str = str.trim();
        str = str.replaceAll(" +"," ");
        String[] words = str.split(" ");
        // Count number of words
        System.out.printf("There %s %s word%s in string%n", (words.length == 1 || words.length == 0) ? "is" : "are", words.length == 0 ? "no" : words.length, (words.length == 1 || words.length == 0) ? "" : "s");
        // Check first name
        if (words[0].contains("Doan")) {
            System.out.println("First name is Doan");
        }
        System.out.println("Trimmed string: "+str);
    }
}
