public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        //  FOR FIRST HALF 

        for(int i = 1; i <= n; i++){

            for(int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }

            for(int k = 1 ; k <= 2*(n-i); k++){
                System.out.print(" ");
            }

            for(int k = 1; k<= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 

        // FOR SECOND HALF

        for(int i = n; i >= 1; i--){

            for(int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }

            for(int k = 1 ; k <= 2*(n-i); k++){
                System.out.print(" ");
            }

            for(int k = 1; k<= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
