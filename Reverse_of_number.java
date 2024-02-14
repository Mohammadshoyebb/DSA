import java.util.*;

    public class Reverse_of_number {
    
        public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sn.nextInt();
            int rev = 0;
    
            for (; num != 0; num /= 10) { // Loop to iterate through digits
                int digit = num % 10;
                rev = rev * 10 + digit;
            }
    
            System.out.print(rev);
            }
        
    }
    
    

