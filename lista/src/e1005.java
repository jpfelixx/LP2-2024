import java.io.IOException;
import java.util.Scanner;

public class e1005 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        double m =0;
        double a,b;

        a = scan.nextDouble();
        b = scan.nextDouble();
        m = ((a*0.35)+(b*0.75));
        m = m*10/11;
        System.out.printf("MEDIA =%.5f",m);
        System.out.println();

    }
}