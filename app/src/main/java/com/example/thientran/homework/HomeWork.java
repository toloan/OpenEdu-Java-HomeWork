package com.example.thientran.homework;

import java.util.Scanner;

/**
 * Created by Thien Tran on 2017-03-13.
 */
/*
- nhập vào xâu str từ bàn phím, kiểm tra xem trong xâu có bao nhiêu chữ a
- Kiểm tra xem xâu có bao nhiêu từ
- Nhập vào tên của một người, kiểm tra Họ của người đó có phải là Doan ko
- Xóa các kí tự space đầu và cuối trong 1 xâu, giữa các từ trong xâu chỉ có 1 space.
 */

public class HomeWork {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu : ");
        string = scanner.nextLine();

        // Xâu nhập vào có bao nhiêu chữ a
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'á' || string.charAt(i) == 'à' || string.charAt(i) == 'ạ' || string.charAt(i) == 'ả'
                    || string.charAt(i) == 'ã' || string.charAt(i) == 'A' || string.charAt(i) == 'Á' || string.charAt(i) == 'À' || string.charAt(i) == 'Ạ'
                    || string.charAt(i) == 'Ả' || string.charAt(i) == 'Ã')
                count++;
        }
        if (count == 0)
            System.out.println("Xâu nhập vào không có chữ a nào");
        else
            System.out.println("Xâu nhập vào có " + count + " chữ a");

        // Loại bỏ khoảnh trắng ở đầu và cuối xâu, chỉ giữ lại 1 khoảng trắng giữa các từ
        string = string.trim();
        string = string.replaceAll("\\s+", " ");
//      string = string.replaceAll("\\s{2,}"," ")

        // Đếm xem xâu nhập vào có bao nhiêu từ
        String[] strings = string.split(" ");
        System.out.println("Xâu nhập vào có " + strings.length + " từ");

        // Xác định xem người nhập vào có phải họ doan hay không
        String stringss = "Doan";
        int result = strings[0].compareTo(stringss);
        if(result == 0)
            System.out.println("Người này họ Doan");
        else
            System.out.println("Người này không phải họ Doan");
    }
}
