import java.util.Scanner;
public class Binomail {
    public static int product(int a ){

        int fact =1;
        for(int i=1;i<=a;i++){
            fact*=i;

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int r = sn.nextInt();
    

        int nf = product(n);
        int rf = product(r);
        int df = product(n-r);

        int binomial = nf/(rf*df);

        System.out.println("Binomail of nCr is : " + binomial);
    }
    
}

