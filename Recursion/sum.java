public class sum {

    public static int sum(int n)
    {
        if(n == 1)//base case
        {
            return 1;
        }
        int Snm1 = sum(n-a1);
        int Sn = n + sum(n-1);
        return Sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
