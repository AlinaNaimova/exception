import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class EmptyLineException {
    public static void emptyLineTest() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.trim();
        if (string.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        else
            System.out.println(string);
    }

}
