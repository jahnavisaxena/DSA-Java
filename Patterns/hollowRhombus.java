public class hollowRhombus {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            //spaces
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j=1;j<=5;j++)
            {
                if(i==1 || i==5 || j ==1||j==5){
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