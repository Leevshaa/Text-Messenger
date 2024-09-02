package app;

public class Main {

    public static void main(String[] args) {

        //Створюємо об'єкт класу DataInput
        DataInput dataInput = new DataInput();
        // та передаємо дані з методу getData в змінну message класу DataProcessing
        DataProcessing.Message message = dataInput.getData();

        //Створюємо об'єкт класу DataProcessing
        DataProcessing dataProcessing = new DataProcessing();
        // та викликаємо метод print, який опрацьовує користувацькі дані message
        // та відповідно до введених даних виводить текст
        dataProcessing.print(message);
    }
}
