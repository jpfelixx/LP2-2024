import java.util.Scanner;

public class e1035 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a, b, c, d;

        a = x.nextInt();
        b = x.nextInt();
        c = x.nextInt();
        d = x.nextInt();

        if ((b > c && d > a) && (c + d > a + b) && (c > 0 && d > 0) && (a % 2 == 0)) {

            System.out.printf("Valores aceitos\n");

        } else
            System.out.printf("Valores nao aceitos\n");

    }
}
