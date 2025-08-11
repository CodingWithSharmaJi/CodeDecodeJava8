import java.util.function.BiConsumer;

public class LamdaDemo {
    public static void main(String[] args) {
        //add(1,4);
        // Java-8 onwards
        BiConsumer<Integer,Integer> biConsumer=(a,b)->System.out.println(a+b);
        biConsumer.accept(5,6);
    }

//    // Till Java 7
//    public static void add(int a,int b){
//        System.out.println(a+b);
//    }
}
