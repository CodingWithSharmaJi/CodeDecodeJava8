package CodeDecode.Day7;

import java.util.Arrays;
import java.util.List;

public class TerminalVsNonTerminalOperations {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"code1");
        Employee e2=new Employee(2,"code22");
        Employee e3=new Employee(3,"code333");
        Employee e4=new Employee(4,"code4");

        List<Employee> empList= Arrays.asList(e1,e2,e3,e4);
        List<Integer> integerList=Arrays.asList(1,2,3,4,5);
        integerList.stream().filter(a->a%2==0).map(a->a+a).filter(a->a>5).forEach(a->System.out.println(a));
       //peek use
        System.out.println(integerList.stream().filter(a->a%2==0).peek(System.out::println).map(a->a+a).filter(a->a>5).count());
        //reduce use
        System.out.println("Sum is="+integerList.stream().reduce((a,b)->a+b).get());

        empList.stream().filter(e->e.getId()%2==0).map(e->{
            e.printName();
            return e.getName();
        }).forEach(e->System.out.println(e));

        empList.stream().filter(e->e.getId()%2==0).map(e->{
            e.printName();
            return e.getName();
        });
        //printName is not called because intermidate operation is lazy it is only called
        // when terminal operation is there
    }
}
