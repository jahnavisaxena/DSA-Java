public class subArray {

    public static void subArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int start = i;
            for(int j=i;j<arr.length;j++)//to get singlw elements
            {
                int end = j;
                for(int k = start ;k<=end ; k++)//print
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subArray(arr);
    }
}
