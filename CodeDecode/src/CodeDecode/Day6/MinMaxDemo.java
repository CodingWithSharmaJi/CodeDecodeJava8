package CodeDecode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {
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
       // Integer min=filteredStream.min((i1,i2)->i1.compareTo(i2)).get();
       // System.out.println("Minimum is="+min);
       // Integer max=filteredStream.max((i1,i2)->i1.compareTo(i2)).get();
       //System.out.println("Maximum is="+max);

        System.out.println("Now in single line");

            Integer min=arList.stream().filter(i->i>=20).min((i1,i2)->i1.compareTo(i2)).get();
            System.out.println("Minimum is="+min);
            Integer max=arList.stream().filter(i->i>=20).max((i1,i2)->i1.compareTo(i2)).get();
            System.out.println("Maximum is="+max);
    }
}
