import java.io.IOException;
import java.util.Scanner;

public class e1044 {
    public static void main(String[] args)throws IOException{

    Scanner scan = new Scanner(System.in);
    int a,b;

      a = scan.nextInt();
      b = scan.nextInt();

      if((a%b==0)||(b%a==0))
         System.out.println("Sao multiplos");
      else
      System.out.println("Nao sao multiplos");


    }    

    
}
