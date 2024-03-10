import java.util.Scanner;

public class e1080 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size,menor =0 ,position =0;

        System.out.println("tamanho do vetor");
        size = scan.nextInt();

        int vetor [] = new int [size];

        System.out.println("captura de dados do vetor");
        for (int i = 0; i < vetor.length; i++) {
            
            vetor [i] = scan.nextInt();
        }

        


        for (int i = 0; i < vetor.length; i++) {
            
            for (int j = 0; j < vetor.length-1; j++) {
                  if(vetor[i]<vetor[j+1])
                  {
                    menor = vetor[i];
                    position = i; // no se o que fazeee =(
                  }
                  
            }                   
        }

        System.out.println("menor valor: "+menor+"posição"+position);

    }
}
