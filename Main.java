import java.time.Year;
import java.util.Scanner;
import java.util.Date;
//import java.util.Math;
//import Number;
public class Main {
    public static void main(String[] args) {
//        int x = 12;
//        System.out.println(x);
        // constructing the expression 3 + 2 * 5
//    Number two = new Number(2);
//        Number three = new Number(3);
//        Number five = new Number(5);
//
//        Sum sumobj = new Sum(three,two);
//        sumobj.evaluate();
//        Product productobj = new Product(two, five);
//        productobj.evaluate();

        Number twelve = new Number(12);
        Number thirteen = new Number(13);
        Sum sumobj2 = new Sum(twelve,thirteen);
        sumobj2.evaluate();
//        ArithmeticExp term = new ArithmeticExp(TYPE_SUM, 0,
//                new ArithmeticExp(TYPE_NUMBER, 3, null, null),
//                new ArithmeticExp(TYPE_PROD, 0,
//                        new ArithmeticExp(TYPE_NUMBER, 2, null, null),
//                        new ArithmeticExp(TYPE_NUMBER, 5, null, null)));
//
//        System.out.println(evaluate(term));

    }
}