package CodeDecode.Day2;

public class InterfaceWithStaticDemoImpl implements InterfaceWithStaticDemo{
    public static void main(String[] args) {
        InterfaceWithStaticDemoImpl interfaceWithStaticDemo=new InterfaceWithStaticDemoImpl();
        InterfaceWithStaticDemo.staticMeth();
        //interfaceWithStaticDemo.staticMeth();
    }
}
