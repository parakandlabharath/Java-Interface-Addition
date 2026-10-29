package javaapps.math;

public class MainProgram {
    public static void main(String[] args) {
        AdditionOperation operation = new AdditionOperation();

        long intResult = operation.addTwoInts(7, 7);
        System.out.println("Result of adding two int numbers: " + intResult);

        long longResult = operation.addTwoNumbers(10L, 7L);
        System.out.println("Result of adding two long numbers: " + longResult);
    }
}
