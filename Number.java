public class Number extends ArithmeticExp {
    int value;

    public Number(int value) {
        this.value = value;
    }

    public int evaluate() {
        return value;
    }
}
