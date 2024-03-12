import java.io.IOException;
import java.util.Scanner;

public class e1017 {
    public static void main(String[] args)throws IOException {
        

    Scanner scan = new Scanner(System.in);

       double vm,t,s,l;

       t = scan.nextDouble();
       vm = scan.nextDouble();
       s = t*vm;
       l = s/12;

      System.out.printf("%.3f\n",l);
      



    }
}
