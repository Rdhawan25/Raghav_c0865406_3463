public class Product extends Binary{
    public Product(Number left, Number right) {
        this.left = left;
        this.right = right;    }

    @Override
    public int evaluate() {
        System.out.println(left.value + "*" + right.value);
        return left.value * right.value;
    }
}
