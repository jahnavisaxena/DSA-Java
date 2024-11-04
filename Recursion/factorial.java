public class factorial {

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int fnm1 = factorial(n-1);//smaller problems
        int fn = n*factorial(n-1);//solution return kr raha
        return fn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(factorial(n));
    }
}
