package javaapps.math;

public class AdditionOperation {
    public long addTwoInts(int num1, int num2) {
        Addition addition = new IntAddition(num1, num2);
        return addition.add();
    }

    public long addTwoNumbers(long num1, long num2) {
        Addition addition = new LongAddition(num1, num2);
        return addition.add();
    }
}
