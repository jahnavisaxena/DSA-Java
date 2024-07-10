public class binaryToDecimal {

    public static void binToDc(int n)
    {
        int biNum = n;
        int pow=0;
        int decimal = 0;

        while(n > 0)
        {
            int ld = n % 10;
            decimal = decimal + (ld* (int)Math.pow(2,pow)); 
            pow++;
            n = n/10;

        }
        System.out.println("decimal of: "+ biNum + " = "+ decimal);
    }
    public static void main(String[] args) {
        binToDc(101);
    }
    
}
