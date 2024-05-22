import java.util.Scanner;
public class Exercise_2 {
    //question1
    static void check(int n){
        if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
    //question2
    static void compare(int x,int y,int z){
        if(x>y && x>z){
            System.out.printf("%d is greatest",x);
        }
        else if(y>x && y>z){
            System.out.printf("%d is the greatest ",y);
        }
        else{
            System.out.printf("%d is the greatest",z);
        }
    }
    //question3
    static void week(int n){
         switch(n){
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
        }
    }
    //question4
    static void error(String a){
        if((a == "A" ) || (a=="E")||(a=="I")||(a=="O")||(a=="U")){
            System.out.println("Vowel");
        }
        else if((a.length()>1)||a != a.toUpperCase()|| a!=a.toLowerCase()){
            System.out.println("Error / Invalid input");
        }
        else{
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        check(-90);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        System.out.println("Enter y: ");
        int y=sc.nextInt();
        System.out.println("Enter z: ");
        int z=sc.nextInt();
        compare(x,y,z);
        System.out.println("\nEnter a weekday number: ");
        int n=sc.nextInt();
        week(n);
        System.out.println("Enter a letter: ");
        String a=sc.next();
        error(a);
    }
}
