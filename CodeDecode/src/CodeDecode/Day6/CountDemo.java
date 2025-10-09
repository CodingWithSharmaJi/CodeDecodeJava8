package CodeDecode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {
        public static void main(String[] args) {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream=arList.stream();
        //configure stream by filtering out required values
        Stream<Integer> filteredStream=openStream.filter(i->i>=20);
        long streamCount=filteredStream.count();
        System.out.println(streamCount);

        System.out.println("Now in single line");

        Long newFilteredListCount=arList.stream().filter(i->i>=20).count();
        System.out.println(newFilteredListCount);
    }
}
