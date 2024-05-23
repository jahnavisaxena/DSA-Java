import java.util.Scanner;
public class Exercise_3 {
    //question1
    static void natural(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    //question2
    static void loop(int n){
        int sum=0;
        for(int i =0;i<=n;i++){
             sum += i;
        }
        double avg= (sum)/n;
        System.out.println("sum is :"+sum+"average is: "+ avg);
    }
    //question3
    static void odd(int x){
        int sum=0;
        for(int i=1;i<=x;i+=2){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("sum of odd n natural numbers is: "+sum);
    }
    //question4
    static void pattern(){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //question5
    static void pattern1(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    //question6
    static void pattern2(){
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
    //question7
    static void pattern3(){
        int n=4;
        for(int i=n;i>0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        natural();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        loop(n);
        System.out.println("Enter number: ");
        int x=sc.nextInt();
        odd(x);
        pattern();
        pattern1();
        pattern2();
        pattern3();
    }
}
