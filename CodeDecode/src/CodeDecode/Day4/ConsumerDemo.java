package CodeDecode.Day4;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        ConsumerDemo consumerDemo=new ConsumerDemo();
        consumerDemo.squreInt(5);

        Consumer<Integer> squreMe=i->System.out.println("Taking ip and performing operation and return anything "+i*i);
        squreMe.accept(5);

    }

    private void squreInt(int i) {
        int squred=i*i;
        System.out.println(squred);
    }
}
