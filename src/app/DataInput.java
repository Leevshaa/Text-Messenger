package app;

import java.util.Scanner;

public class DataInput {

    Scanner scanner = new Scanner(System.in);

    public DataProcessing.Message getData() {
        System.out.print("Введіть ім'я користувача: ");
        String sender = scanner.nextLine();
        System.out.print("Введіть текст повідомлення: ");
        String text = scanner.nextLine();
        return new DataProcessing.Message(sender, text);
    }
}
