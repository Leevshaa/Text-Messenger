package app;

import java.util.Scanner;

public class DataInput {

    Scanner scanner = new Scanner(System.in);

    //Створюємо метод для отримання користувацьких даних
    public DataProcessing.Message getData() {
        System.out.print("\nВведіть ім'я користувача: ");
        String sender = scanner.nextLine();
        System.out.print("Введіть текст повідомлення: ");
        String text = scanner.nextLine();

        //Повертаємо в DataProcessing Message з користувацькими даними
        return new DataProcessing.Message(sender, text);
    }
}
