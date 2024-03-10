import java.io.IOException;
import java.util.Scanner;

public class e1019 {

    public static void main(String[] args)throws IOException {
        
        Scanner scan = new Scanner(System.in);
        int x =0;
        int hours, minutes, seconds, aux;

        x = scan.nextInt();

        hours=x/3600;
        aux = x%3600;
        minutes = aux/60;
        aux = aux%60;
        seconds = aux;
        
        System.out.println(hours+":"+minutes+":"+seconds);

    }
    
}
