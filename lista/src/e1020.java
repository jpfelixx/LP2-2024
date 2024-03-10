import java.io.IOException;
import java.util.Scanner;

public class e1020 {
    
    public static void main(String[] args) throws IOException  {
        Scanner scan = new Scanner(System.in);  
        int years,months,days,aux,x;

          x = scan.nextInt();
          years = x/365;
          aux = x%365;
          months = aux/30;
          aux = aux%30;
          days = aux;

          System.out.println(years+" ano(s)\n"+months+" mes(es)\n"+days+" dia(s)");
      }
}
