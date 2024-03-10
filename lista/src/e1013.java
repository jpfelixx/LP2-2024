import java.io.IOException;
import java.util.Scanner;

public class e1013 {
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int m,x,y,z;

        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        m = (x+y+Math.abs(x-y))/2;
        m = (m+z+Math.abs(m-z))/2;

        System.out.println(m+" eh o maior");


    }
}
