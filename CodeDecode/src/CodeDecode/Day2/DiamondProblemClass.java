package CodeDecode.Day2;

public class DiamondProblemClass implements InterfaceDemo2,InterfsaceDemo{
    @Override
    public void printName() {
        InterfsaceDemo.super.printName();
    }

    public static void main(String[] args) {
        DiamondProblemClass diamondProblemClass=new DiamondProblemClass();
        diamondProblemClass.printName();
    }
}
