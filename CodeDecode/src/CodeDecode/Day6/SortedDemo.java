package CodeDecode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
        public static void main(String[] args) {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream=arList.stream();
        //configure stream by filtering out required values
        Stream<Integer> filteredStream=openStream.filter(i->i>=20);
        Stream<Integer> sortedStream=filteredStream.sorted();
        sortedStream.forEach(x->System.out.println(x));

        System.out.println("Now in single line");

            Stream<Integer> sortedStream1=arList.stream().filter(i->i>=20).sorted();
            sortedStream1.forEach(x->System.out.println(x));
    }
}
