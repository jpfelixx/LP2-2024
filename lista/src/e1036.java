import java.io.IOException;
import java.util.Scanner;

public class e1036 {
    public static void main(String[] args)  throws IOException {
        
        Scanner scan = new Scanner(System.in);
        double a,b,c, delta, x1, x2;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = ((b * b) - (4 * a * c));

      if(delta<=0 || a == 0.0)
      System.out.println("Impossivel calcular");

      else{

        x1 = (-b+(Math.sqrt(delta)))/(2*a);
        x2 = (-b-(Math.sqrt(delta)))/(2*a);
        System.out.printf("R1 = %.5f\n",x1);
        System.out.printf("R2 = %.5f\n",x2);
      }
        
        
    }
    
}
