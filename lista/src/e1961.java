import java.io.IOException;
import java.util.Scanner;

public class e1961 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int ps, nrocanos;
        boolean sentinela = true;
        ps = scan.nextInt();
        nrocanos = scan.nextInt();
        int[] altcanos = new int[nrocanos];

        for (int i = 0; i < altcanos.length; i++) {
            altcanos[i] = scan.nextInt();
        }

        for (int i = 0; i < altcanos.length - 1; i++) {

            if (Math.abs(altcanos[i] - altcanos[i + 1]) <= ps) // altcanos-1 pois quando chegasse, por exemplo,i = 9
                sentinela = true; // em um vetor de 10 posições,não existiria posição 10 para subtrair

            else {
                sentinela = false;
                break;
            }
        }

        if (sentinela)
            System.out.println("YOU WIN");

        else
            System.out.println("GAME OVER");

    }

}
