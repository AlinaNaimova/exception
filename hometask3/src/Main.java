import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона (число без разделителей) и пол(символ латиницей f или m), разделенные пробелом");

        String input = scanner.nextLine();
        String[] data = input.split(" ");

        if (data.length != 6) {
            System.out.println("Неверное количество данных");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        char gender = data[5].charAt(0);

        try {
            validateData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            saveToFile(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            System.out.println("Данные успешно сохранены в файл");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении данных в файл");
        }
    }

        private static void validateData(String lastName, String firstName, String middleName,
                                         String birthDate, String phoneNumber, char gender) {
            if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                throw new IllegalArgumentException("Неверный формат даты рождения");
            }

            if (!phoneNumber.matches("\\d+")) {
                throw new IllegalArgumentException("Неверный формат номера телефона");
            }

            if (gender != 'f' && gender != 'm') {
                throw new IllegalArgumentException("Неверный формат пола");
            }
        }

        private static void saveToFile(String lastName, String firstName, String middleName,
                                       String birthDate, String phoneNumber, char gender) throws IOException {
            FileWriter writer = null;
            try {
                writer = new FileWriter(lastName + ".txt", true);
                writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
        }
}
