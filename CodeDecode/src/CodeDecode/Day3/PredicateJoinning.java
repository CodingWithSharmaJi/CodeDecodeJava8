package CodeDecode.Day3;

import java.util.function.Predicate;

public class PredicateJoinning {
    public static void main(String[] args) {
        Predicate<String> checkLength=s->s.length()>=5;
        System.out.println("Check length is greater than 5 or no="+checkLength.test("Code decode"));

        Predicate<String> checkEvenlength=s->s.length()%2==0;
        System.out.println("The length of String is even or not="+checkLength.test("Code decode"));

        //It can be joined with and
        System.out.println("After merging with and="+checkLength.and(checkEvenlength).test("Code decode"));

        //It can be joined with or
        System.out.println("After merging with and="+checkLength.or(checkEvenlength).test("Code decode"));

        //It can be joined with negate
        System.out.println("After merging with and="+checkLength.negate().test("Code decode"));
    }
}
