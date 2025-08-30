package namsteDSA.warmUp;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=scanner.nextInt();
        int toggle=1;
        for(int i=1;i<=size;i++){
            String res="";
            for (int j=1;j<=i;j++){
                res+=toggle;
                toggle=(toggle==1)?0 : 1;
            }
            System.out.println(res);
        }
    }
}


