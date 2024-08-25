package Assignement;

public class second{

    public static int rowSum(int nums[][])
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(i == 1 && j<nums[0].length)
                {
                    sum += nums[i][j];           
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[][] ={ {1,4,9},{11,4,3},{2,2,3}};
        System.out.println(rowSum(nums));
    }
}
