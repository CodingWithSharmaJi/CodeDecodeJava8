package CodeDecode.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> arList=new ArrayList<>();
        arList.add(11);arList.add(17);arList.add(8);arList.add(16);arList.add(5);
        //Without Stream
        List<Integer> arListFromMethod=findElements(arList);
        for(Integer i: arListFromMethod){
            System.out.println(i);
        }

        // with Stream
        List<Integer> newAl=new ArrayList<>();
        newAl=arList.stream().filter(x->x>=15).collect(Collectors.toList());
        newAl.stream().forEach(x->System.out.println(x));
    }
    public static List<Integer> findElements(List<Integer> arList){
        List<Integer> newAl=new ArrayList<>();
        for(Integer i:arList){
            if(i>15){
                newAl.add(i);
            }
        }
        return newAl;
    }
}
