public class SumofDigits {
   public static int digitsum(int n)
   {
    int sum = 0;
    while(n>0){
        int rem = n % 10;
        sum+=rem;
        n/=10;
    }
    return sum;
   } 
   public static void main(String[] args) {
    int x = digitsum(23456);
    System.out.println(x);
   }
}
