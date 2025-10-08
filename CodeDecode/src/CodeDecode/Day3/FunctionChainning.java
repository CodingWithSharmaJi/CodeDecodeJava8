package CodeDecode.Day3;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        Function<Integer,Integer> doubleIt=i->2*i;
        System.out.println("Output after doubling is="+doubleIt.apply(number));

        Function<Integer,Integer> cubeIt=i->i*i*i;
        System.out.println("Output after doubling is="+cubeIt.apply(number));

        //It can be joined with andThen
        System.out.println("Output after doubling is="+doubleIt.andThen(cubeIt).apply(number));

        //It can be joined with compose
        System.out.println("Output after doubling is="+doubleIt.compose(cubeIt).apply(number));
    }


}
