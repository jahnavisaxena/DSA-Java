public class prefixSum {

    public static void prefixsum(int array[])
    {
        int sum;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        //calculate prefix
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1] + array[i];
        }
         //sum
        for(int i=1;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                sum = i==0? prefix[j] : prefix[j] - prefix[i-1];
            if(max_sum< sum)
            {
                 max_sum = sum;
            }
            }
            
        }
        System.out.println("Max sum = "+max_sum);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        prefixsum(array);
    }
}
