public class Palindrome_Number_Using_method {
    public static int palindrome_num(int n){
        int num = n;
        int rev = 0;
        for(;n>0;n/=10){
            int rem = n%10;
            rev = rem + rev*10;            
        }
        if(rev == num){
            return rev;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
       int ans = palindrome_num(1001001);
       System.out.println(ans);
    }
}
