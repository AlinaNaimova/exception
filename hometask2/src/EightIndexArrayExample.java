/**
 * Если необходимо, исправьте данный код
 * Result: При попытке выполнения деления на 0, возникнет исключение ArithmeticException, которое перехвачивается блоком catch
 * и будет выведено сообщение об ошибке и метод вернет значение Double.NaN (Not a Number).
 */
public class EightIndexArrayExample {
    public static double divideByZero(int[] intArray) {
        try {
            int d = 0;
            double result = intArray[8] / d;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            return Double.NaN;
        }
    }
}
