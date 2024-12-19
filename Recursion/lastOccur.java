public class lastOcc {
    public static int lastOccurence(int arr[],int key,int i)
    {
        if(i==0)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,4,6,8};
        System.out.println(lastOccurence(arr, 6, arr.length-1));
    }
}
