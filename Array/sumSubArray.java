public class sumSubArr {

    public static void sumsub(int arr1[])

    {
        int i,j,k;
        int sum ;
        for( i=0;i<arr1.length;i++)
        {
            
            for( j=i;j<arr1.length;j++)//to get singlw elements
            {
                sum =0;
                for( k = i ;k<=j ; k++)//print
                {
                    
                    sum += arr1[k];
                    
                }
                System.out.println("Sum: "+sum);
                
            }
            System.out.println();
            
        }
       
    }
    public static void main(String[] args) {
        int arr1[] = {1,-2,3,-4,6};
        sumsub(arr1);
    }
}
