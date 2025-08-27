package namsteDSA;

import java.util.Scanner;

public class NegativeNumberReturn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter Element"+(i+1));
            arr[i]=scanner.nextInt();
        }
       int result[]= findNegative(arr);
        display(result);
    }

    private static int[] findNegative(int[] arr) {
        int crr[]=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                crr[j++]=arr[i];
            }
        }
        int rs[]=new int[j];
        for(int k=0;k<j;k++){
            rs[k]=crr[k];
        }
        return rs;
    }
    private static void display(int[] result){
        for(int x:result){
            System.out.print(x+"\t");
        }
    }
}
