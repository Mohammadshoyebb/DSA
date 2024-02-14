import java.lang.Math;
public class Dec2Bin {

    public static void binToDec(int decNumber){
        int myNum = binNumber;
        char decNum;
       

        while(binNumber>0){
            char rem = (char)myNum%2;
            decNum = rem+decNum;

        }
        System.out.println("Binary of "+decNumber+" is : "+decNum);
    }
    public static void main(String[] args) {
        binToDec(7);
    }
    
}
