package home2;
// 1. Напишите программу, чтобы найти вхождение в строке 
// (содержащей все символы другой строки).
public class Program {
    public static void main(String[] args)
    {
        String test = "GeekBrains";

        CharSequence seq = "e";
        boolean bool = test.contains(seq);
        System.out.println("Найден 'e'?: " + bool);

        // return false
        boolean sqFound = test.contains("x");
        System.out.println("Найден 'x'?: " + sqFound);
    }
}

// 2. Напишите программу, чтобы проверить, 
// являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
public class ProgramMirror {

    class StringRotation
{
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main (String[] args)
    {
        String str1 = "AACCC";
        String str2 = "CCAAA";

        if (areRotations(str1, str2))
            System.out.println("Строки зеркальные друг другу");
        else
            System.out.printf("Строки не зеркальные друг другу");
    }
}
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class ProgramRecursion {
    public static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    public static void main(String[] args) {
    String s = "Java\n";
    System.out.print(s);

    if(s.length() > 0) {
        reverseString(s, s.length() - 1);
    }
    }
    public static void reverseString(String s, int index) {
    if(index == 0) {
        System.out.println(s.charAt(index));

         return;
    }
    System.out.print(s.charAt(index));
    reverseString(s, index - 1);
    }
}
}
// Дано два числа, например 3 и 56, 
// необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = 
// -53 3 * 56 = 168 
// 3 + 56 = 59 
// 3 – 56 = -53
// 3 * 56 = 168 
// Используем метод StringBuilder.append().

import java.util.Scanner;

public class ProgramNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        int a = 56;
        int b = 3;
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        builder.append(String.format("%d / %d = %d\n", a, b, a / b));
        System.out.println(builder.toString());
        System.out.println(builder.toString());
        // System.out.println(builder.toString());
        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
}