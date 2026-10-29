package javaapps.math;

public class LongAddition implements Addition {
    private final long num1;
    private final long num2;

    public LongAddition(long num1, long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public long add() {
        return num1 + num2;
    }
}
