package namsteDSA.warmUp;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int count=0;
        while(number>0){
            number/=10;//1
            count++;//3
        }
        System.out.println("Total Digit is="+count);
    }
}
