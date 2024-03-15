package org.example.javaQuestion.evenOddUsingTwoThread;

public class Main {

    public static void main(String[] args) {

        PrintNumbers printNumbers = new PrintNumbers();

        Thread t1 = new Thread(printNumbers, "even");
        Thread t2 = new Thread(printNumbers, "odd");

        t1.start();
        t2.start();
    }
}
