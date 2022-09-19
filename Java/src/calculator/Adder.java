package calculator;

public class Adder implements Calculator {
    // d220831
    protected int[] operands;

    @Override
    public int calculate() {
        return operands[0] + operands[1];
    }

    @Override
    public void setOperands(int[] operands) {
        this.operands = operands;
    }

    @Override
    public void showResult() {
        System.out.printf("%d + %d = %d\n", operands[0], operands[1], calculate());
    }

    @Override
    public int getCountOfOperands() {
        return 2;
    }

}