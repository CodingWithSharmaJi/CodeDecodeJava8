package CodeDecode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {
        public static void main(String[] args) {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream=arList.stream();
        //configure stream by filtering out required values
        Stream<Integer> filteredStream=openStream.filter(i->i>=20);
        Object[] inArray=filteredStream.toArray();
        for(Object o:inArray){
            System.out.println("Element in Array is="+o);
        }

        System.out.println("Now in single line");

            Object[] inArray1=arList.stream().filter(i->i>=20).toArray();
            for(Object o:inArray1){
                System.out.println("Element in Array is="+o);
            }
    }
}
