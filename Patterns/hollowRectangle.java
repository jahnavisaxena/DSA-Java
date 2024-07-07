
public class hollowRectangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)//outer loop
        {
            for(int j=1 ; j<=5 ; j++ )//columns
            {
                if( i == 1 || i == 4 || j == 1 || j == 5)//boundar cells
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
