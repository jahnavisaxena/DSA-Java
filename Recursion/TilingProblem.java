public class TilingProblem {
    public static int tilingproblem(int n)
    {
        //base case
        if(n==0||n==1)
        {
            return 1;
        }
        //kaam
        //vertical choice
        int vertical = tilingproblem(n-1);
        //horizontal choice
        int horizontal = tilingproblem(n-2);
        //total ways
        int total_ways= vertical + horizontal;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(3));
    }
}

