import java.util.Scanner;

public class e1011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r,v;
        final double  pi = 3.14159;

        r = scan.nextDouble();

        v = (4.0/3.0)*pi*Math.pow(r,3);
        
        System.out.printf("VOLUME = %.3f\n",v);

    }
    
}
