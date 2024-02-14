import java.util.Scanner;
public class FACTORIAL {
    public static int product(int a ){

        int fact =1;
        for(int i=1;i<=a;i++){
            fact*=i;

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
    

        int fact = product(a);

        System.out.println("Product of two number is: " + fact);
    }
    
}

