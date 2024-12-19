public class firstOcc {
    public static int firstOccurence(int arr[],int key,int i)
    {
        if(i == arr.length-1)//base case
    {
        return -1;
    }
        if(arr[i] == key)
        {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
     public static void main(String[] args) {
        int arr[]={8,5,6,7,2,10,1,22,3,4,6};
        System.out.println(firstOccurence(arr, 6, 0));
     }
}

