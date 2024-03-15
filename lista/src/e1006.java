git

public class e1006 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n1,n2,n3,m;
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();

        m = ((n1*0.2)+(n2*0.3)+(n3*0.5));
        System.out.printf("MEDIA = %.1f\n",m);
    }
    
}
