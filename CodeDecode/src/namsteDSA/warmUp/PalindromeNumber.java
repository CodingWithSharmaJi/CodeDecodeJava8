package namsteDSA.warmUp;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int rev=0;
        int storeNumber=number;
        while(number>0){
            int t=number%10;
            rev=rev*10+t;
            number/=10;
        }
        if(rev==storeNumber)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}
