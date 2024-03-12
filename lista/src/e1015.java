import java.util.Scanner;

public class e1015 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double a,b,c,d,x;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();


        x = Math.sqrt(Math.pow((c-a),2)+Math.pow((d-b),2));
        System.out.printf("%.4f\n",x);
    }
}
