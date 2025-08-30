package namsteDSA.warmUp;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=scanner.nextInt();

        for(int i=1;i<=size;i++){
            for(int k=1;k<=size-i;k++){
                System.out.print(" ");
            }
            String res="";
            for (int j=1;j<=i;j++){
                res=res+"*";
            }
            System.out.println(res);
        }
    }
}


