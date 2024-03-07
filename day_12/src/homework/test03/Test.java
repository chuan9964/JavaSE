package homework.test03;

public class Test {
    public static void main(String[] args) {
        PrinterCharTask charTask = new PrinterCharTask();
        Thread char1 = new Thread(charTask);
        Thread char2 = new Thread(charTask);

        PrinterNumTask numTask = new PrinterNumTask();
        Thread num1 = new Thread(numTask);
        Thread num2 = new Thread(numTask);

        char1.start();
        char2.start();
        num1.start();
        num2.start();
    }
}
