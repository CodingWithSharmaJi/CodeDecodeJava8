package CodeDecode.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(11);
        arList.add(17);
        arList.add(8);
        arList.add(16);
        arList.add(5);

        //Stream s=arList.stream().map(i->i*i);
        //s.forEach(x->System.out.println(x));

        arList.stream().map(i -> i * i).forEach(x -> System.out.println(x));
    }

}
