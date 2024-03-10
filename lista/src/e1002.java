import java.util.Scanner;
import java.io.IOException;

public class e1002 {
    public static void main(String[] args)throws IOException {
     final double pi = 3.14159;
     double a,r;
     Scanner scan = new Scanner(System.in);
     r = scan.nextDouble();

     a = r*r*pi;
     System.out.printf("A=%.4f",a);
     System.out.println();
    }
}