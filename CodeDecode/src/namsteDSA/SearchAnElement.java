//WAF that searches the element in an array and return the index, If the element is not present than just reurn -1
package namsteDSA;

import java.util.Scanner;

public class SearchAnElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element "+(i+1));
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the element which you want to search");
        int item=scanner.nextInt();
        int index=findElement(arr,item);
        if(index==-1)
            System.out.println("Item not searched");
        else
            System.out.println("Item searched at index="+(index));
    }

    private static int findElement(int[] arr,int item) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
