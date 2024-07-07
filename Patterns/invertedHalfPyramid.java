
public class invertedHalfPyramid {

    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            //num
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(j+ " ");
            }
            //for spaces
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
