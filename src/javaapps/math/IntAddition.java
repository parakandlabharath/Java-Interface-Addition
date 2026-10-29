package javaapps.math;

public class IntAddition implements Addition {
    private final int num1;
    private final int num2;

    public IntAddition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public long add() {
        return (long) num1 + num2;
    }
}
