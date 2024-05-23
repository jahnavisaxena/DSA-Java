import java.util.Scanner;
public class Exercise_4 {
    //question1
    static void array1(){
        int []a= {1,2,4,5,6,7};
        for(int element:a){
            System.out.println(element);
        }
    }
    //question2
    static void array2(){
        int sum=0;
        int []a={4,54,23,44,22,11,90};
        for(int element:a){
            sum+=element;
        }
        System.out.printf("sum of array is: %d ",sum);
    }
    //question3
    static void array3(){
        int [][]a=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("%d",a[i][j]);
            }
            System.out.println();
        }
    }
    //question4
    static void array4(){
        int sum=0;
        int []a={1,2,3,4,5,6,7,87,2};
        for(int element:a){
            sum+=element;
        }
        double avg=(sum/a.length);
        System.out.println("Average of array is: "+avg);
    }
    //question5
    static void array5(int x){
        int []a={1,7,54,32,90,54,87};
        for(int i=0;i<7;i++){
            if(a[i]==x){
                System.out.println("Found");
                break;
            }
        }
    }
    //question7
    static void array7(){
        int index=3;
        int []a={32,34,56,77,9};
        for(int i=index;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        System.out.println("new array: ");
        for(int element:a){
            System.out.println(element);
        }
    }
    //question8
    static void array8(){
        int []a={45,67,22,33,44,12,98};
        System.out.println(" Reversed Array: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.printf("%d, ",a[i]);
        }
    }
   
    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be found");
        int x=sc.nextInt();
        array5(x);
    }
}
