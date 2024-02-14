public class char_pattern {
    public static void main(String[] args) {
        char $ = 'a';
        for(int i=0;i<4;i++){
            for(int j=0; j<=i;j++){
                System.out.print($);
                $++;
            }
            System.out.println();
        }
    }
}
