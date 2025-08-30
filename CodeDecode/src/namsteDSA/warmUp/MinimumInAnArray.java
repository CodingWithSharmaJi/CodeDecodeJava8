package namsteDSA.warmUp;

import java.util.Scanner;

public class MinimumInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Element "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int minimum=findMinimum(arr);
        System.out.println("Maximum in an array is="+minimum);
    }

    private static int findMinimum(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
