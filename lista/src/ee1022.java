import java.util.Scanner;

public class ee1022 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c, d, nf,df, qnt;
        char barra, op;
         qnt =  scan.nextInt();
         for (int i = 0; i<qnt; i++) {
            
            a = scan.nextInt();
        barra = scan.next().charAt(0);
        b = scan.nextInt();

        op = scan.next().charAt(0);

        c = scan.nextInt();
        barra = scan.next().charAt(0);
        d = scan.nextInt();

        if (op == '+') {
           nf = ((a*d)+(b*c));
           df = (b*d);
        }

        else if (op == '-') {
            nf = (a*d - b*c);
            df = (b*d);

        } else if (op == '/') {
            nf = a*d;
            df = b*c;

        } else {

            nf = (a*c);
            df = (b*d);
        }
     



         }
        

    

        System.out.println(nf+" / "+df);
    }

}
