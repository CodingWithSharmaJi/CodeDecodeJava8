package CodeDecode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream=arList.stream();
        //configure stream by filtering out required values
        Stream<Integer> filteredStream=openStream.filter(i->i>=20);
        //Collect all filtered elements and add them to a new list called newFilteredListOrigin
        List<Integer> newFilteredListOrigin=filteredStream.collect(Collectors.toList());
        newFilteredListOrigin.stream().forEach(x->System.out.println(x));

        System.out.println("Now in single line");
        //What we have donne
        /*
        1.Open stream with .stream()
        2.Use lamda expression in filter to filter out required object from the open stream
        3.Collect all filtered elements and add them to a new list called newFilteredListOrigin
         */
        List<Integer> newFilteredList=arList.stream().filter(i->i>=20).collect(Collectors.toList());
        newFilteredList.forEach(x->System.out.println(x));
    }
}
