public class Hollow_rectangle_Pattern {
    public static void rectangle(int row_size,int col_size){
        // outer loop for rows
        for(int i = 1; i<=row_size;i++){

            // inner loop for column
            for(int j=1; j<=col_size; j++){

                if(i == 1 ||  i == row_size || j == 1 || j == col_size){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        
        rectangle(7, 9);
    }
}
