public class numberPyramid {
    public static void main(String[] args) {
        
        for(int i=1;i<=7;i++)
        {
            //spaces
            for(int j=1;j<=(7-i);j++)
            {
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
