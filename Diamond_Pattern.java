public class Diamond_Pattern {
    public static void main(String[] args) {

        int n = 5; 
                         //no. of rows
        for(int i = 1; i <= n; i++){
            
            for(int j = n-i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1; k++){
                System.out.print("*");
            }
            
            System.out.println();
           
        }

        for(int i = n-1; i >= 1; i--){
            
            for(int j = n-i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1; k++){
                System.out.print("*");
            }
            
            System.out.println();
           
        }
    }
}
