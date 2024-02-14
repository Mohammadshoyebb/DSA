import java.util.*;
public class Next_Prime_number{
    public static boolean isPrime(int numbb){
        for(int i = 2; i<numbb;i++){
            if(numbb%i==0){
                return false;
            }
        }
        return true;
    }
    public static int getNextPrime(int numbb){
        for(int j=numbb + 1; ; j++){
            if(isPrime(j)==true){
                return j;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter number: ");
        int numbb = sn.nextInt();
            System.out.println("Next prime number is : "+ getNextPrime(numbb));
            
    }

}