public class power {
    public static void main(String[] args) {
        int x=2, n=1;
        int res = 1;
        while(n<=5)
        {
            res = res * 2;
            n++;
        }
        System.out.println(res);
        System.out.println(power(3, 2));
    }

public static int power(int x,int n)
{
    if(n==1)
    {
        return x;
    }
    int xnm1 = power(x, n-1);
    int xn = x * xnm1;
    return xn;
}
}
