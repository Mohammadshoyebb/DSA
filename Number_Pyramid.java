public class Number_Pyramid {
    public static void main(String[] args) {

        int n = 5; 
                         //no. of rows
        for(int i = 1; i <= n; i++){
            
            for(int j = n-i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i; k++){
                System.out.print(i+" ");
            }
            
            System.out.println();
           
        }
    }
}
