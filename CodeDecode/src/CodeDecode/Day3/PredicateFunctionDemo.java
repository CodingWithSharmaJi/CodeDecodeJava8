package CodeDecode.Day3;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
        PredicateFunctionDemo predicateFunctionDemo=new PredicateFunctionDemo();
        System.out.println(predicateFunctionDemo.checkLength("code decode"));

        Predicate<String> checkLength=s->s.length()>5;
        System.out.println(" The length of string is greater than 5 or not="+checkLength.test("code decode"));
    }

    private boolean checkLength(String s) {
        if(s.length()>5)
            return true;
        else
            return false;

    }
}
