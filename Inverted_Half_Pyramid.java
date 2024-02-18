public class Inverted_Half_Pyramid {
    public static void pyramid(int row_size){
        // outer loop for rows

        int space = row_size - 1;
        for(int i = 1; i<=row_size;i++){

            // inner loop for column
            for(int j=space; j> 0; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (row_size - space); k++ )
            {
                System.out.print("*");
            }
            System.out.println();
            space--;

        }

    }

    public static void main(String[] args) {
        
        pyramid(4);
    }
}
 

