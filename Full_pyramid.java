public class Full_pyramid {
    public static void main(String[] args) {

        int n = 5;                  //no. of rows
        for(int i = 1; i <= n; i++){
            
            for(int j = n-i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k < 2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
