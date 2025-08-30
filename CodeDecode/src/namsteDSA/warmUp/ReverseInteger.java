package namsteDSA.warmUp;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int reverse=rev(number);
        System.out.println(reverse);
    }
    public static int rev(int number){
        int rev=0;
        int copyofnumber=number;
        number=Math.abs(number);
        while(number>0){
            int t=number%10;
            rev=rev*10+t;
            number/=10;
        }
        return (copyofnumber<0)?-rev:rev;
    }
}
