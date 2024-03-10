import java.io.IOException;
import java.util.Scanner;

public class e1010 {

    public static void main(String[] args)throws IOException {
        
     Scanner scan = new Scanner(System.in);

     int cod,nrmopecas;
     double valor,total=0;
     
     for (int i = 0; i <=1; i++) {
        cod = scan.nextInt();
        nrmopecas = scan.nextInt();
        valor = scan.nextDouble();
        total+=nrmopecas*valor;

     }
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
  

    }
    
}
