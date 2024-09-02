package app;

public class DataProcessing implements Printer {

    //Перевизначаємо метод print
    @Override
    public void print(Message message) {

        //Прописуємо умови виклику різних повідомлень за умовами задачі,
        // використовуємо статичний метод isEmpty замість конструкції message.getSender() == ""

        if ((message.getSender() == null || message.getSender().isEmpty()) &&
                (message.getText() == null || message.getText().isEmpty())) {

            //Створюємо анонімний клас якщо поля sender та text пусті

            Printer anonymous = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("\nОпрацьовується пусте повідомлення від анонімного користувача...");
                }
            };

            //В анонімному класі anonymous викликаємо перевизначений метод print, який містить в собі повідомлення

            anonymous.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("\nАнонімний користувач відправив повідомлення: " + message.text);
        } else if (message.getText() == null || message.getText().isEmpty()) {
            System.out.println("\nКористувач " + message.getSender() + " надіслав пусте повідомлення :(");
        } else {
            System.out.println("\nКористувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

        //Створюємо статичний внутрішній клас, який має в собі конструктор, геттери та сеттери

        public static class Message {

            private String sender;
            private String text;

            public Message(String sender, String text) {
                this.sender = sender;
                this.text = text;
            }

            public String getSender() {
                return sender;
            }

            public void setSender(String sender) {
                this.sender = sender;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
