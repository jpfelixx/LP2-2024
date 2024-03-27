import java.util.Scanner;

public class e2923 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t, a, w, c;
        float ap;
        t = scan.nextInt();
        a = scan.nextInt();
        w = scan.nextInt();
        c = scan.nextInt();

        ap = a * 100 / t;
        if (ap < w)
            System.out.printf("OK\n");

        else if (ap >= c)
            System.out.printf("critical\n");
        else
            System.out.printf("warning\n");

    }
}
