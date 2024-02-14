import java.lang.Math;
public class Bin2Dec {

    public static void binToDec(int binNumber){
        int myNum = binNumber;
        int decNum = 0;
        int power = 0;

        while(binNumber>0){
            int last_digit = binNumber%10;

            decNum = decNum + (int)Math.pow(2,power);

            power++;
            binNumber /= 10;
        }
        System.out.println("Decimal of "+myNum+" is : "+decNum);
    }
    public static void main(String[] args) {
        binToDec(1111);
    }
    
}
