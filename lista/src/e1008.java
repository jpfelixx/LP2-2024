import java.util.Scanner;

public class e1008 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 

    int a, b;
    double x,s;

    a = scan.nextInt();
    b = scan.nextInt();
    x = scan.nextDouble();

    s = x*b;

   System.out.println("NUMBER = "+a);
   System.out.printf("SALARY = U$ %.2f\n",s);
    }
    
}
