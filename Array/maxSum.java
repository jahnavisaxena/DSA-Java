public class maxSumSub {

    public static void maxSum(int a[])
    
    {
        int i,j,k;
        int sum ;
        int max_sum = Integer.MIN_VALUE;
        for( i=0;i<a.length;i++)
        {
            
            for( j=i;j<a.length;j++)//to get singlw elements
            {
                sum =0;
                for( k = i ;k<=j ; k++)//print
                {
                    
                    sum += a[k];
                    
                }
                System.out.println("Sum: "+sum);
                if(max_sum < sum)
                {
                    max_sum = sum;
                }              
            }
            System.out.println();
            
        }
        System.out.println("Max Sum = "+max_sum);  
    }
    public static void main(String[] args) {
        int a[]= {2,5,7,8,9,0};
        maxSum(a);
    }
}
