package CodeDecode.Day4;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> checkSumOfTwo=(a,b)->a+b>=5;
        System.out.println("Sum of 2 and check is greater than 5"+checkSumOfTwo.test(2,5));

        BiFunction<Integer,Integer,Integer> multiplyBoth=(a, b)->a*b;
        System.out.println("multiplication of 5 and 10 is"+multiplyBoth.apply(5,10
        ));
    }
}
