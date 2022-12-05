package ru.task_1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
public class String1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println(getLowerCaseString(str));
        System.out.print("JavaRush".charAt(4));

        boolean retVal;
        boolean retVal1;
        retVal = str.endsWith("!!!");
        System.out.println("\n3. Строка заканчивается !!! : " + retVal);

        retVal1 = str.startsWith("I like");
        System.out.println("4. Строка начинается подстрокой 'I like': " + retVal1);

        System.out.println("5. Строка содержит 'Java': " + str.contains("Java"));


        String wordToFind = "Java";
        Pattern word = Pattern.compile(wordToFind);
        Matcher match = word.matcher(str);

        while (match.find()) {
            System.out.println("6. Позиция подстроки : "+ match.start() +" - "+ (match.end()-1));
        }

        String replaceSample = "amaxakaa apoooaaaalako iedka";
        String newString = replaceSample.replace('a', 'o');
        System.out.println("7. Замена всех символов 'a' на 'o': ");
        System.out.println(newString);

        System.out.println("8. Преобразование строки к верхнему регистру:");
        System.out.println(str.toUpperCase());

        System.out.println("9. Преобразование строки к нижнему регистру: ");
        System.out.println(str.toLowerCase());

        System.out.print("10. Вырезать строку 'Java': ");
        System.out.println(str.substring(7,11));
    }

    private static String getLowerCaseString(String str) {
        StringBuffer sb = new StringBuffer();
        if (str != null) {
            for (char symbol : str.toCharArray()) {
                if (symbol >= 'А' && symbol <= 'Я') {
                    symbol = Character.toLowerCase(symbol);
                }
                sb.append(symbol);
            }
        }
        return sb.toString();
    }

}