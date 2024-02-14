import java.lang.Math;
public class Dec2Bin {

    public static void DecToBin(int decNumber)
    {
        int myNum = decNumber;
        int power = 0;
        int binaryNumber = 0;
       

        while(myNum>0)
        {
            int rem = myNum%2;
            binaryNumber =  binaryNumber + (int)(rem * Math.pow(10,power));
            myNum /=2;
            power++;
        }
        System.out.println("Binary of "+decNumber+" is : "+binaryNumber);
    }
    public static void main(String[] args) {
        DecToBin(9);
    }
    
}
