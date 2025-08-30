package namsteDSA.warmUp;

import java.util.Scanner;

public class SecondLargestInAnArray {
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Element "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int secondMaximum=secondMaximum(arr);
        System.out.println("Second Maximum in an array is="+secondMaximum);
    }
        private static int secondMaximum(int[] arr) {
        int max=arr[0],smax=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
        }
        return smax;
    }
}

