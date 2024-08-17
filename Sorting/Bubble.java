
public class bubbleSort {

    public static void bubble(int num[])
    {
        for(int turn=0;turn<num.length - 1;turn++)
        {
            for(int j=0;j<num.length - 1 - turn; j++)
            {
                if(num[j] > num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
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
        int num[]={2,5,3,7,8,6};
        bubble(num);
        print(num);
    }
}

