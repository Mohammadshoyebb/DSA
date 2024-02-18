public class Palindrome_pattern {
    public static void main(String[] args) {

        int n = 5; 
                      //no. of rows
        for(int i = 1; i <= n; i++){
            int k = i;
            for(int j = n-i; j >= 0; j--){
                System.out.print(" ");
            }
           for(int j = 1;j<=i;j++){
            System.out.print(k);
            k--;
        
           }

           for(int j = 2;j<=i;j++){
            System.out.print(j);}

            
            System.out.println();
}
    }}