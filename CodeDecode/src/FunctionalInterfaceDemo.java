@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void singleAbstractMethod();
    default void printName(){
        System.out.println("Welcome to Code Decode");
    }
    default void printName1(){
        System.out.println("Welcome to Code Decode 2");
    }
}
