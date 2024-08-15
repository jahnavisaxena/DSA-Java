public class count {
    static int count = 0;
    public static void duplicateElement(int num[])
    {
        
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i] == num[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,3,3,5,6,6,6};
        duplicateElement(num);
    }
}
