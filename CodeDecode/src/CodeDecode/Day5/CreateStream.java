package CodeDecode.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        List<Integer> arlist=new ArrayList<Integer>();
        arlist.add(15);
        arlist.add(25);
        arlist.add(16);
        Stream s=arlist.stream().filter(i->i%2==0);
        s.forEach(x->System.out.println(x));

        arlist.stream().filter(i->i%2==0).forEach(x->System.out.println(x));
    }
}
