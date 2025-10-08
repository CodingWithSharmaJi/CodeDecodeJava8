package CodeDecode.Day4;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Integer> squreMe = i -> System.out.println("Taking and ip and perfroming squre return nothinhg" + i * i);
        squreMe.accept(5);

        Consumer<Integer> cube = i -> System.out.println("Taking and ip and perfroming cube return nothinhg" + i * i * i);
        cube.accept(5);

        //joining with andThen
        squreMe.andThen(cube).accept(5);

    }

}
