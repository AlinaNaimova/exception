import java.io.FileNotFoundException;

/**
 * Дан следующий код, исправьте его там, где требуется
 * Result: Класс Throwable был заменен на подкласс класса Exception ArithmeticException (в 18 строке),
 * поясняющий, какая ошибка возникла при выполнении программы.
 */

public class SumTest {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Что-то пошло не так... Деление на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}