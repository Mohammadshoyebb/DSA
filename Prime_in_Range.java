// import java.util.Scanner; 
  
class Prime_in_Range { 
    private static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 

        if(n==2){
            return true;
        }
  
        // Check from 2 to sqrt(n) 
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false; 
                 
        
        return true; 
    } 

    public static void inRangePrime(int n){
        for(int i = 2; i <= n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
  
    // Driver Program 
    public static void main(String args[]) 
    { 
        inRangePrime(20);
       
    }
}