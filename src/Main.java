import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Введите текст и нажмите <Enter>: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длина текста: " + text.length());*/
        int successfulAttemptsNumber = 0;
        while(true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("Указан путь к несуществующему файлу!");
                continue;
            }
            if (isDirectory) {
                System.out.println("Указан путь к папке!");
                continue;
            }
            successfulAttemptsNumber++;
            System.out.println("Путь указан верно. Это файл номер " + successfulAttemptsNumber);
        }
    }
}
