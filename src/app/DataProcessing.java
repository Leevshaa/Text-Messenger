package app;

public class DataProcessing implements Printer {

    @Override
    public void print(Message message) {
        if ((message.getSender() == null || message.getSender() == "") &&
                (message.getText() == null || message.getText() == "")) {
            Printer anonymous = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymous.print(message);
        } else if (message.getSender() == null || message.getSender() == "") {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.text);
        } else if (message.getText() == null || message.getText() == "") {
            System.out.println("Користувач " + message.getSender() + " надіслав пусте повідомлення :(");
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

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
