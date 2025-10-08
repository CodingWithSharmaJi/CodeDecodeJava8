package CodeDecode.Day1;

public class MethodRefrenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo= Test::testImplementation;
        functionalInterfaceDemo.singleAbstractMethod();
    }
}
