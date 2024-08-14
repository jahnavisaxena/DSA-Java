public class minSumSun {

    public static void minSum(int a1[])
    {
        int sum;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=1;j<a1.length;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum += a1[k];
                }
                System.out.println(sum);
                if(min > sum)
                {
                    min = sum;
                }
                
            }
            System.out.println();
        }
        System.out.println("Min sum = "+min);
    }

    public static void main(String[] args) {
        int a1[] = {2,4,6,8,10,12};
        minSum(a1);
    }
}
