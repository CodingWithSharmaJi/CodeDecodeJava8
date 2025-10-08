package CodeDecode.Day1;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
     void singleAbstractMethod();
     default void printName(){
         System.out.println("Welcome To Code Decode");
     }
    default void printName2(){
        System.out.println("Welcome To Code Decode 2nd time");
    }
}
