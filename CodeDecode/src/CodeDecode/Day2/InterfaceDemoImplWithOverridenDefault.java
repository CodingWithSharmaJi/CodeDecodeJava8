package CodeDecode.Day2;

import CodeDecode.Day1.InterfaceImplementsDefaultMethodDemo;

public class InterfaceDemoImplWithOverridenDefault {
    public void printName(){
        System.out.println("Welcome to overriden method by code decode");
    }

    public static void main(String[] args) {
        InterfaceDemoImplWithOverridenDefault default1=new InterfaceDemoImplWithOverridenDefault();
        default1.printName();
    }
}
