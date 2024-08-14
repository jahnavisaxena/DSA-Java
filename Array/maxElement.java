
public class maxElement {

    public static void largestElement(int number[])
    {
        int max = number[0];
        for(int i=0;i<number.length;i++)
        {
            
            if(number[i] > max){
                max= number[i];
               
            
            }
        }
        System.out.println("Max element of array is: "+max);
    }
    public static void main(String[] args) {
        int number[] = {32,54,533,120};
        largestElement(number);
    }
}
