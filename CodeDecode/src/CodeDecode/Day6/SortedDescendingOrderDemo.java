package CodeDecode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDescendingOrderDemo {
        public static void main(String[] args) {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream=arList.stream();
        //configure stream by filtering out required values
        Stream<Integer> filteredStream=openStream.filter(i->i>=20);
        //u can sort on any stream filter or mapped or on normal stream(non filter or non mapped too)
        Stream<Integer> sortedStream=filteredStream.sorted((i1,i2)->i2.compareTo(i1));
        sortedStream.forEach(x->System.out.println(x));

        System.out.println("Now in single line");

        Stream<Integer> sortedStream1=arList.stream().filter(i->i>=20).sorted((i1,i2)->i2.compareTo(i1));
        sortedStream1.forEach(x->System.out.println(x));
    }
}
