import java.util.Scanner;

public class e1021{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cem = 0, cinqnta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0, cinqatvos = 0, vinte5 = 0, dezcent = 0, cincocent = 0, umcent = 0;
        double valor, aux;

        valor = scan.nextDouble();

   //notas
            cem = (int) (valor / 100);
            aux = valor % 100;
            cinqnta = (int) (aux / 50);
            aux = aux % 50;
            vinte = (int) (aux / 20);
            aux = aux % 20;
            dez = (int) (aux / 10);
            aux = aux % 10;
            cinco = (int) (aux / 5);
            aux = aux % 5;
            dois = (int) (aux / 2);
            aux = aux % 2;
            um = (int) aux ;
    //moedas
            aux = valor - (100 * cem + 50 * cinqnta + 20 * vinte + 10 * dez + 5 * cinco + 2 * dois + um);
            aux *= 100;
            System.out.println(aux);
            cinqatvos = (int)(aux / 50);
            aux = aux % 50;
            vinte5 = (int) (aux/25);
            aux = aux % 25;
            dezcent = (int) (aux/ 10);
            aux = aux % 10;
            cincocent = (int) (aux/5);
            aux = aux % 5;
            umcent = (int)aux;
       

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinqnta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cinqatvos + " moeda(s) de R$ 0.50");
        System.out.println(vinte5 + " moeda(s) de R$ 0.25");
        System.out.println(dezcent + " moeda(s) de R$ 0.10");
        System.out.println(cincocent + " moeda(s) de R$ 0.05");
        System.out.println(umcent + " moeda(s) de R$ 0.01");
    }
}