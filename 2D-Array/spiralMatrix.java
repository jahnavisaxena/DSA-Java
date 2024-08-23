public class spiralArray {

    public static void printSpiral(int nums[][])
    {
        int startRow = 0;
        int endRow = nums.length -1;
        int startCol = 0;
        int endCol = nums[0].length - 1;

        while(startRow <= endRow && startCol <= endCol)
        {
            //top
            for(int j = startCol;j<=endCol;j++)
            {
                System.out.print(nums[startRow][j]+" ");
            }
            //right
            for(int i= startRow + 1 ;i<=endRow;i++)
            {
                System.out.print(nums[i][endCol]+" ");
            }
            //bottom
            for(int j= endCol -1;j>=startCol;j--)
            {
                System.out.print(nums[endRow][j]+" ");
            }
            //left
            for(int i = endRow - 1;i>=startRow+1;i--)
            {
                System.out.print(nums[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                            {4,5,6,7},
                        {8,9,10,11},
                         {12,13,14,15}};
        printSpiral(matrix);


    }
}
