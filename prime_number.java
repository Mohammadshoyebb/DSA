
public class prime_number {
    public static void main(String args[]){
        int n = 29;
        int div = 2;
        if(n==2){
            System.out.println("prime");
        }else{
        while(div<n){
            if(n%div==0){
                System.out.println("Not a prime number");
                break;
            }
            else{
                div++;
            }
            if(div==n-1){
                System.out.println("prime :  "+n);
            }
        }
    
    }}
}