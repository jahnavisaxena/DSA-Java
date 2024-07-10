public class binomialCoefficiant {

    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        return fact;

    }
    public static int binCoefficient(int n ,int r){
        
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        return fact_n/(fact_r*fact_nmr);
    }
    public static void main(String[] args) {
        
        System.out.println( binCoefficient(3, 2));
    }
}
