package app;

import java.util.Scanner;

public class DataInput {

    Scanner scanner = new Scanner(System.in);

    public String getData(String sender, String text) {

        System.out.println("Введіть ім'я користувача: ");
        sender = scanner.nextLine();
        System.out.println("Введіть текст повідомлення: ");
        text = scanner.nextLine();
        return sender;
    }
}
