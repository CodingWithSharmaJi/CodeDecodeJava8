package CodeDecode.Day3;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        Function<Integer,Integer> squareMe=i->i*i;
        System.out.println("Square is="+squareMe.apply(number));
    }
}
