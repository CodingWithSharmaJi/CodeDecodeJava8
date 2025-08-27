package namsteDSA;

import java.util.Scanner;

public class LargestInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Element "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int maximum=findLargest(arr);
        System.out.println("Maximum in an array is="+maximum);
    }

    private static int findLargest(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
