import java.util.Scanner;
public class find_product {
    public static int product(int a ,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();

        int result = product(a,b);

        System.out.println("Product of two number is: " + result);
    }
    
}
