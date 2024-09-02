package app;

public class DataProcessing implements Printer {

    @Override
    public void print(Message message) {
        if (message.getSender() == null || message.getSender() = "") {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.text);
        } else {
            System.out.println("Користувач " + message.sender + "відправив повідомлення: " + message.text);
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
