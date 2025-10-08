package CodeDecode.Day1;

import java.util.function.BiConsumer;

public class AddDemoUsingLamda {
    public static void main(String[] args) {
        //AddDemoUsingLamda adul=new AddDemoUsingLamda();
        //adul.add(1,2);
        BiConsumer<Integer,Integer> biConsumer=(a,b)->System.out.println(a+b);
        biConsumer.accept(4,5);
    }
   /* public void add(int a,int b){
        System.out.println(a+b);
    }*/
}
