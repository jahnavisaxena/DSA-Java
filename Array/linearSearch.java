import java.util.Scanner;
public class linearSearch {

    public static int linearSearch(int key,int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            if(key == number[i]){
                System.out.println("Found at index : "+ i);
                break;
            }
           
        }
        
        return key;
    }
    public static void main(String[] args) {
        int number[] = {2,4,64,88,21,45};
        linearSearch(64, number);
    }
}
