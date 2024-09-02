package app;

public class Main {

    public static void main(String[] args) {

        DataInput dataInput = new DataInput();
        DataProcessing.Message message = dataInput.getData();

        DataProcessing dataProcessing = new DataProcessing();
        dataProcessing.print(message);
    }
}
