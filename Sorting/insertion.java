public class insertionSort {

    public static void insertion(int num[])
    {
        for(int i=1;i<num.length-1;i++)
        {
            int curr = num[i];
            int prev=i-1;
            //finding out correct postion to insert
            while(prev>=0 && num[prev]>curr)
            {
                num[prev+1]=num[prev];
                prev--;
            }
            //insertion
            num[prev+1] = curr;
        }
    }
    public static void print(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={2,5,3,6,8,9};
        insertion(num);
        print(num);
    }
}
