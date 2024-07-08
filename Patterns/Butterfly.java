public class ButterflyPattern {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(4-i);j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=4;i>=1;i--)
        {
             //stars
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             //spaces
             for(int j=1;j<=2*(4-i);j++)
             {
                 System.out.print(" ");
             }
             //stars
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
}
