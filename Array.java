import java.util.Scanner;
public class pr_set6 {
    public static void main(String[] args) {

        float sum=0;
        float []marks={2.4f,3.5f,6,0f,9.8f};
        for(int i=0;i<=marks.length;i++)
        {
            sum=sum+i;
        }
        System.out.printf("sum of array is %f",sum);

        //question2
        int []a={2,3,5,34,1,6,7};
        System.out.println("Enter the number you want to find: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(x==i){
                System.out.println("Found");
                break;
            }

            }

        //question3
        int []marks1={54,23,90,87,78,65,82};
        int sum1=0;
        for(int element:marks1){
            sum=sum+element;
        }
        double avg=sum1/marks1.length;
        System.out.println(avg);

        //question4
        int [][]e= {{1,2,3},{4,5,6}};
        int [][]b= {{6,3,5},{9,8,5}};
        int [][]s = new int[2][3];
        for(int i=0; i<a.length; i++)
        {
            for(int j = 0; j<e[i].length; j++)
            {
                s[i][j]=e[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }

        //question5
        int []arr={1,2,3,4,5};
        System.out.println("in correct order: ");
        for(int elements:arr){
            System.out.println(elements);
        }
        System.out.println("In reverse order: ");
        for(int i = arr.length-1 ; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        //question6
        int []arr1={1,2,3,4,5,6};
        int max=arr1[0];
        for(int i=0 ;i<=arr1.length;i++){
        if(arr1[i]>max){
        max=arr[i];
}
    }
      system.out.prilntln(max);
                }
}
            
        

