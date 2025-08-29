package namsteDSA;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=scanner.nextInt();
        for(int i=1;i<=size;i++){
            String row="";
            for(int j=1;j<=i;j++){
                row+=j;
            }
            System.out.println(row);
        }
    }
}

