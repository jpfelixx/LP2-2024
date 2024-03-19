import java.util.Scanner;

public class e1080 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size, menor = 0, position = 0;

        size = scan.nextInt();

        int vetor[] = new int[size];

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = scan.nextInt();
        }

        menor = vetor[0];

        for (int j = 0; j < vetor.length - 1; j++) {

            if (menor > vetor[j + 1]) {
                menor = vetor[j + 1];
                position = j + 1;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + position);

    }
}
